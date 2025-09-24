package Array;

import java.util.Scanner;

public class W15_02_SumNumber {

    @SuppressWarnings({"ConvertToTryWithResources", "resource"})
    public static void main(String[] args) {

        double num[] = new double[5],min[] = new double[5],max[] = new double[5];
        double sumAll = 0, sumOdd = 0,sumEven = 0,avg;
        int i;
        Scanner kb = new Scanner(System.in);
        min[0] = 999999999;
        for (i = 0; i < num.length; i++) {
            System.out.print("Please Enter number " + (i + 1) + " : ");
            num[i] = kb.nextDouble();
            sumAll += num[i];
        }

        avg = sumAll / num.length;

        System.out.println("================================");
        System.out.println("index elements in array");

        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("Index Odd num[" + i + "] = " + num[i]);
                sumOdd += num[i];
            }
            else {
                System.out.println("Index Even num[" + i + "] = " + num[i]);
                sumEven += num[i];
            }
        }

        
        for (i = 1; i < num.length; i++) {
            if (num[i] < min[0]) {
                min[0] = num[i];
            }
            if (num[i] > max[0]) {
                max[0] = num[i];
            }
        }

        System.out.println("================================");
        System.out.println("Sum of all elements in array = " + sumAll);
        System.out.println("Sum of odd index elements in array = " + sumOdd);
        System.out.println("Sum of even index elements in array = " + sumEven);
        System.out.printf("Average of all elements in array = %.2f\n", avg);
        System.out.println("Minimum number = " + min[0]);
        System.out.println("Maximum number = " + max[0]);
        System.out.println("================================");
        kb.close();
    }
}
