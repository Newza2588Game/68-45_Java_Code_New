
import java.util.Scanner;

public class W12_01_For_SumNumber {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int i, j = 0, Start, End, sum = 0;
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Your Starting number : ");
        Start = kb.nextInt();
        System.out.print("Enter Your Ending number : ");
        End = kb.nextInt();

        while (Start >= End) {
            System.out.println("Your Starting number must be less than Ending number.");
            System.out.print("Enter Your Starting number : ");
            Start = kb.nextInt();
            System.out.print("Enter Your Ending number : ");
            End = kb.nextInt();
        }

        /*if (Start < End) {*/
        for (i = Start; i <= End; i++) {
            j++;
            /*if (i % 2 != 0) {
                System.out.println(sum + " + " + i + " = " + (sum += i));
                }*/
            System.out.println("Run No." + j + " " + sum + " + " + i + " = " + (sum += i));
        }
        /*} else {
            System.out.println("Your Starting number must be less than Ending number.");
        }*/
        kb.close();
    }
}
