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
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class medicine_management extends javax.swing.JFrame {
    int medicine_bill_id = 1;
    static Set<String> medicine_name_auto = new TreeSet<String>();
    static float medicine_price = 0;
    static String medicine_with_under;
            
    public medicine_management() {
        initComponents();
        setExtendedState(medicine_management.MAXIMIZED_BOTH);
        
        BasicInternalFrameUI welcom_titel_hide = (BasicInternalFrameUI)welcomIframe.getUI();
        welcom_titel_hide.setNorthPane(null);
        welcomIframe.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        side_panel_menu = new javax.swing.JPanel();
        bill_button = new javax.swing.JButton();
        medicine_manage_button = new javax.swing.JButton();
        sales_button = new javax.swing.JButton();
        user_button = new javax.swing.JButton();
        title_pane = new javax.swing.JPanel();
        cardPane = new javax.swing.JPanel();
        welcomIframe = new javax.swing.JInternalFrame();
        welcom_panel_label = new javax.swing.JLabel();
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
        medMgr_find_error = new javax.swing.JLabel();
        medMgr_tabel_scrollpanel = new javax.swing.JScrollPane();
        medMgr_table = new javax.swing.JTable();
        medMgr_table.getTableHeader().setBackground(new Color(25,130,196));
        medMgr_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        medMgr_table.getTableHeader().setForeground(Color.WHITE);
        medMgr_details_panel = new javax.swing.JPanel();
        medicine_label = new javax.swing.JLabel();
        medicine_details_seperator = new javax.swing.JSeparator();
        medMgr_name = new javax.swing.JLabel();
        medMgr_name_input = new javax.swing.JTextField();
        medMgr_type_label = new javax.swing.JLabel();
        medMgr_type_comboBox = new javax.swing.JComboBox<>();
        medMgr_strength_label = new javax.swing.JLabel();
        medMgr_strength_input = new javax.swing.JTextField();
        medMgr_no_sheet_label = new javax.swing.JLabel();
        medMgr_no_sheet_input = new javax.swing.JTextField();
        medMgr_no_tablet_label = new javax.swing.JLabel();
        medMgr_no_table_input = new javax.swing.JTextField();
        medMgr_mrp_label = new javax.swing.JLabel();
        medMgr_mrp_input = new javax.swing.JTextField();
        medMgr_no_box_label = new javax.swing.JLabel();
        medMgr_no_box_input = new javax.swing.JTextField();
        medMgr_expiry_lable = new javax.swing.JLabel();
        medMgr_expiry_input = new javax.swing.JTextField();
        medMgr_details_error = new javax.swing.JLabel();
        medMgr_add_button = new javax.swing.JButton();
        medMgr_update_button = new javax.swing.JButton();
        salesIframe = new javax.swing.JInternalFrame();
        sales_panel_label = new javax.swing.JLabel();
        userIframe = new javax.swing.JInternalFrame();
        patient_details_panel1 = new javax.swing.JPanel();
        patient_name_input1 = new javax.swing.JTextField();
        patient_address_input1 = new javax.swing.JTextField();
        paitent_contact_input1 = new javax.swing.JTextField();
        patient_name_label1 = new javax.swing.JLabel();
        patient_address_label1 = new javax.swing.JLabel();
        patient_contact_label1 = new javax.swing.JLabel();
        patient_input_error1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy");
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
        user_button.setText("User");
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

        title_pane.setBackground(new java.awt.Color(214, 40, 40));

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

        welcomIframe.setBackground(new java.awt.Color(168, 218, 220));
        welcomIframe.setBorder(null);
        welcomIframe.setVisible(true);

        welcom_panel_label.setText("Welcom Panel");

        javax.swing.GroupLayout welcomIframeLayout = new javax.swing.GroupLayout(welcomIframe.getContentPane());
        welcomIframe.getContentPane().setLayout(welcomIframeLayout);
        welcomIframeLayout.setHorizontalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomIframeLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(welcom_panel_label)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        welcomIframeLayout.setVerticalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomIframeLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(welcom_panel_label)
                .addContainerGap(445, Short.MAX_VALUE))
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
                .addGroup(bill_title_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_company_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_company_address, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Sn. No", "Medicine Name", "Quantity", "Rate", "Total", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
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
            bill_table.getColumnModel().getColumn(0).setPreferredWidth(4);
            bill_table.getColumnModel().getColumn(1).setPreferredWidth(15);
            bill_table.getColumnModel().getColumn(2).setPreferredWidth(4);
            bill_table.getColumnModel().getColumn(3).setPreferredWidth(6);
            bill_table.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medicine_quantity_inputKeyTyped(evt);
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
                .addGap(18, 18, 18)
                .addGroup(bill_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicine_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medinine_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        bill_save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_save_40px_2.png"))); // NOI18N
        bill_save_button.setBorder(null);
        bill_save_button.setBorderPainted(false);
        bill_save_button.setContentAreaFilled(false);

        bill_discard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_waste_40px_1.png"))); // NOI18N
        bill_discard_button.setBorder(null);
        bill_discard_button.setContentAreaFilled(false);

        bill_print_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_print_40px_4.png"))); // NOI18N
        bill_print_button.setBorder(null);
        bill_print_button.setBorderPainted(false);
        bill_print_button.setContentAreaFilled(false);

        javax.swing.GroupLayout command_center_paneLayout = new javax.swing.GroupLayout(command_center_pane);
        command_center_pane.setLayout(command_center_paneLayout);
        command_center_paneLayout.setHorizontalGroup(
            command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(command_center_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(command_center_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(command_center_paneLayout.createSequentialGroup()
                        .addComponent(bill_save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bill_discard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(command_center_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_print_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, command_center_paneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(command_center, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoide_date_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bill_tabel_scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                            .addGroup(billIframeLayout.createSequentialGroup()
                                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bill_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patient_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 326, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addComponent(bill_input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(command_center_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bill_tabel_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(command_center_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
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
                .addGroup(medMgr_title_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medMgr_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_company_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_company_address, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        medicine_name_find_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicine_name_find_inputKeyPressed(evt);
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

        medMgr_find_error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medMgr_find_error.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_find_error.setText("Find ERROR");

        javax.swing.GroupLayout medMgr_find_panelLayout = new javax.swing.GroupLayout(medMgr_find_panel);
        medMgr_find_panel.setLayout(medMgr_find_panelLayout);
        medMgr_find_panelLayout.setHorizontalGroup(
            medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(medMgr_find_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(find_medicine_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_medicine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(medMgr_find_error))
                    .addGroup(medMgr_find_panelLayout.createSequentialGroup()
                        .addComponent(medicine_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicine_name_find_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(find_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                    .addComponent(find_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(medMgr_find_error)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        medMgr_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sn. No", "Medicine Name", "Quantity", "Rate", "Total", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medMgr_table.setRowHeight(30);
        medMgr_tabel_scrollpanel.setViewportView(medMgr_table);
        if (medMgr_table.getColumnModel().getColumnCount() > 0) {
            medMgr_table.getColumnModel().getColumn(0).setPreferredWidth(4);
            medMgr_table.getColumnModel().getColumn(1).setPreferredWidth(15);
            medMgr_table.getColumnModel().getColumn(2).setPreferredWidth(4);
            medMgr_table.getColumnModel().getColumn(3).setPreferredWidth(6);
            medMgr_table.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

        medMgr_details_panel.setBackground(new java.awt.Color(25, 130, 196));

        medicine_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_label.setForeground(new java.awt.Color(255, 255, 255));
        medicine_label.setText("Medicine Details");

        medMgr_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_name.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_name.setText("Medicine Name");

        medMgr_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_name_inputKeyPressed(evt);
            }
        });

        medMgr_type_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_type_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_type_label.setText("Type");

        medMgr_type_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Capsule", "Tube", "Bottol", "Sachet", "Ampoule", "Vial", "Pre Filled Pen", "Canister", "Kit" }));
        medMgr_type_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medMgr_type_comboBoxActionPerformed(evt);
            }
        });

        medMgr_strength_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_strength_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_strength_label.setText("Strength/Volume");

        medMgr_strength_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_strength_inputKeyPressed(evt);
            }
        });

        medMgr_no_sheet_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_no_sheet_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_no_sheet_label.setText("Number of Sheet");

        medMgr_no_sheet_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_no_sheet_inputKeyPressed(evt);
            }
        });

        medMgr_no_tablet_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_no_tablet_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_no_tablet_label.setText("Number of Tablet");

        medMgr_no_table_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_no_table_inputKeyPressed(evt);
            }
        });

        medMgr_mrp_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medMgr_mrp_label.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_mrp_label.setText("MRP");

        medMgr_mrp_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_mrp_inputKeyPressed(evt);
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

        medMgr_expiry_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medMgr_expiry_inputKeyPressed(evt);
            }
        });

        medMgr_details_error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medMgr_details_error.setForeground(new java.awt.Color(255, 255, 255));

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

        medMgr_update_button.setBackground(new java.awt.Color(248, 150, 30));
        medMgr_update_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        medMgr_update_button.setForeground(new java.awt.Color(255, 255, 255));
        medMgr_update_button.setText("Update");
        medMgr_update_button.setBorder(null);
        medMgr_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medMgr_update_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medMgr_details_panelLayout = new javax.swing.GroupLayout(medMgr_details_panel);
        medMgr_details_panel.setLayout(medMgr_details_panelLayout);
        medMgr_details_panelLayout.setHorizontalGroup(
            medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, medMgr_details_panelLayout.createSequentialGroup()
                            .addComponent(medMgr_mrp_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medMgr_mrp_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                            .addComponent(medMgr_no_tablet_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addComponent(medMgr_no_table_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                            .addComponent(medMgr_no_box_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medMgr_no_box_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                            .addComponent(medMgr_expiry_lable)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medMgr_expiry_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(medicine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(medicine_details_seperator, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                            .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                                    .addComponent(medMgr_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(medMgr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(medMgr_details_error))
                            .addGap(127, 127, 127))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, medMgr_details_panelLayout.createSequentialGroup()
                            .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(medMgr_type_label)
                                .addComponent(medMgr_name)
                                .addComponent(medMgr_strength_label)
                                .addComponent(medMgr_no_sheet_label))
                            .addGap(34, 34, 34)
                            .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(medMgr_no_sheet_input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medMgr_name_input)
                                    .addComponent(medMgr_strength_input)
                                    .addComponent(medMgr_type_comboBox, 0, 279, Short.MAX_VALUE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        medMgr_details_panelLayout.setVerticalGroup(
            medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medMgr_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicine_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_details_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_name)
                    .addComponent(medMgr_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_type_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_type_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medMgr_strength_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_strength_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medMgr_no_sheet_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_no_sheet_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_no_table_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_no_tablet_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_mrp_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_mrp_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_no_box_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_no_box_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_expiry_lable)
                    .addComponent(medMgr_expiry_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(medMgr_details_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(medMgr_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medMgr_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medMgr_update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout medicineIframeLayout = new javax.swing.GroupLayout(medicineIframe.getContentPane());
        medicineIframe.getContentPane().setLayout(medicineIframeLayout);
        medicineIframeLayout.setHorizontalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medMgr_tabel_scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(medicineIframeLayout.createSequentialGroup()
                        .addGroup(medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medMgr_title_lable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_find_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medMgr_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        medicineIframeLayout.setVerticalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(medMgr_title_lable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_find_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_tabel_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medMgr_details_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPane.add(medicineIframe, "card3");

        salesIframe.setBackground(new java.awt.Color(168, 218, 220));
        salesIframe.setBorder(null);
        salesIframe.setVisible(true);

        sales_panel_label.setText("I am sales");

        javax.swing.GroupLayout salesIframeLayout = new javax.swing.GroupLayout(salesIframe.getContentPane());
        salesIframe.getContentPane().setLayout(salesIframeLayout);
        salesIframeLayout.setHorizontalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(sales_panel_label)
                .addContainerGap(522, Short.MAX_VALUE))
        );
        salesIframeLayout.setVerticalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(sales_panel_label)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        cardPane.add(salesIframe, "card3");

        userIframe.setBackground(new java.awt.Color(137, 194, 217));
        userIframe.setBorder(null);
        userIframe.setVisible(true);

        patient_details_panel1.setBackground(new java.awt.Color(25, 130, 196));

        patient_name_input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patient_name_input1KeyPressed(evt);
            }
        });

        patient_address_input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patient_address_input1KeyPressed(evt);
            }
        });

        paitent_contact_input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paitent_contact_input1KeyPressed(evt);
            }
        });

        patient_name_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name_label1.setForeground(new java.awt.Color(255, 255, 255));
        patient_name_label1.setText("Name");

        patient_address_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_address_label1.setForeground(new java.awt.Color(255, 255, 255));
        patient_address_label1.setText("Username");

        patient_contact_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_contact_label1.setForeground(new java.awt.Color(255, 255, 255));
        patient_contact_label1.setText("Password");

        patient_input_error1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        patient_input_error1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout patient_details_panel1Layout = new javax.swing.GroupLayout(patient_details_panel1);
        patient_details_panel1.setLayout(patient_details_panel1Layout);
        patient_details_panel1Layout.setHorizontalGroup(
            patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_details_panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_details_panel1Layout.createSequentialGroup()
                        .addComponent(patient_contact_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_details_panel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(patient_input_error1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_details_panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paitent_contact_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_details_panel1Layout.createSequentialGroup()
                        .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_name_label1)
                            .addComponent(patient_address_label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_name_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patient_address_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        patient_details_panel1Layout.setVerticalGroup(
            patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_details_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_name_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_name_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_address_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_address_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_details_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patient_contact_label1)
                    .addComponent(paitent_contact_input1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patient_input_error1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userIframeLayout = new javax.swing.GroupLayout(userIframe.getContentPane());
        userIframe.getContentPane().setLayout(userIframeLayout);
        userIframeLayout.setHorizontalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patient_details_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        userIframeLayout.setVerticalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patient_details_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(562, Short.MAX_VALUE))
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
        ImageIcon icon = new ImageIcon("D:\\MMS\\MMS\\MMS\\src\\mms\\src\\icon.png");
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
        sales_button.setBackground(new Color(168,218,220));
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
        user_button.setBackground(new Color(168,218,220));
        
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
        medicine_with_under = medicine_name_input.getText().replace(' ', '%');
        medicine_with_under = medicine_with_under.substring(0, medicine_with_under.length()-1);
        
        try {
            mysql.medicine_mrp();
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

    private void medicine_quantity_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_quantity_inputKeyTyped
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            medicine_input_error.setText("");
            add_button.setEnabled(true);
        }
        else{
            medicine_input_error.setText("Invalid Medicine Quantity!");
            add_button.setEnabled(false);
        }
    }//GEN-LAST:event_medicine_quantity_inputKeyTyped

    @SuppressWarnings("empty-statement")
    private void medicine_name_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_inputKeyReleased
        int position_of_medicine_name = medicine_name_input.getCaretPosition();
        medicine_name_input.setText(medicine_name_input.getText().toUpperCase());
        medicine_name_input.setCaretPosition(position_of_medicine_name);

        try {
            mysql.auto_suggestion_medicine(); ;
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
            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                if(paitent_contact_input.getText().length() != 10)
                {
                    patient_input_error.setText("Worong Phone");
                }
                else{
                    medicine_name_input.requestFocus();
                }
            }
        }
        else{
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
    }//GEN-LAST:event_medicineIframeInternalFrameActivated

    private void medicine_name_find_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicine_name_find_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicine_name_find_inputKeyPressed

    private void medMgr_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medMgr_add_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_add_buttonActionPerformed

    private void medMgr_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_name_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_name_inputKeyPressed

    private void medMgr_strength_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_strength_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_strength_inputKeyPressed

    private void medMgr_no_table_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_table_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_no_table_inputKeyPressed

    private void medMgr_mrp_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_mrp_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_mrp_inputKeyPressed

    private void medMgr_no_sheet_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_sheet_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_no_sheet_inputKeyPressed

    private void medMgr_type_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medMgr_type_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_type_comboBoxActionPerformed

    private void medMgr_no_box_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_no_box_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_no_box_inputKeyPressed

    private void medMgr_expiry_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medMgr_expiry_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_expiry_inputKeyPressed

    private void find_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_find_buttonActionPerformed

    private void medMgr_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medMgr_update_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medMgr_update_buttonActionPerformed

    private void patient_name_input1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patient_name_input1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_name_input1KeyPressed

    private void patient_address_input1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patient_address_input1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_address_input1KeyPressed

    private void paitent_contact_input1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paitent_contact_input1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paitent_contact_input1KeyPressed

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
    private javax.swing.JButton add_button;
    private javax.swing.JLabel add_medicine_label;
    private javax.swing.JSeparator add_medicine_seperator;
    private javax.swing.JPanel background;
    private javax.swing.JInternalFrame billIframe;
    private javax.swing.JButton bill_button;
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
    private javax.swing.JButton cancel_button;
    private javax.swing.JPanel cardPane;
    private javax.swing.JLabel command_center;
    private javax.swing.JPanel command_center_pane;
    private javax.swing.JSeparator command_center_seperator;
    private javax.swing.JLabel date_display;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton find_button;
    private javax.swing.JLabel find_medicine_label;
    private javax.swing.JSeparator find_medicine_seperator;
    private javax.swing.JLabel invoice_label;
    private javax.swing.JPanel invoide_date_panel;
    private javax.swing.JButton medMgr_add_button;
    private javax.swing.JLabel medMgr_company_address;
    private javax.swing.JLabel medMgr_company_name;
    private javax.swing.JLabel medMgr_company_phone;
    private javax.swing.JLabel medMgr_details_error;
    private javax.swing.JPanel medMgr_details_panel;
    private javax.swing.JTextField medMgr_expiry_input;
    private javax.swing.JLabel medMgr_expiry_lable;
    private javax.swing.JLabel medMgr_find_error;
    private javax.swing.JPanel medMgr_find_panel;
    private javax.swing.JTextField medMgr_mrp_input;
    private javax.swing.JLabel medMgr_mrp_label;
    private javax.swing.JLabel medMgr_name;
    private javax.swing.JTextField medMgr_name_input;
    private javax.swing.JTextField medMgr_no_box_input;
    private javax.swing.JLabel medMgr_no_box_label;
    private javax.swing.JTextField medMgr_no_sheet_input;
    private javax.swing.JLabel medMgr_no_sheet_label;
    private javax.swing.JTextField medMgr_no_table_input;
    private javax.swing.JLabel medMgr_no_tablet_label;
    private javax.swing.JTextField medMgr_strength_input;
    private javax.swing.JLabel medMgr_strength_label;
    private javax.swing.JScrollPane medMgr_tabel_scrollpanel;
    private javax.swing.JTable medMgr_table;
    private javax.swing.JPanel medMgr_title_lable;
    private javax.swing.JComboBox<String> medMgr_type_comboBox;
    private javax.swing.JLabel medMgr_type_label;
    private javax.swing.JButton medMgr_update_button;
    private javax.swing.JInternalFrame medicineIframe;
    private javax.swing.JSeparator medicine_details_seperator;
    private javax.swing.JLabel medicine_input_error;
    private javax.swing.JLabel medicine_label;
    private javax.swing.JButton medicine_manage_button;
    private javax.swing.JTextField medicine_name_find_input;
    private javax.swing.JTextField medicine_name_input;
    private javax.swing.JLabel medicine_name_label;
    private javax.swing.JTextField medicine_quantity_input;
    private javax.swing.JLabel medinine_label;
    private javax.swing.JTextField paitent_contact_input;
    private javax.swing.JTextField paitent_contact_input1;
    private javax.swing.JTextField patient_address_input;
    private javax.swing.JTextField patient_address_input1;
    private javax.swing.JLabel patient_address_label;
    private javax.swing.JLabel patient_address_label1;
    private javax.swing.JLabel patient_contact_label;
    private javax.swing.JLabel patient_contact_label1;
    private javax.swing.JPanel patient_details_panel;
    private javax.swing.JPanel patient_details_panel1;
    private javax.swing.JLabel patient_input_error;
    private javax.swing.JLabel patient_input_error1;
    private javax.swing.JTextField patient_name_input;
    private javax.swing.JTextField patient_name_input1;
    private javax.swing.JLabel patient_name_label;
    private javax.swing.JLabel patient_name_label1;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JInternalFrame salesIframe;
    private javax.swing.JButton sales_button;
    private javax.swing.JLabel sales_panel_label;
    private javax.swing.JPanel side_panel_menu;
    private javax.swing.JPanel title_pane;
    private javax.swing.JInternalFrame userIframe;
    private javax.swing.JButton user_button;
    private javax.swing.JInternalFrame welcomIframe;
    private javax.swing.JLabel welcom_panel_label;
    // End of variables declaration//GEN-END:variables
}