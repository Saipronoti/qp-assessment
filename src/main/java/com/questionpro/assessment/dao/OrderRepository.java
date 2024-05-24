package com.questionpro.assessment.dao;

import com.questionpro.assessment.entity.Item;
import com.questionpro.assessment.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="orders")
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
