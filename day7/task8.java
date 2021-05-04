package day7;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int j = 0;
        for (int i = 1; i < a+1; i++){
            if (a % i == 0){
                j++;
            }
        }
        System.out.println(j);

    }
}
