package Week4_Day1;

import java.util.Scanner;

public class university {
    int countOfStudents = 0;
    int MaxCountOfStudents = 2;
    int maxAgeOfStudents = 50;
    int minAgeOfStudents = 18;
    String name = "Miracle international";
    public university(){

    }
    public void printInfo (){
        System.out.println("we have " + countOfStudents + " students");
        System.out.println("the maxCount of stutends is " + MaxCountOfStudents);
        System.out.println("Name of university is " + name);
        System.out.println("the minimum age of student is " + minAgeOfStudents);
        System.out.println("the maximum age of student is " + maxAgeOfStudents);
    }
    public boolean checkAge(int age){
        if (age > minAgeOfStudents && age < maxAgeOfStudents){
            return true;
        }else return false;
    }
    public void addmission(){
        System.out.println("for java courses enter 1");
        System.out.println("for c++ courses enter 2");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        if (a == 1 || a == 2){
            System.out.println("Enter your age pls");
            int b = in1.nextInt();
            if (checkAge(b) == true && countOfStudents < MaxCountOfStudents){
                register();
                System.out.println("now we have " + countOfStudents + " students");
            } else System.out.println("We cant accept you sry");
        }
    }
    public void register(){
        countOfStudents += 1;
    }
}
