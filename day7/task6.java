package day7;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int recorder = 0;
        for (int i = 2; i < 5; i++){
            if (a % i == 0){
                recorder = 1;
                System.out.println(i);
                break;
            }
        }
        if (recorder == 0){
            System.out.println(a);
        }
    }
}
