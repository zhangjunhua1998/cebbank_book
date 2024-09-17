package com.cebbank.bookstore.entity;

import java.util.Date;

public class Book {

    private Integer bookId;

    private String authorName;

    private String bookName;

    private String publish;

    private Date publishTime;

    private Double price;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publish='" + publish + '\'' +
                ", publishTime=" + publishTime +
                ", price=" + price +
                '}';
    }
}
