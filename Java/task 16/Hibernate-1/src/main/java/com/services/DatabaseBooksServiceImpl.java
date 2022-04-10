package com.services;
import com.model.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database")
public class DatabaseBooksServiceImpl implements BooksService{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Books> getBooks() {
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        List<Books> booksList = session.createQuery("from Books",Books.class).list();
        transaction.commit();
        session.close();
        return booksList;
    }

    @Override
    public Books getBookById(int bookId) {
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Books book =session.get(Books.class,bookId);
        transaction.commit();
        session.close();
        return book;

    }

    @Override
    public Books createBook(Books book) {
        Session session = sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public Books updateBook(Books book) {
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public Books deleteBook(int bookId) {
        Session session= sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        Books book = session.get(Books.class,bookId);
        session.delete(book);
        transaction.commit();
        session.close();
        return book;
    }
}
