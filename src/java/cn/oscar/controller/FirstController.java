package cn.oscar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Oscar
 */
@Controller
@RequestMapping(value = "oscar")
public class FirstController {
@RequestMapping(value = "/firstController")
    public ModelAndView handleRequest(HttpServletRequest request,
           HttpServletResponse response) throws Exception {
        //创建moduleandview对象
        ModelAndView modelAndView = new ModelAndView();
        // 向模型对象中添加数据
        modelAndView.addObject("note","Hello Spring MVC");
        //设置逻辑视图名
        modelAndView.setViewName("/WEB-INF/jsp/FirstSpringMVC.jsp");
        //返回moduleandview对象
        return modelAndView;

    }
}
