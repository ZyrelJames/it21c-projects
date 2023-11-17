import java.util.Scanner;



public class ZyrelJames{
    String name,section,motto;
    
    public String getName(){
         
        return name;
    }
    void setName(){
        
        name = new Scanner(System.in).nextLine();
    
    }
    public String getSection(){
         
        return section;
    }
    void setSection(){
        
        section = new Scanner(System.in).nextLine();
    
    }
    public String getMotto(){
         
        return motto;
    }
    void setMotto(){
        
        motto = new Scanner(System.in).nextLine();
    
    }

    void Info(){
        
        System.out.println("Name: "+name);
        System.out.println("Section: "+section);
        System.out.println("Motto: \n"+motto);
    
    }
    
    
}