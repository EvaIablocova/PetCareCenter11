package com.iablocova.petcarecenter11.BL.services;

import com.iablocova.petcarecenter11.Db.models.User;
import com.iablocova.petcarecenter11.Db.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository){this.userRepository = userRepository;}

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

