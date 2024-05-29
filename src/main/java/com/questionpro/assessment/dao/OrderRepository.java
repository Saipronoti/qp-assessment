package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.GroceryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<GroceryOrder,Integer> {
}
