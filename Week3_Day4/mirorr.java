package Week3_Day4;

import java.util.Scanner;

public class mirorr {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(mirortime(a,a.length()));
    }
    public static String mirortime(String yourString, int lenght){
        if (lenght == 0){
            return yourString;
        }
        if (yourString.charAt(lenght - 1) != '(' ){
            return mirortime(yourString += yourString.charAt(lenght - 1), lenght - 1);
        } else  return mirortime(yourString += ")", lenght - 1);
    }
}