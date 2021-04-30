package day5;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        System.out.print("Enter your symbole");
        String op = bb.nextLine();
        switch (op){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(op + " is a vowel");
                break;
            default:
                System.out.println(op + " is not a vowel");

        }

    }
}
