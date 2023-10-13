import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Student y = new Student();
    public static int arr[] = new int[2];
    
    public static void display() throws IOException{
        System.out.println("   Display");

        for(int i = 0; i<arr.length; i++){
            
            System.out.println("Name: " + y.getName());
            System.out.println("Age: " + y.getAge());
            System.out.println("Gender: "+ y.getGender());
            System.out.println("Grade: "+ y.getGrade());
            System.out.println();
        }
        
    }
    public static void create() throws IOException{
         for(int i=0; i<arr.length; i++){
            System.out.println();
            System.out.println("Student " + i);
            System.out.print("Enter Name: ");
            y.setName(input.readLine());
            System.out.print("Enter Age: ");
            y.setAge(Integer.parseInt(input.readLine()));
            System.out.print("Enter Gender: ");
            y.setGender(input.readLine());
            System.out.print("Enter Grade: ");
            y.setGrade(Integer.parseInt(input.readLine()));
        }
    }
    public static void menu()throws IOException{
       
       boolean mainLoop = true;
        int choice;
        while(true){
        do{
                System.out.println("---------------");
                System.out.println("    Menu");
                System.out.println("---------------");
                System.out.println("[1] Create");
                System.out.println("[2] Display");
                System.out.print("Enter Choice:");
                choice = Integer.parseInt(input.readLine());
                
                switch(choice){
                    case 1: create();
                        break;
                    case 2: display();
                        break;
                    case 3:
                        break;
                    
                }
            }while(choice > 2 );
        }
    }
    
    public static void main(String[] args) throws IOException {
        menu();
    }
}
