import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    static sub x = new sub();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void display() throws IOException{
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("          DISPLAY");
        System.out.println("------------------------");
        System.out.println("Type: " + x.getType());
        System.out.println("Brand: " + x.getBrand());
        System.out.println("Model: " + x.getModel());
        System.out.println("Colour: " + x.getColour());
        System.out.println("Speed: " + x.getSpeed());
        System.out.println("Price: " + x.getPrice());
        System.out.println();
    }
    public static void create() throws IOException{
        System.out.println();
        System.out.println("\n------------------------");
        System.out.print("\n Enter Type:");
        x.setType(reader.readLine());
        System.out.print("\n Enter Brand: ");
        x.setBrand(reader.readLine());
        System.out.print("\n Enter Colour: ");
        x.setColour(reader.readLine());
        System.out.print("\n Enter Model: ");
        x.setModel(Integer.parseInt(reader.readLine()));
        System.out.print("\n Enter Speed: ");
        x.setSpeed(Integer.parseInt(reader.readLine()));
        System.out.print("\n Enter Price: ");
        x.setPrice(Integer.parseInt(reader.readLine()));
    }
    public static void menu() throws IOException{
        
        boolean MainLoop = true;
        int choice;
        do{
            System.out.println();
            System.out.println("--------------");
            System.out.println(" Vehicle Menu");
            System.out.println("---------------");
            System.out.println("[1] Create");
            System.out.println("[2] Display");
            System.out.print("Enter Choice: ");
            
            choice = Integer.parseInt(reader.readLine());

            switch(choice){
                case 1: create();
                    break;
                case 2: display();
                    break;
                case 3: 
                    break;
            }
            
       }while(choice  != 3);
    }
    
    public static void main(String[] args) throws IOException{
        
        
        menu();
    }
}
