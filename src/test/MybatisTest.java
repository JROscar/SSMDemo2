import cn.oscar.po.Customer;
import cn.oscar.utils.MybatisUtils;
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
        Customer customer = sqlSession.selectOne("FindById",1);
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
        List<Customer> customer = sqlSession.selectList("FindByName","r");
        for (Customer customer1 : customer ) {
            System.out.println(customer1);
        }

    }
    @Test
    public void MybatisUtilsTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        List<Customer> customers = sqlSession.selectList("all");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        sqlSession.close();
    }
    @Test
    public void FindByIfTest(){
      SqlSession sqlSession = MybatisUtils.getSession();
      Customer customer = new Customer();
//      customer.setUsername("Oscar");
      customer.setJobs("programer");
      List<Customer> customers = sqlSession.selectList("FindByIf",customer);
        for (Customer customer1 : customers) {
            System.out.println(customer1);
        }
    }
}
