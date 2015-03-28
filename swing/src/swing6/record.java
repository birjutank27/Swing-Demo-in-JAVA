import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class record extends JFrame implements ActionListener{
   JLabel l2;
   JLabel grnm ;
   JLabel gadd;
   JLabel gsem;
   JLabel gsub1;
   JLabel gsub2;
   JLabel gsub3;
   JLabel gsub4;
   JLabel gsub5;
   JTextArea area1;   
   JLabel gender;
   JLabel getgender;
   JPanel p1;
   JPanel p2;
   
   record(){
        
    setSize(500,500);
    setTitle("redirect");
    FlowLayout f = new FlowLayout();
    setLayout(f); 
   p1 = new JPanel(new FlowLayout());
   p2 = new JPanel(new FlowLayout());
    JLabel unm= new JLabel("UserName:");
    JLabel rnm = new JLabel("Roll No:");
    JLabel address = new JLabel("Address:");
    JLabel semester = new JLabel("Sem:");
    JLabel sub = new JLabel("selected subject is:");
    gender = new JLabel("Gender:");
   grnm  = new JLabel();
   gadd = new JLabel();
   l2 = new JLabel();
   gsem = new JLabel();
   gsub1 = new JLabel();
   gsub2 = new JLabel();
   gsub3 = new JLabel();
   gsub4 = new JLabel();
   gsub5 = new JLabel();
   area1 = new JTextArea(5, 10);
   getgender = new JLabel();
    add(unm);
    add(l2);
    add(rnm);
    add(grnm);
    add(gender);
    add(getgender);
    add(semester);
    add(gsem);
    add(sub);
    add(gsub1);
    add(gsub2);
    add(gsub3);
    add(gsub4);
    add(gsub5);
    add(address);
    add(gadd);
    
    setVisible(true);
            
            l2.setText(Swing6.txtuser.getText());
            grnm.setText(Swing6.pas1.getText());
            gsem.setText(Swing6.state.getSelectedItem().toString());
            gadd.setText(Swing6.adrs.getText());
            
            if(Swing6.b1.isSelected()){                    
                getgender.setText(Swing6.b1.getLabel());
            }
            if(Swing6.b2.isSelected()){                    
                getgender.setText(Swing6.b2.getLabel());
            }
            if(Swing6.b3.isSelected()){                    
                getgender.setText(Swing6.b3.getLabel());
            }
            
            
            
            if(Swing6.c1.isSelected()){                    
                gsub1.setText(Swing6.c1.getLabel());
            }
            else{
                gsub1.setText("");
            }
            if(Swing6.c2.isSelected()){                    
                gsub2.setText(Swing6.c2.getLabel());
            }
            else{
                gsub2.setText("");
            }
            if(Swing6.c3.isSelected()){                    
                gsub3.setText(Swing6.c3.getLabel());
            }
            else{
                gsub3.setText("");
            }
            if(Swing6.c4.isSelected()){                    
                gsub4.setText(Swing6.c4.getLabel());
            }
            else{
                gsub4.setText("");
            }
            if(Swing6.c5.isSelected()){                    
                gsub5.setText(Swing6.c5.getLabel());
            }
            else{
                gsub5.setText("");
            }
            
           
                }

public void actionPerformed(ActionEvent e) {
                     
        }


public static void main(String[] args)
{
    new record();

}
}