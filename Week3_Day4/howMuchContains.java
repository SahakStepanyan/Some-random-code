package Week3_Day4;

import java.util.Scanner;

public class howMuchContains {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your number");
        int a = in1.nextInt();
        System.out.print("Enter your number that shall contains in first one");
        int b = in1.nextInt();
        System.out.println(counter1(a, b, 0));
    }
    public static int counter1(int yourNum, int contNum, int startpoint){
        if (yourNum == 0){
            return startpoint;
        }
        if (yourNum % 10 == contNum) {
            return counter1((yourNum - (yourNum % 10)) / 10, contNum, startpoint + 1);
        }else return counter1((yourNum - (yourNum % 10)) / 10, contNum, startpoint);
    }
}