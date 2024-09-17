package com.cebbank.bookstore.service.impl;

import com.cebbank.bookstore.entity.Book;
import com.cebbank.bookstore.mapper.BookMapper;
import com.cebbank.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookByPublish(String publish) {
        Book book = new Book();
        book = bookMapper.findByPublish(publish);
        System.out.println(book.getBookName());
        return bookMapper.findByPublish(publish);
    }

    @Override
    public Book findByAuthorName(String authorName) {
        Book book = bookMapper.findByAuthorName(authorName);
        return book;
    }

    @Override
    public Book findByAuthorBookPublish(String authorName, String bookName, String publish) {
        Book book = bookMapper.findByAuthorBookPublish(authorName, bookName, publish);
        return book;
    }

    @Override
    public List<Book> findByAuthorBookPublishList(String authorName, String bookName, String publish) {
        List<Book> list = bookMapper.findByAuthorBookPublishList(authorName, bookName, publish);
        return list;
    }

    @Override
    public Integer insertUser() {
        int num = bookMapper.insertBook();
        return num;
    }
}
