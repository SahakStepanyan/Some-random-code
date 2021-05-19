package Week4_Day3;

public class Accounting extends itCompany {

    public Accounting(int countOfImployers, String departmentName) {
        this.countOfEmployers = countOfImployers;
        this.departmentName = departmentName;
    }
    public Accounting() {
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    @Override
    protected void accounts(){
        System.out.println("Total sailing is" + countOfEmployers * 100 + "$");
    }
}
