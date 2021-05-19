package Week4_Day2;

import java.util.Scanner;

public class Store {
     private int countOfWorkers ;
     private String name ;
     private String phoneNumber;
     //array of product numbers(what kind of product are in store)
     int[] productArray;

    public Store(int countOfWorkers, String name, String phoneNumber, int[] productArray) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productArray = productArray;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers > 1 && countOfWorkers < 51) {
            this.countOfWorkers = countOfWorkers;
        } else System.out.println("value is not valid");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        } else System.out.println("value is not valid");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8 && phoneNumber.charAt(0) > 47 && phoneNumber.charAt(0) < 58  && phoneNumber.charAt(1) > 47 && phoneNumber.charAt(1) < 58 && phoneNumber.charAt(2) > 47 && phoneNumber.charAt(2) < 58 && phoneNumber.charAt(3) > 47 && phoneNumber.charAt(3) < 58 && phoneNumber.charAt(4) > 47 && phoneNumber.charAt(4) < 58 && phoneNumber.charAt(5) > 47 && phoneNumber.charAt(5) < 58 && phoneNumber.charAt(6) > 47 && phoneNumber.charAt(6) < 58  && phoneNumber.charAt(7) > 47 && phoneNumber.charAt(7) < 58)
        this.phoneNumber = phoneNumber;
    }

    public int[] getProductArray() {
        return productArray;
    }

    public void setProductArray(int[] productArray) {
        this.productArray = productArray;
    }

    public Store(){
     }
     public void sell(){
         System.out.println("What product you wanna buy, enter his number");
         Scanner in1 = new Scanner(System.in);
         int a = in1.nextInt();
         if (productArray[a] != 0) {
             productArray[a] = productArray[a] - 1;
             System.out.println("Transaction complete");
         }else System.out.println("Sry we are out of order");
     }
}
