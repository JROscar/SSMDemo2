package cn.oscar.interceptor;

import cn.oscar.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req,
         HttpServletResponse res, Object o) throws Exception {
        //获取请求的url
        String url = req.getRequestURI();
        //url除了login.jsp都拦截
        if (url.indexOf("/login")>=0){
            return true;
        }
        //获取session
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        //判断session中是否有值 有就返回true
        if (user !=null){
            return true;
        }
        //不符合条件给出提示信息，并转发到登录页面
        req.setAttribute("msg","您还没登录 请先登录");
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,res);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
         HttpServletResponse res, Object o, ModelAndView mod) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest req,
         HttpServletResponse res, Object o, Exception e) throws Exception {

    }
}
