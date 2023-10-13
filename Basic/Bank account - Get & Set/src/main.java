import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main extends attri{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static attri Attri = new attri();
    static int[] arr = new int[5];
    static String response = " ";

    public static void create() throws IOException{
        for(int i = 0; i < 1 ; i++){
             System.out.println("----------------------");
            System.out.println("         CREATE");
             System.out.println("----------------------");
            System.out.print("Enter Account Number: ");
            Attri.setAccountNo(Integer.parseInt(input.readLine()));
            System.out.print("Enter Desired Password: ");
            Attri.setPin(Integer.parseInt(input.readLine()));     
        }
        menu();
    }
    
    public static void withdraw() throws IOException{
        System.out.println();
        System.out.println("----------------------");
        System.out.println("      WITHDRAWAL ");
        System.out.println("----------------------");
        System.out.print("Withdraw Amount: ");
        Attri.setAmount(input.read());
        do{
            System.out.print("Withdraw Amount: ");
            Attri.setAmount(input.read());
        }while(Attri.getAmount()>= 10000);
        
        menu();
    }
    public static void changePin() throws IOException{
        System.out.println("----------------------");
        System.out.println("      PIN CHANGE");
        System.out.println("----------------------");
        System.out.print("Enter Current Pin: ");
        Attri.setPin(Integer.parseInt(input.readLine()));
        if(Attri.getPin() != Attri.getPin()){
            System.out.println("Wrong input");
        }
        else{
            System.out.print("Enter New Pin: ");
            Attri.setPin(input.read());
            System.out.println("Confrim New Pin: ");
            Attri.setPin(input.read());
            
        }
        System.out.println("Success");
        System.out.println("Password / Pin Has Been Changed");
        
        menu();
        
    }
    
    public static void deposit() throws IOException{
        
        
        System.out.println();
        System.out.println("----------------------");
        System.out.println("     DEPOSIT");
        System.out.println("----------------------");
        System.out.println("Enter Deposit Amount: ");
        Attri.setAmount(input.read());
        System.out.println("New amount is: " + Attri.getAmount());
        
    }
    
    public static void inquiry() throws IOException{
        int deduction = Attri.getAmount() - 2; 
        System.out.println();
        System.out.println("----------------------");
        System.out.println("       INQUIRY");
        System.out.println("----------------------");
        System.out.print("Enter Account No: ");
        Attri.setAccountNo(Integer.parseInt(input.readLine()));
        
        System.out.println("Amount: " + deduction);
        
        System.out.println("Do you want to Check Another Account ? Y/N");
        response = input.readLine();
        
        
        if(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("y")){
            inquiry();
        }
        else if(response.equalsIgnoreCase("N") || response.equalsIgnoreCase("n")){ 
        }
        menu();

    }
    public static void menu() throws IOException{
        int option;
//        boolean MainLoop = true;
//        while(true){
//            do{
                System.out.println("-----------------------");
                System.out.println("          ATM");
                System.out.println("-----------------------");
                System.out.println("[1] CREATE");
                System.out.println("[2] INQUIRY");
                System.out.println("[3] DEPOSIT");
                System.out.println("[4] WITHDRAW");
                System.out.println("[5] CHANGE PIN");
                System.out.println("[6] EXIT");
                System.out.print("Option: ");
                option = Integer.parseInt(input.readLine());
                
                switch(option){
                    case 1: create();
                        break;
                    case 2:  inquiry();
                        break;
                    case 3: deposit();
                        break;
                    case 4: withdraw();
                        break;
                    case 5:  changePin();
                        break;
                    case 6: 
                        System.exit(0);
                        break;
                }  
//            }while(option != 7 );
//        }
    }
    public static void main(String[] args) throws IOException {
         menu();
    }
   
    
}
