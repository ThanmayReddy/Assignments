package com.services;
import com.model.Books;
import java.util.List;

public interface BooksService {
    List<Books> getBooks();
    Books getBookById(int bookId);
    Books createBook (Books book);
    Books updateBook(Books book);
    Books deleteBook(int bookId);
}
