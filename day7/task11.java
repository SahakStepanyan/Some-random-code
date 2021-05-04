package day7;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number greater than 0");
        int a = in1.nextInt();
        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.print("Write your number");
        for (int o = 0;o < a; o++){
            int b = in1.nextInt();
            if (b == 0){
                zeroCount++;
            }else if(b > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println(positiveCount);
        System.out.println(zeroCount);
        System.out.println(negativeCount);

    }
}
