package day7;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int input1 = in1.nextInt();
        if (input % 2 != 0){
            input++;
        }
        for (;input < input1 + 1;){

            System.out.println(input);
            input = input + 2;

        }
    }
}
