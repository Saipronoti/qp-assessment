package com.questionpro.assessment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="inventoryItems")
public class InventoryItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private String itemId;
    @Column(name="item_name")
    private String name;
    @Column(name="item_price")
    private double price;
    @Column(name="item_count")
    private int availableItemCount;

    public InventoryItems() {
    }

    public InventoryItems(String itemId, String name, double price, int availableItemCount) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.availableItemCount = availableItemCount;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
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
