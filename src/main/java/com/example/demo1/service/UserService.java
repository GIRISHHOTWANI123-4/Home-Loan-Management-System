package com.example.demo1.service;

import com.example.demo1.domain.User;
import com.example.demo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public void addUser(User user){
       userRepository.save(user);
    }
}
