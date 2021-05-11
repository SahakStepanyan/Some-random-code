package Week3_Day2;

public class sameParameters {
    public static void main(String[] args) {
        System.out.println( getfloat(9));
        System.out.println( getInt(9));
    }
    public static float getfloat(int i){
        float a = i;
                return a;
    }
    public static int getInt(int i){
        i += 8;
        return i;
    }

}