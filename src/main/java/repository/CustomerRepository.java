/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Customer;
import java.awt.HeadlessException;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author alber
 */
public class CustomerRepository implements Repository<Customer>{
        
        final Session session;

        public CustomerRepository() {
                this.session = HibernateUtils.openConnection();
        }
        
        @Override
        public void create(Customer customer) {
                session.beginTransaction();
                session.clear();
                try {
                        session.save(customer);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Customer saved");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error creating customer"); 
                }
        }

        @Override
        public List<Customer> readAll() {
                session.beginTransaction();
                Query<Customer> query = session.createQuery("FROM Customer", Customer.class);
                List<Customer> customersList = query.getResultList();
                session.getTransaction().commit();
                return customersList;
        }
        
        @Override
        public void update(Customer customer) {
                session.beginTransaction();
                try {
                        session.update(customer);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Customer updated");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating customer");
                }
        }

        @Override
        public void updateById(int id, Customer customer) {
                session.beginTransaction();
                try {
                        customer.setId(id);
                        session.update(customer);
                        session.getTransaction().commit();
                        JOptionPane.showConfirmDialog(null, "Customer updated");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating customer");
                }
        }

        @Override
        public void deleteById(int id) {
                session.beginTransaction();
                session.clear();
                Customer deleteCustomer = new Customer();
                try {
                        deleteCustomer.setId(id);
                        session.delete(deleteCustomer);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Customer deleted");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error deleting customer"); 
                }
        }

        @Override
        public Customer findOneById(int id) {
                session.beginTransaction();
                Query<Customer> query = session.createQuery("FROM Customer WHERE id =: id", Customer.class);
                query.setParameter("id", id);
                try {
                        return query.getSingleResult();
                } catch (NoResultException e) {
                        System.err.println(e.getMessage());
                        return new Customer();
                }
                finally {
                        session.getTransaction().commit();
                }
        }
            
        public Boolean findCustomer(String email) {
                boolean found = false;
                try {
                        session.beginTransaction();
                        String query = "FROM Customer WHERE email = '" + email + "'";
                        List<Customer> customers = session.createQuery(query).list();
                        for (Customer tempCustomer : customers) {
                                if (tempCustomer.getEmail().equals(email)) {
                                        found = true;
                                        break;
                                }
                        }
                        session.getTransaction().commit();
                } catch (HibernateException e) {
                        System.err.println("Unregistered customer");
                        System.err.println(e.getMessage());
                }
                return found;
        }
        
        public void updateCustomer(int id, String name, String surnames, String email, String phone){
                session.beginTransaction();
                try {
                        Customer updateCustomer = new Customer();
                        updateCustomer.setId(id);
                        updateCustomer.setName(name);
                        updateCustomer.setSurnames(surnames);
                        updateCustomer.setEmail(email);
                        updateCustomer.setPhone(phone);
                        session.update(updateCustomer);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Customer updated");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating customer");
                }
        }
}
