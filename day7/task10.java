package day7;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int a = in1.nextInt();
        int count = 0;
        int num = 0;
        for (int i = a; i > 0; i = (i - (i % 10))/ 10){
            count++;
        }
        for (int i = 0; i < count; i++){
            int lastdigit = a % 10;
            num += lastdigit * Math.pow(2, i );
            a = (a - lastdigit) / 10;
        }
        System.out.println(num);

    }
}
