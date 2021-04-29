package day4;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Write your age");
        int age = in.nextInt();
        if (age >= 18){

            System.out.println("you are eligible to vote");

        } else {

            System.out.println("you are not eligible to vote");

        }
    }

}
