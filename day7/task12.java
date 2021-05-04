package day7;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int count = 0;
        for (int i = 1;true; i++){
            for (int j = 1; j < i + 1; j++ ){
                if (count == a){
                    break;
                }
                System.out.print(i);
                count++;
            }
        }
    }
}
