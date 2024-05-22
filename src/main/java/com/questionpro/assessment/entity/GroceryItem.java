package com.questionpro.assessment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="item")
public class GroceryItem {
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

    public int getAvailableCount() {
        return 0;
    }

    public int updateAvailableCount() {
        return 0;
    }

    public boolean updatePrice(double newPrice) {
        return false;
    }
}
