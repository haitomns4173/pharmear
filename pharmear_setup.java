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
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setup_scroll = new javax.swing.JScrollPane();
        setup_background = new javax.swing.JPanel();
        setup_menu_panel = new javax.swing.JPanel();
        sertup_pharmear_icon = new javax.swing.JLabel();
        setup_pharmear_panel = new javax.swing.JPanel();
        setup_pharmear_label = new javax.swing.JLabel();
        setup_mysql = new javax.swing.JButton();
        setup_user_add = new javax.swing.JButton();
        setup_store_details = new javax.swing.JButton();
        setup_tabbed_panel = new javax.swing.JTabbedPane();
        mysql_panel = new javax.swing.JPanel();
        mysql_conn_label = new javax.swing.JLabel();
        mysql_conn_seperator = new javax.swing.JSeparator();
        mysql_password_label = new javax.swing.JLabel();
        mysql_password_input = new javax.swing.JPasswordField();
        mysql_save_button = new javax.swing.JButton();
        mysql_test_connection_button = new javax.swing.JButton();
        mysql_next_button = new javax.swing.JButton();
        about_developer = new javax.swing.JLabel();
        setup_about_developer_seperator = new javax.swing.JSeparator();
        developer = new javax.swing.JLabel();
        developer_name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        email_value = new javax.swing.JLabel();
        software_version = new javax.swing.JLabel();
        setup_software_version_seperator = new javax.swing.JSeparator();
        version = new javax.swing.JLabel();
        version_value = new javax.swing.JLabel();
        setup_requirements = new javax.swing.JLabel();
        requirements_seperator = new javax.swing.JSeparator();
        requirement_value = new javax.swing.JLabel();
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
        new_user_next = new javax.swing.JButton();
        userr_type_info_label = new javax.swing.JLabel();
        user_info_seperator = new javax.swing.JSeparator();
        owner_info = new javax.swing.JLabel();
        med_bill_info = new javax.swing.JLabel();
        bill_info = new javax.swing.JLabel();
        med_info = new javax.swing.JLabel();
        shop_details_panel = new javax.swing.JPanel();
        user_shopDtr_label = new javax.swing.JLabel();
        user_shopDtr_seperator = new javax.swing.JSeparator();
        user_shopDtr_shop_name = new javax.swing.JLabel();
        user_shopDtr_shop_name_input = new javax.swing.JTextField();
        user_shopDtr_address_label = new javax.swing.JLabel();
        user_shopDtr_address_input = new javax.swing.JTextField();
        user_shopDtr_shop_contact = new javax.swing.JLabel();
        user_shopDtr_shop_contact_input = new javax.swing.JTextField();
        user_shopDtr_update_button = new javax.swing.JButton();
        shop_details_error = new javax.swing.JLabel();
        vat_no_label = new javax.swing.JLabel();
        vat_no_input = new javax.swing.JTextField();
        mysql_test_connection_button3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        setup_finish_panel = new javax.swing.JPanel();
        finish_thanks_label = new javax.swing.JLabel();
        thanks_label_1 = new javax.swing.JLabel();
        thanks_label_2 = new javax.swing.JLabel();
        thanks_email = new javax.swing.JLabel();
        thanks_label_3 = new javax.swing.JLabel();
        thanks_label_4 = new javax.swing.JLabel();
        finish_note_lable = new javax.swing.JLabel();
        finish_note_seperator = new javax.swing.JSeparator();
        finish_note_1 = new javax.swing.JLabel();
        finish_note_2 = new javax.swing.JLabel();
        complete_finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmear Setup");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        setup_background.setBackground(new java.awt.Color(11, 119, 169));

        setup_menu_panel.setBackground(new java.awt.Color(248, 150, 30));

        sertup_pharmear_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icon_40px.png"))); // NOI18N

        setup_pharmear_panel.setBackground(new java.awt.Color(234, 53, 70));

        setup_pharmear_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        setup_pharmear_label.setForeground(new java.awt.Color(255, 255, 255));
        setup_pharmear_label.setText("Phaemear Setup");

        javax.swing.GroupLayout setup_pharmear_panelLayout = new javax.swing.GroupLayout(setup_pharmear_panel);
        setup_pharmear_panel.setLayout(setup_pharmear_panelLayout);
        setup_pharmear_panelLayout.setHorizontalGroup(
            setup_pharmear_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_pharmear_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(setup_pharmear_label)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        setup_pharmear_panelLayout.setVerticalGroup(
            setup_pharmear_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_pharmear_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setup_pharmear_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setup_mysql.setBackground(new java.awt.Color(36, 130, 119));
        setup_mysql.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setup_mysql.setForeground(new java.awt.Color(255, 255, 255));
        setup_mysql.setText("MySQL Connection");
        setup_mysql.setBorder(null);

        setup_user_add.setBackground(new java.awt.Color(20, 116, 111));
        setup_user_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setup_user_add.setForeground(new java.awt.Color(255, 255, 255));
        setup_user_add.setText("User Add");
        setup_user_add.setBorder(null);

        setup_store_details.setBackground(new java.awt.Color(3, 102, 102));
        setup_store_details.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setup_store_details.setForeground(new java.awt.Color(255, 255, 255));
        setup_store_details.setText("Store Details");
        setup_store_details.setBorder(null);

        javax.swing.GroupLayout setup_menu_panelLayout = new javax.swing.GroupLayout(setup_menu_panel);
        setup_menu_panel.setLayout(setup_menu_panelLayout);
        setup_menu_panelLayout.setHorizontalGroup(
            setup_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_store_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setup_mysql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setup_user_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(setup_menu_panelLayout.createSequentialGroup()
                .addComponent(setup_pharmear_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setup_menu_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sertup_pharmear_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        setup_menu_panelLayout.setVerticalGroup(
            setup_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sertup_pharmear_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_pharmear_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(setup_mysql, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_user_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_store_details, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setup_tabbed_panel.setBackground(new java.awt.Color(11, 119, 169));
        setup_tabbed_panel.setForeground(new java.awt.Color(255, 255, 255));
        setup_tabbed_panel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

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

        mysql_next_button.setBackground(new java.awt.Color(46, 196, 182));
        mysql_next_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        mysql_next_button.setForeground(new java.awt.Color(0, 0, 0));
        mysql_next_button.setText("Next");
        mysql_next_button.setBorder(null);
        mysql_next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysql_next_buttonActionPerformed(evt);
            }
        });

        about_developer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        about_developer.setForeground(new java.awt.Color(255, 255, 255));
        about_developer.setText("About Developer");

        developer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setText("Developer Name");

        developer_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        developer_name.setForeground(new java.awt.Color(255, 255, 255));
        developer_name.setText("Haitomns G");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");

        email_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_value.setForeground(new java.awt.Color(255, 255, 255));
        email_value.setText("haitomns4173@gmail.com");

        software_version.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        software_version.setForeground(new java.awt.Color(255, 255, 255));
        software_version.setText("Software Version");

        version.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        version.setForeground(new java.awt.Color(255, 255, 255));
        version.setText("Version");

        version_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        version_value.setForeground(new java.awt.Color(255, 255, 255));
        version_value.setText("1.2");

        setup_requirements.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setup_requirements.setForeground(new java.awt.Color(255, 255, 255));
        setup_requirements.setText("Requirements : ");

        requirement_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requirement_value.setForeground(new java.awt.Color(255, 255, 255));
        requirement_value.setText("1. MySQL Should be installed, and you should have the password to installed it.");

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
                        .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mysql_panelLayout.createSequentialGroup()
                                .addComponent(mysql_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mysql_test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mysql_next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mysql_password_input)))
                    .addComponent(setup_about_developer_seperator)
                    .addComponent(setup_software_version_seperator)
                    .addComponent(requirement_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(requirements_seperator)
                    .addGroup(mysql_panelLayout.createSequentialGroup()
                        .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mysql_conn_label)
                            .addComponent(software_version)
                            .addComponent(about_developer)
                            .addGroup(mysql_panelLayout.createSequentialGroup()
                                .addComponent(developer)
                                .addGap(29, 29, 29)
                                .addComponent(developer_name))
                            .addGroup(mysql_panelLayout.createSequentialGroup()
                                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(version))
                                .addGap(85, 85, 85)
                                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(version_value)
                                    .addComponent(email_value)))
                            .addComponent(setup_requirements))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mysql_panelLayout.setVerticalGroup(
            mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mysql_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mysql_conn_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mysql_conn_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mysql_password_label)
                    .addComponent(mysql_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mysql_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mysql_test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mysql_next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(about_developer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_about_developer_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developer)
                    .addComponent(developer_name))
                .addGap(2, 2, 2)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(email_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(software_version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_software_version_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(mysql_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(version_value)
                    .addComponent(version))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setup_requirements)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requirements_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requirement_value)
                .addContainerGap())
        );

        setup_tabbed_panel.addTab("MySQL", mysql_panel);

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
        new_user_save.setText("Add");
        new_user_save.setBorder(null);
        new_user_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_user_saveActionPerformed(evt);
            }
        });

        new_user_next.setBackground(new java.awt.Color(46, 196, 182));
        new_user_next.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        new_user_next.setForeground(new java.awt.Color(0, 0, 0));
        new_user_next.setText("Next");
        new_user_next.setBorder(null);
        new_user_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_user_nextActionPerformed(evt);
            }
        });

        userr_type_info_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userr_type_info_label.setForeground(new java.awt.Color(255, 255, 255));
        userr_type_info_label.setText("User Type Info :");

        owner_info.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        owner_info.setForeground(new java.awt.Color(255, 255, 255));
        owner_info.setText("1. Owner : The main Person of the store with all the Permission to control the Software");

        med_bill_info.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        med_bill_info.setForeground(new java.awt.Color(255, 255, 255));
        med_bill_info.setText("2. Medcine/Bill Manage : These type of user can make Bills as well as manage Medicine");

        bill_info.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bill_info.setForeground(new java.awt.Color(255, 255, 255));
        bill_info.setText("3. Bill Manage : There type of user can just make Bills and nothing else.");

        med_info.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        med_info.setForeground(new java.awt.Color(255, 255, 255));
        med_info.setText("4. Medcine Manage : These users have permission to manage medicine.");

        javax.swing.GroupLayout new_user_panelLayout = new javax.swing.GroupLayout(new_user_panel);
        new_user_panel.setLayout(new_user_panelLayout);
        new_user_panelLayout.setHorizontalGroup(
            new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_user_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_info_seperator)
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
                        .addComponent(name_label)
                        .addGap(35, 35, 35)
                        .addComponent(new_user_name_input))
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addComponent(password_label)
                        .addGap(17, 17, 17)
                        .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(new_user_panelLayout.createSequentialGroup()
                                .addComponent(new_user_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(new_user_next, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(new_user_password_input)))
                    .addGroup(new_user_panelLayout.createSequentialGroup()
                        .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(new_user_label)
                            .addComponent(userr_type_info_label)
                            .addComponent(owner_info)
                            .addComponent(med_bill_info)
                            .addComponent(bill_info)
                            .addComponent(med_info))
                        .addGap(0, 54, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(new_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_user_save, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_user_next, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(userr_type_info_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_info_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(owner_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(med_bill_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(med_info)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setup_tabbed_panel.addTab("New User", new_user_panel);

        shop_details_panel.setBackground(new java.awt.Color(25, 130, 196));

        user_shopDtr_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_label.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_label.setText("Shop Details");

        user_shopDtr_shop_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_shop_name.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_shop_name.setText("Shop Name");

        user_shopDtr_shop_name_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_shop_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_shop_name_inputKeyPressed(evt);
            }
        });

        user_shopDtr_address_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_address_label.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_address_label.setText("Address");

        user_shopDtr_address_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_address_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_address_inputKeyPressed(evt);
            }
        });

        user_shopDtr_shop_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_shopDtr_shop_contact.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_shop_contact.setText("Contact");

        user_shopDtr_shop_contact_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_shopDtr_shop_contact_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_shopDtr_shop_contact_inputKeyPressed(evt);
            }
        });

        user_shopDtr_update_button.setBackground(new java.awt.Color(138, 201, 38));
        user_shopDtr_update_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        user_shopDtr_update_button.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_update_button.setText("Add");
        user_shopDtr_update_button.setBorder(null);
        user_shopDtr_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_shopDtr_update_buttonActionPerformed(evt);
            }
        });

        shop_details_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shop_details_error.setForeground(new java.awt.Color(255, 255, 255));
        shop_details_error.setText("Shop Error");

        vat_no_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vat_no_label.setForeground(new java.awt.Color(255, 255, 255));
        vat_no_label.setText("VAT No.");

        vat_no_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        vat_no_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vat_no_inputKeyPressed(evt);
            }
        });

        mysql_test_connection_button3.setBackground(new java.awt.Color(46, 196, 182));
        mysql_test_connection_button3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        mysql_test_connection_button3.setForeground(new java.awt.Color(0, 0, 0));
        mysql_test_connection_button3.setText("Finish");
        mysql_test_connection_button3.setBorder(null);
        mysql_test_connection_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysql_test_connection_button3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Note : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("1. Enter all the details correct because these details will appear in the bill that you make");

        javax.swing.GroupLayout shop_details_panelLayout = new javax.swing.GroupLayout(shop_details_panel);
        shop_details_panel.setLayout(shop_details_panelLayout);
        shop_details_panelLayout.setHorizontalGroup(
            shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_shopDtr_label)
                    .addGroup(shop_details_panelLayout.createSequentialGroup()
                        .addComponent(user_shopDtr_shop_name)
                        .addGap(30, 30, 30)
                        .addComponent(user_shopDtr_shop_name_input))
                    .addGroup(shop_details_panelLayout.createSequentialGroup()
                        .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_shopDtr_address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vat_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_shopDtr_shop_contact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(shop_details_panelLayout.createSequentialGroup()
                                .addComponent(shop_details_error)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(shop_details_panelLayout.createSequentialGroup()
                                .addComponent(user_shopDtr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                                .addComponent(mysql_test_connection_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(user_shopDtr_shop_contact_input)
                            .addComponent(vat_no_input)
                            .addComponent(user_shopDtr_address_input)))
                    .addComponent(user_shopDtr_seperator)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        shop_details_panelLayout.setVerticalGroup(
            shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_shopDtr_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_shopDtr_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_shopDtr_shop_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_shopDtr_shop_name))
                .addGap(7, 7, 7)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_shopDtr_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_shopDtr_address_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_shopDtr_shop_contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_shopDtr_shop_contact))
                .addGap(7, 7, 7)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shop_details_panelLayout.createSequentialGroup()
                        .addComponent(vat_no_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shop_details_error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_shopDtr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mysql_test_connection_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(vat_no_label))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        setup_tabbed_panel.addTab("Shop Details", shop_details_panel);

        setup_finish_panel.setBackground(new java.awt.Color(25, 130, 196));

        finish_thanks_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        finish_thanks_label.setForeground(new java.awt.Color(255, 255, 255));
        finish_thanks_label.setText("Thanks for Using Pharmear,");

        thanks_label_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanks_label_1.setForeground(new java.awt.Color(255, 255, 255));
        thanks_label_1.setText("If you have any trouble in program,");

        thanks_label_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanks_label_2.setForeground(new java.awt.Color(255, 255, 255));
        thanks_label_2.setText(" or bugs in the program you and Email to.");

        thanks_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thanks_email.setForeground(new java.awt.Color(255, 255, 255));
        thanks_email.setText("haitomns4173@gmail.com");

        thanks_label_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanks_label_3.setForeground(new java.awt.Color(255, 255, 255));
        thanks_label_3.setText("Hope you daily store management will be ");

        thanks_label_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanks_label_4.setForeground(new java.awt.Color(255, 255, 255));
        thanks_label_4.setText("easy with our software.");

        finish_note_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finish_note_lable.setForeground(new java.awt.Color(255, 255, 255));
        finish_note_lable.setText("Note :");

        finish_note_1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finish_note_1.setForeground(new java.awt.Color(255, 255, 255));
        finish_note_1.setText("The program will close once you press complete, Open it again then you can continue");

        finish_note_2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finish_note_2.setForeground(new java.awt.Color(255, 255, 255));
        finish_note_2.setText("to the main program by logging into the program.");

        complete_finish.setBackground(new java.awt.Color(46, 196, 182));
        complete_finish.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        complete_finish.setForeground(new java.awt.Color(0, 0, 0));
        complete_finish.setText("Complete");
        complete_finish.setBorder(null);
        complete_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_finishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setup_finish_panelLayout = new javax.swing.GroupLayout(setup_finish_panel);
        setup_finish_panel.setLayout(setup_finish_panelLayout);
        setup_finish_panelLayout.setHorizontalGroup(
            setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_finish_panelLayout.createSequentialGroup()
                .addGroup(setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(complete_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addGroup(setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(thanks_label_1)
                                .addComponent(finish_thanks_label)))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(thanks_email))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addGroup(setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(thanks_label_3)
                                .addComponent(thanks_label_2)
                                .addGroup(setup_finish_panelLayout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(thanks_label_4))))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(finish_note_lable))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(finish_note_2))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(finish_note_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(setup_finish_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(finish_note_1))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        setup_finish_panelLayout.setVerticalGroup(
            setup_finish_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_finish_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finish_thanks_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanks_label_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanks_label_2)
                .addGap(18, 18, 18)
                .addComponent(thanks_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thanks_label_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanks_label_4)
                .addGap(64, 64, 64)
                .addComponent(finish_note_lable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish_note_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish_note_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish_note_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complete_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setup_tabbed_panel.addTab("Finish", setup_finish_panel);

        javax.swing.GroupLayout setup_backgroundLayout = new javax.swing.GroupLayout(setup_background);
        setup_background.setLayout(setup_backgroundLayout);
        setup_backgroundLayout.setHorizontalGroup(
            setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setup_backgroundLayout.createSequentialGroup()
                .addComponent(setup_menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(setup_tabbed_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        setup_backgroundLayout.setVerticalGroup(
            setup_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(setup_backgroundLayout.createSequentialGroup()
                .addComponent(setup_tabbed_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setup_scroll.setViewportView(setup_background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_scroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setup_scroll)
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

    private void mysql_next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysql_next_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mysql_next_buttonActionPerformed

    private void new_user_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_user_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_user_saveActionPerformed

    private void user_shopDtr_shop_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_shop_name_inputKeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_shopDtr_address_input.requestFocus();
        }
    }//GEN-LAST:event_user_shopDtr_shop_name_inputKeyPressed

    private void user_shopDtr_address_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_address_inputKeyPressed
        user_shopDtr_update_button.setEnabled(true);
        shop_details_error.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_shopDtr_shop_contact_input.requestFocus();
        }
    }//GEN-LAST:event_user_shopDtr_address_inputKeyPressed

    private void user_shopDtr_shop_contact_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_shopDtr_shop_contact_inputKeyPressed
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
    }//GEN-LAST:event_user_shopDtr_shop_contact_inputKeyPressed

    private void user_shopDtr_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_shopDtr_update_buttonActionPerformed
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
    }//GEN-LAST:event_user_shopDtr_update_buttonActionPerformed

    private void vat_no_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vat_no_inputKeyPressed
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
    }//GEN-LAST:event_vat_no_inputKeyPressed

    private void new_user_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_user_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_user_nextActionPerformed

    private void mysql_test_connection_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysql_test_connection_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mysql_test_connection_button3ActionPerformed

    private void complete_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_finishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complete_finishActionPerformed

    public static void restore_find(){
        String[] multiple_database;
        int restore_file_check;
        String  restore_file_path;
        
        File directory_restore = new File("pharmear_backup");
        multiple_database = directory_restore.list();
        
        Arrays.sort(multiple_database);
        restore_file_check = multiple_database.length - 1;
        
        if(restore_file_check < 0){
            File restore_full_path = new File("main_database/pharmear_db.sql");
            restore_file_path = restore_full_path.getAbsolutePath();
            
            System.out.println(restore_file_path);
            
            try {
                mysql.restore_from_setup(restore_file_path);
            } catch (SQLException | IOException ex) {
                Logger.getLogger(pharmear_setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            File restore_full_path = new File("pharmear_backup/"+multiple_database[restore_file_check]);
            restore_file_path = restore_full_path.getAbsolutePath();
            
            System.out.println(restore_file_path);
            
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
    private javax.swing.JLabel about_developer;
    private javax.swing.JLabel bill_info;
    private javax.swing.JButton complete_finish;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel developer_name;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email_value;
    private javax.swing.JLabel finish_note_1;
    private javax.swing.JLabel finish_note_2;
    private javax.swing.JLabel finish_note_lable;
    private javax.swing.JSeparator finish_note_seperator;
    private javax.swing.JLabel finish_thanks_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel med_bill_info;
    private javax.swing.JLabel med_info;
    private javax.swing.JLabel mysql_conn_label;
    private javax.swing.JSeparator mysql_conn_seperator;
    private javax.swing.JButton mysql_next_button;
    private javax.swing.JPanel mysql_panel;
    private javax.swing.JPasswordField mysql_password_input;
    private javax.swing.JLabel mysql_password_label;
    private javax.swing.JButton mysql_save_button;
    private javax.swing.JButton mysql_test_connection_button;
    private javax.swing.JButton mysql_test_connection_button3;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel new_user_label;
    private javax.swing.JTextField new_user_name_input;
    private javax.swing.JButton new_user_next;
    private javax.swing.JPanel new_user_panel;
    private javax.swing.JPasswordField new_user_password_input;
    private javax.swing.JButton new_user_save;
    private javax.swing.JSeparator new_user_seperator;
    private javax.swing.JTextField new_user_username_input;
    private javax.swing.JLabel owner_info;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel requirement_value;
    private javax.swing.JSeparator requirements_seperator;
    private javax.swing.JLabel sertup_pharmear_icon;
    private javax.swing.JSeparator setup_about_developer_seperator;
    private javax.swing.JPanel setup_background;
    private javax.swing.JPanel setup_finish_panel;
    private javax.swing.JPanel setup_menu_panel;
    private javax.swing.JButton setup_mysql;
    private javax.swing.JLabel setup_pharmear_label;
    private javax.swing.JPanel setup_pharmear_panel;
    private javax.swing.JLabel setup_requirements;
    private javax.swing.JScrollPane setup_scroll;
    private javax.swing.JSeparator setup_software_version_seperator;
    private javax.swing.JButton setup_store_details;
    private javax.swing.JTabbedPane setup_tabbed_panel;
    private javax.swing.JButton setup_user_add;
    private javax.swing.JLabel shop_details_error;
    private javax.swing.JPanel shop_details_panel;
    private javax.swing.JLabel software_version;
    private javax.swing.JLabel thanks_email;
    private javax.swing.JLabel thanks_label_1;
    private javax.swing.JLabel thanks_label_2;
    private javax.swing.JLabel thanks_label_3;
    private javax.swing.JLabel thanks_label_4;
    private javax.swing.JSeparator user_info_seperator;
    private javax.swing.JTextField user_shopDtr_address_input;
    private javax.swing.JLabel user_shopDtr_address_label;
    private javax.swing.JLabel user_shopDtr_label;
    private javax.swing.JSeparator user_shopDtr_seperator;
    private javax.swing.JLabel user_shopDtr_shop_contact;
    private javax.swing.JTextField user_shopDtr_shop_contact_input;
    private javax.swing.JLabel user_shopDtr_shop_name;
    private javax.swing.JTextField user_shopDtr_shop_name_input;
    private javax.swing.JButton user_shopDtr_update_button;
    private javax.swing.JComboBox<String> user_type_comboBox;
    private javax.swing.JLabel user_type_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel userr_type_info_label;
    private javax.swing.JTextField vat_no_input;
    private javax.swing.JLabel vat_no_label;
    private javax.swing.JLabel version;
    private javax.swing.JLabel version_value;
    // End of variables declaration//GEN-END:variables
}
