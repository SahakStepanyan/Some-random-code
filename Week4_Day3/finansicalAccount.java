package Week4_Day3;

public class finansicalAccount extends taxAccount{
    int salryOfExployers ;
    public finansicalAccount(){

    }
    @Override
    protected void accounts(){
        System.out.println(" the total salry " + ( taxOfcompany + countOfEmployers)+ "$ every year");
        salryOfExployers = taxOfcompany + countOfEmployers;
    }
}
