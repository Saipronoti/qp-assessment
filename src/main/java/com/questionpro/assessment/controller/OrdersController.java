package com.questionpro.assessment.controller;


import com.questionpro.assessment.entity.GroceryOrder;
import com.questionpro.assessment.entity.OrderItems;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qp-assessment")
public class OrdersController {
     /*@GetMapping("/items")
    public List<Item> findAll(){
        return itemRepository.findAll();
    }*/


    @PostMapping("/order")
    public GroceryOrder addEmployee(@RequestBody OrderItems orderItems){
        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of  new item  instead of update
       // theEmployee.setId(0);
        return null;
        //return employeeService.save(theEmployee);
    }
}


