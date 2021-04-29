package day4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int oi = in1.nextInt();
        int maxNum;
        int notMaxNum;
        int notMaxNum2;

        if (op > oo && op > oi){

            notMaxNum = oo;
            maxNum = op;
            notMaxNum2 = oi;

        } else if (oo > oi){
            notMaxNum = op;
            maxNum = oo;
            notMaxNum2 = oi;
        } else {

            notMaxNum = op;
            maxNum = oi;
            notMaxNum2 = oo;
        }

        if ( maxNum > notMaxNum2 + notMaxNum){

            System.out.println("your triangle is normal");

        } else {

            System.out.println("your triangle is not normal");

        }

    }
}
