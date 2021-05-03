package day6;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int i = 1;
      while (true) {
          Scanner in1 = new Scanner(System.in);
          System.out.print("Write your number");
          int input = in1.nextInt();
          int input1 = input;
          while (input1 % 2 == 0){
              input1 = input1 / 2;
          }
          if (input % 2 != 0 || input1 != 1){
              i++;
          } else {
              System.out.println(input);
              System.out.println(i);
              break;
          }
      }
    }
}
