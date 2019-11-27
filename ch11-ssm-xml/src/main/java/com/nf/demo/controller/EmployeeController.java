package com.nf.demo.controller;


import com.github.pagehelper.PageInfo;
import com.nf.demo.entity.EmployeeEntity;
import com.nf.demo.service.EmployeeServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeServiece employeeServiece;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize, Model model) {
        List<EmployeeEntity> all = employeeServiece.getAll(pageNum, pageSize);

        PageInfo pageInfo = new PageInfo(all);
        model.addAttribute("list", pageInfo);
        return "employee/list";
    }
    @GetMapping("/add")
    public String add(){
        return "/employee/add";
    }
    @PostMapping("/insert")
    public String insert(@Valid EmployeeEntity employeeEntity,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/employee/add";
        }
        employeeServiece.insert(employeeEntity);
        return "redirect:/emp/list";
    }
}
