import java.util.ArrayList;

public class Student {

    private String firstName;
    private static int id = 0;


    //array
    ArrayList<Courses> student = new ArrayList<>();

    public void addCourse(Courses c) {
        student.add(c);
    }


    //Constructor
    public Student() {
        firstName = "Angeline";
        id++;
    }

    public Student(String firstName) {
        this.firstName = firstName;
        id++;
    }
//Getters & Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getId() {
        return id;
    }

    //average grade
    public void averageGrade(Courses course) {

        int average = course.getStudentGrade() + course.getStudentGrade()/2;


    }
}