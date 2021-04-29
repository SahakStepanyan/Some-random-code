package day4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int oi = in1.nextInt();

        if (op == oo && op == oi){

            System.out.println("3");
        } else if (op == oo || oo == oi){

            System.out.println("2");

        } else {

            System.out.println("0");
        }


    }
}
