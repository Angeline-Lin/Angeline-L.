public class Employee {

        private int id;
        private String firstName;
        private String lastName;
        private int salary;



        Employee(int id, String firstName, String Lastname, int Salary){

            this.id = id;
            this.firstName = firstName;
            this.lastName = Lastname;
            this.salary = Salary;


        }
        public int getId(){

            return id;
        }
        public String getFirstName(){

            return firstName;
        }
        public String getLastname(){

            return lastName;
        }
        public String getName(){
            String name = firstName + lastName;

            return name;
        }
        public int getSalary() {

        return salary;
    }
    //salary
        public void setSalary(int S){
            this.salary = S;
        }
    //annual salary
        public int getAnnualSal(){
            return salary*12;
        }
    //raise salary
        public int raiseSalary(int percent){
            this.salary = salary * percent;

            return salary;
        }
        public String toString(){
            String employee = "id:"+ id +" name:"+ firstName + lastName +" salary:" + salary;

            return employee;
        }

    }

