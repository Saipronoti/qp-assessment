package com.questionpro.assessment.controller;


import com.questionpro.assessment.entity.GroceryOrder;
import com.questionpro.assessment.entity.InventoryItems;
import com.questionpro.assessment.entity.OrderItems;
import com.questionpro.assessment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qp/grocery")
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<InventoryItems> findAll(){
         System.out.println("in get order ");
        return null;
    }


     @RequestMapping(value="/orders",method = RequestMethod.POST)
     public ResponseEntity<GroceryOrder> addEmployee(@RequestBody List<OrderItems> orderItems)  {
        System.out.println("REQUEST BODY " + orderItems);
        return new ResponseEntity<>(orderService.createOrder(orderItems), HttpStatus.OK);
    }
}


