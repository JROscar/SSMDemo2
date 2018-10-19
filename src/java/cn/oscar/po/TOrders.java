package cn.oscar.po;


import java.util.List;

public class TOrders {

  private Integer id;
  private String number;
//  private List<TProduct> tProductList;
//
//    public List<TProduct> gettProductList() {
//        return tProductList;
//    }
//
//    public void settProductList(List<TProduct> tProductList) {
//        this.tProductList = tProductList;
//    }

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


    @Override
    public String toString() {
        return "TOrders{" +
                "id=" + id +
                ", number='" + number + '\'' +
//                ", tProductList=" + tProductList +
                '}';
    }
}
