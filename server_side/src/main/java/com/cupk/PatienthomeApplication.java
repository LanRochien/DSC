package com.cupk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.cupk.*")
@SpringBootApplication
public class PatienthomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatienthomeApplication.class, args);
    }

}
