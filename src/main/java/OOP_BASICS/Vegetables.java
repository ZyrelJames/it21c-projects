
package OOP_BASICS;


public class Vegetables {
    String vegetables_name;
    double vegetables_price;
    
    Vegetables(String vegetables_name,double vegetables_price){
        this.vegetables_name = vegetables_name;
        this.vegetables_price = vegetables_price;
       }
    
    void showVegetablesName(){
        System.out.println(vegetables_name + " is lami");
    }
    
    void showVegetablesPrice(){
        System.out.println(vegetables_price + " barato ra");
    }
    
}
