package com.model;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Books {
    @Id
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "bookGener")
    private String bookGener;
    @Column(name = "price")
    private double price;

    Books(){

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGener() {
        return bookGener;
    }

    public void setBookGener(String bookGener) {
        this.bookGener = bookGener;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
