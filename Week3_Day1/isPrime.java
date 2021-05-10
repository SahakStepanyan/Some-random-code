package Week3_Day1;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        long ourNum = in1.nextInt();
        System.out.print(ourNum + "    ");
        System.out.println("is " + isPrime1(ourNum));
    }
    public static boolean isPrime1(long n){

        if (n != 1 && n < 20000000 && n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0){
            return true;
        } else {
            return false;
        }

    }
}
