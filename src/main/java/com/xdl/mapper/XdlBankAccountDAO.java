package com.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import com.xdl.bean.XdlBankAccount;

public interface XdlBankAccountDAO {
     XdlBankAccount   findAccountByAccNoAndAccPassword(
    	 @Param("no")String  no,
    	 @Param("password")String password);
}
