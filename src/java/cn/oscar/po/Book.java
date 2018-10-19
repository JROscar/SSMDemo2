package cn.oscar.po;

public class Book {
    private Integer id;
    private String username;
    private String hobby;
    private String QQ;

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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", hobby='" + hobby + '\'' +
                ", QQ='" + QQ + '\'' +
                '}';
    }
}
