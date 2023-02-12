package com.example.demo.ab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test/{name}")
    public String testHello(@PathVariable("name") String name){
        return "hello,world "+name;
    }
}
