package Week3_Day4;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your number");
        int a = in1.nextInt();
        isPrime1(a);
    }
    public static void isPrime1(int number){
        if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0  ){
            System.out.println(number + " is prime");
        }else System.out.println(number + " is not prime");
    }
}