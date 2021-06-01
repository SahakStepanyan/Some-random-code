package vendingMachineProject;

import vendingMachineProject.product.Output;
import vendingMachineProject.product.Product;
import vendingMachineProject.product.Resolve;
import vendingMachineProject.product.Storage;
import vendingMachineProject.product.MoneyCounter;

import java.util.Scanner;

public class VendingMachine {
    Scanner scanner = new Scanner(System.in);
    Storage storage = new Storage();
    Resolve resolve = new Resolve();
    MoneyCounter counter = new MoneyCounter();
    public Output buyProduct(){
        Output output = new Output();
        System.out.println("Enter the code and count of product you buying (in A:4:2 format)");
        System.out.println("A - |  1 - Bear   : 2 - Cola   : 3 - Pepsi          : 4 - Soda");
        System.out.println("B - |  1 - Twix   : 2 - Mars   : 3 - Snickers       : 4 - KitKat");
        System.out.println("C - |  1 - Snacks : 2 - Lais   : 3 - BreadFingers   : 4 - Crackers ");
        System.out.println("D - |  1 - Durum  : 2 - Brduch : 3 - Without chease : 4 - With Chease");
        Resolve pattern;
        String code;
        while (true){
            code = scanner.next();
            try {
                pattern=resolve.codeResolve(code);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("pls try again");
            }
        }
        Product[] out;
        while (true){
            try {
                out = storage.productChooser(pattern);
                output.output = out;
                break;
            }catch (Exception e){
                e.printStackTrace();
                storage.getProductsFull();
            }
        }
        int cost = output.output.length * output.output[0].price;
        while (true){
            System.out.println("It will be " + cost + " Drams");
            int take = scanner.nextInt();
            try {
                output.backMoney = counter.counter(cost,take);
                break;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return output;
    }

}
