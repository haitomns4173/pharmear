package mms;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static mms.mysql.connect;

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
        shop_details_panel2 = new javax.swing.JPanel();
        user_shopDtr_label2 = new javax.swing.JLabel();
        user_shopDtr_seperator2 = new javax.swing.JSeparator();
        user_shopDtr_shop_name2 = new javax.swing.JLabel();
        user_shopDtr_shop_name_input2 = new javax.swing.JTextField();
        user_shopDtr_address_label2 = new javax.swing.JLabel();
        user_shopDtr_address_input2 = new javax.swing.JTextField();
        user_shopDtr_shop_contact2 = new javax.swing.JLabel();
        user_shopDtr_shop_contact_input2 = new javax.swing.JTextField();
        user_shopDtr_update_button2 = new javax.swing.JButton();
        shop_details_error2 = new javax.swing.JLabel();
        vat_no_label2 = new javax.swing.JLabel();
        vat_no_input2 = new javax.swing.JTextField();

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
                        .addGap(0, 183, Short.MAX_VALUE)))
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

        shop_details_panel2.setBackground(new java.awt.Color(25, 130, 196));

        user_shopDtr_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_label2.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_label2.setText("Shop Details");

        user_shopDtr_shop_name2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_shop_name2.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_shop_name2.setText("Shop Name");

        user_shopDtr_shop_name_input2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_shop_name_input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_shop_name_input2KeyPressed(evt);
            }
        });

        user_shopDtr_address_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_address_label2.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_address_label2.setText("Address");

        user_shopDtr_address_input2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_address_input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_address_input2KeyPressed(evt);
            }
        });

        user_shopDtr_shop_contact2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_shop_contact2.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_shop_contact2.setText("Contact");

        user_shopDtr_shop_contact_input2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_shop_contact_input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_shop_contact_input2KeyPressed(evt);
            }
        });

        user_shopDtr_update_button2.setBackground(new java.awt.Color(248, 150, 30));
        user_shopDtr_update_button2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        user_shopDtr_update_button2.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_update_button2.setText("Update");
        user_shopDtr_update_button2.setBorder(null);
        user_shopDtr_update_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_shopDtr_update_button2ActionPerformed(evt);
            }
        });

        shop_details_error2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shop_details_error2.setForeground(new java.awt.Color(255, 255, 255));
        shop_details_error2.setText("Shop Error");

        vat_no_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vat_no_label2.setForeground(new java.awt.Color(255, 255, 255));
        vat_no_label2.setText("VAT No.");

        vat_no_input2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        vat_no_input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vat_no_input2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout shop_details_panel2Layout = new javax.swing.GroupLayout(shop_details_panel2);
        shop_details_panel2.setLayout(shop_details_panel2Layout);
        shop_details_panel2Layout.setHorizontalGroup(
            shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_label2)
                    .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(user_shopDtr_seperator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(shop_details_panel2Layout.createSequentialGroup()
                            .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(shop_details_panel2Layout.createSequentialGroup()
                                    .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(user_shopDtr_shop_name2)
                                        .addComponent(user_shopDtr_shop_contact2))
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, shop_details_panel2Layout.createSequentialGroup()
                                    .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(user_shopDtr_address_label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vat_no_label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(shop_details_error2)
                                .addComponent(user_shopDtr_update_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_shopDtr_address_input2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addComponent(user_shopDtr_shop_contact_input2)
                                .addComponent(user_shopDtr_shop_name_input2)
                                .addComponent(vat_no_input2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shop_details_panel2Layout.setVerticalGroup(
            shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_shopDtr_label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_shopDtr_seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_shop_name2)
                    .addGroup(shop_details_panel2Layout.createSequentialGroup()
                        .addComponent(user_shopDtr_shop_name_input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_shopDtr_address_input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_shopDtr_address_label2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_shop_contact2)
                    .addComponent(user_shopDtr_shop_contact_input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shop_details_panel2Layout.createSequentialGroup()
                        .addComponent(vat_no_input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shop_details_error2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_shopDtr_update_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vat_no_label2))
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
                    .addComponent(new_user_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shop_details_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        setup_backgroundLayout.setVerticalGroup(
            setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mysql_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(new_user_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shop_details_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(setup_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            
            FileWriter myWriter;
            try {
                myWriter = new FileWriter("setup_test.phe");
                myWriter.write(db_code_write);
                myWriter.close();
                JOptionPane.showMessageDialog(null, "Connection Successful now you can create a user.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } 
            
            try{
                mysql.stmt = connect.createStatement();
                String sql = "use pharma_db;";
                mysql.result = mysql.stmt.executeQuery(sql);
                restore_find();
            }
            catch(SQLException database_error_message){
                mysql.stmt = connect.createStatement();
                String sql = "CREATE DATABASE pharma_db";
                mysql.stmt.executeUpdate(sql);
                restore_find();
            }
        }
        catch(SQLException database_error_message){
            JOptionPane.showMessageDialog(null, "Wrong Password or you have not installed MYSQL");
            mysql_password_input.setText("");
        }
    }//GEN-LAST:event_mysql_test_connection_buttonActionPerformed

    private void user_shopDtr_shop_name_input2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_shop_name_input2KeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_shopDtr_address_input.requestFocus();
        }
    }//GEN-LAST:event_user_shopDtr_shop_name_input2KeyPressed

    private void user_shopDtr_address_input2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_address_input2KeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_shopDtr_shop_contact_input.requestFocus();
        }
    }//GEN-LAST:event_user_shopDtr_address_input2KeyPressed

    private void user_shopDtr_shop_contact_input2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_shop_contact_input2KeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");

        char text_in_shop_contact = evt.getKeyChar();
        if (Character.isDigit(text_in_shop_contact)||Character.isISOControl(text_in_shop_contact)) {
            shop_details_error.setText("");
            user_shopDtr_shop_contact_input.setEditable(true);
        }
        else{
            shop_details_error.setText("Wrong Number");
            user_shopDtr_shop_contact_input.setEditable(false);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            vat_no_input.requestFocus();
        }
    }//GEN-LAST:event_user_shopDtr_shop_contact_input2KeyPressed

    private void user_shopDtr_update_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_shopDtr_update_button2ActionPerformed
        String shop_name_update, shop_address_update, shop_contact_update, shop_vat;
        shop_name_update = user_shopDtr_shop_name_input.getText();
        shop_address_update = user_shopDtr_address_input.getText();
        shop_contact_update = user_shopDtr_shop_contact_input.getText();
        shop_vat = vat_no_input.getText();

        if(shop_name_update.trim().isEmpty() || shop_address_update.trim().isEmpty() || shop_contact_update.trim().isEmpty() || shop_vat.trim().isEmpty()){
            user_shopDtr_update_button.setEnabled(false);
            shop_details_error.setText("Details are Empty");
            if(shop_name_update.trim().isEmpty()){
                user_shopDtr_shop_name_input.requestFocus();
            }
            else if(shop_address_update.trim().isEmpty()){
                user_shopDtr_address_input.requestFocus();
            }
            else if(shop_vat.trim().isEmpty()){
                vat_no_input.requestFocus();
            }
            else{
                user_shopDtr_shop_contact_input.requestFocus();
            }
        }
        else if(user_shopDtr_shop_contact_input.getText().length() != 10){
            shop_details_error.setText("Phone Nuumber is of 10 Digits");
        }
        else if(vat_no_input.getText().length() < 4 || vat_no_input.getText().length() > 15){
            shop_details_error.setText("Vat Number is of 4-15 Digits");
        }
        else{
            int shopDtr_update_confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the details ?", "Update Shop Details",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (shopDtr_update_confirm) {
                case JOptionPane.NO_OPTION -> {
                    user_shopDtr_shop_name_input.setText(mysql.company_name);
                    user_shopDtr_address_input.setText(mysql.company_address);
                    user_shopDtr_shop_contact_input.setText(mysql.company_phoneNo);
                    shop_details_error.setText("");
                }
                case JOptionPane.YES_OPTION -> {
                    try {
                        mysql.company_update_query(shop_name_update, shop_address_update, shop_contact_update);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }

                    JOptionPane.showMessageDialog(null, "Shop Details Updated");
                }
                case JOptionPane.CLOSED_OPTION -> {
                    user_shopDtr_shop_name_input.setText(mysql.company_name);
                    user_shopDtr_address_input.setText(mysql.company_address);
                    user_shopDtr_shop_contact_input.setText(mysql.company_phoneNo);
                    shop_details_error.setText("");
                }
                default -> {
                    user_shopDtr_shop_name_input.setText(mysql.company_name);
                    user_shopDtr_address_input.setText(mysql.company_address);
                    user_shopDtr_shop_contact_input.setText(mysql.company_phoneNo);
                    shop_details_error.setText("");
                }
            }
        }
    }//GEN-LAST:event_user_shopDtr_update_button2ActionPerformed

    private void vat_no_input2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vat_no_input2KeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");

        char text_in_shop_vat = evt.getKeyChar();
        if (Character.isDigit(text_in_shop_vat)||Character.isISOControl(text_in_shop_vat)) {
            shop_details_error.setText("");
            vat_no_input.setEditable(true);
        }
        else{
            shop_details_error.setText("Wrong Number");
            vat_no_input.setEditable(false);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_shopDtr_update_button.doClick();
        }
    }//GEN-LAST:event_vat_no_input2KeyPressed

    public static void restore_find(){
        String[] multiple_database;
        int restore_file_check;
        String  restore_file_path;
        
        File directory_restore = new File("pharmear_backup");
        multiple_database = directory_restore.list();
        
        Arrays.sort(multiple_database);
        restore_file_check = multiple_database.length - 1;
        
        if(restore_file_check < 0){
            restore_file_path = "main_database/pharmear_db.sql";
            try {
                mysql.restore_from_setup(restore_file_path);
            } catch (SQLException | IOException ex) {
                Logger.getLogger(pharmear_setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            restore_file_path = "pharmear_backup/"+multiple_database[restore_file_check];
            try {
                mysql.restore_from_setup(restore_file_path);
            } catch (SQLException | IOException ex) {
                Logger.getLogger(pharmear_setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmear_setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pharmear_setup().setVisible(true);
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
    private javax.swing.JLabel shop_details_error;
    private javax.swing.JLabel shop_details_error1;
    private javax.swing.JLabel shop_details_error2;
    private javax.swing.JPanel shop_details_panel;
    private javax.swing.JPanel shop_details_panel1;
    private javax.swing.JPanel shop_details_panel2;
    private javax.swing.JTextField user_shopDtr_address_input;
    private javax.swing.JTextField user_shopDtr_address_input1;
    private javax.swing.JTextField user_shopDtr_address_input2;
    private javax.swing.JLabel user_shopDtr_address_label;
    private javax.swing.JLabel user_shopDtr_address_label1;
    private javax.swing.JLabel user_shopDtr_address_label2;
    private javax.swing.JLabel user_shopDtr_label;
    private javax.swing.JLabel user_shopDtr_label1;
    private javax.swing.JLabel user_shopDtr_label2;
    private javax.swing.JSeparator user_shopDtr_seperator;
    private javax.swing.JSeparator user_shopDtr_seperator1;
    private javax.swing.JSeparator user_shopDtr_seperator2;
    private javax.swing.JLabel user_shopDtr_shop_contact;
    private javax.swing.JLabel user_shopDtr_shop_contact1;
    private javax.swing.JLabel user_shopDtr_shop_contact2;
    private javax.swing.JTextField user_shopDtr_shop_contact_input;
    private javax.swing.JTextField user_shopDtr_shop_contact_input1;
    private javax.swing.JTextField user_shopDtr_shop_contact_input2;
    private javax.swing.JLabel user_shopDtr_shop_name;
    private javax.swing.JLabel user_shopDtr_shop_name1;
    private javax.swing.JLabel user_shopDtr_shop_name2;
    private javax.swing.JTextField user_shopDtr_shop_name_input;
    private javax.swing.JTextField user_shopDtr_shop_name_input1;
    private javax.swing.JTextField user_shopDtr_shop_name_input2;
    private javax.swing.JButton user_shopDtr_update_button;
    private javax.swing.JButton user_shopDtr_update_button1;
    private javax.swing.JButton user_shopDtr_update_button2;
    private javax.swing.JComboBox<String> user_type_comboBox;
    private javax.swing.JLabel user_type_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField vat_no_input;
    private javax.swing.JTextField vat_no_input1;
    private javax.swing.JTextField vat_no_input2;
    private javax.swing.JLabel vat_no_label;
    private javax.swing.JLabel vat_no_label1;
    private javax.swing.JLabel vat_no_label2;
    // End of variables declaration//GEN-END:variables
}
