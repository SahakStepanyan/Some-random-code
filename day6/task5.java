package day6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int i = 2;
        if (op > 1){
            System.out.println(1);
        } else {
            System.out.println("there is no solution");
        }
        while (true){

            if (i < op){
                System.out.println(i);
            } else {
                break;
            }
            i = i * 2;
        }
    }
    }
