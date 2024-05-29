package com.questionpro.assessment.service;

import com.questionpro.assessment.dao.OrderItemsRepository;
import com.questionpro.assessment.dao.OrderRepository;
import com.questionpro.assessment.entity.GroceryOrder;
import com.questionpro.assessment.entity.OrderItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl  implements  OrderService{

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @Override
    public GroceryOrder createOrder(List<OrderItems> orderItems) {
        System.out.println("inside create order service " + orderItems);
        GroceryOrder groceryOrder=new GroceryOrder();
        groceryOrder.setOrderItems(orderItems);
        orderRepo.save(groceryOrder);
        return groceryOrder;
    }


}
