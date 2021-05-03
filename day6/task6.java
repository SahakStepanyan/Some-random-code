package day6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        while (op > 0){
            op--;
            System.out.println(op);
        }
    }
}
