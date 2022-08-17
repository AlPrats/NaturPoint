/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entities.Customer;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import repository.CustomerRepository;
import repository.OrderRepository;

/**
 *
 * @author alber
 */
public class Customers extends javax.swing.JFrame {
        
       
        
        Customer customer = new Customer();
        CustomerRepository customerRepository = new CustomerRepository();
        OrderRepository orderRepository = new OrderRepository();
        private List<Customer> CustomerList;

        /**
         * Creates new form Customers
         */
        public Customers() {
                initComponents();
                showCustomersTable();
                customersTable.setShowGrid(false);
                customersTable.setGridColor(Color.GRAY);
                customersTable.setSelectionBackground(Color.gray);
                JTableHeader th = customersTable.getTableHeader();
                th.setFont(new Font("Raleway", Font.PLAIN, 14));
        }
        
        public void showCustomersTable() {
                CustomerList = customerRepository.readAll();

                String[] colNames = {"Id", "Name", "Surnames", "Email", "Phone"};
                Object[][] rows = new Object[CustomerList.size()][5];
                DefaultTableModel model = (DefaultTableModel) customersTable.getModel();

                for (int i = 0; i < CustomerList.size(); i++) {
                        rows[i][0] = CustomerList.get(i).getId();
                        rows[i][1] = CustomerList.get(i).getName();
                        rows[i][2] = CustomerList.get(i).getSurnames();
                        rows[i][3] = CustomerList.get(i).getEmail();
                        rows[i][4] = CustomerList.get(i).getPhone();
                }
                model.setDataVector(rows, colNames);
                customersTable.setRowHeight(45);
        }
        
