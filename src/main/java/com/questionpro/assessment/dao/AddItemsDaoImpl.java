package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.GroceryItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddItemsDaoImpl implements ItemDAO{
    @Override
    public List<GroceryItem> findAll() {
        return null;
    }

    @Override
    public GroceryItem findById(int theId) {
        return null;
    }

    @Override
    public GroceryItem save(GroceryItem theEmployee) {
        return null;
    }

    @Override
    public GroceryItem update(GroceryItem theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
