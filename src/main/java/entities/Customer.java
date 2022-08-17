/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alber
 */
@Entity
@Table(name = "customers")
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "name")
        private String name;
        @Column(name = "surnames")
        private String surnames;
        @Column(name = "email")
        private String email;
        @Column(name = "phone")
        private String phone;
        @OneToMany(mappedBy = "customer")
        private Set<Order> orders = new HashSet<>();

        public Customer() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurnames() {
                return surnames;
        }

        public void setSurnames(String surnames) {
                this.surnames = surnames;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public Set<Order> getOrders() {
                return orders;
        }

        public void setOrders(Set<Order> orders) {
                this.orders = orders;
        }               
}
