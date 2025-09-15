
import java.util.Scanner;

public class HW14_IfOddorEven {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int startingNumber, endingNumber, i;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Please enter starting number : ");
            startingNumber = kb.nextInt();
            System.out.print("Please enter ending number : ");
            endingNumber = kb.nextInt();
            if (startingNumber < endingNumber) {
                for (i = startingNumber; i <= endingNumber; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is an Even number.");
                    } else {
                        System.out.println(i + " is an Odd number.");
                    }
                }
            } else {
                System.out.println("Your starting number must be less than ending number.");
                System.out.println("===============================");
            }
        } while (startingNumber >= endingNumber);
        kb.close();
    }
}
