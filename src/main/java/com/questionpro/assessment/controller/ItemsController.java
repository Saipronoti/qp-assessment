/*package com.questionpro.assessment.controller;

//import com.questionpro.assessment.entity.GroceryItem;
import com.questionpro.assessment.dao.ItemRepository;
import com.questionpro.assessment.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qpassessment")
public class ItemsController {


    private ItemRepository itemRepository;

    public ItemsController (ItemRepository theEmployeeDAO) {
        itemRepository = theEmployeeDAO;
    }
    /*@PostMapping("/items")
    Item addItem(@RequestBody Item theGroceryItem){

    }*/
    /*@GetMapping("/items")
    public List<Item> findAll(){
        return itemRepository.findAll();
    }*/


   /* @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of  new item  instead of update
        theEmployee.setId(0);
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        return employeeService.save(theEmployee);
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee=employeeService.findById(employeeId);

        if(tempEmployee==null){
            throw new RuntimeException("Employee id not found "+employeeId);
        }
        return "Deleted employee id -"+employeeId;
    }

    @PutMapping("/items")
    void update(){

    }
    //when updating item we give id in body correct one and then change the name,price etc
    // create table items(ID int NOT NULL,Name NOT NULL, DOUBLE PRICE NOT NULL,INT COUNT DEFAULT 0, PRIMARY KEY (ID))
    //once item is created we can update using PUT only name,price or count.
    // good to have:
    // if admin uses POST to add item already exisitng in DB we return error, item already exisits


    @RestController
    @RequestMapping("/qpassessment")
    public class DeleteItemsController {

        @DeleteMapping("/items")
        void removeItem(){

        }
    }
    @RestController
    @RequestMapping("/qpassessment")
    public class ViewItemsController {

        @GetMapping("/items")
        void view(){

        }
    }
}*/