        // function to check empty fields
        public boolean verifFields() {
                if (tf_name.getText().isEmpty() || tf_surnames.getText().isEmpty() || tf_email.getText().isEmpty() || tf_phone.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "One or more fields are empty");
                        return false;
                } else {
                        return true;
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                label_tittle = new javax.swing.JLabel();
                label_id = new javax.swing.JLabel();
                tf_idCustomer = new javax.swing.JTextField();
                label_name = new javax.swing.JLabel();
                tf_name = new javax.swing.JTextField();
                label_surnames = new javax.swing.JLabel();
                tf_surnames = new javax.swing.JTextField();
                label_email = new javax.swing.JLabel();
                tf_email = new javax.swing.JTextField();
                label_phone = new javax.swing.JLabel();
                tf_phone = new javax.swing.JTextField();
                btn_clear = new view.swing.MyButton();
                btn_addCustomer = new view.swing.MyButton();
                btn_editCustomer = new view.swing.MyButton();
                btn_deleteCustomer = new view.swing.MyButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                customersTable = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                label_tittle.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
                label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_tittle.setText("Customers");

                label_id.setText(" Id");

                label_name.setText(" Name");

                label_surnames.setText(" Surnames");

                label_email.setText(" Email");

                label_phone.setText(" Phone");

                btn_clear.setBackground(new java.awt.Color(69, 39, 160));
                btn_clear.setBorder(null);
                btn_clear.setForeground(new java.awt.Color(255, 255, 255));
                btn_clear.setText("Clear");
                btn_clear.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_clear.setColor(new java.awt.Color(69, 39, 160));
                btn_clear.setColorClick(new java.awt.Color(0, 0, 112));
                btn_clear.setColorOver(new java.awt.Color(0, 0, 112));
                btn_clear.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_clear.setRadius(25);
                btn_clear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_clearActionPerformed(evt);
                        }
                });

                btn_addCustomer.setBackground(new java.awt.Color(69, 39, 160));
                btn_addCustomer.setBorder(null);
                btn_addCustomer.setForeground(new java.awt.Color(255, 255, 255));
                btn_addCustomer.setText("Add Customer");
                btn_addCustomer.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_addCustomer.setColor(new java.awt.Color(69, 39, 160));
                btn_addCustomer.setColorClick(new java.awt.Color(0, 0, 112));
                btn_addCustomer.setColorOver(new java.awt.Color(0, 0, 112));
                btn_addCustomer.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_addCustomer.setRadius(25);
                btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_addCustomerActionPerformed(evt);
                        }
                });

                btn_editCustomer.setBackground(new java.awt.Color(69, 39, 160));
                btn_editCustomer.setBorder(null);
                btn_editCustomer.setForeground(new java.awt.Color(255, 255, 255));
                btn_editCustomer.setText("Edit Customer");
                btn_editCustomer.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_editCustomer.setColor(new java.awt.Color(69, 39, 160));
                btn_editCustomer.setColorClick(new java.awt.Color(0, 0, 112));
                btn_editCustomer.setColorOver(new java.awt.Color(0, 0, 112));
                btn_editCustomer.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_editCustomer.setRadius(25);
                btn_editCustomer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_editCustomerActionPerformed(evt);
                        }
                });

                btn_deleteCustomer.setBackground(new java.awt.Color(69, 39, 160));
                btn_deleteCustomer.setBorder(null);
                btn_deleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
                btn_deleteCustomer.setText("Delete Customer");
                btn_deleteCustomer.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_deleteCustomer.setColor(new java.awt.Color(69, 39, 160));
                btn_deleteCustomer.setColorClick(new java.awt.Color(0, 0, 112));
                btn_deleteCustomer.setColorOver(new java.awt.Color(0, 0, 112));
                btn_deleteCustomer.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_deleteCustomer.setRadius(25);
                btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_deleteCustomerActionPerformed(evt);
                        }
                });

                customersTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Name", "Surnames", "Email", "Phone"
                        }
                ));
                customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                customersTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(customersTable);

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-2-16.png"))); // NOI18N
                jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel1MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(tf_idCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(23, 23, 23))
                                                                        .addComponent(tf_name)
                                                                        .addComponent(label_surnames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(label_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tf_surnames)
                                                                        .addComponent(label_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tf_email)
                                                                        .addComponent(label_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tf_phone)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(btn_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(btn_editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(507, Short.MAX_VALUE)
                                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(469, 469, 469)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tf_idCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(label_name)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_surnames)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_surnames, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_email)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_phone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))
                                .addContainerGap(38, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
                tf_idCustomer.setText("");
                tf_name.setText("");
                tf_surnames.setText("");
                tf_email.setText("");
                tf_phone.setText("");
        }//GEN-LAST:event_btn_clearActionPerformed

        private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
                if (customerRepository.findCustomer(tf_name.getText())) {
                        JOptionPane.showMessageDialog(null, "The customer exists in database");
                }
                else if (verifFields()) {
                        Customer newCustomer = new Customer();
                        newCustomer.setName(tf_name.getText());
                        newCustomer.setSurnames(tf_surnames.getText());
                        newCustomer.setEmail(tf_email.getText());
                        newCustomer.setPhone(tf_phone.getText());
                        try {
                                customerRepository.create(newCustomer);
                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        showCustomersTable();
                }
        }//GEN-LAST:event_btn_addCustomerActionPerformed

        private void btn_editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCustomerActionPerformed
                try {
                        if (verifFields()) {
                                customer = CustomerList.get(customersTable.getSelectedRow());
                                customer.setName(tf_name.getText());
                                customer.setSurnames(tf_surnames.getText());
                                customer.setEmail(tf_email.getText());
                                customer.setPhone(tf_phone.getText());
                                customerRepository.update(customer);
                                showCustomersTable();
                        }
                } catch (IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(null, "Select a customer before editing");
                }
        }//GEN-LAST:event_btn_editCustomerActionPerformed

        private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed
                try {
                        Integer rowIndex = customersTable.getSelectedRow();
                        Integer id = Integer.valueOf(customersTable.getValueAt(rowIndex, 0).toString());
                        customerRepository.deleteById(id);
                } catch (IndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Select a customer from the table");
                }
        }//GEN-LAST:event_btn_deleteCustomerActionPerformed

        private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
                try {
                        Integer rowIndex = customersTable.getSelectedRow();
                        tf_idCustomer.setText(customersTable.getValueAt(rowIndex, 0).toString());
                        tf_name.setText(customersTable.getValueAt(rowIndex, 1).toString());
                        tf_surnames.setText(customersTable.getValueAt(rowIndex, 2).toString());
                        tf_email.setText(customersTable.getValueAt(rowIndex, 3).toString());
                        tf_phone.setText(customersTable.getValueAt(rowIndex, 4).toString());
                } catch (Exception ex) {

                }
        }//GEN-LAST:event_customersTableMouseClicked

        private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
                showCustomersTable();
        }//GEN-LAST:event_jLabel1MouseClicked

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
                        java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Customers().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private view.swing.MyButton btn_addCustomer;
        private view.swing.MyButton btn_clear;
        private view.swing.MyButton btn_deleteCustomer;
        private view.swing.MyButton btn_editCustomer;
        private javax.swing.JTable customersTable;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel label_email;
        private javax.swing.JLabel label_id;
        private javax.swing.JLabel label_name;
        private javax.swing.JLabel label_phone;
        private javax.swing.JLabel label_surnames;
        private javax.swing.JLabel label_tittle;
        private javax.swing.JTextField tf_email;
        private javax.swing.JTextField tf_idCustomer;
        private javax.swing.JTextField tf_name;
        private javax.swing.JTextField tf_phone;
        private javax.swing.JTextField tf_surnames;
        // End of variables declaration//GEN-END:variables
}
