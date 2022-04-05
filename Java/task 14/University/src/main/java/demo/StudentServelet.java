package demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServelet extends HttpServlet {
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter pw = response.getWriter();
        Data d= new Data();
//        pw.print(d.getStudents());
        pw.print(d. getStudentdataByID());
        pw.print(d.deleteStudentdata());
    }
}
