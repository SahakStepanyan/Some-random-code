package Week3_Day4;

import java.util.Scanner;

public class xcounter {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your String");
        String a = in1.nextLine();
        System.out.println(xCounter(a, 0,0));
    }
    public static int xCounter(String yourstring, int startpoint, int i){
        if (i == yourstring.length()){
            return startpoint;
        }
        if (yourstring.charAt(i) == 'x') {
            return xCounter(yourstring, startpoint + 1, i + 1 );
        }else return xCounter(yourstring, startpoint, i + 1 );
    }
}