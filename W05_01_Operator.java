
import java.util.Scanner;

public class W05_01_Operator {
    public static void main(String[] args) {
        int a,b,c,temp;
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        a = kb.nextInt();

        System.out.print("Enter 2nd Number : ");
        b = kb.nextInt();

        System.out.print("Enter 3rd Number : ");
        c = kb.nextInt();

        temp = c;
        c = b;
        b = a;
        a = temp;
        

        System.out.println("Your 1st NUmber is "+a);
        System.out.println("YOur 2nd Number is "+b);
        System.out.println("YOur 3nd Number is "+c);
        
        int x = 6;
        System.out.println(x-- + ++x - --x - x-- + x++ + x);
        //                 6       6     5   5     4     5

        double num = 1.6;num +=5.1;
        System.out.println(num % 4);
        kb.close();
    }
}
