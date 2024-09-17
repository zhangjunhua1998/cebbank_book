package com.cebbank.bookstore.controller;

import com.cebbank.bookstore.entity.Book;

import com.cebbank.bookstore.service.BookService;
import com.cebbank.bookstore.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Currency;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findBookByPublish")
    public Book getBookByPublish(@RequestParam("publish") String publish) {
        System.out.println("publish = " + publish);
        Book book = bookService.getBookByPublish(publish);
        System.out.println(book.getBookName());

        return book;
    }

    @RequestMapping("/findByAuthorName")
    public Book findByAuthorName(@RequestParam("authorName") String authorName) {
        Book book = bookService.findByAuthorName(authorName);
        return book;
    }

    @RequestMapping("/findByAuthorBookPublish")
    public Book findByAuthorBookPublish(@RequestParam("authorName") String authorName,
                                        @RequestParam("bookName") String bookName,
                                        @RequestParam("publish") String publish) {
        Book book = bookService.findByAuthorBookPublish(authorName, bookName, publish);
        return book;
    }

    @RequestMapping("/findByAuthorBookPublishList")
    public List<Book> findByAuthorBookPublishList(@RequestParam("authorName") String authorName,
                                                  @RequestParam("bookName") String bookName,
                                                  @RequestParam("publish") String publish) {
        List<Book> list = bookService.findByAuthorBookPublishList(authorName, bookName, publish);
        for (Book book:list) {
            System.out.println(book.getBookName());
        }
        Date date = new Date();
        Book book1 = new Book();
        book1.setBookId(7);
        book1.setPublish("222");
        book1.setBookName("xxx");
        book1.setAuthorName("zjh");
        book1.setPrice(28.0);
        book1.setPublishTime(date);

        return list;
    }

    @RequestMapping("/insertBook")
    public Integer insertBook(){
        Integer num = bookService.insertUser();
        return num;
    }
}
