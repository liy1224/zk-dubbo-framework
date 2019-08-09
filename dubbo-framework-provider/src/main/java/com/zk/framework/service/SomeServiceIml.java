package com.zk.framework.service;

import com.zk.framework.service.api.SomeService;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceIml implements SomeService {

    @Override
    public String hello(String name){
        System.out.println(name+"我的提供者");
        return "providerV## Hello Dubbo world!"+name;
    }
}
