import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing6 extends JFrame implements ActionListener,FocusListener,ItemListener{
    public static JTextField txtuser;
    public static JLabel rolno;
    public static JTextField pas1;
    public static JLabel text1;
    public static JButton but1;
    public static JButton but2;
    public static JLabel l2;
    public static Vector sem;
    public static DefaultComboBoxModel dcm;
    public static JLabel semester;
    public static JLabel address;
    public static JTextArea adrs;
    public static JComboBox state;
    public static JCheckBox c1;
    public static JCheckBox c2;
    public static JCheckBox c3;
    public static JCheckBox c4;
    public static JCheckBox c5;
    public static JRadioButton b1;
    public static JRadioButton b2;
    public static JRadioButton b3;
    public static ButtonGroup bg;
    public static JLabel gender;
    
    Swing6(){
    setSize(500,500);
    setTitle("my first swing");
    FlowLayout f = new FlowLayout();
    setLayout(f);
    
    JLabel username = new JLabel("Username");
    txtuser = new JTextField(25);
    pas1 = new JTextField(15);
    pas1.addFocusListener(this);
    l2 = new JLabel("");
    JPanel p1 = new JPanel(new FlowLayout(10, 10, 10));
    JPanel p2 = new JPanel(new FlowLayout(5));
    text1 = new JLabel();
    rolno = new JLabel("Enter Roll No:");
    semester = new JLabel("Select Sem:");
    but1 = new JButton("login");
    but1.addActionListener(this);
    but2 = new JButton("cancel");
    but2.addActionListener(this);
    b1 = new JRadioButton("Male");
    b2 = new JRadioButton("Female");
    b3 = new JRadioButton("Other");
    bg = new ButtonGroup();
    gender = new JLabel("Gender:");
    bg.add(b1);
    bg.add(b2);
    bg.add(b3);
    address = new JLabel("Enter Your Adress:");
    adrs = new JTextArea(5, 10);
    String[] statearr = {"select sem","Sem1","Sem2","Sem3","Sem4","Sem5","Sem6","Sem7"};
    sem = new Vector();
   state = new JComboBox(statearr);
    dcm = new DefaultComboBoxModel();
    JComboBox city = new JComboBox(dcm);
    dcm.addElement("-select anyone-");
    state.addItemListener(this);
    
  
        
    add(p1);
    p1.add(username);
    p1.add(txtuser);
    add(gender);
    add(b1);
    add(b2);
    add(b3);
    add(rolno);
    add(pas1);
    add(l2);
    add(semester);
    add(state);
    add(city);
    add(address);
    add(adrs);
    add(but1);
    add(text1);
    //add(but2);
    setVisible(true);
    }
    public void focusLost(FocusEvent e) {
             JTextField src = (JTextField)e.getSource(); 
            StringBuffer buffer  = new StringBuffer(pas1.getText());
            if(buffer.length()==7){                  
                char a = buffer.charAt(0);
                char b=  buffer.charAt(1);   
                if(a=='0' && b=='0'){
                    l2.setText("Enter Valid Roll No");
                }
                else
                if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'){
                    if(b=='1'||b=='0'||b=='2'||b=='3'||b=='4'||b=='5'||b=='6'||b=='7'||b=='8'||b=='9'){
                        char c= buffer.charAt(2);
                        char d= buffer.charAt(3);
                        if(c=='c'&&d=='e'||c=='m'&&d=='e'||c=='b'&&d=='t'||c=='i'&&d=='t'||c=='c'&&d=='i'||c=='e'&&d=='l'||c=='C'&&d=='E'||c=='M'&&d=='E'||c=='B'&&d=='T'||c=='I'&&d=='T'||c=='C'&&d=='I'||c=='E'&&d=='L'||c=='e'&&d=='c'||c=='E'&&d=='C'){    
                              char f = buffer.charAt(4);
                              char g = buffer.charAt(5);
                              char h =buffer.charAt(6);
                              if(f=='0'||f=='1'||f=='2'&&g=='0'||g=='1'||g=='2'||g=='3'||g=='4'||g=='5'||g=='7'||g=='6'||g=='9'||g=='8'&&h=='1'||h=='2'||h=='3'||h=='4'||h=='5'||h=='7'||h=='6'||h=='9'||h=='8'){
                            l2.setText("valid");              
                              }
                              else{
                                  l2.setText("Enter Valid Roll No");
                              }
                                            }   
                        else{
                            l2.setText("Enter Valid Roll No");
                        }
                    }
                }
                else {
                    l2.setText("Enter Valid Roll No");
                }
            }
            else{
                 l2.setText("Enter Valid Roll No");                        
                                     
            }
        
    
    }

