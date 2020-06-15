package com.example.demodubboclient.service.impl;

import com.example.demo.test.rpc.service.IndexService;
import com.example.demodubboclient.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author luojun
 * @date 2020-6-1217:19
 */
@Service
public class TestServiceImpl implements TestService {

    @Reference(check=false)
    private IndexService indexService;


    @Override
    public String index(String message) {
        return  indexService.index("1212");
    }
}
