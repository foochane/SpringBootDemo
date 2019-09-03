package com.foochane.springbootdemo.controller.mysql1;


import com.foochane.springbootdemo.entity.mysql1.Account;
import com.foochane.springbootdemo.service.mysql1.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * test 数据库 Controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accountList")
    @ResponseBody
    public List<Account> teest() {
        List<Account> accounts = accountService.getAccountList();
        return accounts;
    }
}
