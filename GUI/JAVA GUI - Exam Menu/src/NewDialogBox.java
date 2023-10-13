import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NewDialogBox extends JDialog implements ActionListener{
   
    JLabel messageFirst = new JLabel("First Name: ");
    JLabel messageLast = new JLabel("Last Name: ");
    
    JTextField tfName = new JTextField(20);
    JTextField tlName = new JTextField(20);
    
    JButton btProcess = new JButton("Process");
    JButton btClose = new JButton("Close");
      
    
    public NewDialogBox(){
        
        setSize(650,300);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true);
        setLocationRelativeTo(this);
        setResizable(false);
       
        setLayout(new FlowLayout());
        
        add(messageFirst);
        add(tfName);
        add(messageLast);
        add(tlName);
        add(btProcess);
        add(btClose);
        
        
        btProcess.addActionListener(this);
        btClose.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
       if(e.getSource() == btProcess){
           String Name = tfName.getText() + " " +tlName.getText();
           JOptionPane.showMessageDialog(null, Name);
           
       }
    }
    
}
