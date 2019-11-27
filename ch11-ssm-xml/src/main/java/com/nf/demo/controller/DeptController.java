package com.nf.demo.controller;

import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 过往云烟~
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public String list() {
        return "/dept/list";
    }

    @RequestMapping("/delete")
    public String delete(int deptid) {
        deptService.deleteById(deptid);
        return "redirect:/dept/list";
    }
}
