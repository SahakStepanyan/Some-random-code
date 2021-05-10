package Week3_Day1;

import java.util.Scanner;

public class isVowel {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your char");
        String ourChar = in1.nextLine();

        System.out.println(isVowel1(ourChar));
    }
    public static boolean isVowel1(String s){
        if (s.charAt(0) == 65 || s.charAt(0) == 97 || s.charAt(0) == 69 || s.charAt(0) == 101 || s.charAt(0) == 73 || s.charAt(0) == 105 || s.charAt(0) == 79 || s.charAt(0) == 111 || s.charAt(0) == 85 || s.charAt(0) == 117){
            return true;
        }else {
            return false;
        }
   }
}