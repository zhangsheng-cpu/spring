package com.controller;

import com.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/formatter")
public class FormatterController {

    @Autowired(required = false)
    private ConversionService conversionService;

    @GetMapping("/date")
    public String receiveDate(/*@DateTimeFormat(pattern = "yyyy-MM-dd")*/ Date date) {
        System.out.println("date = " + date);

        return "index";
    }

    @GetMapping("/emp")
    public String receiveEmp(@RequestParam("xxx") Emp emp) {

        System.out.println("emp = " + emp);
        return "index";
    }
}
