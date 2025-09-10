package Array;

public class W13_02_BasicArray {

    public static void main(String[] args) {
        int i;
        String animals[] = {"Cat", "Dog", "Elephant", "Tiger", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float aveScore[] = {3.00f, 2.75f, 3.25f, 4.00f, 3.50f};
        byte count = 1;

        System.out.println("Size of animals array : " + animals.length);

        System.out.println("Animal at index 0 : " + animals[0]);
        System.out.println("Animal at index 3 : " + animals[3]);

        System.out.println("Show all aveScore : ");
        for (i = 0; i < aveScore.length; i++) {
           
            System.out.println((i + 1) + " : " + aveScore[i]);
            count++;
        }

        String colors[] = new String[4];
        colors[0] = "Red";
        colors[2] = "Blue";
        colors[3] = "Green";

        System.out.println("Size of colors array : " + colors.length);

        System.out.println("Color at index 0 : " + colors[0]);
        System.out.println("Color at index 1 : " + colors[1]);

        System.out.println("Show all colors : ");
        for (i = 0; i < colors.length; i++) {
            System.out.println("Color at index" + (i + 1) + " : " + colors[i]);
        }

        int score[] = new int[5];
        score[0] = 80;

        System.out.println("Size of score array : " + score.length);

        System.out.println("Score at index 4 : " + score[4]);
    }
}
