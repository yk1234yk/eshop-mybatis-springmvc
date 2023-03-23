package com.xhxy.eshop.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    public static SqlSession getSession(){
        SqlSession sqlSession;
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSession();
        System.out.println(session);
    }
}
