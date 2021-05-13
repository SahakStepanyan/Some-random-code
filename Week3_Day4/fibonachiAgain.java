package Week3_Day4;

import java.util.Scanner;

public class fibonachiAgain {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        int a = in1.nextInt();
        System.out.println(fib(a, 0,1));
    }
    public static int fib(int count , int num1 , int num2){
        if (count == 2){
            return num2;
        }
        return fib(count - 1, num2 , num1 + num2);
    }
}