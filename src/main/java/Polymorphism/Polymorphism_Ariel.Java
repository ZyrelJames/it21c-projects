package polymorphism;

public class Polymorphism_Ariel { //parent class
    String name;    
    Polymorphism_Ariel(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kusog mo kaon og siomai");
    }    
    void sleep(){
        System.out.println(name + " gwapo og matulog");
    }    
    void tae(){
        System.out.println(name + " gwapo bisag malibang");
    }
    void coding(){
        System.out.println(name + " ga pula ang mga code");
    }       
    public void studentCute(){
        System.out.println("bati og nawong " + name);
    }
}