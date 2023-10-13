import java.util.Scanner;

public class Main extends grades{
    public static Scanner input = new Scanner(System.in);
    static int total ;
    public static void display(){
        System.out.println("0 10 20 30 40 50 60 70 80 90 100");
        System.out.println("------------------------------------------");
        System.out.println("Total Score is " + total);
        System.out.println("------------------------------------------");
        if(total>=90){
            System.out.println("****************************");
        }
        else if(total >=80 && total <90)
        {
            System.out.println("************************");
        }
        else if(total >=70 && total <80){
            System.out.println("*****************");
        }
        else if (total >=60 && total <70){
            System.out.println("**************");
        }
        else{
            System.out.println("*********");
        }
    }
    public static void add(){
        int enter;
        
        grades x = new grades();
        
        System.out.print("How many grades will be Entered: ");
        enter = input.nextInt();
        int arr[] = new int[enter];
       
        
        
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("         Adding Grades");
        System.out.println("---------------------------------");
        for(int i=0; i<enter; i++)
        {
            System.out.print("Enter Quiz 1 Grade: ");
            x.Quizzes(input.nextInt());
        }
        
        for(int p=0;p<enter;p++)
        {
            System.out.print("Enter Midterm Exam Grade: ");
            x.Midterms(input.nextInt());
        }
        for(int q=0;q<enter;q++)
        {
            System.out.print("Enter Final Exam Grade: ");
            x.Finals(input.nextInt());
        }
        
        total = (x.getFinals()+x.getMidterms()+x.getQuizzes())/3;
        
    }
    public static void menu(){
        int option;
        boolean MainLoop = true;
        do{
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("          Grading Program");
            System.out.println("---------------------------------");
            System.out.println("[1] - Add grade(s) ");
            System.out.println("[2] - Display Graph");
            System.out.print("Option: ");
            option = input.nextInt();
            switch(option)
            {
                case 1: System.out.println();
                        add();
                        break;
                case 2: System.out.println();
                        display();
                        break;
            }
        }while(option!=3);
        
    }
    public static void main(String[] args) {
        
        menu();
    }
}