package day7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        String u = "";
        for (int i = 0; i < a; i++){
            u += "*";
        }
        for (int j = 0; j < a; j++){
            System.out.println(u);
        }
    }
}
