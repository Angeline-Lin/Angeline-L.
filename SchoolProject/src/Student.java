public class Student {

    // student name
    private String firstname;
    private String lastname;
    private String name = firstname + lastname;


    //student grade
    private int grade;

    //student number
    private int num;

//Constructor
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        num++;
    }


    //getters and setters
    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
    //toString
    public String toString(){
        String student = name + grade;
        return student;
    }
}
