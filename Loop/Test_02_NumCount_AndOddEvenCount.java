
import java.util.Scanner;

public class Test_02_NumCount_AndOddEvenCount {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int i ,StartingNumber ,EndingNumber ,OddCount = 0 ,EvenCount = 0;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Please Enter Your Starting Number : ");
            StartingNumber = kb.nextInt();
            System.out.print("Please Ennter Your Ending Number : ");
            EndingNumber = kb.nextInt();

            if (StartingNumber < EndingNumber) {
                System.out.println("---------------Result----------------");
                System.out.print("Show All Number : ");
                for (i = StartingNumber; i <= EndingNumber; i++) {
                    System.out.print(i + " ");
                    if(i % 2 == 0){
                        EvenCount++;
                    }else{
                        OddCount++;
                    }
                }
                System.out.println("\nThere are " + EvenCount + " Even Number");
                System.out.println("There are " + OddCount + " Odd Number");
            }else{
                System.out.println("---------------warning---------------");
                System.out.println("Starting Number must be lower than Ending Number");
                System.out.println("Please Enter Your Number Again");
                System.out.println("-------------------------------------");
            }
        } while (StartingNumber >= EndingNumber);
        kb.close();
    }
}
