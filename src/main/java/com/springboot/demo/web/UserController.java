package com.springboot.demo.web;

import com.springboot.demo.domain.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list/all")
    public List<User> listAll() {
        return userService.listAll();
    }
}