package com.nest.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }

    @GetMapping("/contact")
    public  String Contactpage(){
        return "welcome to contact page";
    }

    @GetMapping("/galary")
    public String Galarypage()
    {
        return "welcome to galary page";
    }
}
