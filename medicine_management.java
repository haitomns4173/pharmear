package mms;

import javax.swing.ImageIcon;

public class medicine_management extends javax.swing.JFrame {
    public medicine_management() {
        initComponents();
        setExtendedState(medicine_management.MAXIMIZED_BOTH); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        side_panel_menu = new javax.swing.JPanel();
        bill_select = new javax.swing.JPanel();
        bill_select_icon = new javax.swing.JLabel();
        bill_select_title = new javax.swing.JLabel();
        medicine = new javax.swing.JPanel();
        medicine_select_icon = new javax.swing.JLabel();
        medicine_select_title = new javax.swing.JLabel();
        sales_select = new javax.swing.JPanel();
        sales_select_icon = new javax.swing.JLabel();
        sales_select_title = new javax.swing.JLabel();
        sales_select1 = new javax.swing.JPanel();
        sales_select_icon1 = new javax.swing.JLabel();
        sales_select_title1 = new javax.swing.JLabel();
        titel_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy");
        setName("medicine"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(229, 107, 111));

        side_panel_menu.setBackground(new java.awt.Color(109, 89, 122));

        bill_select.setBackground(new java.awt.Color(139, 120, 144));
        bill_select.setToolTipText("");

        bill_select_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_billing_machine_48px.png"))); // NOI18N

        bill_select_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bill_select_title.setForeground(new java.awt.Color(255, 255, 255));
        bill_select_title.setText("Bill Manking");

        javax.swing.GroupLayout bill_selectLayout = new javax.swing.GroupLayout(bill_select);
        bill_select.setLayout(bill_selectLayout);
        bill_selectLayout.setHorizontalGroup(
            bill_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_select_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_select_title, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bill_selectLayout.setVerticalGroup(
            bill_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_select_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bill_selectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bill_select_title)
                .addGap(20, 20, 20))
        );

        medicine.setBackground(new java.awt.Color(139, 120, 144));
        medicine.setToolTipText("");

        medicine_select_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_pill_45px.png"))); // NOI18N

        medicine_select_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine_select_title.setForeground(new java.awt.Color(255, 255, 255));
        medicine_select_title.setText("Medicine Manage");

        javax.swing.GroupLayout medicineLayout = new javax.swing.GroupLayout(medicine);
        medicine.setLayout(medicineLayout);
        medicineLayout.setHorizontalGroup(
            medicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicine_select_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_select_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        medicineLayout.setVerticalGroup(
            medicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicine_select_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medicineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medicine_select_title)
                .addGap(20, 20, 20))
        );

        sales_select.setBackground(new java.awt.Color(139, 120, 144));
        sales_select.setToolTipText("");

        sales_select_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_total_sales_45px.png"))); // NOI18N

        sales_select_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sales_select_title.setForeground(new java.awt.Color(255, 255, 255));
        sales_select_title.setText("Sales Report");

        javax.swing.GroupLayout sales_selectLayout = new javax.swing.GroupLayout(sales_select);
        sales_select.setLayout(sales_selectLayout);
        sales_selectLayout.setHorizontalGroup(
            sales_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_select_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_select_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sales_selectLayout.setVerticalGroup(
            sales_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_select_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sales_selectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sales_select_title)
                .addGap(20, 20, 20))
        );

        sales_select1.setBackground(new java.awt.Color(139, 120, 144));
        sales_select1.setToolTipText("");

        sales_select_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mms/src/icons8_person_45px.png"))); // NOI18N

        sales_select_title1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sales_select_title1.setForeground(new java.awt.Color(255, 255, 255));
        sales_select_title1.setText("User");

        javax.swing.GroupLayout sales_select1Layout = new javax.swing.GroupLayout(sales_select1);
        sales_select1.setLayout(sales_select1Layout);
        sales_select1Layout.setHorizontalGroup(
            sales_select1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_select1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_select_icon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_select_title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sales_select1Layout.setVerticalGroup(
            sales_select1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_select1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_select_icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sales_select1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sales_select_title1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout side_panel_menuLayout = new javax.swing.GroupLayout(side_panel_menu);
        side_panel_menu.setLayout(side_panel_menuLayout);
        side_panel_menuLayout.setHorizontalGroup(
            side_panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bill_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(medicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sales_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sales_select1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        side_panel_menuLayout.setVerticalGroup(
            side_panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panel_menuLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(bill_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_select1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        titel_panel.setBackground(new java.awt.Color(255, 218, 185));
        titel_panel.setAlignmentX(0.0F);
        titel_panel.setAlignmentY(0.0F);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("For all those who will study pharmacy");

        javax.swing.GroupLayout titel_panelLayout = new javax.swing.GroupLayout(titel_panel);
        titel_panel.setLayout(titel_panelLayout);
        titel_panelLayout.setHorizontalGroup(
            titel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titel_panelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        titel_panelLayout.setVerticalGroup(
            titel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titel_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(side_panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(titel_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(titel_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JPanel bill_select;
    private javax.swing.JLabel bill_select_icon;
    private javax.swing.JLabel bill_select_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel medicine;
    private javax.swing.JLabel medicine_select_icon;
    private javax.swing.JLabel medicine_select_title;
    private javax.swing.JPanel sales_select;
    private javax.swing.JPanel sales_select1;
    private javax.swing.JLabel sales_select_icon;
    private javax.swing.JLabel sales_select_icon1;
    private javax.swing.JLabel sales_select_title;
    private javax.swing.JLabel sales_select_title1;
    private javax.swing.JPanel side_panel_menu;
    private javax.swing.JPanel titel_panel;
    // End of variables declaration//GEN-END:variables
}
