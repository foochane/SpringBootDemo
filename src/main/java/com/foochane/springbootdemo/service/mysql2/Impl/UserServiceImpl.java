package com.foochane.springbootdemo.service.mysql2.Impl;


import com.foochane.springbootdemo.entity.mysql2.User;
import com.foochane.springbootdemo.mapper.mysql2.UserMapper;
import com.foochane.springbootdemo.service.mysql2.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
