package com.getstarted.javademo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome ... API is working..";
    }
}
