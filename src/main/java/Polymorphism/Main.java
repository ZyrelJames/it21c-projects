package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Human my_Human = new Polymorphism_Human("Si Ariel ");
        Polymorphism_Ariel my_Ariel = new Polymorphism_Ariel ("Ariel");
        Polymorphism_Zyrel my_Zyrel = new Polymorphism_Zyrel ("Zyrel");
        
        my_Human.sleep();
        my_Ariel.sleep();
        my_Zyrel.coding();
        
        System.out.println("---------------------------------------");
        
        my_Human.humanGwapo();
        my_Ariel.eat();
        my_Zyrel.coding();
    }
}