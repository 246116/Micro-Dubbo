package com.example.service;

import com.example.Entity.User;
import com.example.Interface.UserInterface;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserService implements UserInterface {

    @Override
    public User queryUserById(String id) {
        return new User("1", "zhangsan");
    }
}
