package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//GESTIONAN LAS SOLICITUDES HTTP Y DEFINEN LAS ACCIONES A REALIZAR

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello () {
        return "Hello, this is a test";
    }
}
