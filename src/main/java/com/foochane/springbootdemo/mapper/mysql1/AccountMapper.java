package com.foochane.springbootdemo.mapper.mysql1;


import com.foochane.springbootdemo.entity.mysql1.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AccountMapper {

	/**
	 * 查询所有
	 */
	List<Account> getAccountList();
}
