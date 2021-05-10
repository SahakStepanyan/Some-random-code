package Week3_Day1;

import java.util.Scanner;

public class fibElement {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your fib number");
        int ourNum = in1.nextInt();
        if (fib(ourNum) == -1){
            System.out.println("Your number is not in fibonachi line");
        }else{
            System.out.println(fib(ourNum));
        }
    }
    public static int fib(int a){
        int fib2 = 1;
        int fib1 = 1;
        int fib3 = 0;
        for (int i = 3; fib2 <= a; i++){
            if (a == fib2){
                return i;
            }
            fib3 = fib1;
            fib1 = fib2;
            fib2 = fib3 + fib1;

        }
        return -1;
    }
}