package day5;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the expression");
        String ii = in2.next();
        switch (ii){
            case "+":
                System.out.println(op + oo);
                break;
            case "-":
                System.out.println(op - oo);
                break;
            case "*":
                System.out.println(op * oo);
                break;
            case "/":
                System.out.println(op / oo);




        }
    }
}
