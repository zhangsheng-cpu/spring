package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 过往云烟~
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/dologin")
    public String login(String name, HttpSession session) {
        if ("admin".equals(name)) {
            System.out.println("asdadad");
            session.setAttribute("username", name);
            return "index";
        } else {
            return "redirect:login";
        }
    }

}
