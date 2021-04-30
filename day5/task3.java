package day5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();

        if (op == 0){

            System.out.println(0);

        }
        String posOrNegative = op > 0 ? "Positive" : "Negative";
        System.out.println(posOrNegative);

    }
}
