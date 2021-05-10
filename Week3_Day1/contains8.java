package Week3_Day1;

import java.util.Scanner;

public class contains8 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int o = in1.nextInt();
        System.out.println(is8In(o));
    }
    public static boolean is8In(int a){
        String o = String.valueOf(a);
        for (int i = 0; i < o.length(); i++){
            if (o.charAt(i) == 56){
                return true;
            }
        }
        return false;
    }
}