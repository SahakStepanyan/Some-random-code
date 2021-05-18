package Week4_Day1;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
//       employer y = new employer(7, 110000, "Company", "Arthur");
//        employer i = new employer();
//        y.printInfo();
//        i.printInfo();


//        shop candyShop = new shop("Dasies sweetis", "arshakunyac 6",10, 100,0);
//        Scanner in1 = new Scanner(System.in);
//        System.out.print("How much candys you want");
//        int oo = in1.nextInt();
//        candyShop.checkOrder(oo);
//        university kk = new university();
//        kk.addmission();
//        kk.addmission();

//        int [] hh = { 2, 1,7,19, 67};
//        arithmetics jj = new arithmetics(hh);
//        jj.maxElement(hh);
        students student1 = new students("Sargis",22, 67);
        students student2 = new students("Edgar",11, 90);
        students student3 = new students("Dav",12, 56);
        students [] gstudentsArray = {student1,student2,student3};
        sort ii = new sort();
        ii.sort(gstudentsArray);
        for (int i = 0; i < gstudentsArray.length; i++) {
            System.out.print(gstudentsArray[i].weight + " ");
        }

    }
}