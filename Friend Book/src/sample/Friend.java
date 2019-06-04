package sample;

public class Friend {

    public String name;
    private int age;
    public String colour;

    //object
    Friend(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    //getters and setters
    public int getAge(){
        return age;
    }
    public String toString(){
        return name;
    }

}
