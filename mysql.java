package mms;
import java.sql.*;
import javax.swing.*;

public class mysql {
    static Connection connect = null;
    static Statement stmt = null;
    static ResultSet result = null;
    static boolean login_status = false;
    
    public static void main(String args[]) {
        String db_url = "jdbc:mysql://localhost:3306/pharma_knowhere";
        String db_username = "root";
        String db_password = "";  
        
        try {
            connect = DriverManager.getConnection(db_url, db_username, db_password);
        }
        catch(Exception database_error_message){
            JOptionPane.showMessageDialog(null, database_error_message);
            database_error_message.printStackTrace();
        }
    }
    
    public static void login_validator(String username, String password) throws SQLException{
        int number_of_rows = 0;
        stmt = connect.createStatement();
        String query = "SELECT * FROM `login` WHERE `user` LIKE '"+username+"' AND `pass` LIKE '"+password+"'";
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
}