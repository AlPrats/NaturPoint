/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alber
 */
@Entity
@Table(name = "users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "name")
        private String name;
        @Column(name = "surnames")
        private String surnames;
        @Column(name = "username")
        private String username;
        @Column(name = "password")
        private String password;
        @Column(name = "email")
        private String email;
        @Column(name = "phone")
        private String phone;

        public User() {
        }

        public User(int id, String name, String surnames, String username, String password, String email, String phone) {
                this.id = id;
                this.name = name;
                this.surnames = surnames;
                this.username = username;
                this.password = password;
                this.email = email;
                this.phone = phone;
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

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
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
        
        
}
