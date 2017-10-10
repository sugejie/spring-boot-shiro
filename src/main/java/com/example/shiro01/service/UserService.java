package com.example.shiro01.service;

import com.example.shiro01.entity.User;

public interface UserService {
    public User findByUsername(String username);
}
