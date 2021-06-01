package vendingMachineProject;

import vendingMachineProject.product.Output;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Output myProduct = vendingMachine.buyProduct();
        Output mySecondProduct = vendingMachine.buyProduct();
        System.out.println(myProduct.backMoney);
        System.out.println(mySecondProduct.backMoney);
    }
}