package Week3_Day2;

public class reminderFunction {
    public static void main(String[] args){}
    public static int reminder(int a){
        int sum = 0;
        for (int i = 0; a > 0; i++){
            int lastdigit = a % 10;
            sum += lastdigit;
            a = (a - lastdigit) / 10;
        }
        return sum;
    }
    public static int reminder(int a , int b){
        int sum = 0;
        for (int i = 0; a > 0; i++){
            int lastdigit = a % 10;
            sum += lastdigit;
            a = (a - lastdigit) / 10;
        }
        return sum % b;
    }
}
