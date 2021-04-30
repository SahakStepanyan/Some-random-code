package day5;

import java.util.Scanner;

public class someRandomTask {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Write your number");
        int someNum = in.nextInt();

        switch (Math.round(someNum / 45)){
            case 0:
                System.out.println("Your num is in 0 - 45 range");
                break;
            case 1:
                System.out.println("Your num is in 45 - 90 range");
                break;
            case 2:
                System.out.println("Your num is in 90 - 135 range");
                break;
            default:
                System.out.println("Your num is not in range");
        }


    }
}
