package day8;

public class task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3};
        int b = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] != b){
                count++;
                b = array[i];
            }
        }
        System.out.println(count);
    }
}
