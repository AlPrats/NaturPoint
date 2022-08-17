/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.MyTable;
import entities.Customer;
import entities.Order;
import entities.OrderDetails;
import entities.Product;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repository.CustomerRepository;
import repository.OrderDetailsRepository;
import repository.OrderRepository;
import repository.ProductRepository;

/**
 *
 * @author alber
 */
public class Orders extends javax.swing.JFrame {
        
        OrderRepository orderRepository = new OrderRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();
        OrderDetailsRepository orderDetailsRepository = new OrderDetailsRepository();

        /**
         * Creates new form Orders
         */
        public Orders() {
                initComponents();
                //displayIdOrder();
                productTable.setBackground(Color.white);
                orderTable.setBackground(Color.white);
                showCustomerTable();
                showProductTable();
                try {
                        tf_idOrder.setText(String.valueOf(orderRepository.getMaxOrderId() + 1));
                } catch (Exception ex) {
                        tf_idOrder.setText(String.valueOf(1));
                }
        }
        
        //Método para mostrar la tabla clientes
        public void showCustomerTable() {
                List<Customer> customerList = customerRepository.readAll();
                String[] colNames = {"Id", "Name", "Surnames", "Email", "Phone"};
                Object[][] rows = new Object[customerList.size()][5];
                DefaultTableModel model = (DefaultTableModel) customersTable.getModel();

                for (int i = 0; i < customerList.size(); i++) {
                        rows[i][0] = customerList.get(i).getId();
                        rows[i][1] = customerList.get(i).getName();
                        rows[i][2] = customerList.get(i).getSurnames();
                        rows[i][3] = customerList.get(i).getEmail();
                        rows[i][4] = customerList.get(i).getPhone();
                }
                model.setDataVector(rows, colNames);

                customersTable.setModel(model);
                customersTable.setRowHeight(45);
        }
        
