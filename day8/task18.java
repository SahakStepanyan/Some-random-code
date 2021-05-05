package day8;

public class task18 {
    public static void main(String[] args){
        double[] array = {1, 2, 3, 3, 5, 5, 6 , 6, 6, 6};
        for (int i = 0; i < array.length; i++){
            int count = 0;
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }

            if (count >= array[i] / 2){
                System.out.print( Math.round(array[i]));
                break;
            }
        }
    }
}
