package cn.oscar.service;

import cn.oscar.mapper.BookMapper;
import cn.oscar.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Oscar
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BookServiceImpl implements BookService {
    @Autowired

    /*
      引入数据层的接口
     */
    private BookMapper bookMapper;
    @Override
    public void addBook(Book book) {
        /*
         * 添加记录
         */
        this.bookMapper.addBook(book);
        int i = 1/0;
    }
}
