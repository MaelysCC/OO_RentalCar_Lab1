package com.example.RentalCarLab1;

import org.springframework.web.bind.annotation.GetMapping;
 
public class HelloService {  
    @GetMapping("/") 
    public String hello() {   
        return "hello";  
    }  
}