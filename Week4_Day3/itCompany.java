package Week4_Day3;

public class itCompany {
    protected int countOfEmployers;
    protected String departmentName;

    public itCompany(int countOfImployers, String departmentName) {
        this.countOfEmployers = countOfImployers;
        this.departmentName = departmentName;
    }
    public itCompany() {
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void setCompanyName(String departmentName) {
        this.departmentName = departmentName;
    }
    protected void accounts(){}
}
