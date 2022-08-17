/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.OrderDetails;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author alber
 */
public class OrderDetailsRepository implements Repository<OrderDetails>{
        
        final Session session;

        public OrderDetailsRepository() {
                this.session = HibernateUtils.openConnection();
        }
        
        @Override
        public void create(OrderDetails orderDetails) {
                session.beginTransaction();
                session.clear();
                try {
                        session.save(orderDetails);
                        session.getTransaction().commit();
                        //JOptionPane.showMessageDialog(null, "Order details saved");
                        if (orderDetails != null) {
                                //String query = "UPDATE Product SET quantity = quantity - ? where id = ?";
                        }
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error creating order details");
                }
        }

        @Override
        public List<OrderDetails> readAll() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void update(OrderDetails orderDetails) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateById(int id, OrderDetails t) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public OrderDetails findOneById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }        
}
