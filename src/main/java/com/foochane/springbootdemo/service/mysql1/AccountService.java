package com.foochane.springbootdemo.service.mysql1;



import com.foochane.springbootdemo.entity.mysql1.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有
     */
    List<Account> getAccountList();
}
