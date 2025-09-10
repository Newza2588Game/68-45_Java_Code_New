
import java.time.Year;
import java.util.Scanner;

public class HW09_IfElse {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int ID, ShortYear, CurrentYear, StudentYear;
        System.out.print("Please Enter Your Student Number ID [9 Digit] : ");
        Scanner kb = new Scanner(System.in);
        ID = kb.nextInt();

        ShortYear = ID / 10000000;
        CurrentYear = Year.now().getValue() + 543;
        StudentYear = CurrentYear - (2500 + ShortYear) + 1;

        if (StudentYear == 1) {
            System.out.println("1 (Freshmen)");
        } else if (StudentYear == 2) {
            System.out.println("2 (Saphomore)");
        } else if (StudentYear == 3) {
            System.out.println("3 (Junior)");
        } else if (StudentYear == 4) {
            System.out.println("4 (Senior)");
        } else if (StudentYear > 4) {
            System.out.println(StudentYear + " Beyond 4 Years");
        } else {
            System.out.println("You're Not in the University yet");
        }
        kb.close();
    }
}
