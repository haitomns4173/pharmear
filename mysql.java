package mms;
import java.sql.*;
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
    
    static String users_name;
    static String username;
    static String user_type;
    
    public static void main(String args[]) {
        String db_url = "jdbc:mysql://localhost:3306/pharma_db";
        String db_username = "root";
        String db_password = "";  
        
        try {
            connect = DriverManager.getConnection(db_url, db_username, db_password);
        }
        catch(SQLException database_error_message){
            JOptionPane.showMessageDialog(null, database_error_message);
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
    
    public static void company_find_query() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT `name`, `address`, `phone` FROM `company` WHERE 1";
        result = stmt.executeQuery(query);
        while(result.next()) {
            company_name = result.getString(1);
            company_address = result.getString(2);
            company_phoneNo = result.getString(3);
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
    
    public static void medicine_import_details__query(String med_name, String med_sheet, String med_tablet, String med_box,String med_expiry_month, String med_expiry_year, String med_mrp, int tablets_total, float cost_total) throws SQLException{
        int med_id = 0;
        
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import` WHERE `medicine_name` LIKE '%"+med_name+"%'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            med_id = result.getInt(1);
        }
        
        String insert_query = "INSERT INTO `medicine_import_details`(`medicine_id`, `number_of_sheets`, `number_of_tablets`, `number_of_box`, `expiry_date`, `mrp`, `total_tablets`, `total_cost`) VALUES ('"+med_id+"', '"+med_sheet+"','"+med_tablet+"','"+med_box+"','20"+med_expiry_year+"-"+med_expiry_month+"-01','"+med_mrp+"', "+tablets_total+", "+cost_total+")";
        stmt.executeUpdate(insert_query);
    }
    
    public static void medicine_mrp(String medicine_with_under) throws SQLException{
        int medicine_id_temp = 0;
        stmt = connect.createStatement();
        String query_id = "SELECT * FROM `medicine_import` WHERE `medicine_name` LIKE '%"+medicine_with_under+"%'";
        result = stmt.executeQuery(query_id);
        while(result.next()) {
            medicine_id_temp = result.getInt(1);
        }
        
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import_details` WHERE id = "+medicine_id_temp+"";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_price = result.getFloat(8);
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
            medicine_management.medicien_mrp = result.getFloat(7);
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
        int number_of_rows_delete = 0;
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_import_details` WHERE `medicine_id` = "+medicine_id+"";
        result = stmt.executeQuery(query);
        while(result.next()) {
            number_of_rows_delete++;
        }
        
        String delete_query_details = "DELETE FROM `medicine_import_details` WHERE batch_no = "+medicine_batch+"";
        String delete_query_import = "DELETE FROM `medicine_import` WHERE id = "+medicine_id+"";
        if(number_of_rows_delete == 1){
            stmt.executeUpdate(delete_query_details);
            stmt.executeUpdate(delete_query_import);
        }
        else{
            stmt.executeUpdate(delete_query_details);
        }
    }
}