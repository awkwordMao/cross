package com.jl.cross.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {

    @RequestMapping("/")
    public String init(){
        return "login";
    }

    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }
}
