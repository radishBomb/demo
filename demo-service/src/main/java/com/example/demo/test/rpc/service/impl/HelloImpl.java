package com.example.demo.test.rpc.service.impl;

import com.example.demo.test.rpc.service.IHello;

/**
 * @author luojun
 * @date 2020-5-1311:02
 */
public class HelloImpl implements IHello {
    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }
}
