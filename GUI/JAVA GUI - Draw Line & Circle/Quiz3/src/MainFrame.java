import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainFrame extends JFrame{
    
    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Quiz 3");
    }
    
    public void paint(Graphics g){
        
        g.drawLine(300, 500, 400, 150);
       
         g.setColor(Color.red);
        g.drawLine(400, 153, 500, 500);
        
        g.setColor(Color.cyan);
        g.drawLine(300, 500, 500, 500);
        
        g.setColor(Color.black);
        g.drawOval(350, 300, 100, 100);
        
        
       
        
 
        }
        
}
    
    
    

