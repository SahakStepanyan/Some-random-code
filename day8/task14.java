package day8;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, -7, 3, 7, 3, 3, 3, 5, 5};
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter th index of element to execute in 0 - 11 range");
        int a = in1.nextInt();
        int[] newArray = new int[array.length - 1];
        int onOf = 0;
        for (int i = 0; i < newArray.length; i++){
            if (a == i){
                newArray[i] = array[i+1];
                onOf = 1;
                continue;
            }
            if (onOf == 0) {
                newArray[i] = array[i];
            }else{
                newArray[i] = array[i+1];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
