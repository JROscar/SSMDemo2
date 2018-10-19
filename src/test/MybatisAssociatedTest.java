import cn.oscar.po.TPerson;
import cn.oscar.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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

}
