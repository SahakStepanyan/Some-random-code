package day7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int b = in1.nextInt();
        int c = in1.nextInt();
        int d = in1.nextInt();

        for (;a < b + 1;){

            if (a % d == c){
                System.out.println(a);
            }
            a++;
        }
    }
}
