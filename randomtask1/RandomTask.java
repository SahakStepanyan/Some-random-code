package randomtask1;

import java.util.Random;

public class RandomTask {
    public static void main(String[] args) {
        int[] j = new int[10];
        Random o = new Random();
        for (int i = 0; i < j.length - 1; i++) {
            j[i] = o.nextInt(20);
        }
        inverse(j);
        printing(j);
    }

    public static int[] inverse(int[] i) {
        for (int b = 0; b < i.length - 1; b++) {
            i[b] = -i[b];
        }
        return i;
    }

    public static void printing(int[] i) {
        for (int b = 0; b < i.length - 1; b++) {
            System.out.print(i[b]);
            System.out.print(i[b] + " ");
        }
    }
}
