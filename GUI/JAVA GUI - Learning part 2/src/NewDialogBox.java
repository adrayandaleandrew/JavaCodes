import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewDialogBox extends JDialog implements ActionListener{
    
    JPanel centerPanel = new JPanel();
    JTextField txtField1 = new JTextField(12);
    JTextField txtField2 = new JTextField(12);

    JPanel southPanel = new JPanel();
    JButton btSwitch = new JButton("Switch");
    JButton btClose = new JButton("Close");
    
    public NewDialogBox(){
        setTitle("Text Entry");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(600,600);
        setModal(true);
        setLocationRelativeTo(this);
        setResizable(false);
        
        setLayout(new BorderLayout());
       
        
        setupComponentsCENTER();
        setupComponentsSOUTH();
        pack();
    }
    
    public void setupComponentsSOUTH(){
        add(southPanel,BorderLayout.SOUTH);
        southPanel.add(btSwitch);
        southPanel.add(btClose);
        
        btSwitch.addActionListener(this);
        btClose.addActionListener(this);
    }
    
    public void setupComponentsCENTER(){
        add(centerPanel,BorderLayout.CENTER);
        centerPanel.add(txtField1);
        centerPanel.add(txtField2);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btClose){
            dispose();
        }
        else if(e.getSource() == btSwitch){
            String str = txtField1.getText();
            txtField2.setText(str);
            
            txtField1.setText(" ");
        }
    }
}