public void actionPerformed(ActionEvent e) {       
        
        record r = new record();
        
}

    public void focusGained(FocusEvent e) {
    }
       
    public void itemStateChanged(ItemEvent e) {
JComboBox src = (JComboBox)e.getSource();
src.removeItemListener(this);
if(src.getSelectedItem().equals("Sem1")){
   dcm.removeAllElements();    
   dcm.addElement("MOS");
    dcm.addElement("C");
    dcm.addElement("EOME");
    dcm.addElement("MATHS-1");
    dcm.addElement("PHYSICS");   
    c1 = new JCheckBox("MOS");
     c2 = new JCheckBox("C");
     c3 = new JCheckBox("EOME");
     c4 = new JCheckBox("MATHS-1");
     c5 = new JCheckBox("PHYSICS");
    /*add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(c5);
 */  
}
if(src.getSelectedItem().equals("Sem2")){
    dcm.removeAllElements();
     c1 = new JCheckBox("Es");
     c2 = new JCheckBox("mATHS-2");
     c3 = new JCheckBox("CIVIL");
    dcm.addElement("ES");
    dcm.addElement("MATHS-2");
    dcm.addElement("CIVIL");
      
    add(c1);
    add(c2);
    add(c3);
    
}
if(src.getSelectedItem().equals("Sem3")){
    dcm.removeAllElements();
    
    dcm.addElement("COA");
    dcm.addElement("maths3");
    dcm.addElement("AP");
    dcm.addElement("AE");
    c1 = new JCheckBox("COA");
    add(c1);
    c2 = new JCheckBox("maths3");
    add(c2);
    c3 = new JCheckBox("AP");
    add(c3);
    c4 = new JCheckBox("AE");
    add(c4);
    
    
}
if(src.getSelectedItem().equals("Sem4")){
    dcm.removeAllElements();
   
    dcm.addElement("OS");
    dcm.addElement("OADU");
    dcm.addElement("ORACLE");
    dcm.addElement("math4");
     c1 = new JCheckBox("OS");
    c2 = new JCheckBox("OADU");
    c3 = new JCheckBox("ORACLE");
    c4 = new JCheckBox("MATH4");
    add(c1);
    add(c2);
    add(c3);
    add(c4);
    
}
if(src.getSelectedItem().equals("Sem5")){
    dcm.removeAllElements();
    dcm.addElement("java");
    dcm.addElement("cn");
    dcm.addElement("mgmt1");
     c1 = new JCheckBox("java");
     c2 = new JCheckBox("cn");
     c3 = new JCheckBox("mgmt1");
    
    add(c1);
    add(c2);
    add(c3);
    
}
if(src.getSelectedItem().equals("Sem6")){
    dcm.removeAllElements();
    dcm.addElement("php");
    dcm.addElement("mgmt2");
    dcm.addElement("sp");
    dcm.addElement("toc");
     c1 = new JCheckBox("php");
     c2 = new JCheckBox("mgmt2");
    c3 = new JCheckBox("sp");
     c4 = new JCheckBox("toc");
        add(c1);
    add(c2);
    add(c3);
    add(c4);
    
}
if(src.getSelectedItem().equals("Sem7")){
    dcm.removeAllElements();
    dcm.addElement("Ad.java");
    dcm.addElement(".net");
    dcm.addElement("wcmp");
    dcm.addElement("cd");
    dcm.addElement("act");
     c1 = new JCheckBox("Ad.java");
     c2 = new JCheckBox(".net");
     c3 = new JCheckBox("wcmp");
    c4 = new JCheckBox("cd");
    c5 = new JCheckBox("act");
    //add(l1);
    add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(c5);
}    }
       
public static void main(String[] args)
{
    new Swing6();
}
 
}