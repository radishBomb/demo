package com.example.demo.test.rpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author luojun
 * @date 2020-5-1311:04
 */
public class ProxyFactory {

    @SuppressWarnings("unchecked")
    public static <T> T create(Class<T> c, String ip, int port) {

        InvocationHandler handler = new RpcProxy(ip, port, c);

        return (T) Proxy.newProxyInstance(c.getClassLoader(),new Class[] {c},handler);
    }
}