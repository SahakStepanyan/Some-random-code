package day7;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        for (int i = 1; i < a+1; i++){
            System.out.println();
            for (int j = 1 ; j < a+1; j++){
                int k = j * i;
                System.out.print(k);
            }
        }
    }
}
