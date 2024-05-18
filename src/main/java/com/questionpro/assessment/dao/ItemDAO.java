package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.GroceryItem;

import java.util.List;

public interface ItemDAO {
    List<GroceryItem> findAll();
    GroceryItem findById(int theId);
    GroceryItem save(GroceryItem theEmployee);
    GroceryItem update(GroceryItem theEmployee);

    void deleteById(int theId);
}
