package service;
import model.Books;

import java.sql.SQLException;
import java.util.List;


public interface BooksService {
    List<Books> getbooks();
    Books createbook(Books books);
    Books updatebook(Books books);
    Books deletebook(int bookId) throws SQLException;

}
