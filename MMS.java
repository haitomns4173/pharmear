package mms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MMS {
    static String db_passcode;
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File setup = new File("setup_test.txt");
        
        if(setup.exists()){
            try (Scanner setupReader = new Scanner(setup)) {
                while (setupReader.hasNextLine())
                {
                    db_passcode = setupReader.nextLine();
                }
                setupReader.close();
                
                //Connectioin to the database
                mysql.main(args);
        
                //Login form Called
                loginPage main_login = new loginPage();
                main_login.setVisible(true);
            }
            catch(FileNotFoundException e)
            {
                pharmear_setup main = new pharmear_setup();
                main.setVisible(true);
            }
        }
        else{
            pharmear_setup main = new pharmear_setup();
            main.setVisible(true);
        }   
    } 
}