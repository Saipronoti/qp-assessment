package com.questionpro.assessment.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="groceryOrders")
public class GroceryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderId;
    @Column(name="total_price")
    private double totalPrice;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @OneToMany(mappedBy="groceryOrder",cascade = CascadeType.ALL)
    //@JoinColumn(name = "order_id")
    //@JsonManagedReference
    private List<OrderItems> orderItems = new ArrayList<>();

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public GroceryOrder(int orderId, double totalPrice, List<OrderItems> orderItems) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
    }

    public GroceryOrder() {
        this(0, 0.0, new ArrayList<>());
    }

    //need to add something like this to decrease count of items in DB
    /*SELECT column1
    FROM table_name
    WHERE column_name <= value;
    //check if requested count is lesser than or equal to one in db
    //UPDATE
    // table_name
    //SET
    // column_name = column_name - ITEMcountrequested
    //WHERE
    // condition;*/
}
