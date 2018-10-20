package cn.oscar.mapper;

import cn.oscar.po.Book;

public interface BookMapper {
    public Book FindBookById(Integer id);
    //增加一条记录
    public void addBook(Book book);
}
