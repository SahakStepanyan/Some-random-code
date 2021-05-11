package Week3_Day2;

public class farenheit {
    public static void main(String[] args){
    }
    public static void farToCels(float celcius, int choice){
        if (choice == 1){
            float i = (celcius * (9/5))+ 32;
            int o = Math.round(i);
            System.out.println(o);
        }else if(choice == 2){
            float i = (celcius * (9/5))+ 32;
            double u = i;
            System.out.println(u);
        }
    }
    public static void farToCels(int choice, float farenheit){

        if (choice == 1){
            float i = (farenheit - 32) * (5 / 9);
            int o = Math.round(i);
            System.out.println(o);
        }else if(choice == 2){
            float i = (farenheit - 32) * (5 / 9);
            double u = i;
            System.out.println(u);
        }


    }
}
