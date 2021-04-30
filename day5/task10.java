package day5;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your number");
        int op = in1.nextInt();
        switch (op % 2){

            case 0:
                System.out.println("your number is even");
                break;
            default:
                System.out.println("your number is odd");

        }
    }
}
