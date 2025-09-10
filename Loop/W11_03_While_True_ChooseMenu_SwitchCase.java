
import java.util.Scanner;

public class W11_03_While_True_ChooseMenu_SwitchCase {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int first,second,sum;
        System.out.println("======================================");
        System.out.print("Please Enter Your First Number : ");
        first = kb.nextInt();
        System.out.print("Please Enter Your Second Number : ");
        second = kb.nextInt();

        System.out.println("======================================");
        System.out.println("Menu :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("======================================");

        while (true) {
            System.out.print("Please Enter Your Choice : ");
            byte Choice = kb.nextByte();
            switch (Choice) {
                case 1:
                    sum = first + second;
                    System.out.println("Your Addition of " + first + " And " + second + " is " + sum);
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    sum = first - second;
                    System.out.println("Your Subtraction of " + first + " And " + second + " is " + sum);
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    System.out.println("Thank You for using our Menu");
                    System.out.println("--------------------------------------");
                    break;
            }

            if(Choice == 1)
                break;
            else if(Choice == 2)
                break;
            else if(Choice == 3)
                break;
            else{
                System.out.println("That isn't in the Menu,Chose again");
                System.out.println("--------------------------------------");
            }
        }

        kb.close();
    }
}
