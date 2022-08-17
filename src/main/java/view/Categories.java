/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.MyTable;
import entities.Category;
import entities.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import repository.CategoryRepository;
import repository.HibernateUtils;
import repository.ProductRepository;

/**
 *
 * @author alber
 */
public class Categories extends javax.swing.JFrame {
        
        Category category = new Category();
        CategoryRepository categoryRepository = new CategoryRepository();
        ProductRepository productRepository = new ProductRepository();
        private List<Category> categoriesList;
        int position = 0;

        public Categories() {
                initComponents();
                fillCategoryTable();
                categoryTable.setShowGrid(false);
                categoryTable.setGridColor(Color.GRAY);
                categoryTable.setSelectionBackground(Color.gray);
                JTableHeader th = categoryTable.getTableHeader();
                th.setFont(new Font("Raleway", Font.PLAIN, 14));
        }
        
        //Método para mostrar las categorías en una tabla
        public void fillCategoryTable(){
                 categoriesList = categoryRepository.readAll();

                String[] colNames = {"Id", "Name"};
                Object[][] rows = new Object[categoriesList.size()][2];
                DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();

                for (int i = 0; i < categoriesList.size(); i++) {
                        rows[i][0] = categoriesList.get(i).getId();
                        rows[i][1] = categoriesList.get(i).getName();
                }
                model.setDataVector(rows, colNames);

                categoryTable.setModel(model);
                categoryTable.setRowHeight(45);
        }
        
