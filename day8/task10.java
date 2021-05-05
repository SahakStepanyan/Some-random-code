package day8;

public class task10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int j;
        for (int i = 0; i < array.length / 2; i++){
            j = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = j;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }




    }
}
