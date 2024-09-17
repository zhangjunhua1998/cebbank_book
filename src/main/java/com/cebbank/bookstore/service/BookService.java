package com.cebbank.bookstore.service;

import com.cebbank.bookstore.entity.Book;

import java.util.List;

public interface BookService {
    Book getBookByPublish(String publish);

    Book findByAuthorName(String authorName);

    Book findByAuthorBookPublish(String authorName, String bookName, String publish);

    List<Book> findByAuthorBookPublishList(String authorName, String bookName, String publish);

    Integer insertUser();
}
