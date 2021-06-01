package vendingMachineProject.product;

public class Resolve {
    private int row ;
    private int innerRow;
    public int productCount;
    int productIndex;
    public Resolve codeResolve(String code) throws CodeInvalidationException{
        if (code.charAt(0) != 65 && code.charAt(0) != 66 && code.charAt(0) != 67 && code.charAt(0) != 68 || code.charAt(2) > 52 || code.charAt(2) < 49 || code.length() > 5 || code.charAt(4) > 57 || code.charAt(4) < 49 ){
            throw new CodeInvalidationException("Inserted product code is not valid");
        }
        Resolve pattern = new Resolve();
        if (code.charAt(0) == 65){
            pattern.row = 1;
        }else if (code.charAt(0) == 66){
            pattern.row = 2;
        }else if (code.charAt(0) == 67){
            pattern.row = 3;
        }else if (code.charAt(0) == 68){
            pattern.row = 4;
        }

        if (code.charAt(2) == 49){
            pattern.innerRow = 1;
        }else if (code.charAt(0) == 50){
            pattern.innerRow = 2;
        }else if (code.charAt(0) == 51){
            pattern.innerRow= 3;
        }else if (code.charAt(0) == 52){
            pattern.innerRow = 4;
        }
        pattern.productCount = code.charAt(4) - 48;

        switch (pattern.row){
            case 1 :
                switch (pattern.innerRow){
                    case 1 :
                        pattern.productIndex = 0;
                        break;
                    case 2 :
                        pattern.productIndex = 1;
                        break;
                    case 3 :
                        pattern.productIndex = 2;
                        break;
                    case 4 :
                        pattern.productIndex = 3;
                        break;
                }
                break;
            case 2 :
                switch (pattern.innerRow){
                    case 1 :
                        pattern.productIndex = 4;
                        break;
                    case 2 :
                        pattern.productIndex = 5;
                        break;
                    case 3 :
                        pattern.productIndex = 6;
                        break;
                    case 4 :
                        pattern.productIndex = 7;
                        break;
                }
                break;
            case 3 :
                switch (pattern.innerRow){
                    case 1 :
                        pattern.productIndex = 8;
                        break;
                    case 2 :
                        pattern.productIndex = 9;
                        break;
                    case 3 :
                        pattern.productIndex = 10;
                        break;
                    case 4 :
                        pattern.productIndex = 11;
                        break;
                }
                break;
            case 4 :
                switch (pattern.innerRow){
                    case 1 :
                        pattern.productIndex = 12;
                        break;
                    case 2 :
                        pattern.productIndex = 13;
                        break;
                    case 3 :
                        pattern.productIndex = 14;
                        break;
                    case 4 :
                        pattern.productIndex = 15;
                        break;
                }
                break;
        }
        return pattern;
    }
}
