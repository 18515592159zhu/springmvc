package com.zcf.test;

import com.zcf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccountService {

    @Test
    public void run() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        // 调用方法
        accountService.findAll();
    }
}
