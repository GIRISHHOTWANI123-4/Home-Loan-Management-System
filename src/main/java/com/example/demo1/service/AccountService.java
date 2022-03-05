package com.example.demo1.service;

import com.example.demo1.domain.Account;
import com.example.demo1.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    public AccountRepository accountRepository;

    public void addAccount(Account account)
    {
        accountRepository.save(account);
    }

}
