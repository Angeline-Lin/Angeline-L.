
import java.util.ArrayList;


public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

//Constructor
    School() {
        this.students = students;
        this.teachers = teachers;
    }
    //getters and setters
    public ArrayList<Student> getStudents() {

        return students;

    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }


    //add students and teachers
    public ArrayList<Student> addStudent(Student ss){
        students.add(0,ss);

        return students;
}
    public ArrayList<Teacher> addTeacher(Teacher tt){
        teachers.add(0,tt);

        return teachers;
    }
//remove students and teachers
    public ArrayList<Student> removeStudent(){
        students.remove(0);

        return students;
    }

    public ArrayList<Teacher> removeTeacher() {
        teachers.remove(0);

        return teachers;
    }

}