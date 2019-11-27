package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 过往云烟~
 */
@Controller
//@Component
public class HelloController {

    @RequestMapping("/index")
    public String handle() {
        System.out.println("index--");

        //这里的hello是逻辑视图的名字,靠配置的视图解析器解析为真正的视图,比如jsp文件

        /*return "WEB-INF/jsp/hello.jsp";
        * 删掉视图解析器效果一样
        * */
        return "hello";
    }

    @RequestMapping("/index2")
    public static ModelAndView handle2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("msg", "mvc");
        return mav;
    }

    /*1.不加controller注解出现什么问题？
解：没有被spring管理

启动时服务可能不会爆出异常，但是你会发现页面请求中的URL地址是正确的，当时无论如何也访问不到Controller中相
对应的方法，这个时候就需要那么需要检查@Controller注解和@RequestMapping注解是否已经添加到Class上面了。
     2.controller注解换为Component注解是什么情况
解：不能够找到（@RequestMapping("/index")）index 的映射
     3.RequestMapping注解写为@RequestMapping("") 和@RequestMapping("/")各是什么情况
解：都是默认直接进行调用  RequestMapping注解 下面的方法
     4.InternalResourceViewResolver删掉，直接在控制器类的方法里面写死地址，比如return "WEB-INF/jsp/hello.jsp出现什么情况
解：效果一样
     5.InternalResourceViewResolver去掉前缀与后缀的配置或者只配前缀或只配后缀情况怎么样？？
解：找不到 视图(.jsp)
     6.控制器类的方法名字可以任意吗？
解: 遵守驼峰命名法
     7.控制器类的方法可以是静态的吗？
解:  可以的
     8.控制器类的方法可以返回任意类型吗？比如返回你自己写的一个类
解： 可以的
     9.在jsp页面里面遍历输出请求作用域所有的attribute，看看里面有什么？
解：
    10.ModelAndView类的数据放到哪里了？为什么jsp里写el表达式可以取出来？
    11.既然创建出了一个spring容器，如何获取这个容器呢？
    12.如果能获取到这个spring容器，容器里面都有多少管理的bean？输出这些bean的名字
    13. 如果把DispatcherServlet的url-pattern配置为*.html,那么访问地址为hello.html的时候RequestMapping注解的值应该写成什么才能访问到这个
    请求处理方法?*/

}
