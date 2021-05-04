package day7;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int a1 = a;
        int newNum = 0;
        int count = 1;
        for (;a > 0;) {
            int lastdigit = a % 10;
            a = (a - lastdigit) / 10;
            count *= 10;
        }
        count = count / 10;
        for (;a1 > 0;){
            int lastdigit = a1 % 10;
            newNum += lastdigit * count;
            count = count / 10;
            a1 = (a1 - lastdigit) / 10;

        }
        System.out.println(newNum);
    }
}
