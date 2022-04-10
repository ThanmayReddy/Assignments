package model;

public class Books {
    private int bookId;
    private String bookName;
    private String booksGener;
    private double price;

    public int getBooksId() {
        return bookId;
    }

    public void setBooksId(int booksId) {
        this.bookId = booksId;
    }

    public String getBooksName() {
        return bookName;
    }

    public void setBooksName(String booksName) {
        this.bookName = booksName;
    }

    public String getBooksGener() {
        return booksGener;
    }

    public void setBooksGener(String booksGener) {
        this.booksGener = booksGener;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
