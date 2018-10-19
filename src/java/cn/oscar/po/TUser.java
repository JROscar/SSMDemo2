package cn.oscar.po;


import java.util.List;

public class TUser {

  private Integer id;
  private String username;
  private String address;
  private List<TOrders> tOrdersList;

    public List<TOrders> gettOrdersList() {
        return tOrdersList;
    }

    public void settOrdersList(List<TOrders> tOrdersList) {
        this.tOrdersList = tOrdersList;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", tOrdersList=" + tOrdersList +
                '}';
    }

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
