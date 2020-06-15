package com.example.demo.service.impl;

import com.example.demo.test.rpc.service.IndexService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author luojun
 * @date 2020-6-1216:38
 */
@Service
@Component
public class IndexServiceImpl implements IndexService {

    @Override
    public String index(String message) {
        System.out.println(message);
        return message+"-yes";
    }

}
