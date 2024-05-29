package com.questionpro.assessment.service;

import com.questionpro.assessment.entity.GroceryOrder;
import com.questionpro.assessment.entity.OrderItems;

import java.util.List;

public interface OrderService  {

    GroceryOrder createOrder(List<OrderItems> orderItems);
}
