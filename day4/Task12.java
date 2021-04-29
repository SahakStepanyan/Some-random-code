package day4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        if(oo % 7 == 0 || op % 7 == 0 && oo > 0 && op > 0 && oo > op){

            System.out.println("True");


        } else {

            System.out.println("False");
        }


    }
}
