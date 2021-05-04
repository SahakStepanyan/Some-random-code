package day7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        String u = "";
        String p = "";
        for (int i = 0; i < a; i++){
            u += "? ";
        }
        for (int i = 0; i < a; i++){
            p += " ?";
        }
        for (int j = 0; j < a; j++){
            System.out.println(u);
            System.out.println(p);
        }


    }
}
