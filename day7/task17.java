package day7;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your password");
        String a = in1.nextLine();
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;
        for(int i = 0; i < a.length(); i++){
            int j = a.charAt(i);
            if (j > 47 && j < 58){
                point1 = 1;
            }else if(j > 61 && j < 94){
                point2 = 1;
            } else if (j > 96 && j < 123){
                point3 = 1;
            }else {
                point4 = 1;
            }
        }
        if (a.length() - 1 < 6 || a.length() - 1 > 16 || point1 == 0 || point2 == 0|| point3 == 0|| point4 == 0){
            System.out.println("invalid");
        }else {
            System.out.println("Valid");
        }
    }
}
