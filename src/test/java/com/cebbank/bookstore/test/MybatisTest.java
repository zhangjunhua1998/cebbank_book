package com.cebbank.bookstore.test;

import com.cebbank.bookstore.entity.Book;
import com.cebbank.bookstore.mapper.BookMapper;
import com.cebbank.bookstore.service.BookService;
import com.cebbank.bookstore.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        System.out.println(mapper.insertBook());
        sqlSession.close();
    }

}
