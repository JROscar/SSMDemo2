package cn.oscar.po;

import java.util.List;

public class TProduct {
    private Integer id;
    private String name;
    private String price;
    private List<TOrders> tOrdersList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<TOrders> gettOrdersList() {
        return tOrdersList;
    }

    public void settOrdersList(List<TOrders> tOrdersList) {
        this.tOrdersList = tOrdersList;
    }

    @Override
    public String toString() {
        return "TProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", tOrdersList=" + tOrdersList +
                '}';
    }
}
