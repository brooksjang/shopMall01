package com.shopmall.gmall.usermange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.shopmall.gmall.usermange.mapper")
public class GamllUsermangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllUsermangeApplication.class, args);
    }

}

