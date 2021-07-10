package mms;

public class MMS {
    public static void main(String[] args) {
        //Connectioin to the database
        mysql main_connection = new mysql();
        main_connection.main(args);
        
        //Login form Called
        loginPage main_login = new loginPage();
        main_login.setVisible(true);
    } 
}