package day5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("What is the solution of X - 7 = 9 ?");
        int op = in1.nextInt();
        String answere = op == 16 ? "Correct!" : "Not correct";
        System.out.println(answere);



    }
}
