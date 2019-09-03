package com.foochane.springbootdemo.service.mysql1.Impl;


import com.foochane.springbootdemo.entity.mysql1.Account;
import com.foochane.springbootdemo.mapper.mysql1.AccountMapper;
import com.foochane.springbootdemo.service.mysql1.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<Account> getAccountList() {
        return accountMapper.getAccountList();
    }
}
