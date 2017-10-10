package com.example.shiro01.service.impl;

import com.example.shiro01.entity.User;
import com.example.shiro01.repository.UserRepository;
import com.example.shiro01.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void findByUsername() throws Exception {
        User user = userService.findByUsername("admin");
        Assert.assertEquals(new String("admin"), user.getUsername());
    }

}