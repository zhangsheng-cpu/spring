package com.controller;

import com.formatter.EmpFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;


@ControllerAdvice
public class MyControllerAdvice {

    @InitBinder
    public void xxxx(WebDataBinder dataBinder) {
        dataBinder.addCustomFormatter(new EmpFormatter());

        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        dataBinder.addCustomFormatter(dateFormatter);

    }
}
