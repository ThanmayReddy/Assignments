package database;
import model.Books;
import java.sql.*;

public class DatabaseConnection {
    public static Statement statement=null;
    public static Connection connection=null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            System.out.println(connection.toString());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ResultSet getbooksList() throws SQLException {
        connection = getConnection();
        assert connection != null;
        return connection.createStatement().executeQuery("select * from books");
    }
    public  static ResultSet createbooksList(Books books){
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into books values(?,?,?,?)");
            preparedStatement.setInt(1, books.getBooksId());
            preparedStatement.setString(2, books.getBooksName());
            preparedStatement.setString(3, books.getBooksGener());
            preparedStatement.setDouble(4,books.getPrice());
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public  static ResultSet updateboksList(Books books) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Books SET  bookName=?,bookGener=?,price=?WHERE bookId = " +books.getBooksId());
            preparedStatement.setString(1, books.getBooksName());
            preparedStatement.setString(2, books.getBooksGener());
            preparedStatement.setDouble(3,books.getPrice());
            preparedStatement.executeUpdate();
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    public static ResultSet deletebooksList(int bookId) throws SQLException {
        connection = getConnection();
        assert connection != null;
        PreparedStatement preparedStatement = connection.prepareStatement("delete from books where bookId=" + bookId);
        preparedStatement.executeUpdate();
        connection.close();
        return null;
    }

    public static ResultSet sortedbooksList() throws SQLException {
        connection = getConnection();
        assert connection != null;
        return connection.createStatement().executeQuery("select * from books order by bookName");
    }

}
