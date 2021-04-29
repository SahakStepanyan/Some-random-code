package day4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        class point {
            int x;
            int y;
        }

        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your number");
        int op = in1.nextInt();
        int oo = in1.nextInt();
        int oi = in1.nextInt();
        int ou = in1.nextInt();

        point our1point = new point();
        point our2point = new point();

        our1point.x = oo;
        our1point.y = op;
        our2point.x = oi;
        our2point.y = ou;

        if ( our1point.x == 0 || our1point.y == 0 || our2point.x == 0 || our2point.y == 0  ){

            System.out.println("Syntax error");

        }

        if (our1point.x > 0 && our1point.y > 0 && our2point.x > 0 && our2point.y > 0 || our1point.x < 0 && our1point.y > 0 && our2point.x < 0 && our2point.y > 0 || our1point.x > 0 && our1point.y < 0 && our2point.x > 0 && our2point.y < 0 || our1point.x < 0 && our1point.y < 0 && our2point.x < 0 && our2point.y < 0){

            System.out.println("In the same quarter");

        } else {

            System.out.println(" Not In the same quarter");
        }

    }
}
