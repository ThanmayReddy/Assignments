package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student {
    String name;
    int login_ID;
    String Password;
    List <Course> courseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getLogin_ID() {
        return login_ID;
    }

    public void setLogin_ID(int login_ID) {
        this.login_ID = login_ID;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public List<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", login_ID='" + login_ID + '\'' +
                ", Password='" + Password + '\'' +
                ", courseArrayList=" + courseList +
                '}';
    }

}