        //Método para mostrar la tabla productos
        public void showProductTable(){
                List<Product> productList = productRepository.readAll();
                String[] colNames = {"Id", "Name", "Price", "Quantity", "Image", "Description"};
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
                }
                MyTable myTable = new MyTable(rows, colNames);
                productTable.setModel(myTable);
                productTable.setRowHeight(80);
                productTable.getColumnModel().getColumn(0).setPreferredWidth(50);
                productTable.getColumnModel().getColumn(5).setPreferredWidth(120);
                productTable.getColumnModel().getColumn(4).setPreferredWidth(120);
        }
        
        //Método para obtener la cantidad total de la tabla orden y mostrarlo en el label
        public void getTotal() {
                double total = 0;
                for (int i = 0; i < orderTable.getModel().getRowCount(); i++) {
                        total += Double.valueOf(orderTable.getValueAt(i, 4).toString());
                }
                label_totalAmount.setText("Total: " + total + "€");
        }
        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                label_tittle = new javax.swing.JLabel();
                label_idOrder = new javax.swing.JLabel();
                tf_idCustomer = new javax.swing.JTextField();
                label_idCustomer = new javax.swing.JLabel();
                tf_idOrder = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                customersTable = new javax.swing.JTable();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                productTable = new javax.swing.JTable();
                jScrollPane3 = new javax.swing.JScrollPane();
                orderTable = new javax.swing.JTable();
                label_totalAmount = new javax.swing.JLabel();
                btn_transferProductsToOrder = new view.swing.MyButton();
                btn_showOrders = new view.swing.MyButton();
                btn_deleteProduct = new view.swing.MyButton();
                btn_clear = new view.swing.MyButton();
                btn_insertOrder = new view.swing.MyButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                label_tittle.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
                label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_tittle.setText("Orders");

                label_idOrder.setText(" Id order");

                label_idCustomer.setText(" Id customer");

                customersTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                customersTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(customersTable);

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText(" Select a customer");

                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText(" Select a product");

                productTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane2.setViewportView(productTable);

                orderTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Name", "Price", "Quantity", "Total"
                        }
                ));
                jScrollPane3.setViewportView(orderTable);

                btn_transferProductsToOrder.setBackground(new java.awt.Color(69, 39, 160));
                btn_transferProductsToOrder.setBorder(null);
                btn_transferProductsToOrder.setForeground(new java.awt.Color(255, 255, 255));
                btn_transferProductsToOrder.setText("Transfer product to order");
                btn_transferProductsToOrder.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_transferProductsToOrder.setColor(new java.awt.Color(69, 39, 160));
                btn_transferProductsToOrder.setColorClick(new java.awt.Color(0, 0, 112));
                btn_transferProductsToOrder.setColorOver(new java.awt.Color(0, 0, 112));
                btn_transferProductsToOrder.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_transferProductsToOrder.setRadius(25);
                btn_transferProductsToOrder.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_transferProductsToOrderActionPerformed(evt);
                        }
                });

                btn_showOrders.setBackground(new java.awt.Color(69, 39, 160));
                btn_showOrders.setBorder(null);
                btn_showOrders.setForeground(new java.awt.Color(255, 255, 255));
                btn_showOrders.setText("Show orders");
                btn_showOrders.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_showOrders.setColor(new java.awt.Color(69, 39, 160));
                btn_showOrders.setColorClick(new java.awt.Color(0, 0, 112));
                btn_showOrders.setColorOver(new java.awt.Color(0, 0, 112));
                btn_showOrders.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_showOrders.setRadius(25);
                btn_showOrders.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_showOrdersActionPerformed(evt);
                        }
                });

                btn_deleteProduct.setBackground(new java.awt.Color(69, 39, 160));
                btn_deleteProduct.setBorder(null);
                btn_deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
                btn_deleteProduct.setText("Delete product");
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

                btn_clear.setBackground(new java.awt.Color(69, 39, 160));
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

                btn_insertOrder.setBackground(new java.awt.Color(69, 39, 160));
                btn_insertOrder.setBorder(null);
                btn_insertOrder.setForeground(new java.awt.Color(255, 255, 255));
                btn_insertOrder.setText("Insert order");
                btn_insertOrder.setBorderColor(new java.awt.Color(69, 39, 160));
                btn_insertOrder.setColor(new java.awt.Color(69, 39, 160));
                btn_insertOrder.setColorClick(new java.awt.Color(0, 0, 112));
                btn_insertOrder.setColorOver(new java.awt.Color(0, 0, 112));
                btn_insertOrder.setFont(new java.awt.Font("Rubik SemiBold", 0, 14)); // NOI18N
                btn_insertOrder.setRadius(25);
                btn_insertOrder.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_insertOrderActionPerformed(evt);
                        }
                });

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Products in Order");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(588, 588, 588)
                                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(label_idCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tf_idCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(label_totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btn_insertOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn_deleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                                        .addComponent(btn_showOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(61, 61, 61))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(label_idOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(343, 343, 343))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(tf_idOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btn_transferProductsToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(106, 106, 106)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane3)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(306, 306, 306)))))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 42, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(label_idOrder)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tf_idOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_transferProductsToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(label_idCustomer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tf_idCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_showOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_insertOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addComponent(label_totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        //Método para el evento del botón insertar orden
        private void btn_insertOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertOrderActionPerformed
                Calendar today = Calendar.getInstance();
                Customer customer = new Customer();
                Product product = new Product();
                int idOrder;
                Date date;
                int idProduct;
                int quantity = 0;
                int quantityDB = 0;
                int newQuantity = 0;
                double total = 0;

                //Se veriifca que el idCustomer contenga datos y que la tabla orden contenga mínimo un registro
                if (tf_idCustomer.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Select a customer to add the order");
                } else if (orderTable.getRowCount() > 0) {
                        //Instanciamos una nueva orden y establecemos los valores a sus propiedades
                        Order newOrder = new Order();
                        newOrder.setId(Integer.valueOf(tf_idOrder.getText()));
                        idOrder = Integer.valueOf(tf_idOrder.getText());
                        newOrder.setDateOrder(today.getTime());
                        date = today.getTime();
                        customer.setId(Integer.valueOf(tf_idCustomer.getText()));
                        newOrder.setCustomer(customer);
                        orderRepository.create(newOrder);

                        //Instanciamos los detalles de la nueva orden y obtenemos los datos del producto
                        OrderDetails orderDetails = new OrderDetails();
                        Order order = new Order();
                        order.setId(Integer.valueOf(tf_idOrder.getText()));
                        for (int i = 0; i < orderTable.getRowCount(); i++) {
                                product.setId(Integer.valueOf(orderTable.getValueAt(i, 0).toString()));
                                idProduct = Integer.valueOf(orderTable.getValueAt(i, 0).toString());//
                                //Establecemos los valores a sus propiedades 
                                orderDetails.setOrder(order);
                                orderDetails.setProduct(product);
                                orderDetails.setPrice(Double.valueOf(orderTable.getValueAt(i, 2).toString()));
                                orderDetails.setQuantity(Integer.valueOf(orderTable.getValueAt(i, 3).toString()));         
                                quantity = Integer.valueOf(orderTable.getValueAt(i, 3).toString());//
                                orderDetails.setSubTotal(Double.valueOf(orderTable.getValueAt(i, 4).toString()));
                                total += Double.valueOf(orderTable.getValueAt(i, 4).toString());
                                
                                //Insertamos los detalles
                                orderDetailsRepository.create(orderDetails);
                                
                                //Actualizamos el stock disponible del producto
                                quantityDB = productRepository.getQuantityproduct(idProduct);
                                newQuantity = quantityDB - quantity;
                                productRepository.updateQuantity(idProduct, newQuantity);
                                
                                //Mostramos el nuevo id de pedido en el textfield
                                tf_idOrder.setText(String.valueOf(orderRepository.getMaxOrderId() + 1));
                        }
                        //Actualizamos la orden con el monto total
                        orderRepository.update2(idOrder, date, total, customer);
                        showProductTable();
                } else {
                        JOptionPane.showMessageDialog(null, "You must add at least 1 product to the order");
                }
        }//GEN-LAST:event_btn_insertOrderActionPerformed

        private void btn_showOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showOrdersActionPerformed
                ShowOrders showOrders = new ShowOrders();
                showOrders.setVisible(true);
                showOrders.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }//GEN-LAST:event_btn_showOrdersActionPerformed

        private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
                DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
                model.setRowCount(0);
                getTotal();
        }//GEN-LAST:event_btn_clearActionPerformed

        private void btn_deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteProductActionPerformed
                try {
                        Integer selectedRowIndex = orderTable.getSelectedRow();
                        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
                        model.removeRow(selectedRowIndex);
                        getTotal();
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Select a product from the order table");
                }
        }//GEN-LAST:event_btn_deleteProductActionPerformed

        //Método para el evento del botón de transferir productos a la tabla order
        private void btn_transferProductsToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferProductsToOrderActionPerformed
                int quantity;
                int rowindex;
                try {
                        //obtenemos la cantidad del inputDialog
                        quantity = Integer.valueOf(JOptionPane.showInputDialog("Enter the quantity", "1"));
                        rowindex = productTable.getSelectedRow();

                        //Variable boolean para comprobar si el producto ya existe en la tabla order
                        boolean isExist = false;
                        int index = 0;

                        Object rowData[] = new Object[5];
                        rowData[0] = productTable.getValueAt(rowindex, 0);
                        rowData[1] = productTable.getValueAt(rowindex, 1);
                        rowData[2] = productTable.getValueAt(rowindex, 2);
                        rowData[3] = quantity;
                        Double price = Double.valueOf(productTable.getValueAt(rowindex, 2).toString());
                        rowData[4] = quantity * price;

                        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();

                        //Si la cantidad introducida es mayor que el stock disponible       
                        if (quantity > Integer.valueOf(productTable.getValueAt(rowindex, 3).toString())) {
                                JOptionPane.showMessageDialog(null, "Unavailable quantity", "Invalid Value", 2);
                        }
                        //Si la cantidad introducida es o
                        else if (quantity == 0) {
                                JOptionPane.showMessageDialog(null, "Quantity can't be 0", "Invalid Value", 2);
                        } else {
                                if (orderTable.getModel().getRowCount() == 0) {
                                        model.addRow(rowData);
                                        getTotal();
                                } else {
                                        //Se comprueba que el producto a añadir ya existe en la tabla order
                                        for (int i = 0; i < orderTable.getModel().getRowCount(); i++) {
                                                if (rowData[0] == orderTable.getValueAt(i, 0)) {
                                                        isExist = true;
                                                        index = i;
                                                }
                                        }
                                        if (isExist) {
                                                //Si el producto ya existe, se calcula la nueva cantidad
                                                Integer newQuantity = quantity + Integer.valueOf(orderTable.getValueAt(index, 3).toString());

                                                //Si la nueva cantidad introducida es mayor que el stock disponible 
                                                if (newQuantity > Integer.valueOf(productTable.getValueAt(rowindex, 3).toString())) {
                                                        JOptionPane.showMessageDialog(null, "Unavailable quantity", "Invalid Value", 2);
                                                } else {
                                                        orderTable.setValueAt(newQuantity, index, 3);
                                                        orderTable.setValueAt(newQuantity * price, index, 4);
                                                        getTotal();
                                                }
                                        } else {
                                                model.addRow(rowData);
                                                getTotal();
                                        }
                                }
                        }
                } catch (HeadlessException | NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 1);
                }
        }//GEN-LAST:event_btn_transferProductsToOrderActionPerformed

        private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
                Integer selectedRowIndex = customersTable.getSelectedRow();
                tf_idCustomer.setText(customersTable.getValueAt(selectedRowIndex, 0).toString());
        }//GEN-LAST:event_customersTableMouseClicked

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
                        java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Orders().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private view.swing.MyButton btn_clear;
        private view.swing.MyButton btn_deleteProduct;
        private view.swing.MyButton btn_insertOrder;
        private view.swing.MyButton btn_showOrders;
        private view.swing.MyButton btn_transferProductsToOrder;
        private javax.swing.JTable customersTable;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JLabel label_idCustomer;
        private javax.swing.JLabel label_idOrder;
        private javax.swing.JLabel label_tittle;
        private javax.swing.JLabel label_totalAmount;
        private javax.swing.JTable orderTable;
        private javax.swing.JTable productTable;
        public javax.swing.JTextField tf_idCustomer;
        public javax.swing.JTextField tf_idOrder;
        // End of variables declaration//GEN-END:variables
}
