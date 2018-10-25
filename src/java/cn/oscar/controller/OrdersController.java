package cn.oscar.controller;

import cn.oscar.po.Orders;
import cn.oscar.po.OrdersVO;
import cn.oscar.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrdersController {
    @RequestMapping("toOrders")
    public String toOrders(){
        return "orders";
    }

    @RequestMapping("ordersToUser")
    public String ordersToUser(Orders orders){
        Integer id = orders.getId();
        String password = orders.getPassword();
        String username = orders.getUsername();
        System.out.println(id+"\n"+username+password);
        return "success";
    }

    @RequestMapping("toOrdersEdit")
    public String toOrdersEdit(Model model){
        List<Orders> orders = new ArrayList<>();
        model.addAttribute("orders", orders);
        return "orders_edit";
    }

    @RequestMapping("OrdersEdit")
    public String OrdersEdit(Orders orderslist){
        List<Orders> orders = orderslist.getId();

            if (order.getId() != null){
                System.out.println("修改了ID为："+order.getId()+"用户名为："+order.getUsername());
            }
        return "success";
    }
}
