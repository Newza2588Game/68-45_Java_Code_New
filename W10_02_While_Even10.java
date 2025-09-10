public class W10_02_While_Even10 {
    public static void main(String[] args) {
        int i = 2,sum = 0;
        while(i <= 20){
            if(i % 2 == 0 && i != 20){
                sum += i;
                System.out.print(i + " + ");
            }
            else if(i == 20){
                sum += i;
                System.out.print(i + " = " + sum);
            }
            i++;
        }
    }
}
