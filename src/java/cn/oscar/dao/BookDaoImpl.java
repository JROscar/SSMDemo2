package cn.oscar.dao;

import cn.oscar.po.Book;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {

    @Override
    public Book FindById(Integer id) {
        return this.getSqlSession().selectOne("FindBookById",id);
    }
}
