package cn.oscar.po;


public class TPerson {

  private Integer id;
  private String name;
  private Integer age;
  private String sex;
  private TIdCard cardId;


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


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

    public TIdCard getCardId() {
        return cardId;
    }

    public void setCardId(TIdCard cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "TPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cardId=" + cardId +
                '}';
    }
}
