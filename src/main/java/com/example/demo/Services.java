package com.example.demo;

import org.springframework.stereotype.Service;

// Los servicios realizan operaciones específicas y son llamados desde los controladores

@Service
public class Services {

    public String getGreeting() {
        return "Hello from the service";
    }
}
