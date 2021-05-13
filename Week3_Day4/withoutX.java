package Week3_Day4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(xCleaner(a, "", 0));

    }
    public static String xCleaner(String yourString,String emptyString, int zero){
        if (zero == yourString.length()){
            return emptyString;
        }
        if (yourString.charAt(zero) == 'x'){
            return xCleaner(yourString, emptyString, zero + 1);
        }else  return xCleaner(yourString, emptyString += yourString.charAt(zero), zero + 1);
    }
}