package day6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number greater than 2");
        int op = in1.nextInt();
        int i = 2;
        while (true){
            if (op % i == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
