

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Sally bee ","Math");
        Student s = new Student("Bob rob ",80);
        School sc = new School();
        //teacher object
        System.out.println(t.getName() + t.getSubject());

        //student object
        System.out.println(s.getName() + s.getGrade());

        //add student
            sc.addStudent(s);
        //add teacher
            sc.addTeacher(t);

        //remove student
            sc.removeStudent();
        //remove teacher
            sc.removeTeacher();

        //student list
            System.out.println(sc.students);
        //teacher list
            System.out.println(sc.teachers);


        //add 10 students
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);
        sc.addStudent(s);

        //add 3 teachers
        sc.addTeacher(t);
        sc.addTeacher(t);
        sc.addTeacher(t);

        //remove 2 students
        sc.removeStudent();
        sc.removeStudent();

        //remove 1 teacher
        sc.removeTeacher();

        //display student list
        System.out.println(sc.students);
        //display teacher list
        System.out.println(sc.teachers);
        
    }
}
