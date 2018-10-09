import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int r = 1;
        int p = 2;
        int s = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("enter choice: ");
        s = in.nextInt();

        if (s == r) {
            System.out.println("ok");
        }else{
            System.out.println("booooo");
        }

        if (r > 9) {
            System.out.println("great");
        }else {
            System.out.println("try again");
        }



    }
}