package additional.control.shop;

public class Product {

    public Product() {
    }

    public static String getOrdinaryGoods(String Product) {
        return Product;
    }


    public static double getOrdinaryGoods(double num) {
        return num;
    }


    public static String getPromotionalProduct(String name) {
        return name;
    }


    public static double getPromotionalProduct(double num) {
        return num;
    }

    public static double getPromotionalProductP(double num) {

        return getPromotionalProduct(num);
    }
    public static String getDiscountedGoods (String name){
        return name;
    }
    public static double getDiscountedGoods (double num){
        return num;
    }
    public static double getDiscountedGoodsP (double num){
        return getDiscountedGoods(num);
    }
    public static String getDiscountedGoodsS(String description){
        return description;
    }
   // public String toString(){

    }




