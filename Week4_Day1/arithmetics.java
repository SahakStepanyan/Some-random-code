package Week4_Day1;

import java.util.Scanner;

public class arithmetics {
    int [] array;
    int backvalue;
    public arithmetics(int[] somearray){
        array = somearray;
    }
    public void options(){
        System.out.println("If you want to use bubble sort enter 1");
        System.out.println("If you want to use quick sort enter 2");
        System.out.println("If you want to use binary search enter 3");
        System.out.println("if you want to find element with max value enter 4");
        System.out.println("if you want to find element with min value enter 5");
        System.out.println("if you want to find average of elements enter 6");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        switch (a){
            case 2:
                quickSort(array, 0, array.length - 1);
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " ");
                }
                break;
            case 4:
                maxElement(array);
                System.out.println(backvalue);
                break;
            case 5:
                minElement(array);
                System.out.println(backvalue);
                break;
            case 6:
                average(array);
                System.out.println(backvalue);
                break;
            case 1:
                bubblesort(array);
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " ");
                }
                break;
            case 3:
                bubblesort(array);
                System.out.println("Enter number you wanna search");
                int bb = in1.nextInt();
                binarySearch(array, 0, array.length - 1, bb);
                System.out.println(backvalue);
        }
    }
    public int maxElement(int[] p){
        backvalue = p[0];
        for (int i = 1; i < p.length; i++){
            if (p[i] > backvalue){
                backvalue = p[i];
            }
        }
        return backvalue;
    }
    public int minElement(int[] p){
        backvalue = p[0];
        for (int i = 1; i < p.length; i++){
            if (p[i] < backvalue){
                backvalue = p[i];
            }
        }
        return backvalue;
    }
    public int average(int[] p){
        backvalue = 0;
        for (int i = 0; i < p.length; i++){
            backvalue += p[i];
        }
        backvalue = backvalue / p.length;
        return backvalue ;
    }
    public void bubblesort(int[] array1){
        while(true) {
            int jo = 0;
            for (int j = 1; j < array1.length; j++) {
                if (array1[j] < array1[j - 1]) {
                    int y = array1[j];
                    array1[j] = array1[j - 1];
                    array1[j - 1] = y;
                    jo = 1;
                }
            }
            if (jo == 0){
                break;
            }
        }
    }
    public void quickSort(int [] ourArray, int from, int to){
        if (from < to){
            int someint = kk(ourArray, from, to);
            quickSort(ourArray, from, someint -1);
            quickSort(ourArray, someint, to);

        }
    }
    public int kk(int [] ourArray, int from, int to){
        int hh = from;
        int yy = to;

        int pivot = ourArray[from];
        while (hh <= yy){
            while (ourArray[hh] < pivot){
                hh++;
            }
            while (ourArray[yy] > pivot){
                yy--;
            }
            if (yy <= hh){
                swaping(ourArray, hh, yy);
                hh++;
                yy--;
            }
        }
        return hh;
    }
    public void swaping(int[] somearray, int ind1, int ind2){
        int temp = somearray[ind1];
        somearray[ind1] = somearray[ind2];
        somearray[ind2] = temp;
    }
    public void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                backvalue = mid;
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found");
        }
    }
}
