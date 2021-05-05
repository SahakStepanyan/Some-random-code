package fibonachi;

public class task {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < 10; i++)
        {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int i = arr.length - 1; i > 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
