package day6;

public class task10 {
    public static void main(String[] args) {

        char i = 32;
        int j = 1;
        while (i < 123){
            System.out.print(i);
            i++;
            j++;
            if (j == 10){
                System.out.println(i + 1);
                i++;
                j = 0;
            }
        }
    }
}
