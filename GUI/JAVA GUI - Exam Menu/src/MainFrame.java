import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    
    JMenuBar guiMenu = new JMenuBar();
    
    JMenu examMenu = new JMenu("Exam");
    JMenu aboutMenu = new JMenu("About");
    
    JMenuItem execItem = new JMenuItem("Execute");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenuItem helpItem = new JMenuItem("Help");
    
    
    
    public MainFrame(){
        setTitle("JAVA GUI EXAM MENU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setJMenuBar(guiMenu);
        guiMenu.add(examMenu);   
        guiMenu.add(aboutMenu);
        
        aboutMenu.setMnemonic('A');
        aboutMenu.add(helpItem);
        
        examMenu.add(execItem);
        examMenu.setMnemonic('E');
        examMenu.addSeparator();
        examMenu.add(exitItem);
        
        execItem.setMnemonic('C');
        exitItem.setMnemonic('X');
        
        execItem.addActionListener(this);
        exitItem.addActionListener(this);
        helpItem.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == exitItem){
            int ok = JOptionPane.OK_OPTION;
            int close = JOptionPane.CANCEL_OPTION;
             int option = JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Terminate?", "Warning", ok, close);
             if(option == ok){
                 System.exit(0);
             }      
        }
        else if(e.getSource() == execItem){
            NewDialogBox nbox = new NewDialogBox();
            nbox.setVisible(true);
            
        }
        else if (e.getSource() == helpItem){
         JOptionPane.showMessageDialog(null, "Program Created By: Dale Andrew Adrayan");
        }
    }
}
