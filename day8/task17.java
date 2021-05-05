package day8;

public class task17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, -7, 3, 7, 3, 3, 3, 5, 5};
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i + 1] < array[i]){
                t = 1;
            }
        }
        if (t == 0){
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
