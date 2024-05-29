package com.questionpro.assessment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="orderItems")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_item_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", insertable=false, updatable=false)
    @JsonIgnore
    GroceryOrder groceryOrder;

    @ManyToOne
    @JoinColumn(name = "item_id", insertable=false, updatable=false)
    InventoryItems inventoryItem;
    @Column(name="order_id")
    int order_id;

    @Column(name="item_id")
    @JsonIgnore
    int item_id;
    @Column(name="item_quantity")
    int item_quantity;


    public InventoryItems getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItems inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

   public GroceryOrder getGroceryOrder() {
        return groceryOrder;
    }

    public void setGroceryOrder(GroceryOrder groceryOrder) {
        this.groceryOrder = groceryOrder;
    }

    public int getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(int order_item_id) {
        this.order_item_id = order_item_id;
    }

    public int getOrder_id() {
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
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public OrderItems(int order_item_id, GroceryOrder groceryOrder, InventoryItems inventoryItem, int item_quantity) {
        this.order_item_id = order_item_id;
        this.groceryOrder = groceryOrder;
        this.inventoryItem = inventoryItem;
        this.item_quantity = item_quantity;
    }

    public OrderItems() {
        this(0, new GroceryOrder(), new InventoryItems(), 0);
    }

}
