

import java.util.Random;
import java.util.Scanner;

public class W13_01_GuessNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int i, userguess, numbertoguess = rand.nextInt(10) + 1;
        Scanner kb = new Scanner(System.in);

        /*for (i = 0; i >= 0; i++) {
            System.out.println(numbertoguess);
            numbertoguess = rand.nextInt(10) + 1;
        }*/
        System.out.println("------------------------------------------");
        for (i = 3; i >= 1; i--) {
            System.out.print("Enter your guess (1-10) : ");
            userguess = kb.nextInt();

            if (userguess == numbertoguess) {
                System.out.println("You Win!");
                System.out.println("------------------------------------------");
                break;
            } else if (userguess < numbertoguess) {
                System.out.println("Your guess is too low.");
                System.out.println("You have " + (i - 1) + " guesses left");
                System.out.println("------------------------------------------");
            } else {
                System.out.println("Your guess is too high.");
                System.out.println("You have " + (i - 1) + " guesses left");
                System.out.println("------------------------------------------");
            }
            if (i == 1) {
                System.out.println("You Lose!");
                System.out.println("The number to guess is " + numbertoguess);
                System.out.println("------------------------------------------");
            }
        }
    }
}
