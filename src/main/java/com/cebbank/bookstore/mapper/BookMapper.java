package com.cebbank.bookstore.mapper;

import com.cebbank.bookstore.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BookMapper {
    /**
     * 按照bookId查询
     */
    //Book findByPublish(@Param("publish") String publish);
    Book findByPublish(String publish);

    /**
     * 按照author_name查询
     */
    Book findByAuthorName(String authorName);

    /**
     * 按照authorName和bookName精准匹配，publish右模糊匹配
     */
    Book findByAuthorBookPublish(String authorName, String bookName, String publish);

    /**
     * 按照authorName和bookName精准匹配，publish右模糊匹配,查询结果为List集合
     */
    List<Book> findByAuthorBookPublishList(String authorName, String bookName, String publish);

    /**
     * 查询所有书籍
     */
    //List<Book> findAllBook();

    /**
     * 插入书籍
     */
    int insertBook();
}
