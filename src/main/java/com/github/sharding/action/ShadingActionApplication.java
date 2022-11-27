package com.github.sharding.action;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.sharding.action.dao")
public class ShadingActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadingActionApplication.class, args);
    }
}
