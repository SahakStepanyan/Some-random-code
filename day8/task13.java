package day8;

public class task13 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, -1, 6, 7, 8, 9, 10};
        int maxindex = 0;
        int minindex = 1;
        int maxNum = array[0];
        int minNumm = array[1];
        for (int i = 2; i < array.length; i++){
           if (array[i] > maxNum){
               maxNum = array[i];
               maxindex = i;
           } else if (array[i] < minNumm){
                minNumm = array[i];
                minindex = i;
           }
        }
      maxNum = array[minindex];
        array[minindex] = array[maxindex];
        array[maxindex] = maxNum;

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
