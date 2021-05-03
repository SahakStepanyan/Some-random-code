package day6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int i = 1;
        while (true){

            if (i * i < op){
                System.out.println(i * i);
            }else {
                break;
            }
            i++;

        }
    }
}
