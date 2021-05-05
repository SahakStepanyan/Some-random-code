package day8;

public class task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int storage ;
        for (int i = 0; i < array.length; i += 2){
           storage = array[i];
           array[i] = array[i + 1];
           array[i + 1] = storage;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
