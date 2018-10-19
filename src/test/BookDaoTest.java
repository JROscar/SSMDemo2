import cn.oscar.dao.BookDao;
import cn.oscar.po.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDaoTest {
    @Test
    public void FindById(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        Book book = bookDao.FindById(2);
        System.out.println(book);
    }
}
