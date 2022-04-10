package servlet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Books;
import service.BooksService;
import service.BooksServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class BooksServlet extends HttpServlet {
    private static final Gson GSON=new GsonBuilder().create();
    private static final BooksService booksService =new BooksServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Books>  booksList = booksService.getbooks();

        resp.setStatus(201);
        resp.setHeader("Content-Type","application/json");
        resp.getOutputStream().println(GSON.toJson(booksList));
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Books books = GSON.fromJson(req.getReader(),Books.class);
        try {
            booksService.createbook(books);
        }catch (Exception e){
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("Content-Type","application/json");
        resp.getOutputStream().println(GSON.toJson("Successfully Created a books"));
    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Books books=GSON.fromJson(req.getReader(),Books.class);
        try {
            booksService.updatebook(books);

        }catch (Exception e){
            e.printStackTrace();
        }

        resp.setStatus(201);
        resp.setHeader("Content-Type","application/json");
        resp.getOutputStream().println(GSON.toJson("Updated Book"+books.getBooksId()));
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int bookId=Integer.parseInt(req.getPathInfo().replace("/",""));
        try {
            booksService.deletebook(bookId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("Content-Type","application/json");
        resp.getOutputStream().println(GSON.toJson("deleted Book with bookId : "+bookId));
    }
}
