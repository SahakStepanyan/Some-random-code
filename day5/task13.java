package day5;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your points");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int oi = in1.nextInt();
        //MAX RESULT IS 150 POINTS
        int average = (op + oo + oi) / 3;
        String rate =average > ((150 / 100) * 80) && average < 150 ? "A" : average > ((150 / 100) * 60) && average < ((150 / 100) * 80) ? "B":average > ((150 / 100) * 40) && average < ((150 / 100) * 60) ? "C": "F"    ;
        switch (rate){

            case "A":
                System.out.println("Your rate is A");
            break;
            case "B":
                System.out.println("Your rate is B");
                break;
            case "C":
                System.out.println("Your rate is C");
                break;
            case "F":
                System.out.println("Your rate is F");
                break;

        }

        }
    }

