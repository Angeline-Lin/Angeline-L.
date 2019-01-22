public class Employee {

        private int id;

        private String Firstname;

        private String Lastname;

        private int Salary;



        Employee(int id, String Firstname, String Lastname, int Salary){

            this.id = id;
            this.Firstname = Firstname;
            this.Lastname = Lastname;
            this.Salary = Salary;



        }

        public int getId(){

            return id;
        }
        public String getFirstname(){

            return Firstname;
        }
        public String getLastname(){

            return Lastname;
        }
        public int getSalary(){

            return Salary;
        }
        public String getName(){
            String name = Firstname + Lastname;

            return name;
        }

        public int salary()





    }

