package com.example.seckilldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoTestController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name","example");
        return "hello";
    }
}