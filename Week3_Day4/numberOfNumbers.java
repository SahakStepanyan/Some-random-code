package Week3_Day4;

import java.util.Scanner;

public class numberOfNumbers {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(numofnums(a, 0, 0));
    }
    public static int numofnums(String ourstring, int enterZero , int enterZero1){
        if (enterZero == ourstring.length()){
            return enterZero1;
        }
        if (ourstring.charAt(enterZero) >= '0' && ourstring.charAt(enterZero) <= '9' ){
            return numofnums(ourstring, enterZero + 1, enterZero1 + 1);
        }else return numofnums(ourstring, enterZero + 1, enterZero1);
    }
}