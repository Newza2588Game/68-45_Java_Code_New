
import java.util.Scanner;

public class W07_02_square_root {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        double num;
        System.out.print("Please Enter Your Number : ");
        Scanner kb = new Scanner(System.in);
        num = kb.nextDouble();
        
        if(num > 0){
            System.out.println("Square Root of " + num + " is " + Math.sqrt(num));
        }
        else{
            System.out.println("Your Number is 0 or lower");
        }
        kb.close();
    }
}
