
import java.util.Scanner;

public class W11_04_doWhile_ChooseMenu_SwitchCase {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int first, second, sum;
        byte Choice;

        System.out.println("======================================");
        System.out.println("Menu :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("======================================");

        do {
            System.out.print("Please Enter Your Choice : ");
            Choice = kb.nextByte();
            switch (Choice) {
                case 1:
                    System.out.println("======================================");
                    System.out.print("Please Enter Your First Number : ");
                    first = kb.nextInt();
                    System.out.print("Please Enter Your Second Number : ");
                    second = kb.nextInt();

                    sum = first + second;

                    System.out.println("Your Addition of " + first + " And " + second + " is " + sum);
                    System.out.println("======================================");
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.print("Please Enter Your First Number : ");
                    first = kb.nextInt();
                    System.out.print("Please Enter Your Second Number : ");
                    second = kb.nextInt();

                    sum = first - second;

                    System.out.println("Your Subtraction of " + first + " And " + second + " is " + sum);
                    System.out.println("======================================");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("That isn't in the Menu,Choose again");
                    System.out.println("--------------------------------------");
            }
        } while (Choice != 3);
        
        System.out.println("Thank You for using our Menu");
        System.out.println("======================================");

        kb.close();
    }
}
