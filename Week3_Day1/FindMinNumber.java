package Week3_Day1;

import java.util.Random;

public class FindMinNumber {
    public static void main(String[] args) {
        Random o = new Random();
        int random1 = o.nextInt(20);
        int random2 = o.nextInt(20);
        int random3 = o.nextInt(20);
        int random4 = o.nextInt(20);
        System.out.print(random1 + " ");
        System.out.print(random2 + " ");
        System.out.print(random3 + " ");
        System.out.print(random4 + " ");
        System.out.println( "Your min num is " + min(random1, random2, random3, random4));
    }
    public static int min(int v1, int v2, int v3,int v4){
        if (v1 < v2 && v1 < v3 && v1 < v4){
            return v1;
        } else if (v2 < v3 && v2 < v4){
            return v2;
        } else if (v3 < v4){
            return v3;
        }else {
            return v4;
        }
    }
}
