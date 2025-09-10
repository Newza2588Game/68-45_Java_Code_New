
import java.util.Scanner;

public class W09_01_CalculateGrade {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        byte point;
        System.out.print("Enter Your Score : ");
        Scanner kb = new Scanner(System.in);
        point = kb.nextByte();

        if (point > 100 || point < 0) {
            System.out.println("That isn't a real score");
        } else if (point >= 80) {
            System.out.println("Your Grade is A");
        } else if (point >= 70) {
            System.out.println("Your Grade is B");
        } else if (point >= 60) {
            System.out.println("Your Grade is C");
        } else if (point >= 50) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F");
        }
        kb.close();
    }
}
