package com.questionpro.assessment.controller;


import com.questionpro.assessment.dao.OrderRepository;
import com.questionpro.assessment.entity.GroceryOrder;
import com.questionpro.assessment.entity.InventoryItems;
import com.questionpro.assessment.entity.OrderItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qp/grocery")
public class OrdersController {
    @Autowired
    private OrderRepository orderRepo;
     @GetMapping("/orders")
    public List<InventoryItems> findAll(){
         System.out.println("in get order ");
        return null;
    }


     //@PostMapping(value = "/orders", consumes = {"*/*"})
  //  @RequestMapping(consumes = "application/json", produces = "application/json",method = RequestMethod.POST)
    @RequestMapping(value = "/orders",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            method=RequestMethod.POST)
    public ResponseEntity<GroceryOrder> addEmployee(@RequestBody GroceryOrder groceryOrder){
        System.out.println("REQUEST BODY " + groceryOrder);
        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of  new item  instead of update
       // theEmployee.setId(0);
        //return null;
        //return employeeService.save(theEmployee);
        return new ResponseEntity<>(orderRepo.save(groceryOrder), HttpStatus.OK);
    }
}


