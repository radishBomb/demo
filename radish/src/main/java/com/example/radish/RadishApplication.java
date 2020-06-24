package com.example.radish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.radish") //扫描dao
public class RadishApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadishApplication.class, args);
    }

}
