package day4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write your number");
        int someNum = in.nextInt();
        if (someNum% 5 ==0){

            System.out.println("your num is multiple of 5");

        } else {

            System.out.println("your num is not multiple of 5");

        }
    }
}