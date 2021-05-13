package Week3_Day4;

import java.util.Scanner;

public class reverseRecurs {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(Reverse(a,"",a.length()));
    }
    public static String Reverse(String yourString,String emptyString, int lenght){
        if (lenght == 0){
            return emptyString;
        }
         return Reverse(yourString, emptyString += yourString.charAt(lenght - 1), lenght - 1);
    }
}