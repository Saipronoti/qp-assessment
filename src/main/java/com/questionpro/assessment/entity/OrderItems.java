package com.questionpro.assessment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="orderItems")
public class OrderItems {

    @EmbeddedId
    private OrderItemKey orderItemKey;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable =  false, updatable = false)
    GroceryOrder groceryOrder;


    /*@Column(name="order_id", insertable=false, updatable=false)
    int order_id;

    @Column(name="item_id")
    int item_id;*/
    @Column(name="item_quantity")
    int item_quantity;

    public GroceryOrder getGroceryOrder() {
        return groceryOrder;
    }

    public void setGroceryOrder(GroceryOrder groceryOrder) {
        this.groceryOrder = groceryOrder;
    }

   /* public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }*/

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }
}
