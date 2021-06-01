package vendingMachineProject.product;

public class NotEnoughProductsException extends Exception{
    public NotEnoughProductsException(String message) {
        super(message);
    }
}
