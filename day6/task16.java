package day6;

import java.util.Random;
import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {

       Random j = new Random();
       int random = j.nextInt(100);
        System.out.println(random);
        while (true){

            Scanner in1 = new Scanner(System.in);
            System.out.print("Write your number");
            int input = in1.nextInt();
            if (input > random){

                System.out.println("too high");

            } else if (input < random){

                System.out.println("too low");

            } else {

                System.out.println("correct");
                break;
            }
        }
    }
}
