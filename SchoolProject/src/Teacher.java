public class Teacher {

    //Teacher name
       private String firstName;
       private String lastName;
       private String name = firstName + lastName;


    //Teacher subject
       private String subject;

//Constructor
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    //getters and setters
    public String getName(){

        return name;
    }
    public String getSubject(){

        return subject;
}





}