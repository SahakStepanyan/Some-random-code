package day5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int oi = in1.nextInt();
        int maxNum = op > oo ? op : oo > oi ? oo : oi;

    }
}
