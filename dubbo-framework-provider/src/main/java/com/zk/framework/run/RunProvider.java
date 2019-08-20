package com.zk.framework.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

import java.io.IOException;

public class RunProvider {

    public static void main(String [] args) throws IOException {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-provider.xml");

        // 启用spring容器
        ((ClassPathXmlApplicationContext) applicationContext).start();

        //使用主线程
        System.in.read();*/


        Main.main(args);
    }
}
