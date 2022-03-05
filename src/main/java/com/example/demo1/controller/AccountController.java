package com.example.demo1.controller;

import com.example.demo1.domain.Account;
import com.example.demo1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {


    @Autowired
    public AccountService accountService;

    @PostMapping(value="/addaccount")
    public String addAccount(@RequestBody Account account){

        accountService.addAccount(account);
        return "Account added";
    }

 }
