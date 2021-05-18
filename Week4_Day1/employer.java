package Week4_Day1;

public class employer {
   private int salary;
   private int age;
   private String workSpace;
   private String name;

   public employer(int age, int salary , String name, String workSpace){
       this.age = age;
       this.salary = salary;
       this.workSpace = workSpace;
       this.name = name;
   }
    public employer(){

    }
   public void printInfo(){
       System.out.println("Age "+this.age);
       System.out.println("Name "+this.name);
       System.out.println("salary "+this.salary);
       System.out.println("working in "+this.workSpace);
   }
}
