package de.mse.microservices.controllers;

import de.mse.microservices.services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservices")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("get")
    public String get(){
        return this.service.get();
    }

    @PostMapping("post")
    public String post(){
        return this.service.post();
    }
}
