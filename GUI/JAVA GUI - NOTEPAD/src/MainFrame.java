import javax.swing.*;
import java.awt.event.*;


//9 Implement ActionListener
public class MainFrame extends JFrame implements ActionListener{
    
    //2 Instantiate MenuBard
    JMenuBar guiMenu = new JMenuBar();
    
    //4 Instantiate a Menu
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu formatMenu = new JMenu("Format");
    JMenu helpMenu = new JMenu("Help");
    
    //6 Instantiate Menu Item
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");
    
    JMenuItem ViewHelpItem = new JMenuItem("View Help");
    JMenuItem AboutNotepadItem = new JMenuItem("About Notepad");
    
    
    //1 Create the Frame
    public MainFrame(){
        
        setTitle("My First Java GUI App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //3 set JMenuBar to the frame
        setJMenuBar(guiMenu);
        
        //5 Add the Menu to the MenuBar
        guiMenu.add(fileMenu);
        guiMenu.add(editMenu);
        guiMenu.add(formatMenu);
        guiMenu.add(helpMenu);
        
        
        
        //7 Add the MenuItem to the Menu Obj
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        fileMenu.setMnemonic('F');
        
        helpMenu.add(ViewHelpItem);
        helpMenu.setMnemonic('H');
        helpMenu.addSeparator();
        helpMenu.add(AboutNotepadItem);
        
        
        //11 Register each components that you want to monitor for the action
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        ViewHelpItem.addActionListener(this);
        AboutNotepadItem.addActionListener(this);
        
    }
    
    //10 Implement ActionPerformed Method
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == newItem){
            System.out.println("You Clicked new Item");
        }
        else if(e.getSource() == exitItem){
            System.exit(0);
        }
        else if(e.getSource() == ViewHelpItem){
            System.out.println("You Clicked View Help Item");
        }
        else if(e.getSource() == AboutNotepadItem){
            JOptionPane.showMessageDialog(null, "Created By Dale Andrew Adrayan");
        }
        
        
    }
    
    
}
