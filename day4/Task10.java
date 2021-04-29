package day4;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        Random randNum = new  Random();
        int randomNUM = randNum.nextInt();
        if (randomNUM > -1000 && randomNUM < 1000 && randomNUM % 3 == 0 || randomNUM % 5 == 0 ){

            System.out.println("True");

        } else {

            System.out.println("False");

        }

    }
}
