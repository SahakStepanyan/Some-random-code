package makeSomeCoffy.IngradientsAndMore;

import makeSomeCoffy.IngradientsAndMore.*;

public class command {
    public command() {
    }
    public patern resolve(String code){
        patern patern = new patern();
        if (code.charAt(0) == 'C'){
            patern.ingradients[0] = new Coffy();
        } else  patern.ingradients[0] = new Tea();
        if (code.charAt(2) != 0){
            int i = Integer.parseInt(String.valueOf(code.charAt(2)));
            Sugar[] sugar = new Sugar[i];
            patern.ingradients[1] = sugar;
            patern.ingradients[2] = new Stick();
        }
        return patern;
    }
}
