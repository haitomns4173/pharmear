package mms;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;

public class loginPage extends javax.swing.JFrame {
    
    static String username_stored;
    static int user_id_stored;
    static int user_code;
    
    public loginPage() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        red_lable_right = new javax.swing.JPanel();
        blue_label_right = new javax.swing.JPanel();
        icon_label = new javax.swing.JLabel();
        db_status_label = new javax.swing.JLabel();
        login_title_label = new javax.swing.JLabel();
        title_seperator = new javax.swing.JSeparator();
        login_title_label1 = new javax.swing.JLabel();
        login_title_label2 = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        password_input = new javax.swing.JPasswordField();
        login_buttom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        setName("login_page"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        red_lable_right.setBackground(new java.awt.Color(207, 44, 14));
        red_lable_right.setToolTipText("");

        blue_label_right.setBackground(new java.awt.Color(11, 119, 169));
        blue_label_right.setToolTipText("");

        icon_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icon.png"))); // NOI18N

        db_status_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        db_status_label.setLabelFor(db_status_label);
        db_status_label.setText(".");

        javax.swing.GroupLayout blue_label_rightLayout = new javax.swing.GroupLayout(blue_label_right);
        blue_label_right.setLayout(blue_label_rightLayout);
        blue_label_rightLayout.setHorizontalGroup(
            blue_label_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blue_label_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blue_label_rightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(db_status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        blue_label_rightLayout.setVerticalGroup(
            blue_label_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blue_label_rightLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(db_status_label, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        login_title_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_title_label.setForeground(new java.awt.Color(255, 255, 255));
        login_title_label.setText("Login");

        title_seperator.setForeground(new java.awt.Color(255, 255, 255));

        login_title_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_title_label1.setForeground(new java.awt.Color(255, 255, 255));
        login_title_label1.setText("Username");

        login_title_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_title_label2.setForeground(new java.awt.Color(255, 255, 255));
        login_title_label2.setText("Passowrd");

        username_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_inputKeyPressed(evt);
            }
        });

        password_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        password_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_inputKeyPressed(evt);
            }
        });

        login_buttom.setBackground(new java.awt.Color(49, 122, 121));
        login_buttom.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        login_buttom.setForeground(new java.awt.Color(255, 255, 255));
        login_buttom.setText("Login");
        login_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout red_lable_rightLayout = new javax.swing.GroupLayout(red_lable_right);
        red_lable_right.setLayout(red_lable_rightLayout);
        red_lable_rightLayout.setHorizontalGroup(
            red_lable_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(red_lable_rightLayout.createSequentialGroup()
                .addGroup(red_lable_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(red_lable_rightLayout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(red_lable_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_title_label1)
                            .addComponent(title_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_title_label2)
                            .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(red_lable_rightLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(login_title_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(blue_label_right, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        red_lable_rightLayout.setVerticalGroup(
            red_lable_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blue_label_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(red_lable_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_title_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(login_title_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_title_label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(login_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(red_lable_right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_lable_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttomActionPerformed
        String username = username_input.getText().trim();
        String password = password_input.getText();
        
        username_stored = username;
        
        try {
            mysql.login_validator(username, password) ;
        } 
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }
        if(mysql.login_status){
            setVisible(false);
            dispose();
            
            medicine_management main_medicine = new medicine_management();
            main_medicine.setVisible(true);
        }
    }//GEN-LAST:event_login_buttomActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\MMS\\MMS\\MMS\\src\\mms\\src\\icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void username_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            password_input.requestFocus();
        }
    }//GEN-LAST:event_username_inputKeyPressed

    private void password_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            login_buttom.doClick(1);
        }
    }//GEN-LAST:event_password_inputKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blue_label_right;
    public static javax.swing.JLabel db_status_label;
    private javax.swing.JLabel icon_label;
    private javax.swing.JButton login_buttom;
    private javax.swing.JLabel login_title_label;
    private javax.swing.JLabel login_title_label1;
    private javax.swing.JLabel login_title_label2;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JPanel red_lable_right;
    private javax.swing.JSeparator title_seperator;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}