        //Método para mostrar los productos de una categoría en una lista
        public void fillProductList(int id){
                List<Product> productList = productRepository.productsInCategoryList(id);
                DefaultListModel model = new DefaultListModel();

                for (int i = 0; i < productList.size(); i++) {
                        model.addElement(productList.get(i).getName());
                }
                categoryList.setModel(model);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelCategory = new javax.swing.JPanel();
                label_tittle = new javax.swing.JLabel();
                label_id = new javax.swing.JLabel();
                label_name = new javax.swing.JLabel();
                tf_nameCategory = new javax.swing.JTextField();
                tf_idCategory = new javax.swing.JTextField();
                btn_insertCategory = new view.swing.MyButton();
                btn_updateCategory = new view.swing.MyButton();
                btn_deleteCategory = new view.swing.MyButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                categoryTable = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                categoryList = new javax.swing.JList<>();
                btn_showProductsInCategory = new view.swing.MyButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                panelCategory.setBackground(new java.awt.Color(255, 255, 255));

                label_tittle.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
                label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_tittle.setText("Categories");

                label_id.setText("Id:");

                label_name.setText("Name:");

                btn_insertCategory.setBackground(new java.awt.Color(69, 39, 160));
                btn_insertCategory.setBorder(null);
                btn_insertCategory.setForeground(new java.awt.Color(255, 255, 255));
                btn_insertCategory.setText("Insert");
                btn_insertCategory.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_insertCategory.setColor(new java.awt.Color(69, 39, 160));
                btn_insertCategory.setColorClick(new java.awt.Color(0, 0, 112));
                btn_insertCategory.setColorOver(new java.awt.Color(0, 0, 112));
                btn_insertCategory.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_insertCategory.setRadius(25);
                btn_insertCategory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_insertCategoryActionPerformed(evt);
                        }
                });

                btn_updateCategory.setBackground(new java.awt.Color(69, 39, 160));
                btn_updateCategory.setBorder(null);
                btn_updateCategory.setForeground(new java.awt.Color(255, 255, 255));
                btn_updateCategory.setText("Edit");
                btn_updateCategory.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_updateCategory.setColor(new java.awt.Color(69, 39, 160));
                btn_updateCategory.setColorClick(new java.awt.Color(0, 0, 112));
                btn_updateCategory.setColorOver(new java.awt.Color(0, 0, 112));
                btn_updateCategory.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_updateCategory.setRadius(25);
                btn_updateCategory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_updateCategoryActionPerformed(evt);
                        }
                });

                btn_deleteCategory.setBackground(new java.awt.Color(69, 39, 160));
                btn_deleteCategory.setBorder(null);
                btn_deleteCategory.setForeground(new java.awt.Color(255, 255, 255));
                btn_deleteCategory.setText("Delete");
                btn_deleteCategory.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_deleteCategory.setColor(new java.awt.Color(69, 39, 160));
                btn_deleteCategory.setColorClick(new java.awt.Color(0, 0, 112));
                btn_deleteCategory.setColorOver(new java.awt.Color(0, 0, 112));
                btn_deleteCategory.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_deleteCategory.setRadius(25);
                btn_deleteCategory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_deleteCategoryActionPerformed(evt);
                        }
                });

                categoryTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null},
                                {null, null},
                                {null, null},
                                {null, null}
                        },
                        new String [] {
                                "Id", "Name"
                        }
                ));
                categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                categoryTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(categoryTable);

                jScrollPane2.setViewportView(categoryList);

                btn_showProductsInCategory.setBackground(new java.awt.Color(69, 39, 160));
                btn_showProductsInCategory.setBorder(null);
                btn_showProductsInCategory.setForeground(new java.awt.Color(255, 255, 255));
                btn_showProductsInCategory.setText("Show products");
                btn_showProductsInCategory.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_showProductsInCategory.setColor(new java.awt.Color(69, 39, 160));
                btn_showProductsInCategory.setColorClick(new java.awt.Color(0, 0, 112));
                btn_showProductsInCategory.setColorOver(new java.awt.Color(0, 0, 112));
                btn_showProductsInCategory.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_showProductsInCategory.setRadius(25);
                btn_showProductsInCategory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_showProductsInCategoryActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panelCategoryLayout = new javax.swing.GroupLayout(panelCategory);
                panelCategory.setLayout(panelCategoryLayout);
                panelCategoryLayout.setHorizontalGroup(
                        panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                                .addComponent(label_name)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(tf_nameCategory)
                                                                        .addComponent(btn_insertCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_updateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                                .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(tf_idCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(31, 31, 31)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                .addGap(296, 296, 296)
                                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                .addGap(341, 341, 341)
                                                .addComponent(btn_showProductsInCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelCategoryLayout.setVerticalGroup(
                        panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCategoryLayout.createSequentialGroup()
                                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tf_idCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tf_nameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_insertCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_updateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_showProductsInCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        //Método evento botón insertar categoría
        private void btn_insertCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertCategoryActionPerformed
                try {
                        if (categoryRepository.findCategory(tf_nameCategory.getText())) {
                                JOptionPane.showMessageDialog(null, "The category exists in database");
                        }
                        else if (tf_nameCategory.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Enter a category name");
                        } else {
                                Category newCategory = new Category();
                                String name = tf_nameCategory.getText();
                                newCategory.setName(name);
                                categoryRepository.create(newCategory);
                                fillCategoryTable();
                        }
                } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Not possible introduced data");
                }
        }//GEN-LAST:event_btn_insertCategoryActionPerformed

        //Método evento botón actualizar categoría
        private void btn_updateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateCategoryActionPerformed
                try {
                        if (!tf_nameCategory.getText().isEmpty()) {
                               // category = categoriesList.stream().filter(cat->( cat.getId() == Integer.valueOf(tf_idCategory.getText() ))).findFirst().get();
                               category = categoriesList.get( categoryTable.getSelectedRow());
                               category.setName(tf_nameCategory.getText());
                               categoryRepository.update(category);
                               fillCategoryTable();
                        } else {
                                JOptionPane.showMessageDialog(null, "Enter the category name");
                        }
                } catch (HeadlessException | NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No category selected for update");
                }
        }//GEN-LAST:event_btn_updateCategoryActionPerformed

        //Método evento botón eliminar categoría
        private void btn_deleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCategoryActionPerformed
                try {
                        categoryRepository.deleteById(Integer.valueOf(tf_idCategory.getText()));
                        tf_idCategory.setText("");
                        tf_nameCategory.setText("");
                        position = 0;
                        fillCategoryTable();
                } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No category selected");
                }
        }//GEN-LAST:event_btn_deleteCategoryActionPerformed

        //Método para mostrar los productos de la categoría seleccionada en la tabla
        private void btn_showProductsInCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showProductsInCategoryActionPerformed
                try {
                        ProductsInCategory productsInCategory = new ProductsInCategory();
                        int id = Integer.valueOf(categoryTable.getValueAt(categoryTable.getSelectedRow(), 0).toString());
                        List<Product> productList = productRepository.productsInCategoryList(id);

                        String[] colNames = {"Id", "Name", "Price", "Quantity", "Image", "Description"};
                        Object[][] rows = new Object[productList.size()][6];

                        for (int i = 0; i < productList.size(); i++) {
                                rows[i][0] = productList.get(i).getId();
                                rows[i][1] = productList.get(i).getName();
                                //rows[i][6] = productList.get(i).getCategory().getId();
                                rows[i][2] = productList.get(i).getPrice();
                                rows[i][3] = productList.get(i).getQuantity();

                                ImageIcon pic = new ImageIcon(new ImageIcon(productList.get(i).getPicture())
                                        .getImage()
                                        .getScaledInstance(120, 80, Image.SCALE_SMOOTH));

                                rows[i][4] = pic;
                                rows[i][5] = productList.get(i).getDescription();
                        }

                        MyTable myTable = new MyTable(rows, colNames);
                        productsInCategory.productsInCategoryTable.setModel(myTable);
                        productsInCategory.productsInCategoryTable.setRowHeight(80);
                        productsInCategory.productsInCategoryTable.getColumnModel().getColumn(5).setPreferredWidth(150);
                        productsInCategory.productsInCategoryTable.getColumnModel().getColumn(4).setPreferredWidth(120);
                        productsInCategory.label_nameCategory.setText(categoryTable.getValueAt(categoryTable.getSelectedRow(), 1).toString());
                        productsInCategory.setVisible(true);
                        productsInCategory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Select a category from the table");
                }
        }//GEN-LAST:event_btn_showProductsInCategoryActionPerformed

        private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
                Integer rowIndex = categoryTable.getSelectedRow();
                tf_idCategory.setText(categoryTable.getValueAt(rowIndex, 0).toString());
                tf_nameCategory.setText(categoryTable.getValueAt(rowIndex, 1).toString());

                fillProductList(Integer.valueOf(categoryTable.getValueAt(rowIndex, 0).toString()));
                position = rowIndex;
        }//GEN-LAST:event_categoryTableMouseClicked

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
                        java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Categories().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private view.swing.MyButton btn_deleteCategory;
        private view.swing.MyButton btn_insertCategory;
        private view.swing.MyButton btn_showProductsInCategory;
        private view.swing.MyButton btn_updateCategory;
        private javax.swing.JList<String> categoryList;
        private javax.swing.JTable categoryTable;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel label_id;
        private javax.swing.JLabel label_name;
        private javax.swing.JLabel label_tittle;
        private javax.swing.JPanel panelCategory;
        private javax.swing.JTextField tf_idCategory;
        private javax.swing.JTextField tf_nameCategory;
        // End of variables declaration//GEN-END:variables
}
