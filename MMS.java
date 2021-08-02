package mms;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class MMS {
    static String db_passcode;
    
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        File setup = new File("setup_test.phe");
        File bill_print_folder = new File("bill_print");
        File backup_folder = new File("pharmear_backup");
        
        bill_print_folder.mkdir();
        backup_folder.mkdir();
            
        if(setup.exists()){
            try (Scanner setupReader = new Scanner(setup)) {
                while (setupReader.hasNextLine())
                {
                    db_passcode = setupReader.nextLine();
                }
                setupReader.close();

                if(!mysql.main(args)){
                    pharmear_setup main = new pharmear_setup();
                    main.setVisible(true);
                }
                else{
                    loginPage main_login = new loginPage();
                    main_login.setVisible(true);
                }
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