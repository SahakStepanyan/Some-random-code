package day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Write your number");
        int someNum = in.nextInt();
        if (someNum%2 == 0){

            System.out.println("your number is even");

        } else {

            System.out.println("your number is not even");
        }
    }
}
