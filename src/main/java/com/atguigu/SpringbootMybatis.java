package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
 @MapperScan("com.atguigu.**.dao") //扫描dao接口，创建代理对象
@EnableTransactionManagement //启动事务声明
@SpringBootApplication
public class SpringbootMybatis {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis.class, args);
        System.out.println("1111111");
    }
}
