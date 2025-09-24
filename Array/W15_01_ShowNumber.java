package Array;

public class W15_01_ShowNumber {
    public static void main(String[] args) {
        int num[] = new int[100];
        int i,x;
        num[0] = 24;
        for (i = 0; i < num.length; i++) {
            num[i] = i + 24;
            System.out.println("Index num[" + i + "] = " + num[i]);
        }

        x = num[49];

        System.out.println("================================");
        System.out.println("Index at no.24 = " + num[24]);
        System.out.println("Index at no.50 = " + x);
        System.out.println("Index of final num = " + num[99]);

    }
}
