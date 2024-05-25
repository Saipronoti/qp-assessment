package com.questionpro.assessment.entity;

import jakarta.persistence.*;

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


    @OneToMany//(mappedBy="order_id",cascade = CascadeType.ALL)
    //@JoinColumn(name = "order_id")
    private List<OrderItems> orderItems;

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
