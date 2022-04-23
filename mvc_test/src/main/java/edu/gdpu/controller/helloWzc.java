package edu.gdpu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class helloWzc {
    @RequestMapping("/wzc")
    public String hello1(Model model) {
        model.addAttribute("msg", "hello wzc,welcome to springmvc!");
        return "wzc";
    }
}
