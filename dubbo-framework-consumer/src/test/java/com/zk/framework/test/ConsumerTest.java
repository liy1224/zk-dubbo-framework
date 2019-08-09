package com.zk.framework.test;

import com.zk.framework.service.api.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String [] arg) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-consumer.xml");

        // 启用spring容器
        SomeService service = (SomeService) applicationContext.getBean("someService");
        String name = service.hello("china");
        System.out.println(name);
    }
}
