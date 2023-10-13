import java.util.Scanner;

public class ACTIVITY {
    public static Scanner input = new Scanner(System.in);

    public static void mail(){
        System.out.println(" EMAIL TESTER");
        String pattern = "[a-z]+[0-9]*(@)?[a-z]+(.com|.net|.org)" ;
            String str = "";
            System.out.print("Enter Email Address: ");
            str = input.next();

                if(str.matches(pattern)){
                    System.out.println("Address is VAL"
                            + "ID");
                }
                else
                    System.out.println("Address is INVALID");

        menu();
    }

    public static void number(){
        System.out.println("   NUMBER TESTER ");
        String pattern = "[0][9][0-9]{9}";
        String str = "";
        System.out.print("Enter Number: ");
        str = input.next();
        
        if(str.matches(pattern)){
            System.out.println("Number is VALID");
        }
        else
            System.out.println("Number is INVALID");
        
        menu();
    }
    public static void menu(){
        int choice;
        System.out.println("---------------");
        System.out.println(" TESTER MENU");
        System.out.println("---------------");
        System.out.println("[1] Email Address Test");
        System.out.println("[2] Number Test");
        System.out.print("Choice: ");
        choice = input.nextInt();
        System.out.println();
        switch(choice){
            case 1: mail();
                break;
            case 2: number();
                break;

        }

    }
    public static void main(String[] args) {
        menu();
    }
    
}
