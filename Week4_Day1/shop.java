package Week4_Day1;

import java.util.Scanner;

public class shop {
    String name;
    String adress;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;
    public shop(String name, String adress, int countOfProduct, int priceForProduct, int shopBalance){
        this.name = name;
        this.adress = adress;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
    public void checkOrder(int much){
        if (much<= countOfProduct){
            System.out.println("if you wana biy that much press 1");
            Scanner in1 = new Scanner(System.in);
            int p = in1.nextInt();
            if (p == 1){
                int totalPrice = calculateOrder(much);
                System.out.println("price is " + totalPrice);
                addToBalance(totalPrice);
                System.out.println("sucsess");
            }
        } else System.out.println("we havnt in order that much products");
    }
    public int calculateOrder(int money){
        int totalPrice = money * priceForProduct;
        return totalPrice;
    }
    public void addToBalance(int money){
        shopBalance += money;
    }
}
