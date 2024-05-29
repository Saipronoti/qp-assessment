package com.questionpro.assessment.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="inventoryItems")
public class InventoryItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private int itemId;
    @Column(name="item_name")
    private String name;
    @Column(name="item_price")
    private double price;
    @Column(name="item_count")
    private int availableItemCount;

    @OneToMany(mappedBy="inventoryItem", cascade = CascadeType.ALL)
    List<OrderItems> orderItems = new ArrayList<>();


    public InventoryItems(int itemId, String name, double price, int availableItemCount,
                          List<OrderItems> orderItems) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.availableItemCount = availableItemCount;
        this.orderItems = orderItems;
    }

    public InventoryItems() {
        this(0,"", 0.0, 0, new ArrayList<>());
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableItemCount() {
        return availableItemCount;
    }

    public void setAvailableItemCount(int availableItemCount) {
        this.availableItemCount = availableItemCount;
    }
}
