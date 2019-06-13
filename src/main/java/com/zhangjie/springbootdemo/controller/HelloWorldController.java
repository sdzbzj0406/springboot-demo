package com.zhangjie.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller
 * @author jason
 */
@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping("world")
    @ResponseBody
    public String helloWorld(){
        return "hello world";
    }
}
