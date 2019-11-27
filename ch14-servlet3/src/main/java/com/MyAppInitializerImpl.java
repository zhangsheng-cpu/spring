package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyApplnitializer{
    @Override
    public void dangQiDongShi(ServletContext sc) {

        ServletRegistration.Dynamic second = sc.addServlet("second", new SecondServlet());

        second.addMapping("/second");
    }
}
