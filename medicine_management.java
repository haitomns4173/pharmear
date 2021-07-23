package mms;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class medicine_management extends javax.swing.JFrame {
    int medicine_bill_id = 1;
    static Set<String> medicine_name_auto = new TreeSet<String>();
    static Set<String> medicine_name_auto_med_mgr = new TreeSet<String>();
    static float medicine_price = 0;
    static String expiry_cur_year, expiry_cur_month;
    static int duplicate_med_id;
    static String med_id_delete;
    static String med_batch_delete;
    
    static String medicine_unit, medicine_strength;
    static int mecicine_no_pack, medicine_no_quantity;
    static float medicien_mrp;
    
    static String total_medicine;
    static String total_quantity;
    static String total_cost;
    static String total_expired;
    static String total_out;
            
    public medicine_management() {
        initComponents();
        setExtendedState(medicine_management.MAXIMIZED_BOTH);
        
        BasicInternalFrameUI welcom_titel_hide = (BasicInternalFrameUI)welcomIframe.getUI();
        welcom_titel_hide.setNorthPane(null);
        welcomIframe.setVisible(true);
        
        switch(loginPage.user_code){
            case 0:
                break;
            case 1:
                break;
            case 2:
                sales_button.setEnabled(false);
                break;
            case 3:
                medicine_manage_button.setEnabled(false);
                sales_button.setEnabled(false);
                break;
            case 4:
                bill_button.setEnabled(false);
                sales_button.setEnabled(false);
                break;
            default:
                bill_button.setEnabled(false);
                medicine_manage_button.setEnabled(false);
                sales_button.setEnabled(false);
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_dialog = new javax.swing.JDialog();
        about_backgroung = new javax.swing.JPanel();
        about_developer = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        developer_name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        email_value = new javax.swing.JLabel();
        requirements = new javax.swing.JLabel();
        java_version = new javax.swing.JLabel();
        java_version_value = new javax.swing.JLabel();
        xaamp_version = new javax.swing.JLabel();
        xaamp_version_value = new javax.swing.JLabel();
        software_version = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        version_value = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        side_panel_menu = new javax.swing.JPanel();
        bill_button = new javax.swing.JButton();
        medicine_manage_button = new javax.swing.JButton();
        sales_button = new javax.swing.JButton();
        user_button = new javax.swing.JButton();
        title_pane = new javax.swing.JPanel();
        cardPane = new javax.swing.JPanel();
        welcomIframe = new javax.swing.JInternalFrame();
        welcome_icon = new javax.swing.JLabel();
        welcome_title = new javax.swing.JLabel();
        welcome_sub_title = new javax.swing.JLabel();
        welcome_arrow = new javax.swing.JLabel();
        welcome_user = new javax.swing.JPanel();
        welcome_user_image = new javax.swing.JLabel();
        welcome_user_label = new javax.swing.JLabel();
        welcome_sales = new javax.swing.JPanel();
        welcome_sales_image = new javax.swing.JLabel();
        welcome_sales_label = new javax.swing.JLabel();
        welcome_medicine = new javax.swing.JPanel();
        welcome_medicine_image = new javax.swing.JLabel();
        welcome_medicine_lable = new javax.swing.JLabel();
        welcome_bill = new javax.swing.JPanel();
        welcome_bill_image = new javax.swing.JLabel();
        welcome_bill_label = new javax.swing.JLabel();
        pharmacy_lable = new javax.swing.JLabel();
        status_panel = new javax.swing.JPanel();
        out_of_stock_panel = new javax.swing.JPanel();
        out_of_stock_icon = new javax.swing.JLabel();
        out_of_stock_label = new javax.swing.JLabel();
        total_out_display = new javax.swing.JLabel();
        expiry_panel = new javax.swing.JPanel();
        expired_icon = new javax.swing.JLabel();
        expirrd_label = new javax.swing.JLabel();
        total_expired_display = new javax.swing.JLabel();
        total_cost_panel = new javax.swing.JPanel();
        total_cost_icon = new javax.swing.JLabel();
        total_cost_label = new javax.swing.JLabel();
        total_cost_display = new javax.swing.JLabel();
        total_stocks_panel = new javax.swing.JPanel();
        total_stock_icon = new javax.swing.JLabel();
        total_stock_label = new javax.swing.JLabel();
        total_stocks_display = new javax.swing.JLabel();
        total_medicine_panel = new javax.swing.JPanel();
        total_medicine_icon = new javax.swing.JLabel();
        total_medicine_label = new javax.swing.JLabel();
        total_medicine_display = new javax.swing.JLabel();
        refrresh_for_status = new javax.swing.JButton();
        billIframe = new javax.swing.JInternalFrame();
        bill_title_label = new javax.swing.JPanel();
        bill_company_name = new javax.swing.JLabel();
        bill_company_phone = new javax.swing.JLabel();
        bill_company_address = new javax.swing.JLabel();
        invoide_date_panel = new javax.swing.JPanel();
        invoice_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        date_display = new javax.swing.JLabel();
        patient_details_panel = new javax.swing.JPanel();
        patient_name_input = new javax.swing.JTextField();
        patient_address_input = new javax.swing.JTextField();
        paitent_contact_input = new javax.swing.JTextField();
        patient_name_label = new javax.swing.JLabel();
        patient_address_label = new javax.swing.JLabel();
        patient_contact_label = new javax.swing.JLabel();
        patient_input_error = new javax.swing.JLabel();
        bill_tabel_scrollpanel = new javax.swing.JScrollPane();
        bill_table = new javax.swing.JTable();
        bill_table.getTableHeader().setBackground(new Color(25,130,196));
        bill_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        bill_table.getTableHeader().setForeground(Color.WHITE);
        bill_total_panel = new javax.swing.JPanel();
        bill_total_label = new javax.swing.JLabel();
        bill_total_display = new javax.swing.JLabel();
        bill_input_panel = new javax.swing.JPanel();
        add_medicine_label = new javax.swing.JLabel();
        add_medicine_seperator = new javax.swing.JSeparator();
        medinine_label = new javax.swing.JLabel();
        medicine_name_input = new javax.swing.JTextField();
        quantity_label = new javax.swing.JLabel();
        medicine_quantity_input = new javax.swing.JTextField();
        medicine_input_error = new javax.swing.JLabel();
        add_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        command_center_pane = new javax.swing.JPanel();
        command_center = new javax.swing.JLabel();
        command_center_seperator = new javax.swing.JSeparator();
        bill_save_button = new javax.swing.JButton();
        bill_discard_button = new javax.swing.JButton();
        bill_print_button = new javax.swing.JButton();
        medicineIframe = new javax.swing.JInternalFrame();
        medMgr_title_lable = new javax.swing.JPanel();
        medMgr_company_name = new javax.swing.JLabel();
        medMgr_company_phone = new javax.swing.JLabel();
        medMgr_company_address = new javax.swing.JLabel();
        medMgr_find_panel = new javax.swing.JPanel();
        find_medicine_label = new javax.swing.JLabel();
        find_medicine_seperator = new javax.swing.JSeparator();
        medicine_name_label = new javax.swing.JLabel();
        medicine_name_find_input = new javax.swing.JTextField();
        find_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        medicine_find_error = new javax.swing.JLabel();
        medMgr_tabel_scrollpanel = new javax.swing.JScrollPane();
        medMgr_table_find = new javax.swing.JTable();
        medMgr_table_find.getTableHeader().setBackground(new Color(25,130,196));
        medMgr_table_find.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        medMgr_table_find.getTableHeader().setForeground(Color.WHITE);
        medMgr_details_panel = new javax.swing.JPanel();
        medicine_label = new javax.swing.JLabel();
        medicine_details_seperator = new javax.swing.JSeparator();
        medMgr_name = new javax.swing.JLabel();
        medMgr_name_input = new javax.swing.JTextField();
        medMgr_type_label = new javax.swing.JLabel();
        medMgr_strength_label = new javax.swing.JLabel();
        medMgr_strength_input = new javax.swing.JTextField();
        medMgr_no_sheet_label = new javax.swing.JLabel();
        medMgr_no_sheet_input = new javax.swing.JTextField();
        medMgr_no_tablet_label = new javax.swing.JLabel();
        medMgr_no_tablet_input = new javax.swing.JTextField();
        medMgr_mrp_label = new javax.swing.JLabel();
        medMgr_mrp_input = new javax.swing.JTextField();
        medMgr_no_box_label = new javax.swing.JLabel();
        medMgr_no_box_input = new javax.swing.JTextField();
        medMgr_expiry_lable = new javax.swing.JLabel();
        medicine_error = new javax.swing.JLabel();
        medMgr_add_button = new javax.swing.JButton();
        medMgr_clear_button = new javax.swing.JButton();
        medMgr_type_input = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        medMgr_expiry_input_month = new javax.swing.JTextField();
        medMgr_expiry_input_year = new javax.swing.JTextField();
        medMgr_expiry_lable1 = new javax.swing.JLabel();
        salesIframe = new javax.swing.JInternalFrame();
        bar = new javax.swing.JPanel();
        justJoking = new javax.swing.JButton();
        userIframe = new javax.swing.JInternalFrame();
        user_image_panel = new javax.swing.JPanel();
        user_image_label = new javax.swing.JLabel();
        user_welcome_panel = new javax.swing.JPanel();
        user_wel_welcome = new javax.swing.JLabel();
        user_wel_users_name = new javax.swing.JLabel();
        user_wel_user_type = new javax.swing.JLabel();
        user_wel_shop_name = new javax.swing.JLabel();
        user_wel_shop_contact = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user_details_panel = new javax.swing.JPanel();
        user_details_label = new javax.swing.JLabel();
        user_details_seperator = new javax.swing.JSeparator();
        user_details_name = new javax.swing.JLabel();
        uesr_details_name_input = new javax.swing.JTextField();
        user_details_username_label = new javax.swing.JLabel();
        user_details_username_input = new javax.swing.JTextField();
        user_details_pasword_input = new javax.swing.JLabel();
        user_details_password_input = new javax.swing.JPasswordField();
        user_details_update = new javax.swing.JButton();
        username_error = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        pharmacy_lable1 = new javax.swing.JLabel();
        refrresh_for_status1 = new javax.swing.JButton();
        status_panel_user = new javax.swing.JPanel();
        out_of_stock_panel_user = new javax.swing.JPanel();
        out_of_stock_icon_user = new javax.swing.JLabel();
        out_of_stock_label_user = new javax.swing.JLabel();
        total_out_display_user = new javax.swing.JLabel();
        expiry_panel_user = new javax.swing.JPanel();
        expired_icon_user = new javax.swing.JLabel();
        expirrd_label_user = new javax.swing.JLabel();
        total_expired_display_user = new javax.swing.JLabel();
        total_cost_panel_user = new javax.swing.JPanel();
        total_cost_icon_user = new javax.swing.JLabel();
        total_cost_label_user = new javax.swing.JLabel();
        total_cost_display_user = new javax.swing.JLabel();
        total_stocks_panel_user = new javax.swing.JPanel();
        total_stock_icon_user = new javax.swing.JLabel();
        total_stock_label_user = new javax.swing.JLabel();
        total_stocks_display_user = new javax.swing.JLabel();
        total_medicine_panel_user = new javax.swing.JPanel();
        total_medicine_icon_user = new javax.swing.JLabel();
        total_medicine_label_user = new javax.swing.JLabel();
        total_medicine_display_user = new javax.swing.JLabel();

        about_dialog.setTitle("About");

        about_backgroung.setBackground(new java.awt.Color(255, 255, 255));

        about_developer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        about_developer.setForeground(new java.awt.Color(0, 0, 0));
        about_developer.setText("About Developer");

        developer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        developer.setForeground(new java.awt.Color(0, 0, 0));
        developer.setText("Developer Name");

        developer_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        developer_name.setForeground(new java.awt.Color(0, 0, 0));
        developer_name.setText("Haitomns G");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email");

        email_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_value.setForeground(new java.awt.Color(0, 0, 0));
        email_value.setText("haitomns4173@gmail.com");

        requirements.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requirements.setForeground(new java.awt.Color(0, 0, 0));
        requirements.setText("Requirements");

        java_version.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        java_version.setForeground(new java.awt.Color(0, 0, 0));
        java_version.setText("Java Version");

        java_version_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        java_version_value.setForeground(new java.awt.Color(0, 0, 0));
        java_version_value.setText("16.0.1");

        xaamp_version.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xaamp_version.setForeground(new java.awt.Color(0, 0, 0));
        xaamp_version.setText("Xaamp Version");

        xaamp_version_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xaamp_version_value.setForeground(new java.awt.Color(0, 0, 0));
        xaamp_version_value.setText("3.3.0");

        software_version.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        software_version.setForeground(new java.awt.Color(0, 0, 0));
        software_version.setText("Software Version");

        version.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        version.setForeground(new java.awt.Color(0, 0, 0));
        version.setText("Version");

        version_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        version_value.setForeground(new java.awt.Color(0, 0, 0));
        version_value.setText("1.2");

        javax.swing.GroupLayout about_backgroungLayout = new javax.swing.GroupLayout(about_backgroung);
        about_backgroung.setLayout(about_backgroungLayout);
        about_backgroungLayout.setHorizontalGroup(
            about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_backgroungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(about_developer)
                    .addGroup(about_backgroungLayout.createSequentialGroup()
                        .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(developer)
                            .addComponent(email))
                        .addGap(39, 39, 39)
                        .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(developer_name)
                            .addComponent(email_value)))
                    .addComponent(software_version)
                    .addGroup(about_backgroungLayout.createSequentialGroup()
                        .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(java_version)
                            .addComponent(requirements)
                            .addComponent(xaamp_version)
                            .addComponent(version))
                        .addGap(49, 49, 49)
                        .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(version_value)
                            .addComponent(xaamp_version_value)
                            .addComponent(java_version_value))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        about_backgroungLayout.setVerticalGroup(
            about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_backgroungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(about_developer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developer)
                    .addComponent(developer_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(email_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requirements)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(java_version)
                    .addComponent(java_version_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xaamp_version)
                    .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xaamp_version_value)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(software_version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(about_backgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(version)
                    .addComponent(version_value))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout about_dialogLayout = new javax.swing.GroupLayout(about_dialog.getContentPane());
        about_dialog.getContentPane().setLayout(about_dialogLayout);
        about_dialogLayout.setHorizontalGroup(
            about_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_backgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        about_dialogLayout.setVerticalGroup(
            about_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_backgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmaer");
        setName("medicine"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(168, 218, 220));

        side_panel_menu.setBackground(new java.awt.Color(29, 53, 87));

        bill_button.setBackground(new java.awt.Color(69, 123, 157));
        bill_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bill_button.setForeground(new java.awt.Color(255, 255, 255));
        bill_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_billing_machine_48px.png"))); // NOI18N
        bill_button.setText("Bill Making");
        bill_button.setBorder(null);
        bill_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_buttonActionPerformed(evt);
            }
        });

        medicine_manage_button.setBackground(new java.awt.Color(69, 123, 157));
        medicine_manage_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_manage_button.setForeground(new java.awt.Color(255, 255, 255));
        medicine_manage_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_45px.png"))); // NOI18N
        medicine_manage_button.setText("Medicine Manage");
        medicine_manage_button.setBorder(null);
        medicine_manage_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medicine_manage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_manage_buttonActionPerformed(evt);
            }
        });

        sales_button.setBackground(new java.awt.Color(69, 123, 157));
        sales_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sales_button.setForeground(new java.awt.Color(255, 255, 255));
        sales_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_total_sales_45px.png"))); // NOI18N
        sales_button.setText("Sales Report");
        sales_button.setBorder(null);
        sales_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sales_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_buttonActionPerformed(evt);
            }
        });

        user_button.setBackground(new java.awt.Color(69, 123, 157));
        user_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_button.setForeground(new java.awt.Color(255, 255, 255));
        user_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_person_45px.png"))); // NOI18N
        user_button.setText("User Account");
        user_button.setBorder(null);
        user_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout side_panel_menuLayout = new javax.swing.GroupLayout(side_panel_menu);
        side_panel_menu.setLayout(side_panel_menuLayout);
        side_panel_menuLayout.setHorizontalGroup(
            side_panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panel_menuLayout.createSequentialGroup()
                .addGroup(side_panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sales_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine_manage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        side_panel_menuLayout.setVerticalGroup(
            side_panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panel_menuLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(bill_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_manage_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        title_pane.setBackground(new java.awt.Color(193, 18, 31));

        javax.swing.GroupLayout title_paneLayout = new javax.swing.GroupLayout(title_pane);
        title_pane.setLayout(title_paneLayout);
        title_paneLayout.setHorizontalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        title_paneLayout.setVerticalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        cardPane.setLayout(new java.awt.CardLayout());

        welcomIframe.setBackground(new java.awt.Color(137, 194, 217));
        welcomIframe.setBorder(null);
        welcomIframe.setVisible(false);

        welcome_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icon.png"))); // NOI18N

        welcome_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcome_title.setForeground(new java.awt.Color(255, 255, 255));
        welcome_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_title.setText("Welcome To Pharmaer");

        welcome_sub_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcome_sub_title.setForeground(new java.awt.Color(255, 255, 255));
        welcome_sub_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_sub_title.setText("Lets Start billing");

        welcome_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_down_4_127px.png"))); // NOI18N

        welcome_user.setBackground(new java.awt.Color(25, 130, 196));
        welcome_user.setPreferredSize(new java.awt.Dimension(150, 150));
        welcome_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcome_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcome_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcome_userMouseExited(evt);
            }
        });

        welcome_user_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_person_45px.png"))); // NOI18N

        welcome_user_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome_user_label.setForeground(new java.awt.Color(255, 255, 255));
        welcome_user_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_user_label.setText("User Account");

        javax.swing.GroupLayout welcome_userLayout = new javax.swing.GroupLayout(welcome_user);
        welcome_user.setLayout(welcome_userLayout);
        welcome_userLayout.setHorizontalGroup(
            welcome_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_userLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcome_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_user_image)
                    .addComponent(welcome_user_label))
                .addGap(62, 62, 62))
        );
        welcome_userLayout.setVerticalGroup(
            welcome_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_user_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(welcome_user_label)
                .addContainerGap())
        );

        welcome_sales.setBackground(new java.awt.Color(25, 130, 196));
        welcome_sales.setPreferredSize(new java.awt.Dimension(150, 150));
        welcome_sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcome_salesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcome_salesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcome_salesMouseExited(evt);
            }
        });

        welcome_sales_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_total_sales_45px.png"))); // NOI18N

        welcome_sales_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome_sales_label.setForeground(new java.awt.Color(255, 255, 255));
        welcome_sales_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_sales_label.setText("Sales Report");

        javax.swing.GroupLayout welcome_salesLayout = new javax.swing.GroupLayout(welcome_sales);
        welcome_sales.setLayout(welcome_salesLayout);
        welcome_salesLayout.setHorizontalGroup(
            welcome_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_salesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcome_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_sales_image)
                    .addComponent(welcome_sales_label))
                .addGap(74, 74, 74))
        );
        welcome_salesLayout.setVerticalGroup(
            welcome_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_salesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_sales_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(welcome_sales_label)
                .addContainerGap())
        );

        welcome_medicine.setBackground(new java.awt.Color(25, 130, 196));
        welcome_medicine.setPreferredSize(new java.awt.Dimension(150, 150));
        welcome_medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcome_medicineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcome_medicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcome_medicineMouseExited(evt);
            }
        });

        welcome_medicine_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_45px.png"))); // NOI18N

        welcome_medicine_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome_medicine_lable.setForeground(new java.awt.Color(255, 255, 255));
        welcome_medicine_lable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_medicine_lable.setText("Medicine Manage");

        javax.swing.GroupLayout welcome_medicineLayout = new javax.swing.GroupLayout(welcome_medicine);
        welcome_medicine.setLayout(welcome_medicineLayout);
        welcome_medicineLayout.setHorizontalGroup(
            welcome_medicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_medicineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcome_medicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_medicine_image)
                    .addComponent(welcome_medicine_lable))
                .addGap(74, 74, 74))
        );
        welcome_medicineLayout.setVerticalGroup(
            welcome_medicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_medicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_medicine_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(welcome_medicine_lable)
                .addContainerGap())
        );

        welcome_bill.setBackground(new java.awt.Color(25, 130, 196));
        welcome_bill.setPreferredSize(new java.awt.Dimension(150, 150));
        welcome_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcome_billMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcome_billMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcome_billMouseExited(evt);
            }
        });

        welcome_bill_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_billing_machine_48px.png"))); // NOI18N

        welcome_bill_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome_bill_label.setForeground(new java.awt.Color(255, 255, 255));
        welcome_bill_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome_bill_label.setText("Medicine Billing");

        javax.swing.GroupLayout welcome_billLayout = new javax.swing.GroupLayout(welcome_bill);
        welcome_bill.setLayout(welcome_billLayout);
        welcome_billLayout.setHorizontalGroup(
            welcome_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_billLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcome_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_bill_image)
                    .addComponent(welcome_bill_label))
                .addGap(74, 74, 74))
        );
        welcome_billLayout.setVerticalGroup(
            welcome_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_billLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_bill_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(welcome_bill_label)
                .addContainerGap())
        );

        pharmacy_lable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pharmacy_lable.setForeground(new java.awt.Color(255, 255, 255));
        pharmacy_lable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pharmacy_lable.setText("Pharmacy Status");

        status_panel.setBackground(new java.awt.Color(25, 130, 196));
        status_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        out_of_stock_panel.setBackground(new java.awt.Color(234, 105, 139));

        out_of_stock_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_box_52px.png"))); // NOI18N

        out_of_stock_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        out_of_stock_label.setForeground(new java.awt.Color(255, 255, 255));
        out_of_stock_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        out_of_stock_label.setText("Out of Stock");

        total_out_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_out_display.setForeground(new java.awt.Color(255, 255, 255));
        total_out_display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_out_display.setText("  ");

        javax.swing.GroupLayout out_of_stock_panelLayout = new javax.swing.GroupLayout(out_of_stock_panel);
        out_of_stock_panel.setLayout(out_of_stock_panelLayout);
        out_of_stock_panelLayout.setHorizontalGroup(
            out_of_stock_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out_of_stock_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(out_of_stock_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(out_of_stock_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(out_of_stock_label)
                    .addComponent(total_out_display))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        out_of_stock_panelLayout.setVerticalGroup(
            out_of_stock_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out_of_stock_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(out_of_stock_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(out_of_stock_panelLayout.createSequentialGroup()
                        .addComponent(out_of_stock_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_out_display))
                    .addComponent(out_of_stock_icon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        expiry_panel.setBackground(new java.awt.Color(213, 93, 146));

        expired_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_expired_48px_1.png"))); // NOI18N

        expirrd_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        expirrd_label.setForeground(new java.awt.Color(255, 255, 255));
        expirrd_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expirrd_label.setText("Expired");

        total_expired_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_expired_display.setForeground(new java.awt.Color(255, 255, 255));
        total_expired_display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_expired_display.setText("  ");

        javax.swing.GroupLayout expiry_panelLayout = new javax.swing.GroupLayout(expiry_panel);
        expiry_panel.setLayout(expiry_panelLayout);
        expiry_panelLayout.setHorizontalGroup(
            expiry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expiry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expired_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expiry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expirrd_label)
                    .addComponent(total_expired_display))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        expiry_panelLayout.setVerticalGroup(
            expiry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expiry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expiry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(expiry_panelLayout.createSequentialGroup()
                        .addComponent(expirrd_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_expired_display))
                    .addComponent(expired_icon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_cost_panel.setBackground(new java.awt.Color(192, 82, 153));

        total_cost_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_cheap_2_52px.png"))); // NOI18N

        total_cost_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_cost_label.setForeground(new java.awt.Color(255, 255, 255));
        total_cost_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_cost_label.setText("Total Cost");

        total_cost_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_cost_display.setForeground(new java.awt.Color(255, 255, 255));
        total_cost_display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_cost_display.setText("  ");

        javax.swing.GroupLayout total_cost_panelLayout = new javax.swing.GroupLayout(total_cost_panel);
        total_cost_panel.setLayout(total_cost_panelLayout);
        total_cost_panelLayout.setHorizontalGroup(
            total_cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_cost_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_cost_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_cost_label)
                    .addComponent(total_cost_display))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        total_cost_panelLayout.setVerticalGroup(
            total_cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_cost_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_cost_panelLayout.createSequentialGroup()
                        .addComponent(total_cost_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_cost_display))
                    .addComponent(total_cost_icon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_stocks_panel.setBackground(new java.awt.Color(172, 70, 161));

        total_stock_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_boxes_48px.png"))); // NOI18N

        total_stock_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_stock_label.setForeground(new java.awt.Color(255, 255, 255));
        total_stock_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_stock_label.setText("Total Stocks");

        total_stocks_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_stocks_display.setForeground(new java.awt.Color(255, 255, 255));
        total_stocks_display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_stocks_display.setText("  ");

        javax.swing.GroupLayout total_stocks_panelLayout = new javax.swing.GroupLayout(total_stocks_panel);
        total_stocks_panel.setLayout(total_stocks_panelLayout);
        total_stocks_panelLayout.setHorizontalGroup(
            total_stocks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stocks_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_stock_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_stocks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_stock_label)
                    .addComponent(total_stocks_display))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        total_stocks_panelLayout.setVerticalGroup(
            total_stocks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stocks_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_stocks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_stocks_panelLayout.createSequentialGroup()
                        .addComponent(total_stock_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_stocks_display))
                    .addComponent(total_stock_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        total_medicine_panel.setBackground(new java.awt.Color(151, 58, 168));

        total_medicine_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_bottle_48px.png"))); // NOI18N

        total_medicine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_medicine_label.setForeground(new java.awt.Color(255, 255, 255));
        total_medicine_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_medicine_label.setText("Total Medicine");

        total_medicine_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_medicine_display.setForeground(new java.awt.Color(255, 255, 255));
        total_medicine_display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_medicine_display.setText("  ");

        javax.swing.GroupLayout total_medicine_panelLayout = new javax.swing.GroupLayout(total_medicine_panel);
        total_medicine_panel.setLayout(total_medicine_panelLayout);
        total_medicine_panelLayout.setHorizontalGroup(
            total_medicine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_medicine_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_medicine_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_medicine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_medicine_label)
                    .addComponent(total_medicine_display))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        total_medicine_panelLayout.setVerticalGroup(
            total_medicine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_medicine_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_medicine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_medicine_panelLayout.createSequentialGroup()
                        .addComponent(total_medicine_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_medicine_display))
                    .addComponent(total_medicine_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout status_panelLayout = new javax.swing.GroupLayout(status_panel);
        status_panel.setLayout(status_panelLayout);
        status_panelLayout.setHorizontalGroup(
            status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(status_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(status_panelLayout.createSequentialGroup()
                        .addComponent(total_medicine_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(status_panelLayout.createSequentialGroup()
                        .addGroup(status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_stocks_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total_cost_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(out_of_stock_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expiry_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        status_panelLayout.setVerticalGroup(
            status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(status_panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(out_of_stock_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expiry_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_cost_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_stocks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_medicine_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        refrresh_for_status.setBackground(new java.awt.Color(42, 157, 143));
        refrresh_for_status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refrresh_for_status.setForeground(new java.awt.Color(255, 255, 255));
        refrresh_for_status.setText("Refresh");
        refrresh_for_status.setBorder(null);
        refrresh_for_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrresh_for_statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomIframeLayout = new javax.swing.GroupLayout(welcomIframe.getContentPane());
        welcomIframe.getContentPane().setLayout(welcomIframeLayout);
        welcomIframeLayout.setHorizontalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomIframeLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomIframeLayout.createSequentialGroup()
                        .addComponent(welcome_icon)
                        .addGap(44, 44, 44)
                        .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcome_title)
                            .addGroup(welcomIframeLayout.createSequentialGroup()
                                .addComponent(welcome_sub_title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(welcome_arrow))))
                    .addGroup(welcomIframeLayout.createSequentialGroup()
                        .addComponent(welcome_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcome_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcome_medicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcome_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pharmacy_lable)
                    .addComponent(status_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refrresh_for_status, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        welcomIframeLayout.setVerticalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomIframeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pharmacy_lable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(welcomIframeLayout.createSequentialGroup()
                        .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(welcome_icon)
                            .addGroup(welcomIframeLayout.createSequentialGroup()
                                .addComponent(welcome_title)
                                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(welcomIframeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(welcome_sub_title))
                                    .addGroup(welcomIframeLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(welcome_arrow)))))
                        .addGap(67, 67, 67)
                        .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcome_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcome_medicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcome_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcome_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refrresh_for_status, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        cardPane.add(welcomIframe, "card2");

        billIframe.setBackground(new java.awt.Color(137, 194, 217));
        billIframe.setBorder(null);
        billIframe.setVisible(true);
        billIframe.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                billIframeInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        bill_title_label.setBackground(new java.awt.Color(25, 130, 196));

        bill_company_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bill_company_name.setForeground(new java.awt.Color(255, 255, 255));
        bill_company_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bill_company_name.setText("Company");

        bill_company_phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bill_company_phone.setForeground(new java.awt.Color(255, 255, 255));
        bill_company_phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bill_company_phone.setText("Phone");

        bill_company_address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bill_company_address.setForeground(new java.awt.Color(255, 255, 255));
        bill_company_address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bill_company_address.setText("Address");

        javax.swing.GroupLayout bill_title_labelLayout = new javax.swing.GroupLayout(bill_title_label);
        bill_title_label.setLayout(bill_title_labelLayout);
        bill_title_labelLayout.setHorizontalGroup(
            bill_title_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_title_labelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(bill_title_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bill_company_address, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(bill_company_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bill_company_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bill_title_labelLayout.setVerticalGroup(
            bill_title_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_title_labelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_company_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_company_address)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invoide_date_panel.setBackground(new java.awt.Color(25, 130, 196));

        invoice_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        invoice_label.setForeground(new java.awt.Color(255, 255, 255));
        invoice_label.setText("Invoice #");

        date_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_label.setForeground(new java.awt.Color(255, 255, 255));
        date_label.setText("Date :");

        date_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_display.setForeground(new java.awt.Color(255, 255, 255));
        date_display.setText("Current Date");

        javax.swing.GroupLayout invoide_date_panelLayout = new javax.swing.GroupLayout(invoide_date_panel);
        invoide_date_panel.setLayout(invoide_date_panelLayout);
        invoide_date_panelLayout.setHorizontalGroup(
            invoide_date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoide_date_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(invoice_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_display, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        invoide_date_panelLayout.setVerticalGroup(
            invoide_date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoide_date_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoide_date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoice_label)
                    .addGroup(invoide_date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_display)
                        .addComponent(date_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        patient_details_panel.setBackground(new java.awt.Color(25, 130, 196));

        patient_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patient_name_inputKeyPressed(evt);
            }
        });

        patient_address_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patient_address_inputKeyPressed(evt);
            }
        });

        paitent_contact_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paitent_contact_inputKeyPressed(evt);
            }
        });

        patient_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_name_label.setText("Patient Name");

        patient_address_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_address_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_address_label.setText("Patient Address");

        patient_contact_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_contact_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_contact_label.setText("Patient Contact");

        patient_input_error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        patient_input_error.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout patient_details_panelLayout = new javax.swing.GroupLayout(patient_details_panel);
        patient_details_panel.setLayout(patient_details_panelLayout);
        patient_details_panelLayout.setHorizontalGroup(
            patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_details_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_details_panelLayout.createSequentialGroup()
                        .addComponent(patient_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(patient_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patient_details_panelLayout.createSequentialGroup()
                        .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_address_label)
                            .addComponent(patient_contact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_details_panelLayout.createSequentialGroup()
                                .addComponent(patient_input_error)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(patient_address_input)
                            .addComponent(paitent_contact_input))))
                .addGap(26, 26, 26))
        );
        patient_details_panelLayout.setVerticalGroup(
            patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_address_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paitent_contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_contact_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient_input_error)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bill_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bill_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sn. No", "Medicine Name", "Quantity", "Rate", "Sub-Total", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bill_table.setRowHeight(30);
        bill_tabel_scrollpanel.setViewportView(bill_table);
        if (bill_table.getColumnModel().getColumnCount() > 0) {
            bill_table.getColumnModel().getColumn(0).setPreferredWidth(2);
            bill_table.getColumnModel().getColumn(1).setPreferredWidth(20);
            bill_table.getColumnModel().getColumn(2).setPreferredWidth(2);
            bill_table.getColumnModel().getColumn(3).setPreferredWidth(2);
            bill_table.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

        bill_total_panel.setBackground(new java.awt.Color(25, 130, 196));

        bill_total_label.setBackground(new java.awt.Color(255, 255, 255));
        bill_total_label.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bill_total_label.setForeground(new java.awt.Color(255, 255, 255));
        bill_total_label.setText("Total : ");

        bill_total_display.setBackground(new java.awt.Color(255, 255, 255));
        bill_total_display.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bill_total_display.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bill_total_panelLayout = new javax.swing.GroupLayout(bill_total_panel);
        bill_total_panel.setLayout(bill_total_panelLayout);
        bill_total_panelLayout.setHorizontalGroup(
            bill_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_total_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_total_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_total_display, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );
        bill_total_panelLayout.setVerticalGroup(
            bill_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bill_total_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bill_total_display, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bill_input_panel.setBackground(new java.awt.Color(25, 130, 196));

        add_medicine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_medicine_label.setForeground(new java.awt.Color(255, 255, 255));
        add_medicine_label.setText("Add Medicine");

        medinine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medinine_label.setForeground(new java.awt.Color(255, 255, 255));
        medinine_label.setText("Medicine Name");

        medicine_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicine_name_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medicine_name_inputKeyReleased(evt);
            }
        });

        quantity_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantity_label.setForeground(new java.awt.Color(255, 255, 255));
        quantity_label.setText("Quantity");

        medicine_quantity_input.setActionCommand("<Not Set>");
        medicine_quantity_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicine_quantity_inputKeyPressed(evt);
            }
        });

        medicine_input_error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medicine_input_error.setForeground(new java.awt.Color(255, 255, 255));

        add_button.setBackground(new java.awt.Color(138, 201, 38));
        add_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("Add");
        add_button.setBorder(null);
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        cancel_button.setBackground(new java.awt.Color(255, 89, 94));
        cancel_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cancel_button.setForeground(new java.awt.Color(255, 255, 255));
        cancel_button.setText("Cancel");
        cancel_button.setBorder(null);

        javax.swing.GroupLayout bill_input_panelLayout = new javax.swing.GroupLayout(bill_input_panel);
        bill_input_panel.setLayout(bill_input_panelLayout);
        bill_input_panelLayout.setHorizontalGroup(
            bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_input_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_medicine_label)
                    .addGroup(bill_input_panelLayout.createSequentialGroup()
                        .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medinine_label)
                            .addComponent(quantity_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicine_quantity_input)
                            .addGroup(bill_input_panelLayout.createSequentialGroup()
                                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(medicine_input_error)
                            .addComponent(medicine_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(add_medicine_seperator))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        bill_input_panelLayout.setVerticalGroup(
            bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_input_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_medicine_label)
                .addGap(3, 3, 3)
                .addComponent(add_medicine_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicine_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medinine_label))
                .addGap(7, 7, 7)
                .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity_label)
                    .addGroup(bill_input_panelLayout.createSequentialGroup()
                        .addComponent(medicine_quantity_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicine_input_error)
                        .addGap(4, 4, 4)
                        .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        command_center_pane.setBackground(new java.awt.Color(25, 130, 196));

        command_center.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        command_center.setForeground(new java.awt.Color(255, 255, 255));
        command_center.setText("Command Center");

        bill_save_button.setBackground(new java.awt.Color(25, 130, 196));
        bill_save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_save_40px_2.png"))); // NOI18N
        bill_save_button.setBorder(null);
        bill_save_button.setBorderPainted(false);
        bill_save_button.setContentAreaFilled(false);
        bill_save_button.setOpaque(true);
        bill_save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bill_save_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bill_save_buttonMouseExited(evt);
            }
        });

        bill_discard_button.setBackground(new java.awt.Color(25, 130, 196));
        bill_discard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_waste_40px_1.png"))); // NOI18N
        bill_discard_button.setBorder(null);
        bill_discard_button.setContentAreaFilled(false);
        bill_discard_button.setOpaque(true);
        bill_discard_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_discard_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bill_discard_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bill_discard_buttonMouseExited(evt);
            }
        });

        bill_print_button.setBackground(new java.awt.Color(25, 130, 196));
        bill_print_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_print_40px_4.png"))); // NOI18N
        bill_print_button.setBorder(null);
        bill_print_button.setBorderPainted(false);
        bill_print_button.setContentAreaFilled(false);
        bill_print_button.setOpaque(true);
        bill_print_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bill_print_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bill_print_buttonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout command_center_paneLayout = new javax.swing.GroupLayout(command_center_pane);
        command_center_pane.setLayout(command_center_paneLayout);
        command_center_paneLayout.setHorizontalGroup(
            command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(command_center_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, command_center_paneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(command_center, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(command_center_paneLayout.createSequentialGroup()
                        .addComponent(bill_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bill_discard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(command_center_paneLayout.createSequentialGroup()
                        .addGroup(command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bill_print_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command_center_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        command_center_paneLayout.setVerticalGroup(
            command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(command_center_paneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(command_center)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(command_center_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_save_button)
                    .addComponent(bill_discard_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_print_button)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout billIframeLayout = new javax.swing.GroupLayout(billIframe.getContentPane());
        billIframe.getContentPane().setLayout(billIframeLayout);
        billIframeLayout.setHorizontalGroup(
            billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addComponent(patient_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoide_date_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bill_tabel_scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                            .addGroup(billIframeLayout.createSequentialGroup()
                                .addComponent(bill_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bill_input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bill_total_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(command_center_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        billIframeLayout.setVerticalGroup(
            billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoide_date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_tabel_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_total_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(command_center_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bill_input_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        cardPane.add(billIframe, "card3");

        medicineIframe.setBackground(new java.awt.Color(137, 194, 217));
        medicineIframe.setBorder(null);
        medicineIframe.setVisible(true);
        medicineIframe.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                medicineIframeInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        medMgr_title_lable.setBackground(new java.awt.Color(25, 130, 196));

        medMgr_company_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        medMgr_company_name.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_company_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medMgr_company_name.setText("Company");

        medMgr_company_phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        medMgr_company_phone.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_company_phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medMgr_company_phone.setText("Phone");

        medMgr_company_address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        medMgr_company_address.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_company_address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medMgr_company_address.setText("Address");

        javax.swing.GroupLayout medMgr_title_lableLayout = new javax.swing.GroupLayout(medMgr_title_lable);
        medMgr_title_lable.setLayout(medMgr_title_lableLayout);
        medMgr_title_lableLayout.setHorizontalGroup(
            medMgr_title_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_title_lableLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(medMgr_title_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medMgr_company_address, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(medMgr_company_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medMgr_company_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medMgr_title_lableLayout.setVerticalGroup(
            medMgr_title_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_title_lableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medMgr_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_company_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_company_address)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        medMgr_find_panel.setBackground(new java.awt.Color(25, 130, 196));

        find_medicine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        find_medicine_label.setForeground(new java.awt.Color(255, 255, 255));
        find_medicine_label.setText("Find Medicine");

        medicine_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_name_label.setForeground(new java.awt.Color(255, 255, 255));
        medicine_name_label.setText("Medicine Name");

        medicine_name_find_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_name_find_inputMouseClicked(evt);
            }
        });
        medicine_name_find_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicine_name_find_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medicine_name_find_inputKeyReleased(evt);
            }
        });

        find_button.setBackground(new java.awt.Color(138, 201, 38));
        find_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        find_button.setForeground(new java.awt.Color(255, 255, 255));
        find_button.setText("Find");
        find_button.setBorder(null);
        find_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_buttonActionPerformed(evt);
            }
        });

        delete_button.setBackground(new java.awt.Color(255, 0, 0));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("Delete");
        delete_button.setBorder(null);
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        medicine_find_error.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_find_error.setForeground(new java.awt.Color(255, 0, 0));
        medicine_find_error.setText("Medicine Name");

        javax.swing.GroupLayout medMgr_find_panelLayout = new javax.swing.GroupLayout(medMgr_find_panel);
        medMgr_find_panel.setLayout(medMgr_find_panelLayout);
        medMgr_find_panelLayout.setHorizontalGroup(
            medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(find_medicine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_medicine_seperator)
                    .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                        .addComponent(medicine_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicine_find_error)
                            .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                                .addComponent(medicine_name_find_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(find_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        medMgr_find_panelLayout.setVerticalGroup(
            medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(find_medicine_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(find_medicine_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicine_name_label)
                    .addComponent(medicine_name_find_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_find_error, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        medMgr_table_find.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_table_find.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Medicine Name", "Strength", "No of Box", "Batch No", "MRP", "Import Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medMgr_table_find.setRowHeight(30);
        medMgr_table_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_table_findMouseClicked(evt);
            }
        });
        medMgr_tabel_scrollpanel.setViewportView(medMgr_table_find);

        medMgr_details_panel.setBackground(new java.awt.Color(25, 130, 196));

        medicine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_label.setForeground(new java.awt.Color(255, 255, 255));
        medicine_label.setText("Medicine Details");

        medMgr_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_name.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_name.setText("Medicine Name");

        medMgr_name_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_name_inputMouseClicked(evt);
            }
        });
        medMgr_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_name_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medMgr_name_inputKeyReleased(evt);
            }
        });

        medMgr_type_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_type_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_type_label.setText("Type");

        medMgr_strength_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_strength_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_strength_label.setText("Strength/Volume");

        medMgr_strength_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_strength_inputMouseClicked(evt);
            }
        });
        medMgr_strength_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_strength_inputKeyPressed(evt);
            }
        });

        medMgr_no_sheet_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_no_sheet_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_no_sheet_label.setText("Number of Sheet");

        medMgr_no_sheet_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_no_sheet_inputMouseClicked(evt);
            }
        });
        medMgr_no_sheet_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_no_sheet_inputKeyPressed(evt);
            }
        });

        medMgr_no_tablet_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_no_tablet_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_no_tablet_label.setText("Number of Tablet");

        medMgr_no_tablet_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_no_tablet_inputMouseClicked(evt);
            }
        });
        medMgr_no_tablet_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_no_tablet_inputKeyPressed(evt);
            }
        });

        medMgr_mrp_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_mrp_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_mrp_label.setText("MRP");

        medMgr_mrp_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_mrp_inputMouseClicked(evt);
            }
        });
        medMgr_mrp_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_mrp_inputKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medMgr_mrp_inputKeyTyped(evt);
            }
        });

        medMgr_no_box_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_no_box_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_no_box_label.setText("Number of Box");

        medMgr_no_box_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_no_box_inputKeyPressed(evt);
            }
        });

        medMgr_expiry_lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_expiry_lable.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_expiry_lable.setText("Expiry Date");

        medicine_error.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_error.setForeground(new java.awt.Color(255, 0, 0));
        medicine_error.setText("Medicine Error");

        medMgr_add_button.setBackground(new java.awt.Color(138, 201, 38));
        medMgr_add_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medMgr_add_button.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_add_button.setText("Add");
        medMgr_add_button.setBorder(null);
        medMgr_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medMgr_add_buttonActionPerformed(evt);
            }
        });

        medMgr_clear_button.setBackground(new java.awt.Color(248, 150, 30));
        medMgr_clear_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medMgr_clear_button.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_clear_button.setText("Clear");
        medMgr_clear_button.setBorder(null);
        medMgr_clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medMgr_clear_buttonActionPerformed(evt);
            }
        });

        medMgr_type_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMgr_type_inputMouseClicked(evt);
            }
        });
        medMgr_type_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_type_inputKeyPressed(evt);
            }
        });

        medMgr_expiry_input_month.setText("MM");
        medMgr_expiry_input_month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                medMgr_expiry_input_monthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                medMgr_expiry_input_monthFocusLost(evt);
            }
        });
        medMgr_expiry_input_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_expiry_input_monthKeyPressed(evt);
            }
        });

        medMgr_expiry_input_year.setText("yy");
        medMgr_expiry_input_year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                medMgr_expiry_input_yearFocusGained(evt);
            }
        });
        medMgr_expiry_input_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_expiry_input_yearKeyPressed(evt);
            }
        });

        medMgr_expiry_lable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_expiry_lable1.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_expiry_lable1.setText("-");

        javax.swing.GroupLayout medMgr_details_panelLayout = new javax.swing.GroupLayout(medMgr_details_panel);
        medMgr_details_panel.setLayout(medMgr_details_panelLayout);
        medMgr_details_panelLayout.setHorizontalGroup(
            medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medMgr_details_panelLayout.createSequentialGroup()
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                .addComponent(medMgr_no_tablet_label)
                                .addGap(29, 29, 29)
                                .addComponent(medMgr_no_tablet_input, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, medMgr_details_panelLayout.createSequentialGroup()
                                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medMgr_type_label)
                                    .addComponent(medMgr_name)
                                    .addComponent(medMgr_strength_label)
                                    .addComponent(medMgr_no_sheet_label))
                                .addGap(34, 34, 34)
                                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(medMgr_strength_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(medMgr_type_input, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medMgr_name_input, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medMgr_no_sheet_input))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                .addComponent(medMgr_mrp_label)
                                .addGap(98, 98, 98)
                                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medMgr_no_box_input, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medMgr_mrp_input, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                        .addComponent(medMgr_expiry_input_month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(medMgr_expiry_lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(medMgr_expiry_input_year, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(medicine_error, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                        .addComponent(medMgr_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(medMgr_clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                        .addComponent(medMgr_no_box_label)
                                        .addGap(4, 4, 4)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(medMgr_expiry_lable))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medMgr_details_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(medicine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(747, 747, 747))
                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                        .addComponent(medicine_details_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        medMgr_details_panelLayout.setVerticalGroup(
            medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicine_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_details_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medMgr_name)
                            .addComponent(medMgr_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_mrp_label))
                        .addGap(5, 5, 5)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medMgr_type_label)
                            .addComponent(medMgr_type_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_no_box_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medMgr_strength_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_strength_label)
                            .addComponent(medMgr_expiry_lable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medMgr_no_sheet_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_no_sheet_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medMgr_no_tablet_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_no_tablet_label)))
                    .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                        .addComponent(medMgr_mrp_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(medMgr_no_box_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medMgr_expiry_input_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_expiry_input_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_expiry_lable1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicine_error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medMgr_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout medicineIframeLayout = new javax.swing.GroupLayout(medicineIframe.getContentPane());
        medicineIframe.getContentPane().setLayout(medicineIframeLayout);
        medicineIframeLayout.setHorizontalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medMgr_tabel_scrollpanel)
                    .addGroup(medicineIframeLayout.createSequentialGroup()
                        .addGroup(medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medMgr_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_title_lable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_find_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        medicineIframeLayout.setVerticalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(medMgr_title_lable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_find_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_tabel_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medMgr_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        cardPane.add(medicineIframe, "card3");

        salesIframe.setBackground(new java.awt.Color(137, 194, 217));
        salesIframe.setBorder(null);
        salesIframe.setVisible(true);

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        justJoking.setText("The ULTIMATE BUTTON");
        justJoking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justJokingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salesIframeLayout = new javax.swing.GroupLayout(salesIframe.getContentPane());
        salesIframe.getContentPane().setLayout(salesIframeLayout);
        salesIframeLayout.setHorizontalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(salesIframeLayout.createSequentialGroup()
                        .addComponent(justJoking)
                        .addGap(0, 640, Short.MAX_VALUE)))
                .addContainerGap())
        );
        salesIframeLayout.setVerticalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(justJoking)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        cardPane.add(salesIframe, "card3");

        userIframe.setBackground(new java.awt.Color(137, 194, 217));
        userIframe.setBorder(null);
        userIframe.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userIframe.setVisible(true);
        userIframe.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                userIframeInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        user_image_panel.setBackground(new java.awt.Color(25, 130, 196));

        javax.swing.GroupLayout user_image_panelLayout = new javax.swing.GroupLayout(user_image_panel);
        user_image_panel.setLayout(user_image_panelLayout);
        user_image_panelLayout.setHorizontalGroup(
            user_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_image_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_image_label, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        user_image_panelLayout.setVerticalGroup(
            user_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_image_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_image_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        user_welcome_panel.setBackground(new java.awt.Color(25, 130, 196));

        user_wel_welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_wel_welcome.setForeground(new java.awt.Color(255, 255, 255));
        user_wel_welcome.setText("Welcome Back,");

        user_wel_users_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_wel_users_name.setForeground(new java.awt.Color(255, 255, 255));
        user_wel_users_name.setText("User Name");

        user_wel_user_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_wel_user_type.setForeground(new java.awt.Color(255, 255, 255));
        user_wel_user_type.setText("User Type");

        user_wel_shop_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_wel_shop_name.setForeground(new java.awt.Color(255, 255, 255));
        user_wel_shop_name.setText("Shop Name");

        user_wel_shop_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_wel_shop_contact.setForeground(new java.awt.Color(255, 255, 255));
        user_wel_shop_contact.setText("Shop Contact");

        javax.swing.GroupLayout user_welcome_panelLayout = new javax.swing.GroupLayout(user_welcome_panel);
        user_welcome_panel.setLayout(user_welcome_panelLayout);
        user_welcome_panelLayout.setHorizontalGroup(
            user_welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_welcome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(user_welcome_panelLayout.createSequentialGroup()
                        .addGroup(user_welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_wel_welcome)
                            .addComponent(user_wel_users_name)
                            .addComponent(user_wel_user_type)
                            .addComponent(user_wel_shop_name)
                            .addComponent(user_wel_shop_contact))
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        user_welcome_panelLayout.setVerticalGroup(
            user_welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_welcome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_wel_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_wel_users_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_wel_user_type)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(user_wel_shop_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_wel_shop_contact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        user_details_panel.setBackground(new java.awt.Color(25, 130, 196));

        user_details_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_details_label.setForeground(new java.awt.Color(255, 255, 255));
        user_details_label.setText("User Details");

        user_details_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_details_name.setForeground(new java.awt.Color(255, 255, 255));
        user_details_name.setText("Name");

        uesr_details_name_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        uesr_details_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uesr_details_name_inputKeyPressed(evt);
            }
        });

        user_details_username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_details_username_label.setForeground(new java.awt.Color(255, 255, 255));
        user_details_username_label.setText("Username");

        user_details_username_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_details_username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_details_username_inputKeyPressed(evt);
            }
        });

        user_details_pasword_input.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_details_pasword_input.setForeground(new java.awt.Color(255, 255, 255));
        user_details_pasword_input.setText("Password");

        user_details_password_input.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        user_details_password_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_details_password_inputKeyPressed(evt);
            }
        });

        user_details_update.setBackground(new java.awt.Color(248, 150, 30));
        user_details_update.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        user_details_update.setForeground(new java.awt.Color(255, 255, 255));
        user_details_update.setText("Update");
        user_details_update.setBorder(null);
        user_details_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_details_updateActionPerformed(evt);
            }
        });

        username_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 255, 255));
        username_error.setText("Username Error");

        javax.swing.GroupLayout user_details_panelLayout = new javax.swing.GroupLayout(user_details_panel);
        user_details_panel.setLayout(user_details_panelLayout);
        user_details_panelLayout.setHorizontalGroup(
            user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_details_panelLayout.createSequentialGroup()
                        .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_details_label)
                            .addComponent(user_details_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(user_details_panelLayout.createSequentialGroup()
                        .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_details_name)
                            .addComponent(user_details_username_label)
                            .addComponent(user_details_pasword_input, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_error)
                            .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(user_details_update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_details_username_input, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addComponent(uesr_details_name_input)
                                .addComponent(user_details_password_input)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        user_details_panelLayout.setVerticalGroup(
            user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_details_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_details_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uesr_details_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_details_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_details_username_input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_details_username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_details_pasword_input)
                    .addComponent(user_details_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_error)
                .addGap(3, 3, 3)
                .addComponent(user_details_update, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

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

        user_shopDtr_update_button.setBackground(new java.awt.Color(248, 150, 30));
        user_shopDtr_update_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        user_shopDtr_update_button.setForeground(new java.awt.Color(255, 255, 255));
        user_shopDtr_update_button.setText("Update");
        user_shopDtr_update_button.setBorder(null);
        user_shopDtr_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_shopDtr_update_buttonActionPerformed(evt);
            }
        });

        shop_details_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shop_details_error.setForeground(new java.awt.Color(255, 255, 255));
        shop_details_error.setText("Shop Error");

        javax.swing.GroupLayout shop_details_panelLayout = new javax.swing.GroupLayout(shop_details_panel);
        shop_details_panel.setLayout(shop_details_panelLayout);
        shop_details_panelLayout.setHorizontalGroup(
            shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_label)
                    .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(user_shopDtr_seperator, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(shop_details_panelLayout.createSequentialGroup()
                            .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(shop_details_panelLayout.createSequentialGroup()
                                    .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(user_shopDtr_shop_name)
                                        .addComponent(user_shopDtr_shop_contact))
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, shop_details_panelLayout.createSequentialGroup()
                                    .addComponent(user_shopDtr_address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(shop_details_error)
                                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user_shopDtr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_shopDtr_address_input, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(user_shopDtr_shop_contact_input)
                                    .addComponent(user_shopDtr_shop_name_input))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shop_details_panelLayout.setVerticalGroup(
            shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_shopDtr_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_shopDtr_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_shop_name)
                    .addGroup(shop_details_panelLayout.createSequentialGroup()
                        .addComponent(user_shopDtr_shop_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_shopDtr_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_shopDtr_address_label))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_shopDtr_shop_contact)
                    .addComponent(user_shopDtr_shop_contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shop_details_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_shopDtr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("About Developer");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setMargin(new java.awt.Insets(14, 14, 14, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pharmacy_lable1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pharmacy_lable1.setForeground(new java.awt.Color(255, 255, 255));
        pharmacy_lable1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pharmacy_lable1.setText("Pharmacy Status");

        refrresh_for_status1.setBackground(new java.awt.Color(42, 157, 143));
        refrresh_for_status1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refrresh_for_status1.setForeground(new java.awt.Color(255, 255, 255));
        refrresh_for_status1.setText("Refresh");
        refrresh_for_status1.setBorder(null);
        refrresh_for_status1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrresh_for_status1ActionPerformed(evt);
            }
        });

        status_panel_user.setBackground(new java.awt.Color(25, 130, 196));
        status_panel_user.setPreferredSize(new java.awt.Dimension(150, 150));

        out_of_stock_panel_user.setBackground(new java.awt.Color(234, 105, 139));

        out_of_stock_icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_box_52px.png"))); // NOI18N

        out_of_stock_label_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        out_of_stock_label_user.setForeground(new java.awt.Color(255, 255, 255));
        out_of_stock_label_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        out_of_stock_label_user.setText("Out of Stock");

        total_out_display_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_out_display_user.setForeground(new java.awt.Color(255, 255, 255));
        total_out_display_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_out_display_user.setText("  ");

        javax.swing.GroupLayout out_of_stock_panel_userLayout = new javax.swing.GroupLayout(out_of_stock_panel_user);
        out_of_stock_panel_user.setLayout(out_of_stock_panel_userLayout);
        out_of_stock_panel_userLayout.setHorizontalGroup(
            out_of_stock_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out_of_stock_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(out_of_stock_icon_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(out_of_stock_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(out_of_stock_label_user)
                    .addComponent(total_out_display_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        out_of_stock_panel_userLayout.setVerticalGroup(
            out_of_stock_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out_of_stock_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(out_of_stock_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(out_of_stock_panel_userLayout.createSequentialGroup()
                        .addComponent(out_of_stock_label_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_out_display_user))
                    .addComponent(out_of_stock_icon_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        expiry_panel_user.setBackground(new java.awt.Color(213, 93, 146));

        expired_icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_expired_48px_1.png"))); // NOI18N

        expirrd_label_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        expirrd_label_user.setForeground(new java.awt.Color(255, 255, 255));
        expirrd_label_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expirrd_label_user.setText("Expired");

        total_expired_display_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_expired_display_user.setForeground(new java.awt.Color(255, 255, 255));
        total_expired_display_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_expired_display_user.setText("  ");

        javax.swing.GroupLayout expiry_panel_userLayout = new javax.swing.GroupLayout(expiry_panel_user);
        expiry_panel_user.setLayout(expiry_panel_userLayout);
        expiry_panel_userLayout.setHorizontalGroup(
            expiry_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expiry_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expired_icon_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expiry_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expirrd_label_user)
                    .addComponent(total_expired_display_user))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        expiry_panel_userLayout.setVerticalGroup(
            expiry_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expiry_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expiry_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(expiry_panel_userLayout.createSequentialGroup()
                        .addComponent(expirrd_label_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_expired_display_user))
                    .addComponent(expired_icon_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_cost_panel_user.setBackground(new java.awt.Color(192, 82, 153));

        total_cost_icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_cheap_2_52px.png"))); // NOI18N

        total_cost_label_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_cost_label_user.setForeground(new java.awt.Color(255, 255, 255));
        total_cost_label_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_cost_label_user.setText("Total Cost");

        total_cost_display_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_cost_display_user.setForeground(new java.awt.Color(255, 255, 255));
        total_cost_display_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_cost_display_user.setText("  ");

        javax.swing.GroupLayout total_cost_panel_userLayout = new javax.swing.GroupLayout(total_cost_panel_user);
        total_cost_panel_user.setLayout(total_cost_panel_userLayout);
        total_cost_panel_userLayout.setHorizontalGroup(
            total_cost_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_cost_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_cost_icon_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_cost_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_cost_label_user)
                    .addComponent(total_cost_display_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        total_cost_panel_userLayout.setVerticalGroup(
            total_cost_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_cost_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_cost_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_cost_panel_userLayout.createSequentialGroup()
                        .addComponent(total_cost_label_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_cost_display_user))
                    .addComponent(total_cost_icon_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_stocks_panel_user.setBackground(new java.awt.Color(172, 70, 161));

        total_stock_icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_boxes_48px.png"))); // NOI18N

        total_stock_label_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_stock_label_user.setForeground(new java.awt.Color(255, 255, 255));
        total_stock_label_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_stock_label_user.setText("Total Stocks");

        total_stocks_display_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_stocks_display_user.setForeground(new java.awt.Color(255, 255, 255));
        total_stocks_display_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_stocks_display_user.setText("  ");

        javax.swing.GroupLayout total_stocks_panel_userLayout = new javax.swing.GroupLayout(total_stocks_panel_user);
        total_stocks_panel_user.setLayout(total_stocks_panel_userLayout);
        total_stocks_panel_userLayout.setHorizontalGroup(
            total_stocks_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stocks_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_stock_icon_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_stocks_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_stock_label_user)
                    .addComponent(total_stocks_display_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        total_stocks_panel_userLayout.setVerticalGroup(
            total_stocks_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stocks_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_stocks_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_stocks_panel_userLayout.createSequentialGroup()
                        .addComponent(total_stock_label_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_stocks_display_user))
                    .addComponent(total_stock_icon_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        total_medicine_panel_user.setBackground(new java.awt.Color(151, 58, 168));

        total_medicine_icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_bottle_48px.png"))); // NOI18N

        total_medicine_label_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_medicine_label_user.setForeground(new java.awt.Color(255, 255, 255));
        total_medicine_label_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_medicine_label_user.setText("Total Medicine");

        total_medicine_display_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_medicine_display_user.setForeground(new java.awt.Color(255, 255, 255));
        total_medicine_display_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_medicine_display_user.setText("  ");

        javax.swing.GroupLayout total_medicine_panel_userLayout = new javax.swing.GroupLayout(total_medicine_panel_user);
        total_medicine_panel_user.setLayout(total_medicine_panel_userLayout);
        total_medicine_panel_userLayout.setHorizontalGroup(
            total_medicine_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_medicine_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_medicine_icon_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total_medicine_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_medicine_label_user)
                    .addComponent(total_medicine_display_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        total_medicine_panel_userLayout.setVerticalGroup(
            total_medicine_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_medicine_panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total_medicine_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(total_medicine_panel_userLayout.createSequentialGroup()
                        .addComponent(total_medicine_label_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_medicine_display_user))
                    .addComponent(total_medicine_icon_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout status_panel_userLayout = new javax.swing.GroupLayout(status_panel_user);
        status_panel_user.setLayout(status_panel_userLayout);
        status_panel_userLayout.setHorizontalGroup(
            status_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(status_panel_userLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(status_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(status_panel_userLayout.createSequentialGroup()
                        .addComponent(total_medicine_panel_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(status_panel_userLayout.createSequentialGroup()
                        .addGroup(status_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_stocks_panel_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total_cost_panel_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(out_of_stock_panel_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expiry_panel_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        status_panel_userLayout.setVerticalGroup(
            status_panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(status_panel_userLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(out_of_stock_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expiry_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_cost_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_stocks_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_medicine_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userIframeLayout = new javax.swing.GroupLayout(userIframe.getContentPane());
        userIframe.getContentPane().setLayout(userIframeLayout);
        userIframeLayout.setHorizontalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(user_details_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(userIframeLayout.createSequentialGroup()
                            .addComponent(user_image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(user_welcome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(shop_details_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pharmacy_lable1)
                    .addComponent(status_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refrresh_for_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        userIframeLayout.setVerticalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userIframeLayout.createSequentialGroup()
                        .addGroup(userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user_welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(user_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shop_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userIframeLayout.createSequentialGroup()
                        .addComponent(pharmacy_lable1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refrresh_for_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        cardPane.add(userIframe, "card3");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(side_panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(title_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(title_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("medicine");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon(getClass().getResource("/mms/src/icon.png"));
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void bill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_buttonActionPerformed
        bill_button.setBackground(new Color(137,194,217));
        medicine_manage_button.setBackground(new Color(69,123,157));
        sales_button.setBackground(new Color(69,123,157));
        user_button.setBackground(new Color(69,123,157));
        
        BasicInternalFrameUI bill_titel_hide = (BasicInternalFrameUI)billIframe.getUI();
        bill_titel_hide.setNorthPane(null);
        
        welcomIframe.setVisible(false);
        billIframe.setVisible(true);
        medicineIframe.setVisible(false);
        salesIframe.setVisible(false);
        userIframe.setVisible(false);
    }//GEN-LAST:event_bill_buttonActionPerformed

    private void medicine_manage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_manage_buttonActionPerformed
        bill_button.setBackground(new Color(69,123,157));
        medicine_manage_button.setBackground(new Color(137,194,217));
        sales_button.setBackground(new Color(69,123,157));
        user_button.setBackground(new Color(69,123,157));
        
        BasicInternalFrameUI medicine_titel_hide = (BasicInternalFrameUI)medicineIframe.getUI();
        medicine_titel_hide.setNorthPane(null);
        
        welcomIframe.setVisible(false);
        billIframe.setVisible(false);
        medicineIframe.setVisible(true);
        salesIframe.setVisible(false);
        userIframe.setVisible(false);
    }//GEN-LAST:event_medicine_manage_buttonActionPerformed

    private void sales_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_buttonActionPerformed
        bill_button.setBackground(new Color(69,123,157));
        medicine_manage_button.setBackground(new Color(69,123,157));
        sales_button.setBackground(new Color(137,194,217));
        user_button.setBackground(new Color(69,123,157));
        
        BasicInternalFrameUI sales_titel_hide = (BasicInternalFrameUI)salesIframe.getUI();
        sales_titel_hide.setNorthPane(null);
        
        welcomIframe.setVisible(false);
        billIframe.setVisible(false);
        medicineIframe.setVisible(false);
        salesIframe.setVisible(true);
        userIframe.setVisible(false);
    }//GEN-LAST:event_sales_buttonActionPerformed

    private void user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_buttonActionPerformed
        bill_button.setBackground(new Color(69,123,157));
        medicine_manage_button.setBackground(new Color(69,123,157));
        sales_button.setBackground(new Color(69,123,157));
        user_button.setBackground(new Color(137,194,217));
        
        BasicInternalFrameUI user_titel_hide = (BasicInternalFrameUI)userIframe.getUI();
        user_titel_hide.setNorthPane(null);
        
        welcomIframe.setVisible(false);
        billIframe.setVisible(false);
        medicineIframe.setVisible(false);
        salesIframe.setVisible(false);
        userIframe.setVisible(true);
    }//GEN-LAST:event_user_buttonActionPerformed

    private void billIframeInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_billIframeInternalFrameActivated
        try {
            mysql.company_find_query();
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }
        bill_company_name.setText(mysql.company_name);
        bill_company_address.setText(mysql.company_address);
        bill_company_phone.setText(mysql.company_phoneNo);

        DateFormat current_date = new SimpleDateFormat("dd/MM/yyyy");
        Date current_dateObj = new Date();
        date_display.setText(current_date.format(current_dateObj));
    }//GEN-LAST:event_billIframeInternalFrameActivated

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        String medicine_with_under;
        int medicine_total;
        
        medicine_with_under = medicine_name_input.getText().replace(' ', '%');
        
        medicine_total =+ Integer.parseInt(medicine_quantity_input.getText());
        bill_total_display.setText("");
        bill_total_display.setText(String.valueOf(medicine_total));
        
        try {
            mysql.medicine_mrp(medicine_with_under);
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }
        
        float medicine_total_cost = Float.parseFloat(medicine_quantity_input.getText()) * medicine_price;
                
        if(medicine_name_input.getText().trim().isEmpty() || medicine_quantity_input.getText().trim().isEmpty())
        {
            add_button.setEnabled(false);
            medicine_name_input.requestFocus();
        }
        else{
            DefaultTableModel bill_table_add = (DefaultTableModel)bill_table.getModel();
            bill_table_add.addRow(new Object[]{medicine_bill_id++,medicine_name_input.getText(), medicine_quantity_input.getText(), medicine_price, medicine_total_cost});

            medicine_name_input.setText(null);
            medicine_quantity_input.setText(null);
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    @SuppressWarnings("empty-statement")
    private void medicine_name_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_inputKeyReleased
        medicine_name_input.setText(medicine_name_input.getText().toUpperCase());

        try {
            mysql.auto_suggestion_medicine();
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }

        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE){}
        else
        {
            String to_check = medicine_name_input.getText();
            int to_check_len = to_check.length();
            for(String data:medicine_name_auto)
            {
                String check_from_data="";
                for(int checking=0;checking<to_check_len;checking++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(checking);
                    }
                }
                if(check_from_data.equals(to_check))
                {
                    medicine_name_input.setText(data);
                    medicine_name_input.setSelectionStart(to_check_len);
                    medicine_name_input.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_medicine_name_inputKeyReleased

    private void medicine_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            medicine_quantity_input.requestFocus();
        }
    }//GEN-LAST:event_medicine_name_inputKeyPressed

    private void paitent_contact_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paitent_contact_inputKeyPressed
        char text_in_patient_contact = evt.getKeyChar();
        if (Character.isDigit(text_in_patient_contact)||Character.isISOControl(text_in_patient_contact)) {
            patient_input_error.setText("");
            paitent_contact_input.setEditable(true);
            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                if(paitent_contact_input.getText().length() != 10)
                {
                    paitent_contact_input.setEditable(false);
                    patient_input_error.setText("Phone Number is of 10 Digits");
                }
                else{
                    medicine_name_input.requestFocus();
                }
            }
        }
        else{
            paitent_contact_input.setEditable(false);
            patient_input_error.setText("Worong Phone");
        }
    }//GEN-LAST:event_paitent_contact_inputKeyPressed

    private void patient_address_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patient_address_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            paitent_contact_input.requestFocus();
        }
    }//GEN-LAST:event_patient_address_inputKeyPressed

    private void patient_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patient_name_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            patient_address_input.requestFocus();
        }
    }//GEN-LAST:event_patient_name_inputKeyPressed

    private void medicineIframeInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_medicineIframeInternalFrameActivated
        try {
            mysql.company_find_query();
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }
        medMgr_company_name.setText(mysql.company_name);
        medMgr_company_address.setText(mysql.company_address);
        medMgr_company_phone.setText(mysql.company_phoneNo);
        
        medicine_find_error.setText("  ");
        medicine_error.setText("   ");
        
        DateFormat expiry_year_check = new SimpleDateFormat("yyyy");
        Date current_expiry_year = new Date();
        expiry_cur_year = expiry_year_check.format(current_expiry_year);
        
        DateFormat expiry_month_check = new SimpleDateFormat("MM");
        Date current_expiry_month = new Date();
        expiry_cur_month = expiry_month_check.format(current_expiry_month);
    }//GEN-LAST:event_medicineIframeInternalFrameActivated

    //This is just for testing
    private void justJokingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justJokingActionPerformed
        DefaultCategoryDataset dcb = new DefaultCategoryDataset();
        dcb.setValue(100, "Marks", "Haitomns");
        dcb.setValue(89, "Marks", "Hai");
        dcb.setValue(90, "Marks", "Haitom");
        dcb.setValue(60, "Marks", "Haitom");
        
        JFreeChart jchart;
        jchart = ChartFactory.createBarChart("std name", "std marks","std record", dcb, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        
        ChartFrame chartFrame = new ChartFrame("Std Record", jchart, true);
        chartFrame.setVisible(true);
    }//GEN-LAST:event_justJokingActionPerformed
    //here the testing ends
    
    private void welcome_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_userMouseEntered
        welcome_user.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_welcome_userMouseEntered

    private void welcome_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_userMouseExited
        welcome_user.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_welcome_userMouseExited

    private void welcome_salesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_salesMouseEntered
        welcome_sales.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_welcome_salesMouseEntered

    private void welcome_salesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_salesMouseExited
        welcome_sales.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_welcome_salesMouseExited

    private void welcome_medicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_medicineMouseEntered
        welcome_medicine.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_welcome_medicineMouseEntered

    private void welcome_medicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_medicineMouseExited
        welcome_medicine.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_welcome_medicineMouseExited

    private void welcome_billMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_billMouseEntered
        welcome_bill.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_welcome_billMouseEntered

    private void welcome_billMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_billMouseExited
        welcome_bill.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_welcome_billMouseExited

    private void welcome_billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_billMouseClicked
        if(loginPage.user_code == 4){
            JOptionPane.showMessageDialog(null, "You do not have permission for Bill Management");
        }
        else{
            bill_button.doClick();
        }
    }//GEN-LAST:event_welcome_billMouseClicked

    private void welcome_medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_medicineMouseClicked
        if(loginPage.user_code == 3){
            JOptionPane.showMessageDialog(null, "You do not have permission for Medicine Management");
        }
        else{
            medicine_manage_button.doClick();
        }
    }//GEN-LAST:event_welcome_medicineMouseClicked

    private void welcome_salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_salesMouseClicked
        if(loginPage.user_code == 1 || loginPage.user_code == 2){
            sales_button.doClick();
        }
        else{
            JOptionPane.showMessageDialog(null, "You do not have permission for Sales Report");
        }
    }//GEN-LAST:event_welcome_salesMouseClicked

    private void welcome_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_userMouseClicked
        user_button.doClick();
    }//GEN-LAST:event_welcome_userMouseClicked

    private void bill_save_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_save_buttonMouseEntered
        bill_save_button.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_bill_save_buttonMouseEntered

    private void bill_save_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_save_buttonMouseExited
        bill_save_button.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_bill_save_buttonMouseExited

    private void bill_discard_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_discard_buttonMouseEntered
        bill_discard_button.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_bill_discard_buttonMouseEntered

    private void bill_discard_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_discard_buttonMouseExited
        bill_discard_button.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_bill_discard_buttonMouseExited

    private void bill_print_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_print_buttonMouseEntered
        bill_print_button.setBackground(new Color(25,130,196).darker());
    }//GEN-LAST:event_bill_print_buttonMouseEntered

    private void bill_print_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_print_buttonMouseExited
        bill_print_button.setBackground(new Color(25,130,196));
    }//GEN-LAST:event_bill_print_buttonMouseExited

    private void bill_discard_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_discard_buttonMouseClicked
        int discard_bill_table_confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the Bill ?", "Delete Bill",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (discard_bill_table_confirm) {
            case JOptionPane.NO_OPTION -> {
            }
            case JOptionPane.YES_OPTION -> {
                ((DefaultTableModel)bill_table.getModel()).setNumRows(0);
                medicine_bill_id = 1;
            }
            case JOptionPane.CLOSED_OPTION -> {
            }
            default -> {
            }
        }   
    }//GEN-LAST:event_bill_discard_buttonMouseClicked

    private void medicine_quantity_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_quantity_inputKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            medicine_input_error.setText("");
            add_button.setEnabled(true);
            medicine_quantity_input.setEditable(true);
        }
        else{
            medicine_input_error.setText("Invalid Medicine Quantity!");
            add_button.setEnabled(false);
            medicine_quantity_input.setEditable(false);
        }
    }//GEN-LAST:event_medicine_quantity_inputKeyPressed

    private void userIframeInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_userIframeInternalFrameActivated
        try {
            mysql.company_find_query();
        } catch (SQLException ex) {
            Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            mysql.user_find_query();
        } catch (SQLException ex) {
            Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        user_wel_shop_name.setText(mysql.company_name);
        user_wel_shop_contact.setText(mysql.company_phoneNo);
        
        user_wel_users_name.setText(mysql.users_name);
        user_wel_user_type.setText(mysql.user_type);
        
        if(loginPage.user_code == 0)
        {
            user_image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/admin.png")));
        }
        else if(loginPage.user_code == 1){
            user_image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/manager.png")));
        }
        else if(loginPage.user_code == 3){
            user_image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/bill.png")));
        }
        else if(loginPage.user_code == 4){
            user_image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/pharmacist.png")));
        }
        else{
            user_image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/employee.png")));
        }
        
        uesr_details_name_input.setText(mysql.users_name);
        user_details_username_input.setText(mysql.username);
        user_details_password_input.setText("password");
        username_error.setText("");
        
        user_shopDtr_shop_name_input.setText(mysql.company_name);
        user_shopDtr_address_input.setText(mysql.company_address);
        user_shopDtr_shop_contact_input.setText(mysql.company_phoneNo);
        shop_details_error.setText("");
        
        if(!(loginPage.user_code == 1 || loginPage.user_code == 0))
        {
            user_shopDtr_shop_name_input.setEnabled(false);
            user_shopDtr_address_input.setEnabled(false);
            user_shopDtr_shop_contact_input.setEnabled(false);
            user_shopDtr_update_button.setEnabled(false);
        }
    }//GEN-LAST:event_userIframeInternalFrameActivated

    private void user_details_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_details_updateActionPerformed
        int user_Dtr_update_result = 0;
        
        String users_name_update, username_update, password_update;
        users_name_update = uesr_details_name_input.getText();
        username_update = user_details_username_input.getText();
        password_update = user_details_password_input.getText();
        
        if(users_name_update.trim().isEmpty() || username_update.trim().isEmpty() || password_update.trim().isEmpty()){
            username_error.setText("Details are Empty");
            user_details_update.setEnabled(false);
            if(users_name_update.trim().isEmpty()){
                uesr_details_name_input.requestFocus();
            }
            else if(username_update.trim().isEmpty()){
                user_details_username_input.requestFocus();
            }
            else{
                user_details_password_input.requestFocus();
            }    
        }
        else{
            username_error.setText("");
            user_details_update.setEnabled(true);
            
            var update_user_deatils_confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the details ?", "Update User Details", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            switch (update_user_deatils_confirm) {
                case JOptionPane.NO_OPTION -> {
                    uesr_details_name_input.setText(mysql.users_name);
                    user_details_username_input.setText(mysql.username);
                    user_details_password_input.setText("password");
                }
                case JOptionPane.YES_OPTION -> {
                    
                    try {
                        user_Dtr_update_result = mysql.user_update_query(users_name_update, username_update, password_update, loginPage.username_stored);
                    } catch (SQLException ex) {
                        Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if(user_Dtr_update_result == 0){
                        JOptionPane.showMessageDialog(null, "User Details Updated");
                        user_wel_users_name.setText(users_name_update);
                        user_wel_user_type.setText(mysql.user_type);
                        loginPage.username_stored = username_update;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Username Already Taken");
                        uesr_details_name_input.setText(mysql.users_name);
                        user_details_username_input.setText(mysql.username);
                        user_details_password_input.setText("password");
                    }
                }
                case JOptionPane.CLOSED_OPTION -> {
                    uesr_details_name_input.setText(mysql.users_name);
                    user_details_username_input.setText(mysql.username);
                    user_details_password_input.setText("password");
                }
                default -> {
                    uesr_details_name_input.setText(mysql.users_name);
                    user_details_username_input.setText(mysql.username);
                    user_details_password_input.setText("password");
                }
            }   
        }
    }//GEN-LAST:event_user_details_updateActionPerformed

    private void user_details_username_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_details_username_inputKeyPressed
        if (evt.getKeyCode() == 32) {
            username_error.setText("NO spaces in username");
            user_details_username_input.setEditable(false);
            user_details_update.setEnabled(false);
        }
        else if(user_details_username_input.getText().length() < 3){
            username_error.setText("Username should be at least 4 Digits");
            user_details_username_input.setEditable(true);
            user_details_update.setEnabled(false);
        }
        else{
            username_error.setText("");
            user_details_username_input.setEditable(true);
            user_details_update.setEnabled(true);
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                user_details_password_input.requestFocus();
            }
        }
    }//GEN-LAST:event_user_details_username_inputKeyPressed

    private void user_details_password_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_details_password_inputKeyPressed
        if(user_details_password_input.getText().isEmpty() || user_details_password_input.getText().length() < 2){
            username_error.setText("Password Should be at least 3 Digits");
            user_details_update.setEnabled(false);
        }
        else{
            user_details_update.setEnabled(true);
            username_error.setText("");
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                user_details_update.doClick();
            }
        }
    }//GEN-LAST:event_user_details_password_inputKeyPressed

    private void uesr_details_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uesr_details_name_inputKeyPressed
        user_details_update.setEnabled(true);
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            user_details_username_input.requestFocus();
        }
    }//GEN-LAST:event_uesr_details_name_inputKeyPressed

    private void user_shopDtr_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_shopDtr_update_buttonActionPerformed
        String shop_name_update, shop_address_update, shop_contact_update;
        shop_name_update = user_shopDtr_shop_name_input.getText();
        shop_address_update = user_shopDtr_address_input.getText();
        shop_contact_update = user_shopDtr_shop_contact_input.getText();

        if(shop_name_update.trim().isEmpty() || shop_address_update.trim().isEmpty() || shop_contact_update.trim().isEmpty()){
            user_shopDtr_update_button.setEnabled(false);
            shop_details_error.setText("Details are Empty");
            if(shop_name_update.trim().isEmpty()){
                user_shopDtr_shop_name_input.requestFocus();
            }
            else if(shop_address_update.trim().isEmpty()){
                user_shopDtr_address_input.requestFocus();
            }
            else{
                user_shopDtr_shop_contact_input.requestFocus();
            }
        }
        else if(user_shopDtr_shop_contact_input.getText().length() != 10){
            shop_details_error.setText("Phone Nuumber is of 10 Digits");
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
                        Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(null, "Shop Details Updated");

                    user_wel_shop_name.setText(shop_name_update);
                    user_wel_shop_contact.setText(shop_contact_update);
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
            user_shopDtr_update_button.doClick();
        }
    }//GEN-LAST:event_user_shopDtr_shop_contact_inputKeyPressed

    private void medMgr_type_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_type_inputMouseClicked
        medMgr_type_input.selectAll();
    }//GEN-LAST:event_medMgr_type_inputMouseClicked

    private void medMgr_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medMgr_add_buttonActionPerformed
        String med_name, med_type, med_strength, med_sheet, med_tablet, med_box, med_expiry_month, med_expiry_year, med_mrp;
        String medicine_with_percentage;
        
        int total_no_tablets = 0;
        float total_cost_of_medicine = 0;

        med_name = medMgr_name_input.getText();
        med_type = medMgr_type_input.getText();
        med_strength = medMgr_strength_input.getText();
        med_sheet = medMgr_no_sheet_input.getText();
        med_tablet = medMgr_no_tablet_input.getText();
        med_mrp = medMgr_mrp_input.getText();
        med_box = medMgr_no_box_input.getText();
        med_expiry_month = medMgr_expiry_input_month.getText();
        med_expiry_year = medMgr_expiry_input_year.getText();
        
        total_no_tablets = ( Integer.parseInt(med_sheet) * Integer.parseInt(med_tablet) ) * Integer.parseInt(med_box);
        total_cost_of_medicine = total_no_tablets * Float.parseFloat(med_mrp);
        
        int exp_date_check;
        exp_date_check = expiry_date_checker(med_expiry_month, med_expiry_year);
        
        if(exp_date_check == 0){
            JOptionPane.showMessageDialog(null, "You can not input EXPIRED Medicine");
        }
        else{
            if(med_name.isEmpty() || med_type.isEmpty() || med_strength.isEmpty() || med_sheet.isEmpty() || med_tablet.isEmpty() || med_box.isEmpty() || med_mrp.isEmpty() || med_expiry_month.isEmpty() || med_expiry_year.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Fill all the details!");
            }
            else{
                if(duplicate_med_id <= 0 ){
                    try {
                        mysql.medicine_import_query(med_name, med_type, med_strength);
                    } catch (SQLException ex) {
                        Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                medicine_with_percentage = med_name.replace(' ', '%');
                medicine_with_percentage = medicine_with_percentage.substring(0, medicine_with_percentage.length()-1);

                try {
                    mysql.medicine_import_details__query(medicine_with_percentage, med_sheet, med_tablet, med_box, med_expiry_month, med_expiry_year, med_mrp, total_no_tablets, total_cost_of_medicine);
                } catch (SQLException ex) {
                    Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Medicine Succesfully Saved :)");
                medMgr_clear_button.doClick();
                medMgr_name_input.requestFocus();
            }
        }
    }//GEN-LAST:event_medMgr_add_buttonActionPerformed

    public static int expiry_date_checker(String med_expiry_month, String med_expiry_year){
        int month_check;
        int year_check;       
        int cur_month;
        int cur_year;
        
        if(med_expiry_month.equals("MM") || med_expiry_year.equals("yy")){
            return 0;
        }else{
            try{
                month_check = Integer.parseInt(med_expiry_month);
                year_check = Integer.parseInt(med_expiry_year);
                cur_month = Integer.parseInt(expiry_cur_month);
                cur_year = Integer.parseInt(expiry_cur_year)-2000;
            }
            catch(NumberFormatException ex){
                return 1;
            }

            if(year_check >= cur_year){
                if(cur_year == year_check)
                {
                    if(month_check > cur_month){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
                else{
                    return 1;
                }       
            }
            else{
                return 0;
            }
        }
    }
    
    private void medMgr_mrp_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_mrp_inputMouseClicked
        medMgr_mrp_input.selectAll();
    }//GEN-LAST:event_medMgr_mrp_inputMouseClicked

    private void medMgr_no_tablet_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_no_tablet_inputMouseClicked
        medMgr_no_tablet_input.selectAll();
    }//GEN-LAST:event_medMgr_no_tablet_inputMouseClicked

    private void medMgr_no_sheet_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_sheet_inputKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                if(medMgr_no_sheet_input.getText().equals("0")){
                    medicine_error.setText("No of Sheets can not be zero!");
                    medMgr_add_button.setEnabled(false);
                }
                else{
                    medMgr_no_tablet_input.requestFocus();
                    medicine_error.setText("  ");
                    medMgr_add_button.setEnabled(true);
                }
            } 
        } 
        else if(medMgr_no_sheet_input.getText().length() <= 0){
            medicine_error.setText("No of Sheets can not be NULL!");
            medMgr_add_button.setEnabled(false);
        }
        else{
            medicine_error.setText("Details Need To be filled!");
            medMgr_add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medMgr_no_sheet_inputKeyPressed

    private void medMgr_no_sheet_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_no_sheet_inputMouseClicked
        medMgr_no_sheet_input.selectAll();
    }//GEN-LAST:event_medMgr_no_sheet_inputMouseClicked

    private void medMgr_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_name_inputKeyPressed
        String medicine_with_search;
        medicine_with_search = medMgr_name_input.getText().replace(' ', '%');

        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                mysql.medicine_details(medicine_with_search);
            } catch (SQLException ex) {
                Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                duplicate_med_id = mysql.medicine_duplicate(medicine_with_search);
            } catch (SQLException ex) {
                Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(medicine_unit == null)
            {
                medMgr_type_input.requestFocus();
            }
            else{
                medMgr_type_input.setText(medicine_unit);
                medMgr_strength_input.setText(medicine_strength);
                medMgr_no_sheet_input.setText(String.valueOf(mecicine_no_pack));
                medMgr_no_tablet_input.setText(String.valueOf(medicine_no_quantity));
                medMgr_mrp_input.setText(String.valueOf(medicien_mrp));
                medMgr_no_box_input.requestFocus();
            }
        }
    }//GEN-LAST:event_medMgr_name_inputKeyPressed

    private void medMgr_name_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_name_inputMouseClicked
        medMgr_name_input.selectAll();
    }//GEN-LAST:event_medMgr_name_inputMouseClicked

    private void medMgr_name_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_name_inputKeyReleased
        medMgr_name_input.setText(medMgr_name_input.getText().toUpperCase());

        try {
            mysql.auto_suggestion_medicine_for_mrdMgr();
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }

        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE){}
        else
        {
            String to_check = medMgr_name_input.getText();
            int to_check_len = to_check.length();
            for(String data:medicine_name_auto_med_mgr)
            {
                String check_from_data="";
                for(int checking=0;checking<to_check_len;checking++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(checking);
                    }
                }
                if(check_from_data.equals(to_check))
                {
                    medMgr_name_input.setText(data);
                    medMgr_name_input.setSelectionStart(to_check_len);
                    medMgr_name_input.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_medMgr_name_inputKeyReleased

    private void medMgr_type_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_type_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            medMgr_strength_input.requestFocus();
        }
    }//GEN-LAST:event_medMgr_type_inputKeyPressed

    private void medMgr_strength_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_strength_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            medMgr_no_sheet_input.requestFocus();
        }
    }//GEN-LAST:event_medMgr_strength_inputKeyPressed

    private void medMgr_strength_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_strength_inputMouseClicked
        medMgr_strength_input.selectAll();
    }//GEN-LAST:event_medMgr_strength_inputMouseClicked

    private void medMgr_no_tablet_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_tablet_inputKeyPressed
         if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                if(medMgr_no_tablet_input.getText().equals("0")){
                       medicine_error.setText("No of Tablet can not be zero!");
                       medMgr_add_button.setEnabled(false);
                }
                else{
                    medMgr_mrp_input.requestFocus();
                    medicine_error.setText("  ");
                    medMgr_add_button.setEnabled(true);
                }
            }
         }
        else if(medMgr_no_tablet_input.getText().length() <= 0)
        {
            medicine_error.setText("No of Tablet can not be zero!");
            medMgr_add_button.setEnabled(false);
        }
        else{
            medicine_error.setText("Details Need To be filled!");
            medMgr_add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medMgr_no_tablet_inputKeyPressed

    private void medMgr_mrp_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_mrp_inputKeyTyped
        if (Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.' || Character.isWhitespace(evt.getKeyChar())) {
            medicine_error.setText("  ");
            medMgr_add_button.setEnabled(true);
        }  
        else{
            evt.consume();
            medicine_error.setText("Only Numbers Allowed!");
            medMgr_add_button.setEnabled(false);
        }       
    }//GEN-LAST:event_medMgr_mrp_inputKeyTyped

    private void medMgr_mrp_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_mrp_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                medMgr_no_box_input.requestFocus();
            }
    }//GEN-LAST:event_medMgr_mrp_inputKeyPressed

    private void medMgr_expiry_input_monthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_expiry_input_monthKeyPressed
         if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                if(medMgr_expiry_input_month.getText().equals("0")){
                        medicine_error.setText("Month can not be Zero!");
                        medMgr_add_button.setEnabled(false);
                    }
                    else{
                        medMgr_expiry_input_year.requestFocus();
                        medicine_error.setText("  ");
                        medMgr_add_button.setEnabled(true);
                    }
                }
         }
        else if(medMgr_expiry_input_month.getText().length() <= 0)
        {
            medicine_error.setText("Month can not be Zero!");
            medMgr_add_button.setEnabled(false);
        }
        else{
            medicine_error.setText("Details Need To be filled!");
            medMgr_add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medMgr_expiry_input_monthKeyPressed

    private void medMgr_expiry_input_yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_expiry_input_yearKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                if(medMgr_expiry_input_year.getText().equals("0")){
                        medicine_error.setText("Year can not be Zero!");
                        medMgr_add_button.setEnabled(false);
                    }
                    else{
                        medMgr_add_button.doClick();
                        medicine_error.setText("  ");
                        medMgr_add_button.setEnabled(true);
                    }
                }
            }
        else if(medMgr_expiry_input_year.getText().length() <= 0)
        {
            medicine_error.setText("Year can not be Zero!");
            medMgr_add_button.setEnabled(false);
        }
        else{
            medicine_error.setText("Details Need To be filled!");
            medMgr_add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medMgr_expiry_input_yearKeyPressed

    private void medMgr_expiry_input_monthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_medMgr_expiry_input_monthFocusGained
        medMgr_expiry_input_month.setText("");
    }//GEN-LAST:event_medMgr_expiry_input_monthFocusGained

    private void medMgr_expiry_input_yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_medMgr_expiry_input_yearFocusGained
        medMgr_expiry_input_year.setText("");
    }//GEN-LAST:event_medMgr_expiry_input_yearFocusGained

    private void medMgr_expiry_input_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_medMgr_expiry_input_monthFocusLost
        try{
            int month_check = Integer.parseInt(medMgr_expiry_input_month.getText());
            if(month_check<1 || month_check>12){
                medicine_error.setText("Invalid Month!");
                JOptionPane.showMessageDialog(null, "Invalid Month!");
                medMgr_expiry_input_month.setText("");
                medMgr_add_button.setEnabled(false);
                medMgr_expiry_input_month.requestFocus();
            }
        }
        catch(NumberFormatException ex){
            medicine_error.setText("You can not enter Letters in Date!");
            medMgr_add_button.setEnabled(false);
            medMgr_expiry_input_month.setText("");
        }
    }//GEN-LAST:event_medMgr_expiry_input_monthFocusLost

    private void medMgr_clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medMgr_clear_buttonActionPerformed
        medMgr_name_input.setText("");
        medMgr_type_input.setText("");
        medMgr_strength_input.setText("");
        medMgr_no_sheet_input.setText("");
        medMgr_no_tablet_input.setText("");
        medMgr_mrp_input.setText("");
        medMgr_no_box_input.setText("");
        medMgr_expiry_input_month.setText("");
        medMgr_expiry_input_year.setText("");
        medicine_error.setText("  ");
        medMgr_add_button.setEnabled(true);
    }//GEN-LAST:event_medMgr_clear_buttonActionPerformed

    private void medicine_name_find_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_find_inputKeyReleased
       medicine_name_find_input.setText(medicine_name_find_input.getText().toUpperCase());

        try {
            mysql.auto_suggestion_medicine();
        }
        catch (SQLException database_error_message) {
            JOptionPane.showMessageDialog(null, database_error_message);
        }

        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE){}
        else
        {
            String to_check = medicine_name_find_input.getText();
            int to_check_len = to_check.length();
            for(String data:medicine_name_auto)
            {
                String check_from_data="";
                for(int checking=0;checking<to_check_len;checking++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(checking);
                    }
                }
                if(check_from_data.equals(to_check))
                {
                    medicine_name_find_input.setText(data);
                    medicine_name_find_input.setSelectionStart(to_check_len);
                    medicine_name_find_input.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_medicine_name_find_inputKeyReleased

    private void find_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_buttonActionPerformed
        String medicine_with_find;
        medicine_with_find = medicine_name_find_input.getText().replace(' ', '%');
        int find_result = 0;

        try {
            find_result = mysql.medicine_find(medicine_with_find);
        } catch (SQLException ex) {
            Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(find_result < 1){
            medicine_find_error.setText("No Medicine Found");
            ((DefaultTableModel)medMgr_table_find.getModel()).setNumRows(0);
        }
        else{
            medicine_find_error.setText("  ");
        }
    }//GEN-LAST:event_find_buttonActionPerformed

    private void medicine_name_find_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_find_inputKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            find_button.doClick();
        }
    }//GEN-LAST:event_medicine_name_find_inputKeyPressed

    private void medicine_name_find_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_name_find_inputMouseClicked
        medicine_name_find_input.selectAll();
    }//GEN-LAST:event_medicine_name_find_inputMouseClicked

    private void medMgr_table_findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMgr_table_findMouseClicked
        int find_table_index = medMgr_table_find.getSelectedRow();
        TableModel find_table_model = medMgr_table_find.getModel();
        
        med_id_delete = find_table_model.getValueAt(find_table_index, 0).toString();
        med_batch_delete = find_table_model.getValueAt(find_table_index, 4).toString();
    }//GEN-LAST:event_medMgr_table_findMouseClicked

    private void medMgr_no_box_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_box_inputKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                if(medMgr_no_tablet_input.getText().isEmpty()){
                    medicine_error.setText("No of Tablet can not be Empty!");
                    medMgr_add_button.setEnabled(false);
                }else{
                    medMgr_expiry_input_month.requestFocus();
                    medicine_error.setText("  ");
                    medMgr_add_button.setEnabled(true);
                }
            } 
        } 
        else if(medMgr_no_box_input.getText().length() <= 0){
            medicine_error.setText("No of Boxes can not be NULL!");
            medMgr_add_button.setEnabled(false);
        }
        else{
            medicine_error.setText("Details Need To be filled!");
            medMgr_add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medMgr_no_box_inputKeyPressed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        if(med_id_delete == null || med_batch_delete == null){
            JOptionPane.showMessageDialog(null, "You havent selected a medicine, Select a medicine from the table and then delete.");
        }
        else{
            int medicine_delete_confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete ?", "Medicine Delete",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            System.out.println(med_id_delete+" "+med_batch_delete);

            switch (medicine_delete_confirm) {
                case JOptionPane.NO_OPTION -> {
                }
                case JOptionPane.YES_OPTION -> {
                    try {
                        mysql.medicine_delete(med_id_delete, med_batch_delete);
                    } catch (SQLException ex) {
                        Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Medicine Deleted Succesfully");
                    find_button.doClick();
                }
                case JOptionPane.CLOSED_OPTION -> {
                }
                default -> {
                }
            }
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        about_dialog.setSize(new Dimension(350, 300));
        about_dialog.setResizable(false);
        about_dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refrresh_for_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrresh_for_statusActionPerformed
       try {
            mysql.pharmacy_status();
        } catch (SQLException ex) {
            Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        total_medicine_display.setText(total_medicine);
        total_stocks_display.setText(total_quantity);
        total_cost_display.setText(total_cost);
        total_expired_display.setText(total_expired);
        total_out_display.setText(total_out);
    }//GEN-LAST:event_refrresh_for_statusActionPerformed

    private void refrresh_for_status1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrresh_for_status1ActionPerformed
        try {
            mysql.pharmacy_status();
        } catch (SQLException ex) {
            Logger.getLogger(medicine_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        total_medicine_display_user.setText(total_medicine);
        total_stocks_display_user.setText(total_quantity);
        total_cost_display_user.setText(total_cost);
        total_expired_display_user.setText(total_expired);
        total_out_display_user.setText(total_out);
    }//GEN-LAST:event_refrresh_for_status1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicine_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new medicine_management().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel about_backgroung;
    private javax.swing.JLabel about_developer;
    private javax.swing.JDialog about_dialog;
    private javax.swing.JButton add_button;
    private javax.swing.JLabel add_medicine_label;
    private javax.swing.JSeparator add_medicine_seperator;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bar;
    private javax.swing.JInternalFrame billIframe;
    protected javax.swing.JButton bill_button;
    private javax.swing.JLabel bill_company_address;
    private javax.swing.JLabel bill_company_name;
    private javax.swing.JLabel bill_company_phone;
    private javax.swing.JButton bill_discard_button;
    private javax.swing.JPanel bill_input_panel;
    private javax.swing.JButton bill_print_button;
    private javax.swing.JButton bill_save_button;
    private javax.swing.JScrollPane bill_tabel_scrollpanel;
    private javax.swing.JTable bill_table;
    private javax.swing.JPanel bill_title_label;
    private javax.swing.JLabel bill_total_display;
    private javax.swing.JLabel bill_total_label;
    private javax.swing.JPanel bill_total_panel;
    private javax.swing.JButton cancel_button;
    private javax.swing.JPanel cardPane;
    private javax.swing.JLabel command_center;
    private javax.swing.JPanel command_center_pane;
    private javax.swing.JSeparator command_center_seperator;
    private javax.swing.JLabel date_display;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel developer_name;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email_value;
    private javax.swing.JLabel expired_icon;
    private javax.swing.JLabel expired_icon_user;
    private javax.swing.JLabel expirrd_label;
    private javax.swing.JLabel expirrd_label_user;
    private javax.swing.JPanel expiry_panel;
    private javax.swing.JPanel expiry_panel_user;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton find_button;
    private javax.swing.JLabel find_medicine_label;
    private javax.swing.JSeparator find_medicine_seperator;
    private javax.swing.JLabel invoice_label;
    private javax.swing.JPanel invoide_date_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel java_version;
    private javax.swing.JLabel java_version_value;
    private javax.swing.JButton justJoking;
    private javax.swing.JButton medMgr_add_button;
    private javax.swing.JButton medMgr_clear_button;
    private javax.swing.JLabel medMgr_company_address;
    private javax.swing.JLabel medMgr_company_name;
    private javax.swing.JLabel medMgr_company_phone;
    private javax.swing.JPanel medMgr_details_panel;
    private javax.swing.JTextField medMgr_expiry_input_month;
    private javax.swing.JTextField medMgr_expiry_input_year;
    private javax.swing.JLabel medMgr_expiry_lable;
    private javax.swing.JLabel medMgr_expiry_lable1;
    private javax.swing.JPanel medMgr_find_panel;
    private javax.swing.JTextField medMgr_mrp_input;
    private javax.swing.JLabel medMgr_mrp_label;
    private javax.swing.JLabel medMgr_name;
    private javax.swing.JTextField medMgr_name_input;
    private javax.swing.JTextField medMgr_no_box_input;
    private javax.swing.JLabel medMgr_no_box_label;
    private javax.swing.JTextField medMgr_no_sheet_input;
    private javax.swing.JLabel medMgr_no_sheet_label;
    private javax.swing.JTextField medMgr_no_tablet_input;
    private javax.swing.JLabel medMgr_no_tablet_label;
    private javax.swing.JTextField medMgr_strength_input;
    private javax.swing.JLabel medMgr_strength_label;
    private javax.swing.JScrollPane medMgr_tabel_scrollpanel;
    public static javax.swing.JTable medMgr_table_find;
    private javax.swing.JPanel medMgr_title_lable;
    private javax.swing.JTextField medMgr_type_input;
    private javax.swing.JLabel medMgr_type_label;
    private javax.swing.JInternalFrame medicineIframe;
    private javax.swing.JSeparator medicine_details_seperator;
    private javax.swing.JLabel medicine_error;
    private javax.swing.JLabel medicine_find_error;
    private javax.swing.JLabel medicine_input_error;
    private javax.swing.JLabel medicine_label;
    private javax.swing.JButton medicine_manage_button;
    private javax.swing.JTextField medicine_name_find_input;
    private javax.swing.JTextField medicine_name_input;
    private javax.swing.JLabel medicine_name_label;
    private javax.swing.JTextField medicine_quantity_input;
    private javax.swing.JLabel medinine_label;
    private javax.swing.JLabel out_of_stock_icon;
    private javax.swing.JLabel out_of_stock_icon_user;
    private javax.swing.JLabel out_of_stock_label;
    private javax.swing.JLabel out_of_stock_label_user;
    private javax.swing.JPanel out_of_stock_panel;
    private javax.swing.JPanel out_of_stock_panel_user;
    private javax.swing.JTextField paitent_contact_input;
    private javax.swing.JTextField patient_address_input;
    private javax.swing.JLabel patient_address_label;
    private javax.swing.JLabel patient_contact_label;
    private javax.swing.JPanel patient_details_panel;
    private javax.swing.JLabel patient_input_error;
    private javax.swing.JTextField patient_name_input;
    private javax.swing.JLabel patient_name_label;
    private javax.swing.JLabel pharmacy_lable;
    private javax.swing.JLabel pharmacy_lable1;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JButton refrresh_for_status;
    private javax.swing.JButton refrresh_for_status1;
    private javax.swing.JLabel requirements;
    private javax.swing.JInternalFrame salesIframe;
    private javax.swing.JButton sales_button;
    private javax.swing.JLabel shop_details_error;
    private javax.swing.JPanel shop_details_panel;
    private javax.swing.JPanel side_panel_menu;
    private javax.swing.JLabel software_version;
    private javax.swing.JPanel status_panel;
    private javax.swing.JPanel status_panel_user;
    private javax.swing.JPanel title_pane;
    private javax.swing.JLabel total_cost_display;
    private javax.swing.JLabel total_cost_display_user;
    private javax.swing.JLabel total_cost_icon;
    private javax.swing.JLabel total_cost_icon_user;
    private javax.swing.JLabel total_cost_label;
    private javax.swing.JLabel total_cost_label_user;
    private javax.swing.JPanel total_cost_panel;
    private javax.swing.JPanel total_cost_panel_user;
    private javax.swing.JLabel total_expired_display;
    private javax.swing.JLabel total_expired_display_user;
    private javax.swing.JLabel total_medicine_display;
    private javax.swing.JLabel total_medicine_display_user;
    private javax.swing.JLabel total_medicine_icon;
    private javax.swing.JLabel total_medicine_icon_user;
    private javax.swing.JLabel total_medicine_label;
    private javax.swing.JLabel total_medicine_label_user;
    private javax.swing.JPanel total_medicine_panel;
    private javax.swing.JPanel total_medicine_panel_user;
    private javax.swing.JLabel total_out_display;
    private javax.swing.JLabel total_out_display_user;
    private javax.swing.JLabel total_stock_icon;
    private javax.swing.JLabel total_stock_icon_user;
    private javax.swing.JLabel total_stock_label;
    private javax.swing.JLabel total_stock_label_user;
    private javax.swing.JLabel total_stocks_display;
    private javax.swing.JLabel total_stocks_display_user;
    private javax.swing.JPanel total_stocks_panel;
    private javax.swing.JPanel total_stocks_panel_user;
    private javax.swing.JTextField uesr_details_name_input;
    private javax.swing.JInternalFrame userIframe;
    private javax.swing.JButton user_button;
    private javax.swing.JLabel user_details_label;
    private javax.swing.JLabel user_details_name;
    private javax.swing.JPanel user_details_panel;
    private javax.swing.JPasswordField user_details_password_input;
    private javax.swing.JLabel user_details_pasword_input;
    private javax.swing.JSeparator user_details_seperator;
    private javax.swing.JButton user_details_update;
    private javax.swing.JTextField user_details_username_input;
    private javax.swing.JLabel user_details_username_label;
    private javax.swing.JLabel user_image_label;
    private javax.swing.JPanel user_image_panel;
    private javax.swing.JTextField user_shopDtr_address_input;
    private javax.swing.JLabel user_shopDtr_address_label;
    private javax.swing.JLabel user_shopDtr_label;
    private javax.swing.JSeparator user_shopDtr_seperator;
    private javax.swing.JLabel user_shopDtr_shop_contact;
    private javax.swing.JTextField user_shopDtr_shop_contact_input;
    private javax.swing.JLabel user_shopDtr_shop_name;
    private javax.swing.JTextField user_shopDtr_shop_name_input;
    private javax.swing.JButton user_shopDtr_update_button;
    private javax.swing.JLabel user_wel_shop_contact;
    private javax.swing.JLabel user_wel_shop_name;
    private javax.swing.JLabel user_wel_user_type;
    private javax.swing.JLabel user_wel_users_name;
    private javax.swing.JLabel user_wel_welcome;
    private javax.swing.JPanel user_welcome_panel;
    private javax.swing.JLabel username_error;
    private javax.swing.JLabel version;
    private javax.swing.JLabel version_value;
    private javax.swing.JInternalFrame welcomIframe;
    private javax.swing.JLabel welcome_arrow;
    private javax.swing.JPanel welcome_bill;
    private javax.swing.JLabel welcome_bill_image;
    private javax.swing.JLabel welcome_bill_label;
    private javax.swing.JLabel welcome_icon;
    private javax.swing.JPanel welcome_medicine;
    private javax.swing.JLabel welcome_medicine_image;
    private javax.swing.JLabel welcome_medicine_lable;
    private javax.swing.JPanel welcome_sales;
    private javax.swing.JLabel welcome_sales_image;
    private javax.swing.JLabel welcome_sales_label;
    private javax.swing.JLabel welcome_sub_title;
    private javax.swing.JLabel welcome_title;
    private javax.swing.JPanel welcome_user;
    private javax.swing.JLabel welcome_user_image;
    private javax.swing.JLabel welcome_user_label;
    private javax.swing.JLabel xaamp_version;
    private javax.swing.JLabel xaamp_version_value;
    // End of variables declaration//GEN-END:variables
}