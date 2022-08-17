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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author alber
 */
@Entity
@Table(name = "order_details")
public class OrderDetails {
        @Id
        @Column(name = "order_details_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @ManyToOne
        @JoinColumn(name = "product_id")
        private Product product;
        @ManyToOne
        @JoinColumn(name = "order_id")
        private Order order;
        @Column(name = "quantity")
        private int quantity;
        @Column(name = "price")
        private double price;
        @Column(name = "subTotal")
        private double subTotal;
        
        public OrderDetails() {
        }

        public OrderDetails(Product product, Order order, int quantity, double price, double subTotal) {
                this.product = product;
                this.order = order;
                this.quantity = quantity;
                this.price = price;
                this.subTotal = subTotal;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Product getProduct() {
                return product;
        }

        public void setProduct(Product product) {
                this.product = product;
        }

        public Order getOrder() {
                return order;
        }

        public void setOrder(Order order) {
                this.order = order;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public double getSubTotal() {
                return subTotal;
        }

        public void setSubTotal(double subTotal) {
                this.subTotal = subTotal;
        }                     
}
