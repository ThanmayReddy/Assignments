package demo;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Student> students = new ArrayList<>();

    public Data() {
        Student s1 = new Student();
        s1.setName("Jack");
        s1.setLogin_ID((123));
        Student s2 = new Student();
        s2.setName("Jhon");
        s2.setLogin_ID(345);
        Student s3 = new Student();
        s3.setName("Meena");
        s2.setLogin_ID(678);
        Student s4 = new Student();
        s4.setName("Bhargavi");
        s4.setLogin_ID(901);
        Student s5 = new Student();
        s5.setName("Sheshank");
        s5.setLogin_ID(234);


        Course c1 = new Course();
        c1.setCourse_ID(1);
        c1.setCourse_Name("Science");
        Course c2 = new Course();
        c2.setCourse_ID(2);
        c2.setCourse_Name("Maths");
        Course c3 = new Course();
        c3.setCourse_ID(3);
        c3.setCourse_Name("English");
        Course c4 = new Course();
        c4.setCourse_ID(4);
        c4.setCourse_Name("Sociel");
        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);
        s1.setCourseList(courseList);
        s2.setCourseList(courseList);
        s3.setCourseList(courseList);
        s4.setCourseList(courseList);
        s5.setCourseList(courseList);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
    }

//        public List<Student> getStudents() {
//        return students;
//    }
    public String getStudentdataByID() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLogin_ID() == 234) {
                return students.get(i).toString();
            }
        }
        return "NOT FOUND!!";
    }
    public boolean deleteStudentdata() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).login_ID == 111) {
                students.remove(students.get(i));
                return true;
            }
        }
            return false;
        }
}







