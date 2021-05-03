package day6;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int input2 = in1.nextInt();
        int input1 = in1.nextInt();
        int i = 0;

        while (input < input1){
            input = input + (input * input2) /100;
            i++;
        }
        System.out.println(i);

    }
}
