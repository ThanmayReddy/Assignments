package com.services;
import com.model.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryBooksServiceImpl implements BooksService{
    private List<Books> booksList = new ArrayList<>();
    @Override
    public List<Books> getBooks() {
        return booksList;
    }

    @Override
    public Books getBookById(int bookId) {
        for (Books book:booksList){
            return book;
        }
        return null;
    }

    @Override
    public Books createBook(Books book) {
        booksList.add(book);
        return book;
    }

    @Override
    public Books updateBook(Books book) {
        Books book1 = null;
        for (Books i : booksList) {
            if (i.getBookId() == book.getBookId()) {
                i.setBookName(book.getBookName());
            }
        }
        return book;
    }

    @Override
    public Books deleteBook(int bookId) {
        Books book = null;
        for (Books i : booksList) {

            if (i.getBookId() == bookId) {
                booksList.remove(i);
                book = i;
                break;
            }
        }
        return book;

    }
}
