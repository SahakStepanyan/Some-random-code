package day4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        if (oo > 10 && op != 10){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }

        if (oo > 0 && op > 0){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }if (oo < 0 && op < 0){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }if (oo >10 && op < 1 && oo % 2 != 0 && op % 2 != 0){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }if (oo % 5 == 0 && op % 5 == 0){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }if (oo % 5 == 0 && op % 5 != 0){

            System.out.println("Both a and b legal");

        } else {

            System.out.println("No legal");

        }


    }
}
