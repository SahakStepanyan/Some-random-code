package day8;

public class task15 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, -7, 3, 7, 3, 3, 3, 5, 5};
        int y = 0;
            for (int i = 0; i < array.length; i++){
                for(int j = 0; j < array.length; j++){
                    if (array[i] == array[j] && i != j){
                       y = 1;
                       break;
                    } else {
                        y = 0;
                    }
                   }
                if (y == 0){
                    System.out.print(array[i]);
                }
                }
            }
    }

