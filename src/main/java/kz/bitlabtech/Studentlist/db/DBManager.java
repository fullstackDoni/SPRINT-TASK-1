package kz.bitlabtech.Studentlist.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 9L;

    static {
        students.add(new Student(1L,"Ilyas","Zhuanyshev",88,"B"));
        students.add(new Student(2L,"Doni","Apwuberov",99,"A"));
        students.add(new Student(3L,"Hitler","Adolf",87,"B"));
        students.add(new Student(4L,"Joseph","Stalin",88,"B"));
        students.add(new Student(5L,"Johnny","Depp",85,"B"));
        students.add(new Student(6L,"Sponge","Bob",35,"F"));
        students.add(new Student(7L,"Patrick","Star",1,"F"));
        students.add(new Student(8L,"Kobe","Bryant",77,"B"));
    }
    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void addStud(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }
}
