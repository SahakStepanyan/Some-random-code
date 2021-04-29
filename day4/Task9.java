package day4;


import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write the year");
        int year = in.nextInt();
        if (year % 100 == 0 && year % 400 != 0){

            System.out.println("Your year is not leap");

        } else if (year % 4 == 0){

            System.out.println("Your year is leap");
        } else {

            System.out.println("Your year is not leap");
        }


    }
}
