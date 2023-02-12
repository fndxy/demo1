package com.example.demo;

import com.example.demo.ab.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Demo1Application.class, args);
        TestController bean = run.getBean(TestController.class);
        System.out.println(bean.testHello(""));
    }

}
