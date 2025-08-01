package com.kiamisa.store.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController{
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}