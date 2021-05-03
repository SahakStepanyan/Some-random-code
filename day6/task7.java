package day6;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int i = 2;
        while(i < input){
            System.out.println(i);
            i += 2;
        }
    }
}
