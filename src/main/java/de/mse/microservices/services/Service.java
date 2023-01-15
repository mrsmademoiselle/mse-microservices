package de.mse.microservices.services;

@org.springframework.stereotype.Service
public class Service {
    public String get(){
        return "get successful";
    }

    public String post(){
        return "post successful";
    }
}
