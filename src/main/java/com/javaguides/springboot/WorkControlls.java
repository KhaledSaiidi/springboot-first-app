package com.javaguides.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkControlls {
    @GetMapping("/heloo")
    public String GotoString(){
        return "Hi I Am Git Addict";
    }
}

