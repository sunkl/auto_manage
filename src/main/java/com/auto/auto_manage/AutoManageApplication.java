package com.auto.auto_manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.auto.auto_manage.mapping")
@SpringBootApplication
public class AutoManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoManageApplication.class, args);
    }
}
