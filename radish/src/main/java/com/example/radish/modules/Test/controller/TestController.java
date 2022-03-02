package com.example.radish.modules.Test.controller;

import com.example.radish.entity.User;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luojun
 * @date 2020-6-2314:31
 */
@RestController
public class TestController {

    @Autowired
    private KieSession kieSession;

    @GetMapping("/ruleUser")
    public void test(){
        // 以下的数据可以从数据库来，这里写死了
        User user = new User();
        user.setAge(11);
        // 使用规则引擎
        kieSession.insert(user);
        int ruleFiredCount = kieSession.fireAllRules();
        System.out.println("触发了" + ruleFiredCount + "条规则");
        System.out.println("---------------------------------1");
    }
}
