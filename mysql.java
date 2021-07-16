package mms;
import java.sql.*;
import javax.swing.*;

public class mysql {
    static Connection connect = null;
    static Statement stmt = null;
    static ResultSet result = null;
    static boolean login_status = false;
    
    static String company_name;
    static String company_address;
    static String company_phoneNo;
    
    public static void main(String args[]) {
        String db_url = "jdbc:mysql://localhost:3306/pharma_knowhere";
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
    
    public static void auto_suggestion_medicine() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_list`";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_name_auto.add(result.getString(2));  
        }
    }
    
    public static void medicine_mrp() throws SQLException{
        stmt = connect.createStatement();
        String query = "SELECT * FROM `medicine_list` WHERE `drug` LIKE '%"+medicine_management.medicine_with_under+"%'";
        result = stmt.executeQuery(query);
        while(result.next()) {
            medicine_management.medicine_price = result.getFloat(8);
        }
    }
}