package mms;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class mysql {
    static Connection connect = null;
    static Statement stmt = null;
    static ResultSet result = null;
    static boolean login_status = false;
    
    static String company_name;
    static String company_address;
    static String company_phoneNo;
    static String company_vatNo;
    
    static String users_name;
    static String username;
    static String user_type;
    
    static String invoice_number;
    static int medicine_id_result = 0;
    static int batch_no_find = 0;
    static int medicine_mrp_out_of_stock = 0;
    static int left_stock = 0;
    
    static int patient_id;
    
    static int bar_total_cost;
    static int bar_total_quantity;
    static int bar_sold_cost;
    static int bar_sold_quantity;
    
    public static boolean main(String args[]) {
        String db_url = "jdbc:mysql://localhost:3306/pharma_db";
        String db_username = "root";
        String db_password = MMS.db_passcode;  
        
        try {
            connect = DriverManager.getConnection(db_url, db_username, db_password);
            return true;
        }
        catch(SQLException database_error_message){
            JOptionPane.showMessageDialog(null, database_error_message);
            return false;
        }
    }
    
    public static void login_validator(String username, String password) throws SQLException{
        int number_of_rows = 0;
        stmt = connect.createStatement();
        String query = "SELECT * FROM `user` WHERE `username` LIKE '"+username+"' AND `password` LIKE '"+password+"'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            number_of_rows++;
            loginPage.user_id_stored = result.getInt(1);
            loginPage.user_code = result.getInt(6);
        }
        if(number_of_rows == 1){
            JOptionPane.showMessageDialog(null, "Login Successful");
            login_status = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or Password is Incorrect");
            login_status = false;
        }
    }
    
    public static void pharmacy_status() throws SQLException{
        stmt = connect.createStatement();
        String query_import = "SELECT count(id) FROM medicine_import;";
        result = stmt.executeQuery(query_import);
        while(result.next()) {
            medicine_management.total_medicine = result.getString(1);
        }
        
        stmt = connect.createStatement();
        String query_quantity = "SELECT SUM(total_stock-sold_stock) as left_stock from medicine_stock;";
        result = stmt.executeQuery(query_quantity);
        while(result.next()) {
            medicine_management.total_quantity = result.getString(1);
        }
        
        stmt = connect.createStatement();
        String query_cost = "SELECT SUM(total_cost-sold_cost) as left_stock from medicine_stock;";
        result = stmt.executeQuery(query_cost);
        while(result.next()) {
            medicine_management.total_cost = result.getFloat(1);
        }
        
        stmt = connect.createStatement();
        String query_expired = "select count(batch_no) from medicine_import_details where expiry_date <= CURRENT_DATE";
        result = stmt.executeQuery(query_expired);
        while(result.next()) {
            medicine_management.total_expired = result.getString(1);
        }
        
        stmt = connect.createStatement();
        String query_out = "SELECT sum(total_stock=sold_stock) FROM `medicine_stock`";
        result = stmt.executeQuery(query_out);
        while(result.next()) {
            medicine_management.total_out = result.getString(1);
        }
        
    }
    
    public static void company_find_query() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `company` WHERE 1";
        result = stmt.executeQuery(query);
        while(result.next()) {
            company_name = result.getString(2);
            company_address = result.getString(3);
            company_phoneNo = result.getString(4);
            company_vatNo = result.getString(5);
        }
    }
    
    public static void user_find_query() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `user` WHERE `username` LIKE '"+loginPage.username_stored+"'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            users_name = result.getString(2);
            user_type = result.getString(3);
            username = result.getString(4);
        }
    }
    
    public static int user_update_query(String users_name_update, String username_update, String password_update, String username_to_change) throws SQLException{
        int username_duplicate = 0;
        int temp_user_id = 0;
        
        stmt = connect.createStatement(); 
        String query = "SELECT * FROM `user` WHERE `username` LIKE '"+username_update+"'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            username_duplicate++;
            temp_user_id = result.getInt(1);
        }
        
        if(username_duplicate != 0){
            if(temp_user_id == loginPage.user_id_stored){
                username_duplicate = 0;
            }
            else{
                username_duplicate = 1;
            }
        }
        
        if(username_duplicate == 0){
            if(password_update.equals("password")){
                String update_query = "UPDATE `user` SET `name`='"+users_name_update+"',`username`='"+username_update+"' WHERE `username` = '"+username_to_change+"'";
                stmt.executeUpdate(update_query);
                return 0;
            }
            else{
                String update_query = "UPDATE `user` SET `name`='"+users_name_update+"',`username`='"+username_update+"',`password`='"+password_update+"' WHERE `username` = '"+username_to_change+"'";
                stmt.executeUpdate(update_query);
                return 0;
            }
        }
        else{
            return 1;
        }
    }
    
    public static void company_update_query(String shop_name_update, String shop_address_update, String shop_contact_update) throws SQLException{
        String update_query = "UPDATE `company` SET `name`='"+shop_name_update+"',`address`='"+shop_address_update+"',`phone`='"+shop_contact_update+"' WHERE 1";
        stmt.executeUpdate(update_query);
    }
    
    public static void auto_suggestion_medicine() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import`";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_name_auto.add(result.getString(2));  
        }
    }
    
    public static void auto_suggestion_medicine_for_mrdMgr() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_list`";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_name_auto_med_mgr.add(result.getString(2));  
        }
    }
    
    public static void medicine_import_query(String med_name, String med_type, String med_strength) throws SQLException{
        String insert_query = "INSERT INTO `medicine_import`(`medicine_name`, `medicine_type`, `medicine_strength`) VALUES ('"+med_name+"','"+med_type+"','"+med_strength+"')";
        stmt.executeUpdate(insert_query);
    }
    
    public static void medicine_import_details__query(String med_name, String med_sheet, String med_tablet, String med_box, String med_expiry_month, String med_expiry_year, String med_mrp) throws SQLException{
        int med_id = 0;
        int med_batch = 0;
        
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import` WHERE `medicine_name` LIKE '%"+med_name+"%'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            med_id = result.getInt(1);
        }
        
        String insert_query = "INSERT INTO `medicine_import_details`( `medicine_id`, `number_of_sheets`, `number_of_tablets`, `number_of_box`, `expiry_date`, `mrp`) VALUES ('"+med_id+"', '"+med_sheet+"', '"+med_tablet+"','"+med_box+"','20"+med_expiry_year+"-"+med_expiry_month+"-01','"+med_mrp+"')";
        stmt.executeUpdate(insert_query);
        
        int sheet, tablets, box, total_quantity;
        float mrp, total_cost;
        sheet = Integer.parseInt(med_sheet);
        tablets = Integer.parseInt(med_tablet);
        box = Integer.parseInt(med_box);
        mrp = Float.parseFloat(med_mrp);
        total_quantity = sheet * tablets * box;
        total_cost = total_quantity * mrp;
        
        stmt = connect.createStatement();
        String query_barch = "SELECT * FROM `medicine_import_details` ORDER BY batch_no DESC LIMIT 1;";
        result = stmt.executeQuery(query_barch);
        while(result.next()) {
            med_batch = result.getInt(1);
        }
        
        String stocks_query = "INSERT INTO `medicine_stock`(`med_batch`, `total_stock`, `total_cost`, `sold_stock`, `sold_cost`) VALUES ('"+med_batch+"','"+total_quantity+"','"+total_cost+"','0','0')";
        stmt.executeUpdate(stocks_query);
    }
    
    public static void medicine_mrp(String medicine_with_under,int quantity) throws SQLException{
        stmt = connect.createStatement();
        String query_id = "SELECT * FROM `medicine_import` WHERE `medicine_name` LIKE '%"+medicine_with_under+"%'";
        result = stmt.executeQuery(query_id);
        while(result.next()) {
            medicine_id_result = result.getInt(1);
        }
        
        int temp_med_batch[] = new int[10000];
        float temp_med_mrp[] = new float[10000];
        int index_temp = 0 ;
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import_details` WHERE medicine_id = "+medicine_id_result+"";
        result = stmt.executeQuery(query);
        while(result.next()) {
            temp_med_batch[index_temp] = result.getInt(1);
            temp_med_mrp[index_temp] = result.getFloat(7);
            index_temp++;
        }
        
        int stocks_id = 0;
         
        String query_stock;
        index_temp = 0;
        
        for(int med_batch_item : temp_med_batch){           
            query_stock = "SELECT id, med_batch, total_stock-sold_stock as left_stock FROM medicine_stock WHERE total_stock != sold_stock && med_batch = "+med_batch_item+"";
            result = stmt.executeQuery(query_stock);
            while(result.next()) {
                stocks_id = result.getInt(1);
                batch_no_find = result.getInt(2);
                left_stock = result.getInt(3);
            }
            if(stocks_id!=0){
                medicine_management.medicine_price = temp_med_mrp[index_temp]; 
                medicine_mrp_out_of_stock = 1;
                break;
            }
            else{
                medicine_mrp_out_of_stock = 0;
            }
            index_temp++;
        }  
    }
    
    public static void medicine_details(String medicine_search) throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_list` WHERE `medicine_name` LIKE '%"+medicine_search+"%'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_unit = result.getString(3);
            medicine_management.medicine_strength = result.getString(4);
            medicine_management.mecicine_no_pack = result.getInt(5);
            medicine_management.medicine_no_quantity = result.getInt(6);
            medicine_management.medicine_mrp = result.getFloat(7);
        }
    }
    
    public static int medicine_duplicate(String medicine_search_duplicate) throws SQLException{
        int med_id = 0;
        
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import` WHERE `medicine_name` LIKE '%"+medicine_search_duplicate+"%'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            med_id = result.getInt(1);
        }
        return med_id;
    }
    
    public static int medicine_find(String medicine_find) throws SQLException{
        String medicine_id, medicine_name, medicine_strength, box_no, batch_no, find_mrp, import_date;
        int number_of_rows_find = 0;
        
        DefaultTableModel medMgr_find_table_add = (DefaultTableModel)medicine_management.medMgr_table_find.getModel();
        medMgr_find_table_add.getDataVector().removeAllElements();
        
        stmt = connect.createStatement();
        String query = "select medicine_import.id, medicine_import.medicine_name, medicine_import.medicine_strength, medicine_import_details.number_of_box, medicine_import_details.batch_no, medicine_import_details.mrp, medicine_import_details.med_import_date FROM medicine_import INNER JOIN medicine_import_details on medicine_import.id = medicine_import_details.medicine_id WHERE medicine_name LIKE '%"+medicine_find+"%';";
        result = stmt.executeQuery(query);
        while(result.next()) {
            number_of_rows_find++;
            
            medicine_id = result.getString(1);
            medicine_name = result.getString(2);
            medicine_strength = result.getString(3);
            box_no = result.getString(4);
            batch_no = result.getString(5);
            find_mrp = result.getString(6);
            import_date = result.getString(7);
            
            String table_find_date[] = { medicine_id, medicine_name, medicine_strength, box_no, batch_no, find_mrp, import_date};
            medMgr_find_table_add.addRow(table_find_date);
        }
        return number_of_rows_find;
    }
    
    public static void medicine_delete(String medicine_id, String medicine_batch) throws SQLException{
        int temp_stock = 0;
        float temp_cost = 0;
        stmt = connect.createStatement();
        String query = "SELECT total_stock, total_cost FROM pharma_db.medicine_stock where med_batch = "+medicine_batch+"";
        result = stmt.executeQuery(query);
        while(result.next()) {
            temp_stock = result.getInt(1);
            temp_cost = result.getFloat(2);
        }
        
        stmt = connect.createStatement();
        String query_delete = "update medicine_stock set sold_stock = "+temp_stock+", sold_cost = "+temp_cost+" where med_batch = "+medicine_batch+"";
        stmt.executeUpdate(query_delete);
    }

    public static void patient_add(String pat_name, String pat_address, String pat_contact) throws SQLException{
        String insert_query = "INSERT INTO `patient_details`(`patient_name`, `patient_address`, `patient_contact`) VALUES ('"+pat_name+"','"+pat_address+"','"+pat_contact+"')";
        stmt.executeUpdate(insert_query);
        
        stmt = connect.createStatement();
        String query = "SELECT * FROM `patient_details` ORDER BY id DESC LIMIT 1";
        result = stmt.executeQuery(query);
        while(result.next()) {
            patient_id = result.getInt(1);
        }
    }
    
    public static void medicine_sales(String batch_no, String quantity) throws SQLException{
        float mrp = 0;
        
        String search_query = "SELECT * FROM `medicine_import_details` WHERE `batch_no` = "+batch_no+"";
        result = stmt.executeQuery(search_query); 
        while(result.next()){
            mrp = result.getFloat(7);
        }
        
        int quantity_int = Integer.parseInt(quantity);
        int total_quantity = quantity_int;
        float total_cost = total_quantity * mrp;

        String insert_query = "INSERT INTO `sales`(`med_batch`, `patient_id`, `total_unit`, `total_cost`) VALUES ('"+batch_no+"','"+patient_id+"','"+total_quantity+"','"+total_cost+"')";
        stmt.executeUpdate(insert_query);
        
        int current_stocks = 0;
        float current_cost = 0;
        
        String stocks_query = "SELECT sold_stock, sold_cost FROM `medicine_stock` WHERE med_batch = "+batch_no+"";
        result = stmt.executeQuery(stocks_query); 
        while(result.next()){
            current_stocks = result.getInt(1);
            current_cost = result.getFloat(2);
        }
        
        current_stocks = current_stocks + total_quantity;
        current_cost = current_cost + total_cost;
        
        String update_stocks = "UPDATE `medicine_stock` SET `sold_stock`='"+current_stocks+"',`sold_cost`='"+current_cost+"' WHERE med_batch = "+batch_no+"";
        stmt.executeUpdate(update_stocks);
    }
    
    public static void invoice_finder() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT id FROM `patient_details` ORDER BY id DESC LIMIT 1;";
        result = stmt.executeQuery(query);
        while(result.next()) {
            invoice_number = result.getString(1);
        }
    }
    
    public static void bar_finder() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT sum(total_stock), sum(total_cost), sum(sold_stock), sum(sold_cost) FROM pharma_db.medicine_stock;";
        result = stmt.executeQuery(query);
        while(result.next()) {
            bar_total_quantity = result.getInt(1);
            bar_total_cost = result.getInt(2);
            bar_sold_quantity = result.getInt(3);
            bar_sold_cost = result.getInt(4);
        }
    }
    
    public static void backup_pharma_db() throws SQLException{    
        File directory_backup = new File("pharmear_backup");
        File[] files_backup = directory_backup.listFiles();
        for (File file : files_backup)
        {
           if (!file.delete())
           {
               JOptionPane.showMessageDialog(null, "Multiple Database Backup Error");
           }
        }

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
        LocalDateTime now = LocalDateTime.now();
        
        String backup_path = "pharmear_backup/backup_"+tf.format(now)+".sql";
        Process process_backup;
        
        try {
            Runtime run_pharmear_backup = Runtime.getRuntime();
            process_backup = run_pharmear_backup.exec("C:/Program Files/MySQL/MySQL Server 8.0/bin/mysqldump -uroot -p"+MMS.db_passcode+" --add-drop-database -B pharma_db -r"+backup_path);

            int processComplete= process_backup.waitFor();
            if(processComplete == 0)
            {
                //Backup Done
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Backup Failed, Error with MySQL Server!");
            }
        } 
        catch (HeadlessException | IOException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Backup Not Completed, MYSQL is not installed in C: Drive");
        }
    }
    
    public static void restore_from_setup(String restore_path) throws SQLException, IOException{
        Process process_restore;
        try {
            Runtime run_pharmear_backup = Runtime.getRuntime();
            process_restore = run_pharmear_backup.exec("C:/Program Files/MySQL/MySQL Server 8.0/bin/mysql -uroot -padmin pharma_db < "+restore_path);

            int processComplete= process_restore.waitFor();
            if(processComplete == 0)
            {
                //Restore Done
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Restore Failed, Error with MySQL Server!");
            }
        } 
        catch (HeadlessException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Restore Not Completed, MYSQL is not installed in C: Drive");
        }
    }
}