package postassessment;
import java.util.Scanner;

public class Programs extends School {
    
    Programs(String name) {
        super(name);
        
    }
    void ProgramName(){
        Scanner scanner = new Scanner(System.in);
        
            
        System.out.println("1.TEP ");
        System.out.println("2.BSBA ");
        System.out.println("3.BSIT ");
        System.out.println(name + "Enter Program Name: ");
        String name = scanner.nextLine();
        
        
        
        //System.out.print("1. TEP ");
       // String tep = scanner.nextLine();
        
        //System.out.print("2. BSBA ");
        //String bsba = scanner.nextLine();
        
       // System.out.print("3. BSIT ");
       // String bsit = scanner.nextLine();
        
        System.out.println(name + ".Teacher Education Program ");
        
        scanner.close();
    }
}