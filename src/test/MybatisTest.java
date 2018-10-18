import cn.osacr.Po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void FindById() throws IOException {
      String resource = "mybatis-config.xml";
        InputStream inputStream =
                Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("cn.osacr.Po.Customer.FindById",1);
        System.out.println(customer);
        sqlSession.close();
    }
    @Test
    public void FindByName() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream =
                Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Customer> customer = sqlSession.selectList("cn.osacr.Po.Customer.FindByName","r");
        for (Customer customer1 : customer ) {
            System.out.println(customer1);
        }
        sqlSession.close();
    }
}
