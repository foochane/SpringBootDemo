package com.foochane.springbootdemo.mapper.mysql2;


import com.foochane.springbootdemo.entity.mysql2.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     */
    List<User> getUserList();
}
