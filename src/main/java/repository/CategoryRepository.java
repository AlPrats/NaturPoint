/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Category;
import entities.User;
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
public class CategoryRepository implements Repository<Category>{
        final Session session;

        public CategoryRepository() {
                this.session = HibernateUtils.openConnection();
        }
        
        @Override
        public void create(Category category) {
                session.beginTransaction();
                session.clear();
                try {
                        session.save(category);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Category saved");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error creating category"); 
                }
        }

        @Override
        public List<Category> readAll() {
                session.beginTransaction();
                Query<Category> query = session.createQuery("FROM Category", Category.class);
                List<Category> categoryList = query.getResultList();
                session.getTransaction().commit();
                return categoryList;
        }
        
        @Override
        public void update(Category category) {
                session.beginTransaction();
                try {
                        session.update(category);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Category updated");
                } catch (HeadlessException e) {
                        System.out.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating category");
                }
        }

        @Override
        public void updateById(int id, Category category) {
                session.beginTransaction();
                try {
                        category.setId(id);
                        session.update(category);
                        session.getTransaction().commit();
                        JOptionPane.showConfirmDialog(null, "Category updated");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error updating category");
                }
        }

        @Override
        public void deleteById(int id) {
                session.beginTransaction();
                session.clear();
                Category deleteCategory = new Category();
                try {
                        deleteCategory.setId(id);
                        session.delete(deleteCategory);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Category deleted");
                } catch (HeadlessException e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        JOptionPane.showMessageDialog(null, "Error deleting category"); 
                }
        }

        @Override
        public Category findOneById(int id) {
                session.beginTransaction();
                Query<Category> query = session.createQuery("FROM Category WHERE id =: id", Category.class);
                query.setParameter("id", id);
                try {
                        Category category = query.getSingleResult();
                        session.getTransaction().commit();
                        return category;
                } catch (NoResultException e) {
                        System.err.println(e.getMessage());
                        return new Category();
                }
        }
        
        public Category searchCategory(String name) {
                session.beginTransaction();
                Query<Category> query = session.createQuery("FROM Category WHERE name =: name", Category.class);
                query.setParameter("name", name);
                try {
                        Category category = query.getSingleResult();
                        session.getTransaction().commit();
                        return category;
                } catch (NoResultException e) {
                        System.err.println("No results found");
                        return new Category();
                }
        }
        
        public Boolean findCategory(String name) {
                boolean found = false;
                try {
                        session.beginTransaction();
                        String query = "FROM Category WHERE name = '" + name + "'";
                        List<Category> categories = session.createQuery(query).list();
                        for (Category tempCategory : categories) {
                                if (tempCategory.getName().equals(name)) {
                                        found = true;
                                        break;
                                }
                        }
                        session.getTransaction().commit();
                } catch (HibernateException e) {
                        System.err.println("Unregistered category");
                        System.err.println(e.getMessage());
                }
                return found;
        }
}
