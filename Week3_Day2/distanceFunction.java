package Week3_Day2;

public class distanceFunction {
    public static void main(String[] args) {
        System.out.println(distance(1 ,1));
    }
    public static double distance(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static double distance(int a, int b , int d, int c){
        int x = a - d;
        int y = b - c;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}