package day6;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int ourNum = 0;
        while (input > 0){

            int lastDigit = input % 10;
            input = (input - lastDigit) / 10;
            ourNum += lastDigit;
        }
        System.out.println(ourNum);

    }
}
