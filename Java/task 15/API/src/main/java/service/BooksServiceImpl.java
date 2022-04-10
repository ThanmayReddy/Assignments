package service;
import model.Books;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static database.DatabaseConnection.*;

public class BooksServiceImpl implements BooksService {
    @Override
    public List<Books> getbooks() {
        try {
            ResultSet resultSet = getbooksList();
            List<Books> productList= new ArrayList<>();

            while (resultSet.next()) {
                Books books = new Books();
                books.setBooksId(resultSet.getInt(1));
                books.setBooksName(resultSet.getString(2));
                books.setBooksGener(resultSet.getString(4));
                books.setPrice(resultSet.getDouble(4));
                productList.add(books);
            }
            connection.close();
            return productList;

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Books createbook(Books books) {
        createbooksList(books);
        return null;
    }

    @Override
    public Books updatebook(Books books) {
        updateboksList(books);
        return null;
    }

    @Override
    public Books deletebook(int bookId) throws SQLException {
        deletebooksList(bookId);
        return null;
    }
}
