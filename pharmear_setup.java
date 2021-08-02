package mms;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static mms.mysql.connect;
import static mms.mysql.result;
import static mms.mysql.stmt;

public class pharmear_setup extends javax.swing.JFrame {
    
    String db_code_write;
    
    public pharmear_setup() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        setup_background = new javax.swing.JPanel();
        mysql_panel = new javax.swing.JPanel();
        mysql_conn_label = new javax.swing.JLabel();
        mysql_conn_seperator = new javax.swing.JSeparator();
        mysql_password_label = new javax.swing.JLabel();
        mysql_password_input = new javax.swing.JPasswordField();
        mysql_save_button = new javax.swing.JButton();
        mysql_test_connection_button = new javax.swing.JButton();
        new_user_panel = new javax.swing.JPanel();
        new_user_label = new javax.swing.JLabel();
        new_user_seperator = new javax.swing.JSeparator();
        name_label = new javax.swing.JLabel();
        new_user_name_input = new javax.swing.JTextField();
        user_type_label = new javax.swing.JLabel();
        user_type_comboBox = new javax.swing.JComboBox<>();
        username_label = new javax.swing.JLabel();
        new_user_username_input = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        new_user_password_input = new javax.swing.JPasswordField();
        new_user_save = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmear Setup");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        setup_background.setBackground(new java.awt.Color(207, 44, 14));

        mysql_panel.setBackground(new java.awt.Color(11, 119, 169));

        mysql_conn_label.setBackground(new java.awt.Color(255, 255, 255));
        mysql_conn_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mysql_conn_label.setForeground(new java.awt.Color(255, 255, 255));
        mysql_conn_label.setText("MySQL Connection");

        mysql_password_label.setBackground(new java.awt.Color(255, 255, 255));
        mysql_password_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mysql_password_label.setForeground(new java.awt.Color(255, 255, 255));
        mysql_password_label.setText("MySQL Password");

