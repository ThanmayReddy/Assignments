package com.controllers;

import com.model.Books;
import com.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore")
public class BooksController {
    @Autowired
    @Qualifier("database")

    private BooksService booksService;

    public BooksController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Books> getBooks() {
        return booksService.getBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Books getBookById(@PathVariable("id") int bookId)
    {
        return booksService.getBookById(bookId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Books createBook(@RequestBody Books book) {
        booksService.createBook(book);
        return book;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Books updateBook(@RequestBody Books book) {
        booksService.updateBook(book);
        return book;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Books deleteBook(@PathVariable("id")int bookId){
        Books book = getBookById(bookId);
        booksService.deleteBook(bookId);
        return book;
    }
}


