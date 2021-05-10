package Week3_Day1;

import java.util.Scanner;

public class factorialOf {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int o = in1.nextInt();
        System.out.println(factorial(o));
    }
    public static int factorial(int a){
        if (a == 0){
            return 1;
        }
        int fact = a;
        for (int i = a - 1; i > 0; i--){
            fact *= i;
        }
        return fact;
    }
}