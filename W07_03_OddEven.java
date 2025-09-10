
import java.util.Scanner;

public class W07_03_OddEven {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int Number;
        System.out.print("Enter your Number : ");
        Scanner kb = new Scanner(System.in);
        Number = kb.nextInt();

        if(Number % 2 == 0){
            System.out.println("Your " + Number + " is Even");
        }
        else{
            System.out.println("Your " + Number + " is Odd");
        }
        kb.close();
    }
}
