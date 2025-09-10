
import java.util.Scanner;

public class W07_01_Excondition {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        byte point;

        System.out.println("Condition Statement");
        System.out.print("Enter Your Score : ");
        Scanner kb = new Scanner(System.in);
        point = kb.nextByte();
        
        if(point > 100){
            System.out.println("That isn't a real score");
        }
        else if (point >= 80) {
            System.out.println("A");
        }
        else if (point >= 75) {
            System.out.println("B+");
        }
        else if (point >= 70) {
            System.out.println("B");
        }
        else if(point >= 65){
            System.out.println("C+");
        }
        else if (point >= 60) {
            System.out.println("C");
        }
        else if (point >= 55) {
            System.out.println("D+");
        }
        else if (point >= 50) {
            System.out.println("D");
        }
        else if(point > 0){
            System.out.println("F");
        }
        else{
            System.out.println("That isn't a real score");
        }

        /*if(point >= 40)
        System.out.println("1" + point);
        else{
            System.out.println("0");
            System.out.println(point++);
        }
        if(point >= 90)
        System.out.println(point++);
        else
        System.out.println(++point);
        System.out.println(--point);*/

        kb.close();
    }
}
