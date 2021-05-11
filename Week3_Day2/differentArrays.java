package Week3_Day2;

public class differentArrays {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        float[] b = {0.6f,1.2f};
        double[] i = {1.2, 6.7};
        print(a);
        System.out.println();
        print(b);
        System.out.println();
        print(i);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void print(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void print(double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}