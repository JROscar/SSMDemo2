import cn.oscar.po.Book;
import cn.oscar.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    @Test
    public void InsertToBook(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = applicationContext.getBean(BookService.class);
        Book book = new Book();
        book.setHobby("游戏1");
        book.setQQ("1233345641");
        book.setUsername("Oscar1");
        bookService.addBook(book);
    }
}
