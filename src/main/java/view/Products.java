/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.MyTable;
import entities.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import repository.ProductRepository;

/**
 *
 * @author alber
 */
public class Products extends javax.swing.JFrame {

        ProductRepository productRepository = new ProductRepository();
        private List<Product> productList;

        /**
         * Creates new form Products
         */
        public Products() {
                initComponents();
                showProductsTable("");
                productsTable.setShowGrid(false);
                productsTable.setGridColor(Color.GRAY);
                productsTable.setBackground(Color.white);
                productsTable.setSelectionBackground(Color.gray);
                JTableHeader th = productsTable.getTableHeader();
                th.setFont(new Font("Rubik SemiBold", Font.PLAIN, 14));
        }
        
        public void showProductsTable(String val){
                productList = productRepository.readAll();
                String[] colNames = {"Id", "Name", "Price", "Quantity", "Image", "Description", "Category"};
                Object[][] rows = new Object[productList.size()][7];

                for (int i = 0; i < productList.size(); i++) {
                        rows[i][0] = productList.get(i).getId();
                        rows[i][1] = productList.get(i).getName();
                        rows[i][2] = productList.get(i).getPrice();
                        rows[i][3] = productList.get(i).getQuantity();

                        ImageIcon pic = new ImageIcon(new ImageIcon(productList.get(i).getPicture())
                                .getImage()
                                .getScaledInstance(120, 80, Image.SCALE_SMOOTH));
                        rows[i][4] = pic;
                        rows[i][5] = productList.get(i).getDescription();
                        rows[i][6] = productList.get(i).getCategory().getName();
                }
                MyTable myTable = new MyTable(rows, colNames);
                productsTable.setModel(myTable);
                productsTable.setRowHeight(120);
                productsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
                productsTable.getColumnModel().getColumn(1).setPreferredWidth(80);
                productsTable.getColumnModel().getColumn(2).setPreferredWidth(10);
                productsTable.getColumnModel().getColumn(3).setPreferredWidth(10);
                productsTable.getColumnModel().getColumn(4).setPreferredWidth(120);
                productsTable.getColumnModel().getColumn(5).setPreferredWidth(300);
                productsTable.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelProducts = new javax.swing.JPanel();
                label_tittle = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                productsTable = new javax.swing.JTable();
                label_refresh = new javax.swing.JLabel();
                tf_searchProduct = new view.swing.TextField();
                btn_addProduct = new view.swing.MyButton();
                btn_deleteProduct = new view.swing.MyButton();
                btn_editProduct = new view.swing.MyButton();
                btn_searchProduct = new view.swing.MyButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                panelProducts.setBackground(new java.awt.Color(255, 255, 255));

                label_tittle.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
                label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_tittle.setText("Products");

                productsTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
                productsTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Name", "Price", "Quantity", "Picture", "Description", "Category"
                        }
                ));
                productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                productsTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(productsTable);

                label_refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-2-16.png"))); // NOI18N
                label_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                label_refreshMouseClicked(evt);
                        }
                });

                tf_searchProduct.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                tf_searchProduct.setLabelText("Search product");
                tf_searchProduct.setLineColor(new java.awt.Color(153, 153, 153));

                btn_addProduct.setBackground(new java.awt.Color(69, 39, 160));
                btn_addProduct.setBorder(null);
                btn_addProduct.setForeground(new java.awt.Color(255, 255, 255));
                btn_addProduct.setText("Add Product");
                btn_addProduct.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_addProduct.setColor(new java.awt.Color(69, 39, 160));
                btn_addProduct.setColorClick(new java.awt.Color(0, 0, 112));
                btn_addProduct.setColorOver(new java.awt.Color(0, 0, 112));
                btn_addProduct.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_addProduct.setRadius(25);
                btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_addProductActionPerformed(evt);
                        }
                });

                btn_deleteProduct.setBackground(new java.awt.Color(69, 39, 160));
                btn_deleteProduct.setBorder(null);
                btn_deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
                btn_deleteProduct.setText("Delete Product");
                btn_deleteProduct.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_deleteProduct.setColor(new java.awt.Color(69, 39, 160));
                btn_deleteProduct.setColorClick(new java.awt.Color(0, 0, 112));
                btn_deleteProduct.setColorOver(new java.awt.Color(0, 0, 112));
                btn_deleteProduct.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_deleteProduct.setRadius(25);
                btn_deleteProduct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_deleteProductActionPerformed(evt);
                        }
                });

                btn_editProduct.setBackground(new java.awt.Color(69, 39, 160));
                btn_editProduct.setForeground(new java.awt.Color(255, 255, 255));
                btn_editProduct.setText("Edit Product");
                btn_editProduct.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_editProduct.setColor(new java.awt.Color(69, 39, 160));
                btn_editProduct.setColorClick(new java.awt.Color(0, 0, 112));
                btn_editProduct.setColorOver(new java.awt.Color(0, 0, 112));
                btn_editProduct.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_editProduct.setRadius(25);
                btn_editProduct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_editProductActionPerformed(evt);
                        }
                });

                btn_searchProduct.setBackground(new java.awt.Color(69, 39, 160));
                btn_searchProduct.setBorder(null);
                btn_searchProduct.setForeground(new java.awt.Color(255, 255, 255));
                btn_searchProduct.setText("Search Product");
                btn_searchProduct.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_searchProduct.setColor(new java.awt.Color(69, 39, 160));
                btn_searchProduct.setColorClick(new java.awt.Color(0, 0, 112));
                btn_searchProduct.setColorOver(new java.awt.Color(0, 0, 112));
                btn_searchProduct.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_searchProduct.setRadius(25);
                btn_searchProduct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_searchProductActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panelProductsLayout = new javax.swing.GroupLayout(panelProducts);
                panelProducts.setLayout(panelProductsLayout);
                panelProductsLayout.setHorizontalGroup(
                        panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelProductsLayout.createSequentialGroup()
                                .addGap(552, 552, 552)
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelProductsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(panelProductsLayout.createSequentialGroup()
                                                .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)
                                                .addComponent(btn_editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)
                                                .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(139, 139, 139)
                                                .addComponent(tf_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                                .addComponent(label_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                panelProductsLayout.setVerticalGroup(
                        panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelProductsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelProductsLayout.createSequentialGroup()
                                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tf_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 7, Short.MAX_VALUE))
                                        .addComponent(label_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
                AddProduct addProduct = new AddProduct();
                addProduct.setVisible(true);
                addProduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_addProductActionPerformed

        private void btn_editProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editProductActionPerformed
                try {
                        EditProduct editProduct = new EditProduct();

                        Integer rowIndex = productsTable.getSelectedRow();

                        editProduct.product_id = Integer.valueOf(productsTable.getValueAt(rowIndex, 0).toString());
                        editProduct.tf_id.setText(productsTable.getValueAt(rowIndex, 0).toString());
                        editProduct.tf_name.setText(productsTable.getValueAt(rowIndex, 1).toString());
                        editProduct.tf_price.setText(productsTable.getValueAt(rowIndex, 2).toString());
                        editProduct.tf_quantity.setText(productsTable.getValueAt(rowIndex, 3).toString());
                        editProduct.ta_description.setText(productsTable.getValueAt(rowIndex, 5).toString());
                        editProduct.comboCategories.setSelectedItem(productsTable.getValueAt(rowIndex, 6));

                        ImageIcon image1 = (ImageIcon) productsTable.getValueAt(rowIndex, 4);
                        Image image2 = image1.getImage().getScaledInstance(editProduct.label_picture.getWidth(), editProduct.label_picture.getHeight(),
                                 Image.SCALE_SMOOTH);
                        ImageIcon image3 = new ImageIcon(image2);
                        editProduct.label_picture.setIcon(image3);

                        editProduct.setVisible(true);
                        editProduct.pack();
                        editProduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } catch (IndexOutOfBoundsException Ex) {
                        JOptionPane.showMessageDialog(null, "Select a product from the table");
                }
                
        }//GEN-LAST:event_btn_editProductActionPerformed

        private void btn_deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteProductActionPerformed
                try {
                        Integer rowIndex = productsTable.getSelectedRow();
                        Integer id = Integer.valueOf(productsTable.getValueAt(rowIndex, 0).toString());
                        productRepository.deleteById(id);
                } catch (IndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Select a product from the table");
                }
        }//GEN-LAST:event_btn_deleteProductActionPerformed

        private void btn_searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchProductActionPerformed
                showProductsTable(tf_searchProduct.getText());
        }//GEN-LAST:event_btn_searchProductActionPerformed

        private void label_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_refreshMouseClicked
                showProductsTable("");
        }//GEN-LAST:event_label_refreshMouseClicked

        private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
                
        }//GEN-LAST:event_productsTableMouseClicked

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
                        java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Products().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private view.swing.MyButton btn_addProduct;
        private view.swing.MyButton btn_deleteProduct;
        private view.swing.MyButton btn_editProduct;
        private view.swing.MyButton btn_searchProduct;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel label_refresh;
        private javax.swing.JLabel label_tittle;
        private javax.swing.JPanel panelProducts;
        private javax.swing.JTable productsTable;
        private view.swing.TextField tf_searchProduct;
        // End of variables declaration//GEN-END:variables
}
