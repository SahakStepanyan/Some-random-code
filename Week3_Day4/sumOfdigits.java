package Week3_Day4;

import java.util.Scanner;

public class sumOfdigits {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your number");
        int a = in1.nextInt();
        System.out.println(countDigitsRec(a, 0));
    }
    public static int countDigitsRec(int yourNum, int startpoint){
        if (yourNum == 0){
            return startpoint;
        }
        return countDigitsRec((yourNum - (yourNum % 10)) / 10, startpoint + ( yourNum % 10));
    }
}