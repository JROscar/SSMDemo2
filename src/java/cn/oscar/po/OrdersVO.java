package cn.oscar.po;

import java.util.List;

public class OrdersVO {
    private List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrdersVO{" +
                "orders=" + orders +
                '}';
    }
}
