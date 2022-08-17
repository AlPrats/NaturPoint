/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.DisplayItem;
import classes.Picture;
import entities.Category;
import entities.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import repository.CategoryRepository;
import repository.ProductRepository;

/**
 *
 * @author alber
 */
public class AddProduct extends javax.swing.JFrame {
        
        
        CategoryRepository categoryRepository = new CategoryRepository();
        ProductRepository productRepository = new ProductRepository();
               
        // get the image path
        String imagePth = null;

        /**
         * Creates new form AddProduct
         */
        public AddProduct() {
                initComponents();
                loadCategorys();
        }
        
        //Método para cargar las categorías en un ComboBox
        public  void loadCategorys() {
                DefaultComboBoxModel data = new DefaultComboBoxModel();
                List<Category> categorysList = categoryRepository.readAll();
                
                for(Category o: categorysList){
                        DisplayItem d = new DisplayItem(o.getName(), o.getId());
                        data.addElement(d);        
                 } 
                 comboCategories.setModel(data);
        }

        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelAddProduct = new javax.swing.JPanel();
                label_tittle = new javax.swing.JLabel();
                comboCategories = new javax.swing.JComboBox<>();
                tf_name = new javax.swing.JTextField();
                tf_price = new javax.swing.JTextField();
                tf_quantity = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                ta_description = new javax.swing.JTextArea();
                label_category = new javax.swing.JLabel();
                label_name = new javax.swing.JLabel();
                label_price = new javax.swing.JLabel();
                label_quantity = new javax.swing.JLabel();
                label_description = new javax.swing.JLabel();
                label_picture = new javax.swing.JLabel();
                btn_addProduct = new view.swing.MyButton();
                btn_searchPicture = new view.swing.MyButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                panelAddProduct.setBackground(new java.awt.Color(255, 255, 255));

                label_tittle.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
                label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_tittle.setText("Add Product");

                comboCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                tf_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                tf_quantityKeyTyped(evt);
                        }
                });

                ta_description.setColumns(20);
                ta_description.setRows(5);
                jScrollPane1.setViewportView(ta_description);

                label_category.setText(" Select a category");

                label_name.setText(" Enter a product name");

                label_price.setText(" Enter a price");

                label_quantity.setText(" Enter a quantity");

                label_description.setText(" Enter a product description");

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

                btn_searchPicture.setBackground(new java.awt.Color(69, 39, 160));
                btn_searchPicture.setBorder(null);
                btn_searchPicture.setForeground(new java.awt.Color(255, 255, 255));
                btn_searchPicture.setText("Select a picture");
                btn_searchPicture.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_searchPicture.setColor(new java.awt.Color(69, 39, 160));
                btn_searchPicture.setColorClick(new java.awt.Color(0, 0, 112));
                btn_searchPicture.setColorOver(new java.awt.Color(0, 0, 112));
                btn_searchPicture.setFont(new java.awt.Font("Rubik SemiBold", 0, 12)); // NOI18N
                btn_searchPicture.setRadius(25);
                btn_searchPicture.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_searchPictureActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panelAddProductLayout = new javax.swing.GroupLayout(panelAddProduct);
                panelAddProduct.setLayout(panelAddProductLayout);
                panelAddProductLayout.setHorizontalGroup(
                        panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(tf_name)
                                                                .addComponent(comboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(tf_price)
                                                                .addComponent(tf_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                                        .addComponent(label_category, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddProductLayout.createSequentialGroup()
                                                                .addComponent(label_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddProductLayout.createSequentialGroup()
                                                                .addComponent(btn_searchPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86))))))
                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label_description, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addGap(233, 233, 233)
                                                .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelAddProductLayout.setVerticalGroup(
                        panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addComponent(label_category)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_name)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_price)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_quantity))
                                        .addComponent(label_picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(btn_searchPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAddProductLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        //Método evento para buscar imagen 
        private void btn_searchPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchPictureActionPerformed
                Picture picture = new Picture();
                imagePth = picture.browseImage(label_picture);
                System.out.println(imagePth);
        }//GEN-LAST:event_btn_searchPictureActionPerformed

        //Método del evento para añadir un nuevo producto
        private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
                if (productRepository.findProduct(tf_name.getText())) {
                        JOptionPane.showMessageDialog(null, "The product exists in database");
                } else {
                        Product newProduct = new Product();
                        Category category;
                        category = categoryRepository.searchCategory(comboCategories.getSelectedItem().toString());
                        newProduct.setCategory(category);
                        newProduct.setName(tf_name.getText());
                        newProduct.setDescription(ta_description.getText());
                        newProduct.setPrice(Double.parseDouble(tf_price.getText()));
                        newProduct.setQuantity(Integer.parseInt(tf_quantity.getText()));
                        byte[] img;
                        if (imagePth != null) {
                                try {
                                        Path path = Paths.get(imagePth);
                                        img = Files.readAllBytes(path);
                                        newProduct.setPicture(img);
                                        productRepository.create(newProduct);
                                        //ProductRepository.createProduct1(name, description, price, quantity, img, category);
                                } catch (IOException ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "Select a profile picture");
                        } 
                }
        }//GEN-LAST:event_btn_addProductActionPerformed

        private void tf_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityKeyTyped
                if (!Character.isDigit(evt.getKeyChar())) {
                        evt.consume();
                }
        }//GEN-LAST:event_tf_quantityKeyTyped

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
                        java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new AddProduct().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private view.swing.MyButton btn_addProduct;
        private view.swing.MyButton btn_searchPicture;
        private javax.swing.JComboBox<String> comboCategories;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel label_category;
        private javax.swing.JLabel label_description;
        private javax.swing.JLabel label_name;
        private javax.swing.JLabel label_picture;
        private javax.swing.JLabel label_price;
        private javax.swing.JLabel label_quantity;
        private javax.swing.JLabel label_tittle;
        private javax.swing.JPanel panelAddProduct;
        private javax.swing.JTextArea ta_description;
        private javax.swing.JTextField tf_name;
        private javax.swing.JTextField tf_price;
        private javax.swing.JTextField tf_quantity;
        // End of variables declaration//GEN-END:variables
}
