package cn.oscar.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 *  String resource = "mybatis-config.xml";
 *         InputStream inputStream =
 *                 Resources.getResourceAsStream(resource);
 *         SqlSessionFactory sqlSessionFactory =
 *                 new SqlSessionFactoryBuilder().build(inputStream);
 *         SqlSession sqlSession = sqlSessionFactory.openSession();
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    //初始化sqlsessionfactory对象
    static {

        try {
            //使用mybatis提供的resources类加载mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //构建sqlsessionfactory工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取sqlsession对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}