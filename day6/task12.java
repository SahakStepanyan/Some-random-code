package day6;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int input = in1.nextInt();
        int count1 = 1;
        int count2 = 1;
        int count3 = 2;
        int i = 4;
        while (true){
           if (count3 == input){
               System.out.println(i);
               break;
           } else if (count3 > input){
               System.out.println(-1);
               break;
           }
           count1 = count2;
           count2 = count3;
           count3 = count1 + count2;
           i++;
        }
    }
}
