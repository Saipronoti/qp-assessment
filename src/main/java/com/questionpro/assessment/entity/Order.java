package com.questionpro.assessment.entity;

import java.util.List;

public class Order {

        private int totalPrice;
        private List<Item> items;

    public boolean addItem(Item item) {
        return false;
    }

    public boolean removeItem(Item item) {
        return false;
    }

    public List<Item> getItems() {
        return null;
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
