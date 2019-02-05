

public class Main {
    public static void main(String[] args) {

        Courses c = new Courses("Math",70);
        Student s = new Student("Ariel ");

        System.out.println(c.getSubjectName());

        System.out.println(s.getFirstName()+ s.getId());

        System.out.println(c);

            }

    }
