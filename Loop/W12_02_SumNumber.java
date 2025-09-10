
import java.util.Scanner;

public class W12_02_SumNumber {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int i, j = 0, Start, End, sum = 0;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Enter Your Starting number : ");
            Start = kb.nextInt();
            System.out.print("Enter Your Ending number : ");
            End = kb.nextInt();
            if (Start < End) {
                for (i = Start; i <= End; i++) {
                    j++;
                    System.out.println("Run No." + j + " " + sum + " + " + i + " = " + (sum += i));
                }
            } else {
                System.out.println("Your Starting number must be less than Ending number.");
            }
        } while (Start >= End);

        kb.close();
    }
}
