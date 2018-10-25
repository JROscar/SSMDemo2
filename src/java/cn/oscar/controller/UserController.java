package cn.oscar.controller;

import cn.oscar.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @RequestMapping("/usercontroller")
    public static String selectUser (@RequestParam(value = "id",
            required = true,defaultValue = "hello")String str){
        System.out.println("id="+str);
        return "success";
    }

    @RequestMapping("registerUser")
    public String registerUser(User user){
        String password = user.getPassword();
        String username = user.getUsername();
        System.out.println(username+"\n"+password);
        return "success";
    }

    @RequestMapping("login")
    public String login(){
        return "registerUser";
    }
}