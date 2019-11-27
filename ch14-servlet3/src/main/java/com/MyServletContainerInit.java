package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(MyApplnitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        //下面的2行代码已经可以成功注册了一个servlet
        /*ServletRegistration.Dynamic first = ctx.addServlet("first", new FirstServlet());
        first.addMapping("/first");
*/

        for (Class<?> clz : c) {
            //就是判断传递过来的类型是否是MyAppInitializer的实现类
            //因为HandlerTypes可以填多个类型
            if (MyApplnitializer.class.isAssignableFrom(clz)) {
                try {
                    MyApplnitializer instance = (MyApplnitializer) clz.newInstance();
                    instance.dangQiDongShi(ctx);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
