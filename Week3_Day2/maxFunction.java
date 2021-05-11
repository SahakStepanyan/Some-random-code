package Week3_Day2;

public class maxFunction {
    public static void main(String[] args){}
    public static int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
    public static int max(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if (c > b){
            return c;
        }else {
            return b;
        }
    }
    public static int max(int a, int b, int c, int d){
        if (a > b && a > c && a > d){
            return a;
        }else if (d > b && d > c){
            return d;
        }else if (b > c){
            return b;
        }else {
            return c;
        }
    }
}
