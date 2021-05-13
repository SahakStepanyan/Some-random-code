package Week3_Day4;

import java.util.Scanner;

public class deleteDublicates {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(cleaner(a, " ", 0, 0));
    }
    public static String cleaner(String yourString, String emptyString,int zero, int zero1 ){
        if (zero == yourString.length()){
            return emptyString;
        }
        if (yourString.charAt(zero) != emptyString.charAt(zero1)){
            return cleaner(yourString, emptyString += yourString.charAt(zero), zero + 1, zero1 + 1);
        }else  return cleaner(yourString, emptyString , zero + 1, zero1);

    }
}