package com.questionpro.assessment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qpassessment")
public class AddItemsController {

    @PostMapping("/items")
    void addItem(){

    }
}
