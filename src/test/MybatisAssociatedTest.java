import cn.oscar.po.TPerson;
import cn.oscar.po.TProduct;
import cn.oscar.po.TUser;
import cn.oscar.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisAssociatedTest {
    @Test
    public void OneToOne(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TPerson person = sqlSession.selectOne("FindByPId",1 );
        System.out.println(person.getName());
        sqlSession.close();
    }
    @Test
    public void OneToOne2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TPerson person = sqlSession.selectOne("FindByPId2",1 );
        System.out.println(person);
        sqlSession.close();
    }
    @Test
    public void OneToMany(){
        SqlSession session = MybatisUtils.getSession();
        TUser tUser = session.selectOne("FindOrdersByUser",1);
        System.out.println(tUser);
        session.close();
    }
    @Test
    public void ManyToMany(){
        SqlSession session = MybatisUtils.getSession();
        TProduct tProduct = session.selectOne("ProductByOrders",3);
        System.out.println(tProduct);
        session.close();
    }
}
