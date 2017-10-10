package com.example.shiro01.service.impl;

import com.example.shiro01.entity.User;
import com.example.shiro01.repository.UserRepository;
import com.example.shiro01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
