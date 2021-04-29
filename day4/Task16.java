package day4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int b = in1.nextInt();
        int c = in1.nextInt();

        double D = Math.pow(a, 2) - (4 * b * c);
        if (D < 0){

            System.out.println("Cant be");

        } else if (D == 0){

            System.out.println((-b + Math.sqrt(D)) / 2 * a );

        } else {

            System.out.println((-b + Math.sqrt(D)) / 2 * a );
            System.out.println((-b - Math.sqrt(D)) / 2 * a );

        }



    }
}
