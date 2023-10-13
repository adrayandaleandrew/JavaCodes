package MP10;
import java.io.*;
import java.util.*;

public class setup {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private Formatter x;
    
     String filename = null;
     String content = null;
    //Creating A File
    public void createFile(){
       
        try{    
            System.out.println("----------------------");
            System.out.println("Creating A File");
            System.out.println();
            
            System.out.print("Filename: ");
            filename = input.readLine();
            x = new Formatter(filename);
            System.out.print("Content: ");
            content = input.readLine();
            
            System.out.println("You Successfully Created FileName");
        }
        catch(Exception e){
            System.out.println("You have an error");
        }
    }
    
    //ADDING RECORD
    public void addRecord(){
       x.format("%s%s%s", "20 ", "Dale ", "Adrayan ");
          
    }
    
    //OPENFILE
    public void openFile(){
        try{
            x = new Formatter(new File(filename));
        }
        catch(Exception e){
            System.out.println("Couuld not find the File");
        }
    }
    
    //READING FILE
    public void readFile(){
        String a = filename;
        String b = content;
        System.out.println(a);
        System.out.println(b);
    }
    
    public void deleteFile(){
        System.out.println("File Deleted");
        System.out.println();
    }
    
    //CLOSING FILE
    public void closeFile(){
        x.close();
    }
}
