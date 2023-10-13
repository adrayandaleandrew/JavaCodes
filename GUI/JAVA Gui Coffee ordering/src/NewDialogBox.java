import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NewDialogBox extends JDialog implements ActionListener{
    
    JPanel southPanel = new JPanel();
    JButton close = new JButton("Close");
    JButton ok = new JButton("OK");
    
    
    JPanel westPanel = new JPanel(new GridLayout(3,1));
    JCheckBox wb1 = new JCheckBox("Sugar");
    JCheckBox wb2 = new JCheckBox("Creamer");
    JCheckBox wb3 = new JCheckBox("Chocolate");
    
    JPanel eastPanel = new JPanel(new GridLayout(4,1));
    JRadioButton eb1 = new JRadioButton("Latte");
    JRadioButton eb2 = new JRadioButton("Mocha");
    JRadioButton eb3 = new JRadioButton("Americano");
    JRadioButton eb4 = new JRadioButton("Capuccino");
    
    JPanel centerPanel = new JPanel();
    JLabel messageLast = new JLabel("LastName");
    JLabel messageFirst = new JLabel("FirstName");
    JTextField tlName = new JTextField(12);
    JTextField tfName = new JTextField(12);
    
    public NewDialogBox(){
        setSize(1024,768);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true);
        setLocationRelativeTo(this);
        
        setLayout(new BorderLayout());
        
        setupComponentsSOUTH();
        setupComponentsWEST();
        setupComponentsEAST();
        setupComponentsCENTER();
        pack();
       
        setResizable(false);
    }
    
    public void setupComponentsCENTER(){
        add(centerPanel,BorderLayout.CENTER);
        centerPanel.add(messageLast);
        centerPanel.add(tlName);
        centerPanel.add(messageFirst);
        centerPanel.add(tfName);
        
    }
    public void setupComponentsWEST(){
        add(westPanel,BorderLayout.WEST);
        westPanel.add(wb1);
        westPanel.add(wb2);
        westPanel.add(wb3);
    }
    public void setupComponentsSOUTH(){
        add(southPanel,BorderLayout.SOUTH);
        southPanel.add(ok);
        southPanel.add(close);
        
        ok.addActionListener(this);
        close.addActionListener(this);
    }
    
    public void setupComponentsEAST(){
        add(eastPanel,BorderLayout.EAST);
        eastPanel.add(eb1);
        eastPanel.add(eb2);
        eastPanel.add(eb3);
        eastPanel.add(eb4);
        
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(eb1);
        bgroup.add(eb2);
        bgroup.add(eb3);
        bgroup.add(eb4);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == close){
            dispose();
        }else if(e.getSource() == ok){
            
            
            String message = "";
            if(wb1.isSelected()){
                message += " Sugar ";
            }
            
            if(wb2.isSelected()){
                message += " Creamer ";
            }
            
            if(wb3.isSelected()){
                message += " Chocolate ";
            }
            if(eb1.isSelected()){
                message += eb1.getText();
            }
            if(eb2.isSelected()){
                message += eb2.getText();
            }
            if(eb3.isSelected()){
                message += eb3.getText();
            }
            if(eb4.isSelected()){
                message += eb4.getText();
            }
            
            String Output = tfName.getText() + " " + tlName.getText() + message;
            
            JOptionPane.showMessageDialog(null, Output);
        }
    }
}
