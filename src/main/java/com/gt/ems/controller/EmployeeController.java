package com.gt.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ems")
public class EmployeeController {
     @GetMapping("/hello")
    public  String index(){
        return "Hello World!";
    }

}

// http://localhost:9090/api/ems/hello GET