package day7;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        for (int i = 1; i < a+1 ; i++){
            System.out.println();
            for (int j = 0; j < i; j++){
                System.out.print("&");
            }
        }
        for (int i = a ; i > 0; i--){

            System.out.println();
            for (int j = i; j > 0; j--){
                System.out.print("&");
            }
        }
        for (int i = a; i > 0; i--){
            System.out.println();
                for (int k = a - i; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i ; j > 0 ; j--){
                    System.out.print("&");
                }
        }
        for ( int i = 1; i < a+1; i++){
            System.out.println();
            for(int k = a - i; k > 0; k--){
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--){
                System.out.print("&");
            }
        }
    }
}
