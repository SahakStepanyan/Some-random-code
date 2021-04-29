package day4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Write your number between 1 and 7");
        int someNum = in.nextInt();
        if (someNum == 1){

            System.out.println("Sunday");

        } else if (someNum == 2){

            System.out.println("Monday");

        } else if (someNum == 3){

            System.out.println("Tuesday");

        } else if (someNum == 4){

            System.out.println("Wednesday");

        } else if (someNum == 5){

            System.out.println("Thursday");

        } else if (someNum == 6){

            System.out.println("Friday");

        } else if (someNum == 7){

            System.out.println("Saturday");

        } else {

            System.out.println("Syntax error");
        }
    }
}
