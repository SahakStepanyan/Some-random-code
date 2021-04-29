package day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write your number");
        int k = in.nextInt();

        if (k != 1 && k !=2 && k !=4 && k != 7 ){

            System.out.println("Yes");

        } else {

            System.out.println("No");
        }

    }
}
