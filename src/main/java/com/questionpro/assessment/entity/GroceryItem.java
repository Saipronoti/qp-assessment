package com.questionpro.assessment.entity;

public class GroceryItem {
    private String groceryItemId;
    private String name;
    private double price;
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
