package Week3_Day1;

import java.util.Random;
import java.util.Scanner;

public class indexOfNumInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random o = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = o.nextInt(10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner in1 = new Scanner(System.in);
        System.out.println("Write your number");
        int ourNum = in1.nextInt();
        System.out.println(contains1(array, ourNum));
    }

    public static int contains1(int[] a, int b) {
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                return i;
            }
        }
        return -1;
    }
}
