import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    
    
    JMenuBar guiMenu = new JMenuBar();
    
    JMenu fileMenu = new JMenu("File");
    
    JMenuItem dialogItem = new JMenuItem("Dialog");
    JMenuItem exitItem = new JMenuItem("Exit");
    
    public MainFrame(){
        setTitle("Learning JFrame part 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setJMenuBar(guiMenu);
        guiMenu.add(fileMenu);
        
        fileMenu.add(dialogItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        dialogItem.addActionListener(this);
        exitItem.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == dialogItem){
            NewDialogBox nbox = new NewDialogBox();
            nbox.setVisible(true);
        }
        
        else if(e.getSource() == exitItem){
            System.exit(0);
        }
        
    }
}
