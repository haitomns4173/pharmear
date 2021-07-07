package mms;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class medicine_management extends javax.swing.JFrame {
    
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        billIframe = new javax.swing.JInternalFrame();
        tabel_scrollpane = new javax.swing.JScrollPane();
        bill_table = new javax.swing.JTable();
        invoice_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        title_body_seperator = new javax.swing.JSeparator();
        patient_name_label = new javax.swing.JLabel();
        patient_name_input = new javax.swing.JTextField();
        patient_address_input = new javax.swing.JTextField();
        paitent_contact_input = new javax.swing.JTextField();
        patient_name_label1 = new javax.swing.JLabel();
        patient_name_label2 = new javax.swing.JLabel();
        medicineIframe = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        salesIframe = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        userIframe = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();

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

        title_pane.setBackground(new java.awt.Color(230, 57, 70));

        javax.swing.GroupLayout title_paneLayout = new javax.swing.GroupLayout(title_pane);
        title_pane.setLayout(title_paneLayout);
        title_paneLayout.setHorizontalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        title_paneLayout.setVerticalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        cardPane.setLayout(new java.awt.CardLayout());

        welcomIframe.setBackground(new java.awt.Color(168, 218, 220));
        welcomIframe.setBorder(null);
        welcomIframe.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To Pharmacy");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("The best way to manage");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("your pharmacy. Get");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("your bills ready in minutes");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add medicine whenerve you want.");

        jButton1.setBackground(new java.awt.Color(239, 71, 111));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_billing_machine_48px.png"))); // NOI18N
        jButton1.setBorder(null);

        jButton2.setBackground(new java.awt.Color(255, 209, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_45px.png"))); // NOI18N
        jButton2.setBorder(null);

        jButton3.setBackground(new java.awt.Color(17, 138, 178));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_total_sales_45px.png"))); // NOI18N
        jButton3.setBorder(null);

        jButton4.setBackground(new java.awt.Color(7, 59, 76));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_person_45px.png"))); // NOI18N
        jButton4.setBorder(null);

        javax.swing.GroupLayout welcomIframeLayout = new javax.swing.GroupLayout(welcomIframe.getContentPane());
        welcomIframe.getContentPane().setLayout(welcomIframeLayout);
        welcomIframeLayout.setHorizontalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomIframeLayout.createSequentialGroup()
                .addGap(173, 263, Short.MAX_VALUE)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26))
            .addGroup(welcomIframeLayout.createSequentialGroup()
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomIframeLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcomIframeLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcomIframeLayout.setVerticalGroup(
            welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomIframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(welcomIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        cardPane.add(welcomIframe, "card2");

        billIframe.setBackground(new java.awt.Color(168, 218, 220));
        billIframe.setBorder(null);
        billIframe.setVisible(true);

        bill_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Short((short) 1), null, null, null, null},
                { new Short((short) 2), null, null, null, null},
                { new Short((short) 3), null, null, null, null},
                { new Short((short) 4), null, null, null, null},
                { new Short((short) 5), null, null, null, null},
                { new Short((short) 6), null, null, null, null},
                { new Short((short) 7), null, null, null, null},
                { new Short((short) 8), null, null, null, null},
                { new Short((short) 9), null, null, null, null},
                { new Short((short) 10), null, null, null, null}
            },
            new String [] {
                "Sn. No", "Medicine Name", "Quantity", "Rate", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.Float.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bill_table.setRowHeight(30);
        tabel_scrollpane.setViewportView(bill_table);
        if (bill_table.getColumnModel().getColumnCount() > 0) {
            bill_table.getColumnModel().getColumn(0).setPreferredWidth(4);
            bill_table.getColumnModel().getColumn(1).setPreferredWidth(15);
            bill_table.getColumnModel().getColumn(2).setPreferredWidth(4);
            bill_table.getColumnModel().getColumn(3).setPreferredWidth(6);
            bill_table.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

        invoice_label.setText("Invoice #");

        date_label.setText("Date");

        patient_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name_label.setForeground(new java.awt.Color(45, 45, 43));
        patient_name_label.setText("Patient Name");

        patient_name_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name_label1.setForeground(new java.awt.Color(45, 45, 43));
        patient_name_label1.setText("Patient Address");

        patient_name_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name_label2.setForeground(new java.awt.Color(45, 45, 43));
        patient_name_label2.setText("Patient Contact");

        javax.swing.GroupLayout billIframeLayout = new javax.swing.GroupLayout(billIframe.getContentPane());
        billIframe.getContentPane().setLayout(billIframeLayout);
        billIframeLayout.setHorizontalGroup(
            billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billIframeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billIframeLayout.createSequentialGroup()
                        .addComponent(tabel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addComponent(invoice_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_label)
                        .addGap(103, 103, 103))
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addComponent(title_body_seperator)
                        .addContainerGap())
                    .addGroup(billIframeLayout.createSequentialGroup()
                        .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billIframeLayout.createSequentialGroup()
                                .addComponent(patient_name_label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paitent_contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billIframeLayout.createSequentialGroup()
                                .addComponent(patient_name_label)
                                .addGap(22, 22, 22)
                                .addComponent(patient_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billIframeLayout.createSequentialGroup()
                                .addComponent(patient_name_label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patient_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        billIframeLayout.setVerticalGroup(
            billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billIframeLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoice_label)
                    .addComponent(date_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_body_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_name_label)
                    .addComponent(patient_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_name_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paitent_contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_name_label2))
                .addGap(28, 28, 28)
                .addComponent(tabel_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardPane.add(billIframe, "card3");

        medicineIframe.setBackground(new java.awt.Color(168, 218, 220));
        medicineIframe.setBorder(null);
        medicineIframe.setVisible(true);

        jLabel3.setText("I am Medicine");

        javax.swing.GroupLayout medicineIframeLayout = new javax.swing.GroupLayout(medicineIframe.getContentPane());
        medicineIframe.getContentPane().setLayout(medicineIframeLayout);
        medicineIframeLayout.setHorizontalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        medicineIframeLayout.setVerticalGroup(
            medicineIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineIframeLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        cardPane.add(medicineIframe, "card3");

        salesIframe.setBackground(new java.awt.Color(168, 218, 220));
        salesIframe.setBorder(null);
        salesIframe.setVisible(true);

        jLabel4.setText("I am sales");

        javax.swing.GroupLayout salesIframeLayout = new javax.swing.GroupLayout(salesIframe.getContentPane());
        salesIframe.getContentPane().setLayout(salesIframeLayout);
        salesIframeLayout.setHorizontalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel4)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        salesIframeLayout.setVerticalGroup(
            salesIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesIframeLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel4)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        cardPane.add(salesIframe, "card3");

        userIframe.setBackground(new java.awt.Color(168, 218, 220));
        userIframe.setBorder(null);
        userIframe.setVisible(true);

        jLabel5.setText("i am user");

        javax.swing.GroupLayout userIframeLayout = new javax.swing.GroupLayout(userIframe.getContentPane());
        userIframe.getContentPane().setLayout(userIframeLayout);
        userIframeLayout.setHorizontalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel5)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        userIframeLayout.setVerticalGroup(
            userIframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userIframeLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel5)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        cardPane.add(userIframe, "card3");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(side_panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(title_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(title_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(cardPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
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
        ImageIcon icon = new ImageIcon("D:\\MMS\\MMS\\src\\mms\\src\\icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void bill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_buttonActionPerformed
        bill_button.setBackground(new Color(168,218,220));
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
        medicine_manage_button.setBackground(new Color(168,218,220));
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
            java.util.logging.Logger.getLogger(medicine_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicine_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicine_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicine_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicine_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JInternalFrame billIframe;
    private javax.swing.JButton bill_button;
    private javax.swing.JTable bill_table;
    private javax.swing.JPanel cardPane;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel invoice_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JInternalFrame medicineIframe;
    private javax.swing.JButton medicine_manage_button;
    private javax.swing.JTextField paitent_contact_input;
    private javax.swing.JTextField patient_address_input;
    private javax.swing.JTextField patient_name_input;
    private javax.swing.JLabel patient_name_label;
    private javax.swing.JLabel patient_name_label1;
    private javax.swing.JLabel patient_name_label2;
    private javax.swing.JInternalFrame salesIframe;
    private javax.swing.JButton sales_button;
    private javax.swing.JPanel side_panel_menu;
    private javax.swing.JScrollPane tabel_scrollpane;
    private javax.swing.JSeparator title_body_seperator;
    private javax.swing.JPanel title_pane;
    private javax.swing.JInternalFrame userIframe;
    private javax.swing.JButton user_button;
    private javax.swing.JInternalFrame welcomIframe;
    // End of variables declaration//GEN-END:variables
}
