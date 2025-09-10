
import java.util.Scanner;

public class W06_01_TotalNumber {
    public static void main(String[] args) {
        int i=0,sum,num;
        int[] digit = {};
        Scanner kb = new Scanner(System.in);
        System.out.print("Please Enter 3 Digit Number : ");
        num = kb.nextInt();

        while(num>0){
            digit[i] = num % 10;
            num = num/10;
            i++;
        }

        System.out.println("Hundreds Digit is " + digit[2] + "\nTens Digit is " + digit[1] + "\nOnes Digit is " + digit[0]);
        sum = digit[0] + digit[1] + digit[2];
        System.out.println("Summation of all 3 digit is " + sum);
        kb.close();
    }
}
