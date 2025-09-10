
import java.util.Scanner;

public class W07_04_AboutCircle {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int Choice;
        double Radius,Area,Circumference;
        System.out.print("Do you want to Calculate Circumference[1] or Area[2] : ");
        Scanner kb = new Scanner(System.in);
        Choice = kb.nextInt();

        System.out.print("Enter Your Circle Radius : ");
        Scanner k = new Scanner(System.in);
        Radius = k.nextDouble();

        if(Choice == 1){
            Circumference = 2 * Math.PI * Radius;
            System.out.println("Your Circumference of the Circle is " + Circumference);
        }
        else if(Choice == 2){
            Area = Math.PI * Math.pow(Radius,2);
            System.out.println("Your Area of the Circle is " + Area);
        }
        else{
            System.out.println("You did not Choose the Choice Correctly");
        }
        kb.close();
    }
}
