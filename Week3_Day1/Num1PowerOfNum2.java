package Week3_Day1;

import java.util.Random;

public class Num1PowerOfNum2 {
    public static void main(String[] args) {
        Random o = new Random();
        double random1 = o.nextInt(20);
        int random2 = o.nextInt(20);
        System.out.print(Math.round(random1) + " ");
        System.out.print(random2 + " ");
        System.out.println(" " + Math.round(PowerOf(random1, random2)));
    }
    public static double PowerOf(double num1, int num2){
        return Math.pow(num1, num2);
    }
}
