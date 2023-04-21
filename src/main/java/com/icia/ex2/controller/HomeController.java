package com.icia.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/")
        public String index(){
        return "index";
    }

    @GetMapping("/Hello1")
    public String Hello1(){
    return "Hello1";
    }
    @GetMapping("/Hello2")
    public String Hello2(){
    return "Hello2";
    }

    @GetMapping("/hello-param1")
    public String reqParam1(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("name + = " + name + ", age =" + age);
        return "index";
        }



}
