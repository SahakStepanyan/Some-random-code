package Week3_Day4;

import java.util.Scanner;

public class countBlocks {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int a = in1.nextInt();
        System.out.println((countblocks(1, a)));
    }
    public static int countblocks(int pick, int rows){
        if (rows == 1){
            return pick;
        }
        return pick + countblocks(pick+1, rows-1);
    }
}