import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(118, 10, 4);
        Date date2 = new Date(118, 7, 16);

        Customer c = new Customer(33, 22, 55, "string");
        c.deposit(400, date, Customer.CHECKING);
        c.withdraw(500, date2, Customer.SAVING);
        c.displayDeposits();
        c.displayWithdraws();

    }
}
