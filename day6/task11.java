package day6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int i = 1;
        while (i < input + 1){
            if (i % 3!= 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
