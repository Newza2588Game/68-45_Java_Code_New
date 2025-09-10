
import java.util.Scanner;

public class W09_02_BMI {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        double height,weight,BMI;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Weight [KG] : ");
        weight = kb.nextDouble();

        System.out.print("Enter Your Height [Cm] : ");
        height = kb.nextDouble();

        height /= 100;
        BMI = weight / (Math.pow(height,2));

        System.out.println("Your BMI is : " + String.format("%.2f", BMI));

        if(BMI >= 40){
            System.out.println("You're Obesity Lv.3");
        }
        else if(BMI >= 35){
            System.out.println("You're Obesity Lv.2");
        }
        else if(BMI >= 30){
            System.out.println("You're Obesity Lv.1");
        }
        else if(BMI >= 25){
            System.out.println("You're Overweight");
        }
        else if(BMI >= 18.5){
            System.out.println("You're Healthy");
        }
        else{
            System.out.println("You're Underweight");
        }
        kb.close();
    }
}
