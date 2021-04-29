package day4;

import java.util.Scanner;

public class Task14 {
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


            maxNum = op;

            if (oo > oi){
                notMaxNum = oo;
                notMaxNum2 = oi;
            } else {

                notMaxNum = oi;
                notMaxNum2 = oo;
            }

        } else if (oo > oi){

            maxNum = oo;

            if (op > oi){
                notMaxNum = op;
                notMaxNum2 = oi;
            } else {
                notMaxNum = oi;
                notMaxNum2 = op;
            }
        } else {


            maxNum = oi;

            if (op > oo){
                notMaxNum = op;
                notMaxNum2 = oo;
            } else {
                notMaxNum = oo;
                notMaxNum2 = op;

            }
        }

        System.out.println(maxNum);
        System.out.println(notMaxNum);
        System.out.println(notMaxNum2);

    }
}
