package day8;

public class task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int minNum = array[0];
        for (int i = 1; i < array.length; i++){
            if ( array[i] > 0 && array[i] < minNum){
                minNum = array[i];
            }
        }
        System.out.println(minNum);
    }
}
