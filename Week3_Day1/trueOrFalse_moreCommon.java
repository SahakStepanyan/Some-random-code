package Week3_Day1;

import java.util.Scanner;

public class trueOrFalse_moreCommon {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write True or False");
        boolean firstBoolean = in1.nextBoolean();
        boolean secondBoolean = in1.nextBoolean();
        boolean thirdBoolean = in1.nextBoolean();
        System.out.print(firstBoolean + " ");
        System.out.print(secondBoolean + " ");
        System.out.print(thirdBoolean + "    ");
        System.out.println(moreCommon(firstBoolean, secondBoolean, thirdBoolean));
    }
    public static boolean moreCommon(boolean a,boolean b,boolean c){
        int one = 0;
        int two = 0;
        if (a == true){
            one++;
        } else {
            two++;
        }
        if (b == true){
            one++;
        } else {
            two++;
        }
        if (c == true){
            one++;
        } else {
            two++;
        }
        if (one > two){
            return true;
        }else {
            return false;
        }
    }
}
