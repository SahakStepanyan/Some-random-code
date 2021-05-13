package Week3_Day4;

import java.util.Scanner;

public class asterix {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(something(a, "" ,0));
    }
    public static String something(String ourString, String emptyString, int zero){
        if (zero == ourString.length()){
            return emptyString;
        }
        if (zero == 0){
            return something(ourString, emptyString += ourString.charAt(zero), zero + 1);
        } else return something(ourString, emptyString += "^" + ourString.charAt(zero), zero + 1);
    }
}