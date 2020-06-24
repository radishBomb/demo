package com.example.radish.entity;

import lombok.Data;

/**
 * @author luojun
 * @date 2020-6-2314:21
 */

@Data
public class User {
    private Integer age;

    public boolean test(){
        System.out.println("调用函数");
        return  true;
    }
}
