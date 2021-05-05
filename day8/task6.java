package day8;

public class task6 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int maxNum = array[0];
        int maxNumInt = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxNum){
               maxNum = array[i];
               maxNumInt = i - 1;
            }
        }
        System.out.println(maxNum);
        System.out.println(array[maxNumInt]);
    }
}
