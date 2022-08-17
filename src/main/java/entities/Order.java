/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alber
 */
@Entity
@Table(name = "orders")
public class Order {
        @Id
        //@Column(name = "order_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "date_order")
        private Date dateOrder;
        @Column(name = "total")
        private double total;
        @ManyToOne
        private Customer customer;
        @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
        private Set<OrderDetails> orderDetails = new HashSet<>();

        public Order() {
        }

        public Order(Date dateOrder, double total, Customer customer) {
                this.dateOrder = dateOrder;
                this.total = total;
                this.customer = customer;
        }
        
        public Order(int id, Date dateOrder, Customer customer) {
                this.id = id;
                this.dateOrder = dateOrder;
                this.total = total;
                this.customer = customer;
        }

        public Order(int id, Date dateOrder, double total, Customer customer) {
                this.id = id;
                this.dateOrder = dateOrder;
                this.total = total;
                this.customer = customer;
        }
        
        

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Date getDateOrder() {
                return dateOrder;
        }

        public void setDateOrder(Date dateOrder) {
                this.dateOrder = dateOrder;
        }

        public double getTotal() {
                return total;
        }

        public void setTotal(double total) {
                this.total = total;
        }

        public Customer getCustomer() {
                return customer;
        }

        public void setCustomer(Customer customer) {
                this.customer = customer;
        }

        public Set<OrderDetails> getOrderDetails() {
                return orderDetails;
        }

        public void setOrderDetails(Set<OrderDetails> orderDetails) {
                this.orderDetails = orderDetails;
        }        
}
