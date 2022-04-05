package demo;
import java.util.Scanner;
public class Course {


    int Course_ID;
    String Course_Name;
    public int getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(int course_ID) {
        Course_ID = course_ID;
    }
    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }
    @Override
    public String toString() {
        return "Course{" +
                "Course_ID=" + Course_ID +
                ", Course_Name='" + Course_Name + '\'' +
                '}';
    }
}
