package vendingMachineProject.product;

public class NotEnoughMoneyException extends Exception{
   public NotEnoughMoneyException(String message){
       super(message);
   }
}
