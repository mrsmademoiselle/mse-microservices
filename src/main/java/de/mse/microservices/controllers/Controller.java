package de.mse.microservices.controllers;

import de.mse.microservices.services.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("microservices")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @ApiOperation(value = "Replies to a get operation",
            response = String.class,
            notes = "Always returns the same string")
    @GetMapping("get")
    public String get(){
        return this.service.get();
    }

    @ApiOperation(value = "Replies to a post operation",
            response = String.class,
            notes = "Always returns the same string")
    @PostMapping("post")
    public String post(){
        return this.service.post();
    }

    @ApiOperation(value = "Replies to a get/id", notes = "Only returns 'hi' when id is 3, otherwise 404")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = String.class),
            @ApiResponse(code = 404, message = "ID not found"),})
    @GetMapping("get/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") int id){
        if (id == 3){
            return ResponseEntity.ok("hi");
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "id not found"
            );        }
    }
}
