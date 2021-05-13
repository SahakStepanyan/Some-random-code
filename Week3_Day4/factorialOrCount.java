package Week3_Day4;

import java.util.Scanner;

public class factorialOrCount {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        int a = in1.nextInt();
        int[] b = {1,2,3,4,5};
        System.out.println(count(b, b.length));

    }
    public static int count(int num){
        if (num == 1){
            return 1;
        }
       return num * count(num - 1);
    }
    public static int count(int[] num , int lenght){
         if (lenght == 0){
             return 0;
         }
         return num[lenght - 1] + count(num, lenght - 1);
    }
}