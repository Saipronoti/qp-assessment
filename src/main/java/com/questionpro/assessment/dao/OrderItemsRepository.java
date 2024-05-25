package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.OrderItemKey;
import com.questionpro.assessment.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems, OrderItemKey> {
}
