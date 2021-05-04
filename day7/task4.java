package day7;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int b = in1.nextInt();
        int count = 0;
        for (;b > 0;){
            int lastdigit = b % 10;
            if (lastdigit == a){
                count++;
            }
            b = (b - lastdigit) / 10;
        }
        System.out.println(count);
    }
}
