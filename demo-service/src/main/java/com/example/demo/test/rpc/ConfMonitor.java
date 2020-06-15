package com.example.demo.test.rpc;

import com.example.demo.test.rpc.service.impl.HelloImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luojun
 * @date 2020-5-1311:00
 */
public class ConfMonitor {
    @SuppressWarnings("rawtypes")
    public static Map<String, Class> conf = new HashMap<String, Class>();

    static {
        conf.put("com.example.demo.test.rpc.service.IHello", HelloImpl.class);
    }
}