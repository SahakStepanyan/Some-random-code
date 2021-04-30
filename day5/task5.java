package day5;

public class task5 {
    public static void main(String[] args) {

        String ourString = new String( "jjbf");
        int oo = ourString.equals(null) ? -1 : ourString.equals("") ? 0: 1;
        System.out.println(oo);
    }
}
