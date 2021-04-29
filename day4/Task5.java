package day4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number first num");
        int someNum1 = in1.nextInt();
        int someNum2 = in1.nextInt();
        int someNum3 = in1.nextInt();
        if (someNum1 > someNum2 && someNum1 > someNum3){

            System.out.println(someNum1);

        } else if (someNum2 > someNum3){

            System.out.println(someNum2);

        }else {

            System.out.println(someNum3);

        }

    }
}
