package Week4_Day1;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class sort {
    public students[] sort(students [] array){
        System.out.println("To sort students by age enter 1");
        System.out.println("To sort students by weight enter -1");
        System.out.println("To sort students by there names lenght enter 0");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        if (a < 0){
            while(true) {
                int jo = 0;
                for (int j = 1; j < array.length; j++) {
                    if (array[j].weight < array[j - 1].weight) {
                        students y = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = y;
                        jo = 1;
                    }
                }
                if (jo == 0){
                    break;
                }
            }
        } else if (a == 0){
            while(true) {
                int jo = 0;
                for (int j = 1; j < array.length; j++) {
                    if (array[j].name.length() < array[j - 1].name.length()) {
                        students y = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = y;
                        jo = 1;
                    }
                }
                if (jo == 0){
                    break;
                }
            }
        } else {
            while(true) {
                int jo = 0;
                for (int j = 1; j < array.length; j++) {
                    if (array[j].weight < array[j - 1].weight) {
                        students y = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = y;
                        jo = 1;
                    }
                }
                if (jo == 0){
                    break;
                }
            }
        }
        return array;
        }
    }

