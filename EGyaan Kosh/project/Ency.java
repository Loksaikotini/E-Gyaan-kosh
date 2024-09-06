import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ency implements ActionListener{
    JFrame f;
    JButton Welcome;
    JLabel l1,l2,l3,l4,l5;
    Ency(){
        f=new JFrame();
        f.setSize(1500,800);
        f.setVisible(true);
        f.setLayout(null);
        Welcome=new JButton("Enter To Learn");
        Welcome.addActionListener(this);
        f.add(Welcome);
        f.add(l5=new JLabel("e-Gyaan Kosh"));
        f.add(l2=new JLabel("A leader is one who knows the way,goes the way,shows the way."));
        f.add(l3=new JLabel("Hardwork beats Talent if Talent doesn't Work Hard."));
        f.add(l4=new JLabel("The Science of Today is Technology of Tommorrow"));
        f.add(l1=new JLabel("If it is Art it is not for all,If it is for all it is Not Art"));
        f.setBackground(Color.red);
        Font font = new Font("Candara Light", Font.BOLD, 30);
        Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 45);

           
            l1.setFont(font);
            l2.setFont(font);
            l3.setFont(font);
            l4.setFont(font);
            l5.setFont(font1);
            
            
            l1.setForeground(new Color(253,100,10));
            l2.setForeground(new Color(128,0,0));
            l3.setForeground(new Color(0,0,128));
            l4.setForeground(new Color(0,100,0));
            l5.setForeground(Color.red);

            l1.setBounds(150, 50, 700, 40);
            l2.setBounds(300, 150, 900, 40);
            l5.setBounds(500, 250, 400, 60);            
            l3.setBounds(200, 400, 700, 40);
            l4.setBounds(550, 500, 700, 40);
            
            Welcome.setBounds(500, 600, 200, 30);

        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);s
    }
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(f, "Welcome to the world of e-Gyaan Kosh");
        if(ae.getSource()==Welcome){
            new EGyaan();
        }
    }
    public static void main(String[] args){
        new Ency();
    }
}
