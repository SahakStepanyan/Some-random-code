package day7;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
int ourNum = 0;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        for (int i = 0; i < 10; i++){
            int a = in1.nextInt();
            ourNum += a;
        }
        System.out.println(ourNum);
    }
}
