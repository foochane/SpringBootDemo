package com.foochane.springbootdemo.service.mysql2;



import com.foochane.springbootdemo.entity.mysql2.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户信息
     */
    List<User> getUserList();
}
