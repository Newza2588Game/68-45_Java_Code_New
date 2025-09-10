
import java.util.Scanner;

public class W11_01_While_True {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        /* 
        while (true) {
            System.out.print("Please Enter Your Number [9 to stop] : ");
            int x = kb.nextInt();
            if (x == 9)
                break;
        }
        */

        while (true) { 
            System.out.print("Please Enter Your Charactor [e to stop]: ");
            String x = kb.nextLine();
            if(x.equals("e"))
                break;
        }

        kb.close();
    }
}
