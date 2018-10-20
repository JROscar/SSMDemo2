package cn.oscar.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
           HttpServletResponse response) throws Exception {
        //创建moduleandview对象
        ModelAndView modelAndView = new ModelAndView();
        // 向模型对象中添加数据
        modelAndView.addObject("note","Hello Spring MVC");
        //设置逻辑视图名
        modelAndView.setViewName("WEB-INF/jsp/FirstSpringMVC.jsp");
        //返回moduleandview对象
        return modelAndView;

    }
}
