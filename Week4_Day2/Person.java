package Week4_Day2;

public class Person {
    private String sex;
    private String firstName;
    private String lastName;
    private String passportId;
    private String nationality;
    private int age;
    public Person(String nationality,String passportId, String firstName, String lastName,int age,String sex){
        this.sex = sex;
        this.nationality = nationality;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.passportId = passportId;
    }
    public Person(){}
    public void getLastName(){
        System.out.println(lastName);
    }
    public void getFirstName(){
        System.out.println(firstName);
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getSex(){
        System.out.println(sex);
    }
    public void getPassportId(){
        System.out.println(passportId);
    }
    public void getNationality(){
        System.out.println(nationality);
    }




    public void setLastName(String lastName){
        if (lastName.length() > 6 && lastName.length() < 20) {
            this.lastName = lastName;
        }else System.out.println("invalid value, pls try again");
    }
    public void setFirstName(String firstName){
        if (firstName.length() > 3 && firstName.length() < 15) {
            this.firstName = firstName;
        }else System.out.println("invalid value, pls try again");
    }
    public void setAge(int age){
        if (age > 18 && age < 99){
            this.age = age;
        }else System.out.println("invalid value, pls try again");
    }
    public void setSex(String sex){
        if (sex.compareTo("female") == 0  ||sex.compareTo("male") == 0 ) {
            this.sex = sex;
        } else System.out.println("invalid value, pls try again");
    }
    public void setPassportId(String passportId){
        if(passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N'  && passportId.charAt(2) > 47 && passportId.charAt(2) < 58 && passportId.charAt(3) > 47 && passportId.charAt(3) < 58 && passportId.charAt(4) > 47 && passportId.charAt(4) < 58&& passportId.charAt(5) > 47 && passportId.charAt(5) < 58&& passportId.charAt(6) > 47 && passportId.charAt(6) < 58 && passportId.charAt(7) > 47 && passportId.charAt(7) < 58 && passportId.length() < 9 ) {
            this.passportId = passportId;
        } else System.out.println("invalid value, pls try again");
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void display(){
        getFirstName();
        getLastName();
        getNationality();
        getAge();
        getSex();
        getPassportId();
    }
}
