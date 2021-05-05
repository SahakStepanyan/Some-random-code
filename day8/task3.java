package day8;

public class task3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int count = 0;
        for (int y = 0; y < array.length; y++){
            if (array[y] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
