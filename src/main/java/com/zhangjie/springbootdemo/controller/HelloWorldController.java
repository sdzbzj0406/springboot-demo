package com.zhangjie.springbootdemo.controller;

import com.zhangjie.springbootdemo.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

/**
 * controller
 * @author jason
 */
@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @Autowired
    private helloService helloService;

    @GetMapping("world")
    @ResponseBody
    public String helloWorld(@PathParam("name") String name){
        return helloService.sayHello(name);
    }
}
