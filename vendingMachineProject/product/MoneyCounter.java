package vendingMachineProject.product;

public class MoneyCounter {
    public int counter(int cost, int take)throws NotEnoughMoneyException{
        int i = cost - take;
        if (i > 0){
            throw new NotEnoughMoneyException("You ow " + i + " drams more");
        }else return -i;
    }
}
