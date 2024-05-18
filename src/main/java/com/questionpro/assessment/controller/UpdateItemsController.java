package com.questionpro.assessment.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qpassessment")
public class UpdateItemsController {

    @PutMapping("/items")
    void update(){

    }
}
