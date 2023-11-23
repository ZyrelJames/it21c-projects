public class Equipment extends Name{
    
    Equipment(String name){
        super(name);
    }

    void action1(){
        System.out.println(name+ " getting burst");
    }

    void action2(){
        System.out.println(name+ " getting knock out");
    }
}