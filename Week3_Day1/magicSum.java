package Week3_Day1;

import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        System.out.println( magicsum1());
    }
    public static int magicsum1(){
        int sum = 0;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Write your numbers and -1 if you wanna stop");
        while (true){
            int o = in1.nextInt();
            if (o == -1){
                break;
            }
            int oCopy = o;
            while (oCopy > 0){
                int lastdigit = oCopy % 10;
                if (lastdigit == 8){
                    sum += o;
                    break;
                }
                oCopy = (oCopy - lastdigit) / 10;
            }
        }
        return sum;
    }
}