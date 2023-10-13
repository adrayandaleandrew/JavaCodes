
package MP9;
import java.util.Scanner;


public class CardCollect {
    public static Scanner input = new Scanner(System.in);
    static Setup deck = new Setup();
    
    //HEART
    static String h = "HEART";
    static String e;
    
    public static void heartDisplay(){
        System.out.println();
        System.out.println("---------------------");
        System.out.println("LIST OF CARDS");
        deck.showHearts();
        menu();
    }
    public static void addHearts(){
        System.out.println("----------------------");
        System.out.print("Enter Desired Rank: ");
        e = input.next();
        deck.addSpade(d, i);
        System.out.println("You Successfully Add " + h);
        System.out.println("------------------------");
        menu();
    }
    
    //DIAMOND
    static String d = "DIAMONDS";
    static String i;
    
    public static void diamondDisplay(){
        System.out.println();
        System.out.println("--------------------");
        System.out.println("LIST OF CARDS");
        deck.showDiamonds();
        menu();
    }
    public static void addDiamond(){
        System.out.println("----------------------");
        System.out.print("Enter Desired Rank: ");
        i = input.next();
        deck.addSpade(d, i);
        System.out.println("You Successfully Add " + d);
        System.out.println("------------------------");
        menu();
    }
    
    
    //SPADE
    static String s = "SPADES";
    static String p;
    
    public static void spadeDisplay(){
        System.out.println();
        System.out.println("-------------------");
        System.out.println("LIST OF CARDS:");
        deck.showSpade();
        menu();
    }
    public static void addSpade(){
        System.out.println("----------------------");
        System.out.print("Enter Desired Rank: ");
        p = input.next();
        deck.addSpade(s, p);
        System.out.println("You Successfully Add " + s);
        System.out.println("------------------------");
        menu();
    }
    
    
    
    //FOR CLUBS
    static String a = "CLUBS"; 
    static String b;
    
    public static void clubsDisplay(){
        System.out.println();
        System.out.println("-------------------");
        System.out.println("LIST OF CARDS:");
        deck.showClubs();
        menu();
    }
    public static void addClubs(){
          System.out.println("----------------------");
          System.out.print("Enter Desired Rank: ");
          b = input.next();
          deck.addClubs(a, b);
          System.out.println("You Successfully Add " + a);
          System.out.println("------------------------");
          menu();
    }
  
    //DISPLAYING
    public static void display(){
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(" DISPLAYING CARD INFO");
        System.out.println("-------------------------");
        System.out.println(" CARD TYPE");
        System.out.println();
        System.out.println("[1] CLUBS");
        System.out.println("[2] SPADE");
        System.out.println("[3] HEART");
        System.out.println("[4] DIAMOND");
        System.out.println("[5] BACK");
        System.out.println("option: ");
        int option = input.nextInt();
        
        switch(option){
            case 1: clubsDisplay();
                break;
            case 2: spadeDisplay();
                break;
            case 3: heartDisplay();
                break;
            case 4: diamondDisplay();
                break;
            case 5: menu();
                break;
        }
    }
    
    //ADDING
 
    public static void add(){
        System.out.println("----------------------");
        System.out.println("     ADDING CARDS");
        System.out.println("----------------------");
        System.out.println(" CARD TYPE");
        System.out.println();
        System.out.println("[1] CLUBS");
        System.out.println("[2] SPADE");
        System.out.println("[3] HEART");
        System.out.println("[4] DIAMOND");
        System.out.println("[5] BACK");
        System.out.print("option: ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1: addClubs();
                break;
            case 2: addSpade();
                break;
            case 3: addHearts();
                break;
            case 4: addDiamond();
                break;
            case 5: menu();
                break;
        }
 
    }
    public static void menu(){
        System.out.println();
        System.out.println("--------------------");
        System.out.println(" CARDS COLLECTION");
        System.out.println("--------------------");
        System.out.println("[1] ADD");
        System.out.println("[2] DISPLAY");
        System.out.print("option: ");
        int option = input.nextInt();
        
        switch(option){
            case 1: add();
                break;
            case 2: display();
                break;
            case 3: 
                System.exit(0);
        }
    }
    
    public static void main(String[] args) {
       menu();
    }
}
