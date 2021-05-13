package Week3_Day4;

import java.util.Scanner;

public class cutSimetry {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(cutSimetrical(a, "", 0));
    }
    public static String cutSimetrical(String yourString,String emptystring, int zero){
        if (zero == yourString.length()){
            return emptystring;
        }
        if (yourString.charAt(zero) != yourString.charAt(yourString.length() - 1 - zero) || zero == yourString.length() - 1 - zero){
            return cutSimetrical(yourString, emptystring += yourString.charAt(zero), zero + 1);
        } else  return cutSimetrical(yourString, emptystring , zero + 1);
    }
}