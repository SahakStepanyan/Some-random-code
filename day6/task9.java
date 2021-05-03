package day6;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int i = 1;
        int j = 0;
        while (true){
            if (i * 2 > input){
                System.out.println(j);
                break;
            } else {
                i *= 2;
                j += 1;
            }

        }
    }
}
