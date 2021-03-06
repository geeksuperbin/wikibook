package com.geekbin.wikibook.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private  String testHello;


    /*
        /user?id=1
        等价于
        /user/1
     */
    @GetMapping("/hello")
    public  String hello(){
        return "Hello World";
    }


    @PostMapping("/hello/post")
    public  String helloPost(String name) {

        return "Hello Worlo ! Post, " + name + testHello;
    }


}
