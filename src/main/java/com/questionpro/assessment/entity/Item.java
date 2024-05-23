package com.questionpro.assessment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="groceryitems")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String groceryItemId;
    @Column(name="item_name")
    private String name;
    @Column(name="item_price")
    private double price;
    @Column(name="item_count")
    private int availableItemCount;

    public Item() {
    }

    public Item(String groceryItemId, String name, double price, int availableItemCount) {
        this.groceryItemId = groceryItemId;
        this.name = name;
        this.price = price;
        this.availableItemCount = availableItemCount;
    }

    public String getGroceryItemId() {
        return groceryItemId;
    }

    public void setGroceryItemId(String groceryItemId) {
        this.groceryItemId = groceryItemId;
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
