package com.foochane.springbootdemo.service.hive;

import com.foochane.springbootdemo.entity.hive.Hobby;

import java.util.List;

public interface HiveService {

    /**
     * 查询hive连接库中所有表 select * from hobbies_classify
     * @return
     */
    List<String> listAllTablesa();

    List<Hobby> getHobbyList();
}
