import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    
    JMenuBar guiMenu = new JMenuBar();
   
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem exitItem = new JMenuItem("Exit");
    
    JMenu actionItem = new JMenu("Action");
    
    JMenuItem undoItem = new JMenuItem ("Undo");
    JMenuItem redoItem = new JMenuItem ("Redo");
   

    public MainFrame(){
        setTitle("Java GUI Coffee using JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setJMenuBar(guiMenu);
        
        guiMenu.add(fileMenu);
        guiMenu.add(editMenu);
        
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        editMenu.add(actionItem);
        
        actionItem.add(undoItem);
        actionItem.addSeparator();
        actionItem.add(redoItem);
        
        openItem.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == openItem){
            
            NewDialogBox nbox = new NewDialogBox();
            nbox.setVisible(true);
        }
    }
}
