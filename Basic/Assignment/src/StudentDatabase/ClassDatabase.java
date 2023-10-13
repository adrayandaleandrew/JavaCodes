
package StudentDatabase;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ClassDatabase {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Setup s = new Setup();
    static int sn;
    static String fn;
    static String add;
    static String mn;
    
    public static void display() throws IOException{
        System.out.print("Enter Student Number: ");
        int x = input.read();
        if(x == sn){
            s.showInfo(sn);
        }
        else{
            System.out.println("Wrong input..");
            System.out.println("Please Enter Valid Student Number...");
            display();
        }
        
        
    }
    
    public static void add() throws IOException{
        System.out.println();
        System.out.println("----------------");
        System.out.println("ADDING STUDENTS");
        System.out.println("----------------");
        System.out.println();
        System.out.print("Enter Student Number: ");
        sn = input.read();
        
        System.out.print("Enter FullName: ");
         fn = input.readLine();
         System.out.println("\n");
        
        System.out.print("Enter Address: ");
         add = input.readLine();
         System.out.println("\n");
        
        System.out.print("Enter Mobile Number: ");
        mn = input.readLine();
        
        s.addInfo(sn, fn, add, mn);
        
        System.out.println();
        System.out.println("Success");
        
        menu();
    }
    
    public static void menu() throws IOException{
        System.out.println();
        System.out.println("------------------");
        System.out.println("      MENU");
        System.out.println("------------------");
        System.out.println("[1] ADD");
        System.out.println("[2] DISPLAY");
        System.out.println("[3] Exit");
        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(input.readLine());
        switch(choice){
            case 1: add();
                break;
            case 2: display();
                break;
            case 3: System.exit(0);
                break;
        }
    }
    public static void main(String[] args) throws IOException {
        
        
        
        menu();
        
//        s.addInfo(201630007, "Dale Andrew Adrayan", "Decena st. Pasay City", "09498485923");
//        s.showInfo(x);
//        System.out.println();
//        System.out.println();
    }
}
