package com.questionpro.assessment.entity;

import java.util.List;

public class Order {

        private int totalPrice;
        private List<GroceryItem> items;

    public boolean addItem(GroceryItem item) {
        return false;
    }

    public boolean removeItem(GroceryItem item) {
        return false;
    }

    public List<GroceryItem> getItems() {
        return null;
    }
}
