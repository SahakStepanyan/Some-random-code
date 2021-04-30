package day5;

import java.util.Scanner;

public class someRandomTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Write your number");
        int someNum = in.nextInt();

        switch (Math.round(someNum / 100)){

            case 0:
                System.out.println("your num is in 0 - 100 range");
            break;
            case 1:
                System.out.println("your num is in 100 - 200 range");
                break;
            case 2:
                System.out.println("your num is in 200 - 300 range");
                break;


        }



    }
}
