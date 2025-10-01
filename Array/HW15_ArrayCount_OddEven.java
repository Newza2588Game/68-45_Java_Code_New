package Array;

public class HW15_ArrayCount_OddEven {

    public static void main(String[] args) {
        int arr[] = {7 ,9 ,-1 ,4 ,12 ,9 ,3 ,2 ,-7 ,2 ,1 ,9 ,-15 ,24 ,11 ,13};
        int i,oddCount = 0,evenCount = 0;

        for (i=0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Odd Count: " + oddCount);
        System.out.println("Even Count: " + evenCount);
    }
}
