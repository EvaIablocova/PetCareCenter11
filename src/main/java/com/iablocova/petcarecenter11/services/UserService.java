package com.iablocova.petcarecenter11.services;

import com.iablocova.petcarecenter11.models.User;
import com.iablocova.petcarecenter11.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

