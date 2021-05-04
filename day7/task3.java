package day7;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int b = in1.nextInt();
        for (;a < b + 1;){
            double root = Math.sqrt(a) * 10;
            if (root % 10 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
