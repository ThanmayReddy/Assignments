package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import static database.DatabaseConnection.sortedbooksList;


public class SortedBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResultSet resultSet =null;

        try {
            resultSet = sortedbooksList();
            PrintWriter out = resp.getWriter();
            out.write("<h1> Sorted Books </h1> ");
            out.write("<table>");
            out.write("<tr>  <th> bookId </th>    <th>  bookName </th>     <th> bookGener </th>    <th> price </th>    </tr>"   );
            while (resultSet.next()) {
                out.write("<tr>");
                out.write("<td> "+  resultSet.getInt(1) +" </td> ");
                out.write("<td> "+  resultSet.getString(2) +"</td>");
                out.write(" <td> "+  resultSet.getString(3) +" </td> ");
                out.write(" <td> "+  resultSet.getDouble(4) +" </td> ");
                out.write("</tr>");
            }
            out.write("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
