package polymorphism;

public class Polymorphism_Zyrel extends Polymorphism_Human{ 
    Polymorphism_Zyrel(String name){
        super(name);
    }
    void coding(){
        System.out.println(name + " kusog mangayo");
    }    
    public void studentCute(){
        System.out.println("Pildi Zyrel permi " + name);
    }
}