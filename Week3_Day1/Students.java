package Week3_Day1;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int ourNum = in1.nextInt();
        int maxgrade = 0;
        int mingrade = 0;
        int average = 0;
        for (int i = 0; i < ourNum ; i++){
            System.out.println("Enter the grade for student " + (i + 1));
            int grade = in1.nextInt();
            if (i == 0){
                mingrade = grade;
            }
            if (grade > maxgrade){
                maxgrade = grade;
            } else if (grade < mingrade){
                mingrade = grade;
            }
            average += grade;
        }
        System.out.println("The average is " + average / ourNum);
        System.out.println("The maximum is " + maxgrade);
        System.out.println("The minimum is " + mingrade);

    }
}