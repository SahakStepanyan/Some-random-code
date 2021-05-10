package Week3_Day1;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write True or False");
        boolean firstBoolean = in1.nextBoolean();
        boolean secondBoolean  = in1.nextBoolean();
        System.out.print(firstBoolean + " ");
        System.out.print(secondBoolean + "    ");
        System.out.println(TrueOrFalse1(firstBoolean, secondBoolean));
    }
    public static boolean TrueOrFalse1(boolean a, boolean b){
        if (a == b){
            return false;
        } else {
            return true;
        }
    }
}
