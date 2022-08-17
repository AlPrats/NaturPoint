/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Customer;
import entities.Order;
import entities.Product;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author alber
 */
public class OrderRepository implements Repository<Order>{
        
        final Session session;

        public OrderRepository() {
                this.session = HibernateUtils.openConnection();
        }

        @Override
        public void create(Order order) {
                System.out.println(session.getTransaction().getStatus());
                session.beginTransaction();
                        session.clear();
                try {
                        
                        session.save(order);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Order created");
                } catch (IllegalStateException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error creating order");
                }
        }

        @Override
        public List<Order> readAll() {
                session.beginTransaction();
                Query<Order> query = session.createQuery("FROM Order ORDER BY id desc", Order.class);
                List<Order> ordersList = query.getResultList();
                session.getTransaction().commit();
                return ordersList;
        }
        
        @Override
        public void update(Order order) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateById(int id, Order order) {
                session.beginTransaction();
                try {
                        order.setId(id);
                        session.update(order);
                        session.getTransaction().commit();
                        JOptionPane.showConfirmDialog(null, "Order updated");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating order");
                }
        }
        
        public void update2(int id, Date dateOrder, double total, Customer customer){
                session.beginTransaction();
                try {
                        Order updateOrder = new Order();
                        updateOrder.setId(id);
                        updateOrder.setDateOrder(dateOrder);
                        updateOrder.setTotal(total);
                        updateOrder.setCustomer(customer);
                        session.update(updateOrder);
                        session.getTransaction().commit();
                        //JOptionPane.showMessageDialog(null, "Order updated");
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating order");
                }
                
        }

        @Override
        public void deleteById(int id) {
                
        }

        @Override
        public Order findOneById(int id) {
                session.beginTransaction();
                Query<Order> query = session.createQuery("FROM Order WHERE id =: id", Order.class);
                query.setParameter("id", id);
                try {
                        return query.getSingleResult();
                } catch (NoResultException e) {
                        System.err.println(e.getMessage());
                        return new Order();
                }
                finally {
                        session.getTransaction().commit();
                }
        }
        
        // get the max order id
        public  int getMaxOrderId() {
                session.beginTransaction();
                System.out.println("¨Hola");
                try {
                        String query = "SELECT MAX(id) FROM Order";
                        List list = session.createQuery(query).list();
                        int maxOrderId = ((int) list.get(0));
                        session.getTransaction().commit();
                        System.out.println("ÄDIOS");
                        System.out.println(session.getTransaction().getStatus());
                        return maxOrderId;
                }catch (Exception ex){
                        System.out.println(ex.getMessage());
                        session.getTransaction().commit();
                }
                return 0;
        }
        
}
