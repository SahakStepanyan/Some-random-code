package Week3_Day1;

import java.util.Random;

public class copyOfArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random o = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = o.nextInt(10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] copy = copyOf(array);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
    public static int[] copyOf(int[] array1){
        int[] newArray = new int[array1.length];
                for(int i = 0; i < array1.length; i++){
                    newArray[i] = array1[i];
                }
                return newArray;
    }
}