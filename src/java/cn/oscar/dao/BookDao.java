package cn.oscar.dao;

import cn.oscar.po.Book;

public interface BookDao {
    public Book FindById(Integer id);
}
