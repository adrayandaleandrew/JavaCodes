import java.util.Scanner;


public class AppStore extends SetupAppStore{
    public static Scanner input = new Scanner(System.in);
    static AppStore allGames = new AppStore();
    
    public static void AddGame()
    {
            
            
            System.out.println("------------------------");
            System.out.println("   ADDING A NEW GAME");
            System.out.println("------------------------");
            System.out.println();
            
            System.out.print("Enter Game: ");
            allGames.setName(input.next());
            System.out.print("Enter Type: ");
            allGames.setType(input.next());
            System.out.print("Enter Size: ");
            allGames.setSize(input.nextInt());
            System.out.print("Enter Price: ");
            allGames.setPrice(input.nextInt());
            System.out.print("Enter Developer: ");
            allGames.setDeveloper(input.next()); 
    }
    public static void Display()
    {
          //AppStore allGames = new AppStore();

        System.out.println("Name: " + allGames.getName());
        System.out.println("Type: " + allGames.getType());
        System.out.println("Size: " + allGames.getSize());
        System.out.println("Price: " + allGames.getPrice());
        System.out.println("Developer: " + allGames.getDeveloper());
        
    }
    public static void menu(){
        int option;
        boolean mainLoop = true;
        while(true)
        {
            do
            {
                System.out.println("---------------------------------");
                System.out.println("           APPSTORE");
                System.out.println("---------------------------------");
                System.out.println("[1] Add Game");
                System.out.println("[2] Display ");
                System.out.print("Option: ");
                option = input.nextInt();

                switch(option)
                {
                    case 1: AddGame();
                        break;
                    case 2: Display();
                        break;
                }
            }while(option != 3);
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
