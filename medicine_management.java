package mms;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

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
        bill_button = new javax.swing.JButton();
        medicine_manage_button = new javax.swing.JButton();
        sales_button = new javax.swing.JButton();
        user_button = new javax.swing.JButton();
        medicine_management_tpane = new javax.swing.JTabbedPane();
        billTPane = new javax.swing.JTabbedPane();
        medicineTpane = new javax.swing.JTabbedPane();
        salesTpane = new javax.swing.JTabbedPane();
        userTpane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy");
        setName("medicine"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(229, 107, 111));

        side_panel_menu.setBackground(new java.awt.Color(109, 89, 122));

        bill_button.setBackground(new java.awt.Color(139, 120, 144));
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

        medicine_manage_button.setBackground(new java.awt.Color(139, 120, 144));
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

        sales_button.setBackground(new java.awt.Color(139, 120, 144));
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

        user_button.setBackground(new java.awt.Color(139, 120, 144));
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
                .addGap(183, 183, 183)
                .addComponent(bill_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicine_manage_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_button)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        medicine_management_tpane.setBackground(new java.awt.Color(229, 107, 111));
        medicine_management_tpane.addTab("tab1", billTPane);
        medicine_management_tpane.addTab("tab2", medicineTpane);
        medicine_management_tpane.addTab("tab3", salesTpane);
        medicine_management_tpane.addTab("tab4", userTpane);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(side_panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(medicine_management_tpane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(medicine_management_tpane)
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
        bill_button.setBackground(new Color(229,107,111));
        medicine_management_tpane.setSelectedIndex(1);
    }//GEN-LAST:event_bill_buttonActionPerformed

    private void medicine_manage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_manage_buttonActionPerformed
        medicine_manage_button.setBackground(new Color(229,107,111));
        medicine_management_tpane.setSelectedIndex(2);
    }//GEN-LAST:event_medicine_manage_buttonActionPerformed

    private void sales_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_buttonActionPerformed
        sales_button.setBackground(new Color(229,107,111));
        medicine_management_tpane.setSelectedIndex(3);
    }//GEN-LAST:event_sales_buttonActionPerformed

    private void user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_buttonActionPerformed
        user_button.setBackground(new Color(229,107,111));
        medicine_management_tpane.setSelectedIndex(4);
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
    private javax.swing.JTabbedPane billTPane;
    private javax.swing.JButton bill_button;
    private javax.swing.JTabbedPane medicineTpane;
    private javax.swing.JButton medicine_manage_button;
    private javax.swing.JTabbedPane medicine_management_tpane;
    private javax.swing.JTabbedPane salesTpane;
    private javax.swing.JButton sales_button;
    private javax.swing.JPanel side_panel_menu;
    private javax.swing.JTabbedPane userTpane;
    private javax.swing.JButton user_button;
    // End of variables declaration//GEN-END:variables
}
