package com.example.shiro01.controller;

import com.example.shiro01.entity.User;
import com.example.shiro01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户查询
     * @return
     */
    @GetMapping("/list")
    public String userlist() {
        System.out.println("list");
        return "user/list";
    }

    /**
     * 增加、修改用户信息
     * @return
     */
    @GetMapping("/add")
    public String userAdd(User user) {
        System.out.println("add " + user);
        return "user/add";
    }

    /**
     * 删除用户
     * @return
     */
    @GetMapping("/delete")
    public String userDel() {
        System.out.println("delete");
        return "user/delete";
    }

}
