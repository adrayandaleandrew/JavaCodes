package MP10;

import java.util.*;

public class FileManage {
    static setup g = new setup();
    public static Scanner input = new Scanner(System.in);
    
    
    public static void delete(){
        g.deleteFile();
        menu();
    }
    
    public static void open(){
        System.out.println();
        g.openFile();
        g.readFile();
        menu();
    }
    
    public static void create(){
        g.createFile();
        g.addRecord();
        menu();
    }
    
    public static void menu(){
        System.out.println();
        System.out.println("--------------");
        System.out.println("     MENU");
        System.out.println("--------------");
        System.out.println("[1] Create");
        System.out.println("[2] Open ");
        System.out.println("[3] Delete ");
        System.out.print("OPTION: ");
        int option = input.nextInt();
        
        switch(option){
            case 1: create();
                break;
            case 2: open();
                break;
            case 3: delete();
                break;
        }
        
    }
    
    public static void main(String[] args) {
       menu();
       
    }
}