package com.example.demo.test;

import com.example.demo.test.rpc.StartUp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoServiceApplication.class, args);
        applicationContext.getBean(StartUp.class).exportRpc();
    }

}
