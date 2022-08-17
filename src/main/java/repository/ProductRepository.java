/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Category;
import entities.Product;
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
public class ProductRepository implements Repository<Product>{
        
        final Session session;

        public ProductRepository() {
                this.session = HibernateUtils.openConnection();
        }
        
        @Override
        public void create(Product product) {
                session.beginTransaction();
                try {
                        session.save(product);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Product saved");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error creating product");
                }
        }
        
        public void updateProduct(int id, String name, String description, double price, int quantity, byte[] picture, Category category){
                session.beginTransaction();
                try {
                        Product editProduct = new Product();
                        editProduct.setId(id);
                        editProduct.setName(name);
                        editProduct.setDescription(description);
                        editProduct.setPrice(price);
                        editProduct.setQuantity(quantity);
                        editProduct.setPicture(picture);
                        editProduct.setCategory(category);
                        session.merge(editProduct);
                        //session.update(newProduct);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Product updated");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating product");
                }
        }

        @Override
        public List<Product> readAll() {
                session.beginTransaction();
                Query<Product> query = session.createQuery("FROM Product", Product.class);
                List<Product> products = query.getResultList();
                session.getTransaction().commit();
                return products;
        }
        
        @Override
        public void update(Product product) {
                session.beginTransaction();
                try {
                        session.merge(product);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Product updated");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating product");
                }
        }
        
        public void updateQuantity(int id, int quantity){
                try{
                        session.beginTransaction();
                        String hql = "UPDATE Product SET quantity =: quantity WHERE id =: id";
                        Query query = session.createQuery(hql);
                        query.setParameter("id", id);
                        query.setParameter("quantity", quantity);
                        query.executeUpdate();
                        session.getTransaction().commit();
                } catch (Exception ex){
                        System.out.println(ex.getMessage());
                        String hql = "UPDATE Product SET quantity =: quantity WHERE id =: id";
                        Query query = session.createQuery(hql);
                        query.setParameter("id", id);
                        query.setParameter("quantity", quantity);
                        query.executeUpdate();
                        session.getTransaction().commit();
                }

        }

        @Override
        public void updateById(int id, Product product) {
                session.beginTransaction();
                try {
                        product.setId(id);
                        session.update(product);
                        session.getTransaction().commit();
                        JOptionPane.showConfirmDialog(null, "Product updated");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating product");
                }
        }
        
        @Override
        public void deleteById(int id) {
                session.beginTransaction();
                session.clear();
                try {
                        Product deleteProduct = new Product();
                        deleteProduct.setId(id);
                        session.delete(deleteProduct);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Deleted product");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error deleting product");
                }
        }

        @Override
        public Product findOneById(int id) {
                session.beginTransaction();
                Query<Product> query = session.createQuery("FROM Product WHERE id =: id", Product.class);
                query.setParameter("id", id);
                try {
                        return query.getSingleResult();
                } catch (NoResultException e) {
                        System.err.println(e.getMessage());
                        return new Product();
                }
                finally {
                        session.getTransaction().commit();
                }
        }
        
        public Product findOneByName(String name) {
                session.beginTransaction();
                Query<Product> query = session.createQuery("FROM Product WHERE name =: name", Product.class);
                query.setParameter("name", name);
                try {
                        return query.getSingleResult();
                } catch (NoResultException e) {
                        System.err.println(e.getMessage());
                        return new Product();
                }
                finally {
                        session.getTransaction().commit();
                }
        }

        // get products by category
        public List<Product> productsInCategoryList(int category_id) {
                session.beginTransaction();
                Query<Product> query = session.createQuery("FROM Product WHERE category_id =: id", Product.class);
                query.setParameter("id", category_id);
                List<Product> products = query.getResultList();
                session.getTransaction().commit();
                return products;
         }
        
        public Product searchProduct(String name) {
                session.beginTransaction();
                Query<Product> query = session.createQuery("FROM Product WHERE name =: name", Product.class);
                query.setParameter("name", name);
                try {
                        return query.getSingleResult();
                } catch (NoResultException e) {
                        System.err.println("No results found");
                        return new Product();
                } finally {
                        session.getTransaction().commit();
                }
        }
        
        public int getProductQuantity(int id){
                session.beginTransaction();
                try {
                        Query<Product> query = session.createQuery("SELECT quantity FROM Product WHERE id =: id", Product.class);
                        query.setParameter("id", id);
                        Product product = query.getSingleResult();
                        if (product != null) {
                                Integer result = Integer.parseInt(product.toString());
                                return result;
                        }
                        
                } catch (NoResultException e) {
                        System.err.println("No results found");
                }  finally {
                        session.getTransaction().commit();
                }
                return 0;
        }
        
        public int getQuantityproduct(int id){
                session.beginTransaction();
                Query query = session.createQuery("SELECT quantity FROM Product WHERE id =: id");
                query.setParameter("id", id);
                int quantity = (Integer)query.getSingleResult();
                return quantity;
          }
        
        public Boolean findProduct(String name) {
                boolean found = false;
                try {
                        session.beginTransaction();
                        String query = "FROM Product WHERE name = '" + name + "'";
                        List<Product> products = session.createQuery(query).list();
                        for (Product tempProduct : products) {
                                if (tempProduct.getName().equals(name)) {
                                        found = true;
                                        break;
                                }
                        }
                        session.getTransaction().commit();
                } catch (HibernateException e) {
                        System.err.println("Unregistered product");
                        System.err.println(e.getMessage());
                }
                return found;
        }
}
