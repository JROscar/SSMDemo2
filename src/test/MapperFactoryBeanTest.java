import cn.oscar.mapper.BookMapper;
import cn.oscar.po.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperFactoryBeanTest {
    @Test
    public void BookMapperTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookMapper bookMapper = applicationContext.getBean(BookMapper.class);
        BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
        Book book = bookMapper.FindBookById(3);
        System.out.println(book);
    }
}
