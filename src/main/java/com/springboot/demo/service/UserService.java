package com.springboot.demo.service;

import com.springboot.demo.domain.User;
import com.springboot.demo.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    protected UserMapper userMapper;

    public List<User> listAll() {
        return userMapper.selectAll();
    }
}
