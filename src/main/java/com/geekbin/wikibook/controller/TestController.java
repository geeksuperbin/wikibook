package com.geekbin.wikibook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*
        /user?id=1
        等价于
        /user/1
     */
    @GetMapping("/hello")
    public  String hello(){
        return "Hello World";
    }
}
