package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index2() {
        return "index2";
    }
}
