package com.theBridge.theBridge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("theBridge")
public class HomeController {


//    @GetMapping
//    @ResponseBody
//    public String hello(){
//        return "Hello";
//
//    }


    @GetMapping()
    public String displayHomePage(){
        return "homepage";
    }
}
