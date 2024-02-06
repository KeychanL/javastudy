package com.ict.mybatis2;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex01_DBService {
    static private SqlSessionFactory factory;
    static String resource = "com/ict/mybatis2/ex01_config.xml";
    // static 초기화
 // Ex01_DBService 클래스에서의 수정
    static {
        try {
            InputStream in = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error initializing SqlSessionFactory: " + e.getMessage());
        }
    }


    // DAO에서 factory를 호출할 메서드
    public static SqlSessionFactory getFactory() {
        return factory;
    }
}
