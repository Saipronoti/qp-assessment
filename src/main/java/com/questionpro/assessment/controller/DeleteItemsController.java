package com.questionpro.assessment.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qpassessment")
public class DeleteItemsController {

    @DeleteMapping("/items")
    void removeItem(){

    }
}
