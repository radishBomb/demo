package com.example.demodubboclient.controller;

import com.example.demodubboclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luojun
 * @date 2020-6-1217:21
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping
    @RequestMapping("/test")
    public String index(){
        return testService.index("12121");
    }
}
