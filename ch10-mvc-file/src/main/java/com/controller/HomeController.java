package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.MultipartConfig;

@Controller
//@MultipartConfig
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
