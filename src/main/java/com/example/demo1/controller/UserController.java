package com.example.demo1.controller;


import com.example.demo1.domain.User;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping(value = "/adduser")
    public void addUser(@RequestBody User user){
        System.out.println("inside adduser method");
        userService.addUser(user);
    }

    @GetMapping(value ="/details" )
    public String getDetails(){
        return "Details returned";
    }
}
