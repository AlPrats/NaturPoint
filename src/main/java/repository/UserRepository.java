/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author alber
 */
public class UserRepository implements Repository<User>{
        final Session session;
        
        public UserRepository() {
                this.session = HibernateUtils.openConnection();
        }

        @Override
        public void create(User user) {
                session.beginTransaction();
                try {
                        session.save(user);
                        session.getTransaction().commit();
                        System.out.println("User created");
                } catch (Exception e) {
                        System.err.println(e.getMessage());
                        session.getTransaction().rollback();
                        System.out.println("Error creating user");
                }
        }

        @Override
        public List<User> readAll() {
                session.beginTransaction();
                Query<User> query = session.createQuery("FROM User", User.class);
                List<User> users = query.getResultList();
                session.getTransaction().commit();
                return users;
        }

        @Override
        public void updateById(int id, User t) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void update(User t) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public User findOneById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
}
