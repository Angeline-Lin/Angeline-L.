public class Main {
    public static void main(String[] args) {

        Employee ee = new Employee(10,"Amy", " lee",20);
        //get id
        System.out.println(ee.getId());
        //get first name
        System.out.println(ee.getFirstName());
        //get last name
        System.out.println(ee.getLastname());
        //get full name
        System.out.println(ee.getName());
        //get salary
        System.out.println(ee.getSalary());
        //set annual salary
        System.out.println(ee.getAnnualSal());
        // get toString
        System.out.println(ee.toString());
    }
}

