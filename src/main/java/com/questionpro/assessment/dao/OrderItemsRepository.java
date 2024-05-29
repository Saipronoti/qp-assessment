package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer> {
}
