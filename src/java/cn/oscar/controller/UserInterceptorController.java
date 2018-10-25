package cn.oscar.controller;

import cn.oscar.po.User;
import com.mysql.cj.api.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserInterceptorController {
    /**
     * 向登录页面跳转
     * @return
     */
    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model){
        //获取用户名
        String username = user.getUsername();
        String password = user.getPassword();
        //模拟数据判断
        if (username !=null &&username.equals("oscar")&&password !=null &&password.equals("123")) {
            //将数据添加到session中
            session.setAttribute("USER_SESSION",user);
            //重定向到主页面
            return "redirect:main";
        }
        model.addAttribute("msg","账号或密码错误，请重新登录");
        return "login";
    }
    /**
     * 向用户主界面跳转
     */
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }
    /**
     * 退出用户
     */
    @RequestMapping("/logout")
    public String loginout(HttpSession session){
        //清除session
        session.invalidate();
        //重定向到login
        return "redirect:login";
    }
}
