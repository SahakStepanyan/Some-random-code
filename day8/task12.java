package day8;

public class task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int[] newArray = new  int[array.length];
        newArray[0] = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++){
           newArray[i + 1] = array[i];
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(newArray[i]);
            System.out.print(" ");
        }
    }
}
