package com.example.devsecops1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }

    @GetMapping("/car")
    public Car getCar(){
        return new Car("Porsche", 2000);
    }

}
