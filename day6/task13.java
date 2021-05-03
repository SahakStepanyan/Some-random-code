package day6;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int input1 = in1.nextInt();
        int i = 0;
        float j = input;
        while (j < input1){
            j += j * 0.1;
                    i++;
        }
        System.out.println(i);
    }
}
