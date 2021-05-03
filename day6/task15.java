package day6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {

        int maxNum = 0;
        int maxNum2 = 0 ;
        while (true) {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Write your number");
            int input = in1.nextInt();
            
            if (input > maxNum){
                maxNum2 = maxNum;
                maxNum = input;
            }
            if (input == 0){
                break;
            }

        }
        System.out.println(maxNum2);

    }
}
