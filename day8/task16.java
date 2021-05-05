package day8;

public class task16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, -7, 0, 7, 3, 0, 3, 5, 5};
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                newArray[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