        mysql_save_button.setBackground(new java.awt.Color(138, 201, 38));
        mysql_save_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        mysql_save_button.setForeground(new java.awt.Color(255, 255, 255));
        mysql_save_button.setText("Save");
        mysql_save_button.setBorder(null);
        mysql_save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysql_save_buttonActionPerformed(evt);
            }
        });

        mysql_test_connection_button.setBackground(new java.awt.Color(142, 154, 175));
        mysql_test_connection_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        mysql_test_connection_button.setForeground(new java.awt.Color(255, 255, 255));
        mysql_test_connection_button.setText("Test Connection");
        mysql_test_connection_button.setBorder(null);
        mysql_test_connection_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysql_test_connection_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mysql_panelLayout = new javax.swing.GroupLayout(mysql_panel);
        mysql_panel.setLayout(mysql_panelLayout);
        mysql_panelLayout.setHorizontalGroup(
            mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mysql_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mysql_conn_seperator)
                    .addGroup(mysql_panelLayout.createSequentialGroup()
                        .addComponent(mysql_password_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mysql_password_input))
                    .addGroup(mysql_panelLayout.createSequentialGroup()
                        .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mysql_conn_label)
                            .addGroup(mysql_panelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(mysql_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mysql_test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mysql_panelLayout.setVerticalGroup(
            mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mysql_panelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(mysql_conn_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mysql_conn_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mysql_password_label)
                    .addComponent(mysql_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mysql_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mysql_test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        new_user_panel.setBackground(new java.awt.Color(11, 119, 169));

        new_user_label.setBackground(new java.awt.Color(255, 255, 255));
        new_user_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        new_user_label.setForeground(new java.awt.Color(255, 255, 255));
        new_user_label.setText("New User");

        name_label.setBackground(new java.awt.Color(255, 255, 255));
        name_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setText("Name");

        user_type_label.setBackground(new java.awt.Color(255, 255, 255));
        user_type_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        user_type_label.setForeground(new java.awt.Color(255, 255, 255));
        user_type_label.setText("User Type");

        user_type_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner", "Medicine/Bill Manage", "Bill Manage", "Medicine Manage" }));

        username_label.setBackground(new java.awt.Color(255, 255, 255));
        username_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username");

        password_label.setBackground(new java.awt.Color(255, 255, 255));
        password_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");

        new_user_save.setBackground(new java.awt.Color(138, 201, 38));
        new_user_save.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        new_user_save.setForeground(new java.awt.Color(255, 255, 255));
        new_user_save.setText("Save");
        new_user_save.setBorder(null);

        javax.swing.GroupLayout new_user_panelLayout = new javax.swing.GroupLayout(new_user_panel);
        new_user_panel.setLayout(new_user_panelLayout);
        new_user_panelLayout.setHorizontalGroup(
            new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_user_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(user_type_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_type_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(username_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_user_username_input))
                    .addComponent(new_user_seperator)
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(new_user_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(name_label)
                        .addGap(35, 35, 35)
                        .addComponent(new_user_name_input))
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(password_label)
                        .addGap(17, 17, 17)
                        .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(new_user_panelLayout.createSequentialGroup()
                                .addComponent(new_user_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(new_user_password_input))))
                .addContainerGap())
        );
        new_user_panelLayout.setVerticalGroup(
            new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_user_panelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(new_user_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_user_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(new_user_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_type_label)
                    .addComponent(user_type_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_user_username_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_user_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_user_save, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout setup_backgroundLayout = new javax.swing.GroupLayout(setup_background);
        setup_background.setLayout(setup_backgroundLayout);
        setup_backgroundLayout.setHorizontalGroup(
            setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mysql_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(new_user_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        setup_backgroundLayout.setVerticalGroup(
            setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mysql_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(new_user_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon(getClass().getResource("/mms/src/icon.png"));
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void mysql_save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysql_save_buttonActionPerformed
        if(mysql_password_input.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mysql Password is Empty");
        }
        else{
            db_code_write = mysql_password_input.getText();
            JOptionPane.showMessageDialog(null, "MySQL Password Saved. Now You Test the connection");
        }
    }//GEN-LAST:event_mysql_save_buttonActionPerformed

    private void mysql_test_connection_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysql_test_connection_buttonActionPerformed
        String db_url = "jdbc:mysql://localhost:3306";
        String db_username = "root";
        String db_password = db_code_write; 
        
        try {
            connect = DriverManager.getConnection(db_url, db_username, db_password);
            JOptionPane.showMessageDialog(null, "Connection Successful now you can create a user.");
            
            FileWriter myWriter;
            try {
                myWriter = new FileWriter("setup_test.txt");
                myWriter.write(db_code_write);
                myWriter.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } 
            
            try{
                mysql.stmt = connect.createStatement();
                String sql = "use pharma_db;";
                mysql.result = mysql.stmt.executeQuery(sql);
            }
            catch(SQLException database_error_message){
                mysql.stmt = connect.createStatement();
                String sql = "CREATE DATABASE pharma_db";
                mysql.result = mysql.stmt.executeQuery(sql);
            }
        }
        catch(SQLException database_error_message){
            JOptionPane.showMessageDialog(null, "Wrong Password or you have not installed MYSQL");
            mysql_password_input.setText("");
        }
    }//GEN-LAST:event_mysql_test_connection_buttonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pharmear_setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmear_setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmear_setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmear_setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmear_setup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel mysql_conn_label;
    private javax.swing.JSeparator mysql_conn_seperator;
    private javax.swing.JPanel mysql_panel;
    private javax.swing.JPasswordField mysql_password_input;
    private javax.swing.JLabel mysql_password_label;
    private javax.swing.JButton mysql_save_button;
    private javax.swing.JButton mysql_test_connection_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel new_user_label;
    private javax.swing.JTextField new_user_name_input;
    private javax.swing.JPanel new_user_panel;
    private javax.swing.JPasswordField new_user_password_input;
    private javax.swing.JButton new_user_save;
    private javax.swing.JSeparator new_user_seperator;
    private javax.swing.JTextField new_user_username_input;
    private javax.swing.JLabel password_label;
    private javax.swing.JPanel setup_background;
    private javax.swing.JComboBox<String> user_type_comboBox;
    private javax.swing.JLabel user_type_label;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
