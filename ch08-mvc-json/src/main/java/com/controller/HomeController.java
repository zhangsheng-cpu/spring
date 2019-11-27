package com.controller;


import com.entity.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public EmpVO list() {
        EmpVO ov = new EmpVO(1,"aaa", new Date());
        return ov;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public EmpVO insert(@RequestBody EmpVO empVO) {
        System.out.println("empVO = " + empVO);
        EmpVO result = new EmpVO(1,"server", new Date());
        System.out.println(result);
        return result;
    }

    @RequestMapping("/insert2")
    @ResponseBody
    public EmpVO insert2(EmpVO empVO) {
        System.out.println("empVO = " + empVO);
        EmpVO vo = new EmpVO(2, "server2", new Date());
        return vo;
    }
}
