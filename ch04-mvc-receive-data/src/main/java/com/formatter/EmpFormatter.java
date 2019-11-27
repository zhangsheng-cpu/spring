package com.formatter;

import com.entity.Emp;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EmpFormatter implements Formatter<Emp> {

    @Override
    public Emp parse(String text, Locale locale) throws ParseException {
        String[] data = text.split(",");
        Emp emp = new Emp();
        emp.setFirstName(data[0]);
        emp.setLastName(data[1]);
        return emp;
    }

    @Override
    public String print(Emp object, Locale locale) {
        return object.toString();
    }
}
