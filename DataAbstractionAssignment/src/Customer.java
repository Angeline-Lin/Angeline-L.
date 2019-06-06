
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;


    public Customer(int accountNumber, double checkBalance, double savingBalance, String name) {
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;
        this.name = name;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    public double deposit(double amt, Date date, String account){
        Deposit dd = new Deposit(amt,date,account);
        deposits.add(dd);
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        Withdraw ww = new Withdraw(amt,date,account);
        withdraws.add(ww);
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){

        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
