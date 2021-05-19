package Week4_Day2;

public class triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public triangle(){
    }

    public void getSideA(){
        System.out.println(sideA);
    }
    public void getSideB(){
        System.out.println(sideB);
    }
    public void getSideC(){
        System.out.println(sideC);
    }
    public void setSideA(int sideA){
        if (sideA > 0 && sideA < 20) {
           this.sideA = sideA;
        } else System.out.println("Invalid value, try again");
    }
    public void setSideB(int sideB){
        if (sideB > 0 && sideB < 20) {
            this.sideB = sideB;
        } else System.out.println("Invalid value, try again");
    }
    public void setSideC(int sideC){
        if (sideC > 0 && sideC < 20) {
            this.sideC = sideC;
        } else System.out.println("Invalid value, try again");
    }
    public void check(){
        if (isTriangleValid(this.sideA, this.sideB, this.sideC)){
            System.out.println("Triangle is valid");
        } else System.out.println("Triangle is not valid");
        if (isRight(this.sideA, this.sideB, this.sideC)){
            System.out.println("Your triangle also right");
        } else System.out.println("Also your triangle is not right");
    }
    private boolean isTriangleValid(int sideA, int sideB, int sideC){
        if (sideA + sideB < sideC || sideC + sideB < sideA || sideC + sideA < sideB){
            return true;
        }else return false;
    }
    private boolean isRight(int sideA, int sideB, int sideC){
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.sqrt(sideC) ||Math.pow(sideC, 2) + Math.pow(sideB, 2) == Math.sqrt(sideA) || Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.sqrt(sideB)){
           return true;
        }else return false;
    }
}
