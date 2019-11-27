package com.controller.modelattribute;


import com.vo.UserinfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelAttributeController {
    /**
     * 当ModelAttribute修饰方法时,是在每个请求方法执行前会先执行
     * 执行完毕之后,会把方法的返回对象放入到Model对象中
     * 键的名字是方法返回类型的类的名字(首字母小写),值就是返回对象
     * @return
     */
    @ModelAttribute("abc")
    public UserinfoVO initData(){
        UserinfoVO userinfoVO = new UserinfoVO();
        userinfoVO.setUsername("init");
        return userinfoVO;
    }
    @RequestMapping("/demo1")
    public String demo1(UserinfoVO userinfoVO, Model model){
        return "model";
    }


    /**
     * 当ModelAttribute注解修饰在请求方法参数上时是这个意思:
     * 1.从model中找数据赋值给这个参数
     * 2.依据ModelAttribute设置的键去找
     * 3.如果ModelAttribute没有设置键,就依据参数类型的名字(首字母小写)这个键去找
     * 4.如果还是找不到,就实例化一个参数类型的对象,并放入到Model
     *
     * binding=false是阻止数据绑定发生
     * @param userinfoVO
     * @param model
     * @return
     */
    @RequestMapping("/demo2")
    public String demo2(@ModelAttribute(value = "abc",binding = false) UserinfoVO userinfoVO, Model model){
        return "model";
    }
}
