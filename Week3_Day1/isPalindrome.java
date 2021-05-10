package Week3_Day1;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write True or False");
        int ourNum = in1.nextInt();
        System.out.println(isPolindrome1(ourNum));

    }
    public static boolean isPolindrome1(int a){
        if (a > 0 && a < 10){
            return false;
        }
        String o = String.valueOf(a);
        for (int i = 0;i < o.length() / 2; i++){
            if (o.charAt(i) != o.charAt(o.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}