package mms;
import java.sql.*;
import javax.swing.*;

public class mysql {
    public static void main(String args[]) {
        String db_url = "jdbc:mysql://localhost:3306/pharma_knowhere";
        String db_username = "root";
        String db_password = "";  
        
        String username = "admin", password = "123";
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_username, db_password);
        }
        catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
            exc.printStackTrace();
        }
    }
}