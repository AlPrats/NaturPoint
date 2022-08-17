/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author alber
 */
public class Home extends javax.swing.JFrame {

        public Home() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                MenuPanel = new javax.swing.JPanel();
                imageProfile1 = new view.swing.ImageProfile();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                btn_ordersFrame = new view.swing.MyButton();
                btn_productsFrame = new view.swing.MyButton();
                btn_categoriesFrame = new view.swing.MyButton();
                btn_customersForm = new view.swing.MyButton();
                btn_usersFrame = new view.swing.MyButton();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                MenuPanel.setBackground(new java.awt.Color(69, 39, 160));

                imageProfile1.setForeground(new java.awt.Color(69, 39, 160));
                imageProfile1.setBorderSize(1);
                imageProfile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_profile.jpg"))); // NOI18N

                jLabel1.setFont(new java.awt.Font("Rubik Light", 1, 16)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Albert");

                jLabel2.setFont(new java.awt.Font("Rubik Light", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Admin");
                jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

                btn_ordersFrame.setBackground(new java.awt.Color(69, 39, 160));
                btn_ordersFrame.setForeground(new java.awt.Color(255, 255, 255));
                btn_ordersFrame.setText("ORDERS");
                btn_ordersFrame.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_ordersFrame.setColor(new java.awt.Color(69, 39, 160));
                btn_ordersFrame.setColorClick(new java.awt.Color(0, 0, 112));
                btn_ordersFrame.setColorOver(new java.awt.Color(0, 0, 112));
                btn_ordersFrame.setFont(new java.awt.Font("Rubik SemiBold", 1, 16)); // NOI18N
                btn_ordersFrame.setRadius(25);
                btn_ordersFrame.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_ordersFrameActionPerformed(evt);
                        }
                });

                btn_productsFrame.setBackground(new java.awt.Color(69, 39, 160));
                btn_productsFrame.setForeground(new java.awt.Color(255, 255, 255));
                btn_productsFrame.setText("PRODUCTS");
                btn_productsFrame.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_productsFrame.setColor(new java.awt.Color(69, 39, 160));
                btn_productsFrame.setColorClick(new java.awt.Color(0, 0, 112));
                btn_productsFrame.setColorOver(new java.awt.Color(0, 0, 112));
                btn_productsFrame.setFont(new java.awt.Font("Rubik SemiBold", 1, 16)); // NOI18N
                btn_productsFrame.setRadius(25);
                btn_productsFrame.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_productsFrameActionPerformed(evt);
                        }
                });

                btn_categoriesFrame.setBackground(new java.awt.Color(69, 39, 160));
                btn_categoriesFrame.setForeground(new java.awt.Color(255, 255, 255));
                btn_categoriesFrame.setText("CATEGORIES");
                btn_categoriesFrame.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_categoriesFrame.setColor(new java.awt.Color(69, 39, 160));
                btn_categoriesFrame.setColorClick(new java.awt.Color(0, 0, 112));
                btn_categoriesFrame.setColorOver(new java.awt.Color(0, 0, 112));
                btn_categoriesFrame.setFont(new java.awt.Font("Rubik SemiBold", 1, 16)); // NOI18N
                btn_categoriesFrame.setRadius(25);
                btn_categoriesFrame.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_categoriesFrameActionPerformed(evt);
                        }
                });

                btn_customersForm.setBackground(new java.awt.Color(69, 39, 160));
                btn_customersForm.setForeground(new java.awt.Color(255, 255, 255));
                btn_customersForm.setText("CUSTOMERS");
                btn_customersForm.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_customersForm.setColor(new java.awt.Color(69, 39, 160));
                btn_customersForm.setColorClick(new java.awt.Color(69, 39, 160));
                btn_customersForm.setColorOver(new java.awt.Color(0, 0, 112));
                btn_customersForm.setFont(new java.awt.Font("Rubik SemiBold", 1, 16)); // NOI18N
                btn_customersForm.setRadius(25);
                btn_customersForm.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_customersFormActionPerformed(evt);
                        }
                });

                btn_usersFrame.setBackground(new java.awt.Color(69, 39, 160));
                btn_usersFrame.setForeground(new java.awt.Color(255, 255, 255));
                btn_usersFrame.setText("USERS");
                btn_usersFrame.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_usersFrame.setColor(new java.awt.Color(69, 39, 160));
                btn_usersFrame.setColorClick(new java.awt.Color(0, 0, 112));
                btn_usersFrame.setColorOver(new java.awt.Color(0, 0, 112));
                btn_usersFrame.setFont(new java.awt.Font("Rubik SemiBold", 1, 16)); // NOI18N
                btn_usersFrame.setRadius(25);
                btn_usersFrame.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_usersFrameActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
                MenuPanel.setLayout(MenuPanelLayout);
                MenuPanelLayout.setHorizontalGroup(
                        MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(imageProfile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jSeparator1)))
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_ordersFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_productsFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_categoriesFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_customersForm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_usersFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 15, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                MenuPanelLayout.setVerticalGroup(
                        MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(imageProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btn_ordersFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn_productsFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn_categoriesFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn_customersForm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn_usersFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(250, Short.MAX_VALUE))
                );

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undraw_Add_to_cart_re_wrdo.png"))); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1670, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btn_categoriesFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriesFrameActionPerformed
                Categories category = new Categories();
                category.setVisible(true);
                category.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_categoriesFrameActionPerformed

        private void btn_productsFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productsFrameActionPerformed
                Products products = new Products();
                products.setVisible(true);
                products.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_productsFrameActionPerformed

        private void btn_customersFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customersFormActionPerformed
                Customers customers = new Customers();
                customers.setVisible(true);
                customers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_customersFormActionPerformed

        private void btn_ordersFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersFrameActionPerformed
                Orders orders = new Orders();
                orders.setVisible(true);
                orders.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_ordersFrameActionPerformed

        private void btn_usersFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersFrameActionPerformed
                /*Users users = new Users();
                users.setVisible(true);
                users.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);*/
        }//GEN-LAST:event_btn_usersFrameActionPerformed

        /**
         * @param args the command line arguments
         */
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
                        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Home().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel MenuPanel;
        private view.swing.MyButton btn_categoriesFrame;
        private view.swing.MyButton btn_customersForm;
        private view.swing.MyButton btn_ordersFrame;
        private view.swing.MyButton btn_productsFrame;
        private view.swing.MyButton btn_usersFrame;
        private view.swing.ImageProfile imageProfile1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        // End of variables declaration//GEN-END:variables
}
