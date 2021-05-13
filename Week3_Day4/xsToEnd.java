package Week3_Day4;

import java.util.Scanner;

public class xsToEnd {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(xToEnd(a,"", "", 0));
}
    public static String xToEnd(String yourString,String emptyString, String xS, int zero){
        if (zero == yourString.length()){
            return emptyString += xS;
        }
        if (yourString.charAt(zero) == 'x'){
            return xToEnd(yourString, emptyString, xS += yourString.charAt(zero), zero + 1);
        }else  return xToEnd(yourString, emptyString += yourString.charAt(zero), xS, zero + 1);
    }
}