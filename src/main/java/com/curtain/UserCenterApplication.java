package com.curtain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot 入口函数
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.curtain.dao")
public class UserCenterApplication {
    public static void main(String[] args){
        SpringApplication.run(UserCenterApplication.class,args);
    }
}
