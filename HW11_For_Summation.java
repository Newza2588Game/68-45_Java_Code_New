
public class HW11_For_Summation {

    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i != 20) {
                sum += i;
                System.out.print(i + " + ");
            } else if (i == 20) {
                sum += i;
                System.out.print(i + " = " + sum);
            }
        }
    }
}
