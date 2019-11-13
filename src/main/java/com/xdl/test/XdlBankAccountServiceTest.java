package com.xdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xdl.service.XdlBankAccountService;

public class XdlBankAccountServiceTest {

	public static void main(String[] args) {
		ApplicationContext  app  = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
        XdlBankAccountService bankService =  app.getBean("bankService",
        	XdlBankAccountService.class);
        System.out.println(bankService.login("marz", "1234"));
	}

}
