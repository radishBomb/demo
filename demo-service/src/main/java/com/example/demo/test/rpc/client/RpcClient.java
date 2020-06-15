package com.example.demo.test.rpc.client;

import com.example.demo.test.rpc.service.IHello;

/**
 * @author luojun
 * @date 2020-5-1311:06
 */
public class RpcClient {
    public static void main(String[] args) {

        String ip = "localhost";
        int port = 9001;

        IHello hello = ProxyFactory.create(IHello.class, ip, port);

        System.out.println(hello.sayHello("小明"));

    }
}
