package com.wx_hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.jz.mapper")
//@EnableAsync//开启异步注解功能
@EnableScheduling
public class Jz_12Application {

    public static void main(String[] args) {
        SpringApplication.run(Jz_12Application.class, args);
    }

}
