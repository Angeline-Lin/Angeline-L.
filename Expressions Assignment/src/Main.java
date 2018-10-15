import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int word;

        //user input
        Scanner in = new Scanner(System.in);
        System.out.println("enter choice: ");
        word = in.nextInt();

        // random opponent
        Random rand = new Random();
        rand.nextInt(3);
        int enemy = rand.nextInt(3)+1;

        //user choice
        if (word == 1) {
            System.out.println("rock");
        }else if(word == 2){
            System.out.println("paper");
        }else{
            System.out.println("scissors");
        }

        //opponent choice
        System.out.println("-------------");
        if (enemy == 1) {
            System.out.println("rock");
        }else if(enemy == 2){
            System.out.println("paper");
        }else if(enemy == 3){
            System.out.println("scissors");
        }

        //game
        System.out.println("~~~~~~");
        if (word == enemy){
            System.out.println("Try again");
        }else if(word < enemy && word == 1 && enemy == 3){
            System.out.println("You Win");
        }else if(word < enemy && word == 1 && enemy == 2){
            System.out.println("You lose");
        }else if(word < enemy && word == 2){
            System.out.println("You lose");
        }else if(word > enemy && word == 2){
            System.out.println("You Win");
        }else if(word > enemy && word == 3 && enemy == 1){
            System.out.println("You lose");
        }else if(word > enemy && word == 3 && enemy == 2){
            System.out.println("You Win!");
        }

        }

    }