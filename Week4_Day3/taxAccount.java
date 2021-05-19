package Week4_Day3;

public class taxAccount extends Accounting {
    protected int taxOfcompany= countOfEmployers * 100 * 12;
    public taxAccount(){
    }
    @Override
    protected void accounts(){
        System.out.println(" we paying our exployers " + taxOfcompany  + "$ every year");
    }

    public void setTaxOfcompany(int taxOfcompany) {
        this.taxOfcompany = taxOfcompany;
    }
}
