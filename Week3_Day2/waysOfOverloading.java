package Week3_Day2;

public class waysOfOverloading {
    public static void main(String[] args) {
        System.out.println(method(5, 5));
        System.out.println(method(5,5,5));
        System.out.println(method(5,0.5));
        System.out.println(method(2.5, 7));
    }
    public static int method( int a, int b){
        return a+b;
    }
    public static int method(int a, int b, int c){
        return a + b + c;
    }
    public static int method(int a, double b){
        return a * a;
    }
    public static int method(double a , int b){
        return b + b;
    }
}