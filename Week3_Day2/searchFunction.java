package Week3_Day2;

public class searchFunction {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int d = 3;
        int j = 4;
        System.out.println(search(a));
        System.out.println(search(a,d));
        System.out.println(search(a, d , j));
    }
    public static int search( int[] a){
        return a.length;
    }
    public static int  search(int [] a, int b){
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                return i;
            }
        }
        return -1;
    }
    public static boolean search(int[] array, int argument, int index){
        for (int i = 0; i < array.length; i++){
            if (argument == array[i] && i == index){
                return true;
            }
        }
        return false;
    }
}