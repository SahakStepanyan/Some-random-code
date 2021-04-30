package day5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int mathMax = oo > op ? oo : op;
        int mathAbs = oo < 0 ? -oo : -oo;


    }
}
