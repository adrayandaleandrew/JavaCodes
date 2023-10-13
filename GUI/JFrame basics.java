import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.*; 

public class MainFrame extends JFrame { 
    
    
    public MainFrame(){ 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setExtendedState(JFrame.MAXIMIZED_BOTH); 
    setTitle("Using Simple Graphics API"); 
    } 
    
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawLine(0, 0, 1024, 768);
        g.setColor(Color.ORANGE);
        g.drawOval(640, 480, 90, 90);
        g.setColor(Color.BLACK);
        g.drawRect(600, 400, 120, 120);
        g.setColor(Color.CYAN);
        g.fillOval(640, 480, 90, 90);
        g.setColor(Color.GREEN);
        g.fillRoundRect(600, 400, 120, 120,120, 120);
        
    }
    
}