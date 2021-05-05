package day8;

public class task5 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};

        for (int i = 1; i < array.length; i++){
            if (array[i] > 0 && array[i -1] > 0 || array[i] < 0 && array[i -1] < 0){
                System.out.println(array[i - 1]);
                System.out.println(array[i]);
            }
        }

    }
}
