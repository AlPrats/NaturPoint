/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author alber
 */
public class HibernateUtils {
        
        private static Session session;
        public static Session  openConnection(){
                 if (session==null){
                        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
                        final SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                        session = factory.openSession();
                 }
                 return session;
        }
        
        public static void closeConnection(){
                session.close();
                session=null;
        }
}
