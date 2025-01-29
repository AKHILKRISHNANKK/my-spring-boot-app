package com.mycompany.my_spring_boot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/health")
    public String health(){
        return "Working fine";
    }



}
