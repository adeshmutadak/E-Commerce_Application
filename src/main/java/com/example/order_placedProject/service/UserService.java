package com.example.order_placedProject.service;

import com.example.order_placedProject.repositiries.IUser;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUser userRepository;


    public User createUser(User users) {
        return userRepository.save(users);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }
}