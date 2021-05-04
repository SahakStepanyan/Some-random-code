package day7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        for (int i = 1; i < a+1; i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }
    }
    }
