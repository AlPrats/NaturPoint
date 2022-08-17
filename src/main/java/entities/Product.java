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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alber
 */
@Entity
@Table(name = "products")
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "name")
        private String name ;
        @Column(name = "description")
        private String description ;
        @Column(name = "price")
        private double price;
        @Column(name = "quantity")
        private int quantity;
        @Lob
        @Column(name = "picture")
        private byte[] picture;
        @ManyToOne
        private Category category;
        @OneToMany(mappedBy = "product")
        private Set<OrderDetails> orderDetails = new HashSet<>();

        public Product() {
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

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public byte[] getPicture() {
                return picture;
        }

        public void setPicture(byte[] picture) {
                this.picture = picture;
        }

        public Category getCategory() {
                return category;
        }

        public void setCategory(Category category) {
                this.category = category;
        }

        public Set<OrderDetails> getOrderDetails() {
                return orderDetails;
        }

        public void setOrderDetails(Set<OrderDetails> orderDetails) {
                this.orderDetails = orderDetails;
        }
}
