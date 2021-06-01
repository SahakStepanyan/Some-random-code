package vendingMachineProject.product;

public class Storage {
   public Product[][] products = new Product[16][9];

    public Storage() {
        for (int i = 0; i < products.length ; i++){
            switch (i){
                case 0:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Bear();
                    }
                    break;
                case 1:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Cola();
                    }
                    break;
                case 2:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Pepsi();
                    }
                    break;
                case 3:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Soda();
                    }
                    break;
                case 4:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Twix();
                    }
                    break;
                case 5:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Mars();
                    }
                    break;
                case 6:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Snickers();
                    }
                    break;
                case 7:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new KitKat();
                    }
                    break;
                case 8:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Snacks();
                    }
                    break;
                case 9:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Lais();
                    }
                    break;
                case 10:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new BreadFingers();
                    }
                    break;
                case 11:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Crackers();
                    }
                    break;
                case 12:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Durum();
                    }
                    break;
                case 13:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new Brduch();
                    }
                    break;
                case 14:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new WithoutChease();
                    }
                    break;
                case 15:
                    for (int j = 0; j < products[i].length; j++){
                        products[i][j] = new WithChease();
                    }
                    break;
            }
        }
    }
    public Product[] productChooser(Resolve code) throws NotEnoughProductsException{

        Product[] returned = new Product[code.productCount];
        int productAvalable = 9;
        for (int i = 0; i < products[code.productIndex].length; i++){
            if (products[code.productIndex][i] == null){
                productAvalable = i;
                break;
            }
        }
        if (productAvalable < code.productCount){
            throw new NotEnoughProductsException("Machine dont have that much product right now but dont worry, it have a method to full himself, incredible right?");
        }
        int oo = code.productCount;
        for (int i = products[code.productIndex].length - 1 ; oo > 0 ; i-- ){
            products[code.productIndex][i] = null;
            oo--;
        }
        switch (code.productIndex){
            case 0:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Bear();
                }
                break;
            case 1:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Cola();
                }
                break;
            case 2:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Pepsi();
                }
                break;
            case 3:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Soda();
                }
                break;
            case 4:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Twix();
                }
                break;
            case 5:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Mars();
                }
                break;
            case 6:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Snickers();
                }
                break;
            case 7:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new KitKat();
                }
                break;
            case 8:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Snacks();
                }
                break;
            case 9:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Lais();
                }
                break;
            case 10:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new BreadFingers();
                }
                break;
            case 11:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Crackers();
                }
                break;
            case 12:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Durum();
                }
                break;
            case 13:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new Brduch();
                }
                break;
            case 14:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new WithoutChease();
                }
                break;
            case 15:
                for (int i = 0; i < returned.length; i++){
                    returned[i] = new WithChease();
                }
                break;
        }
        return returned;
    }
    public void getProductsFull() {
        Product[][] products = new Product[16][9];
        for (int i = 0; i < products.length; i++) {
            switch (i) {
                case 0:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Bear();
                    }
                    break;
                case 1:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Cola();
                    }
                    break;
                case 2:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Pepsi();
                    }
                    break;
                case 3:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Soda();
                    }
                    break;
                case 4:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Twix();
                    }
                    break;
                case 5:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Mars();
                    }
                    break;
                case 6:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Snickers();
                    }
                    break;
                case 7:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new KitKat();
                    }
                    break;
                case 8:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Snacks();
                    }
                    break;
                case 9:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Lais();
                    }
                    break;
                case 10:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new BreadFingers();
                    }
                    break;
                case 11:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Crackers();
                    }
                    break;
                case 12:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Durum();
                    }
                    break;
                case 13:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new Brduch();
                    }
                    break;
                case 14:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new WithoutChease();
                    }
                    break;
                case 15:
                    for (int j = 0; j < products[i].length; j++) {
                        products[i][j] = new WithChease();
                    }
                    break;
            }
        }
        System.out.println("Storage has been fulled");
        this.products = products;
    }
}