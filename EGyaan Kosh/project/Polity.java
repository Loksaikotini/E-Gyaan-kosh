import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Polity {
    private JFrame frame;

    public Polity() {
        frame = new JFrame("Polity");
        frame.setSize(1500, 800);
        

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        // Image 1
        JLabel imageLabel1 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt3.jpg"));
        imageLabel1.setBounds(0,0,400,400);
       // JTextField textField1 = new JTextField();
        JButton button1 = new JButton("N.T.RamaRao");
        button1.setBounds(100,450,200,40);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Ntr();
            }

        });

        // Image 2
        JLabel imageLabel2 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab.jpg"));
        imageLabel2.setBounds(400,0,400,400);
        //JTextField textField2 = new JTextField();
        JButton button2 = new JButton("Atal Bihari Vajpayee");
        button2.setBounds(500,450,200,40);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Atal();
            }
        });

        // Image 3
        JLabel imageLabel3 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br2.jpg"));
        imageLabel3.setBounds(850,0,400,400);
        //JTextField textField3 = new JTextField();
        JButton button3 = new JButton("B.R.Ambedkar");
        button3.setBounds(950,450,200,40);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             new Baba();
            }
        });

        // Add components to the panel
        mainPanel.add(imageLabel1);
        mainPanel.add(imageLabel2);
        mainPanel.add(imageLabel3);
        //mainPanel.add(textField1);
        //mainPanel.add(textField2);
        //mainPanel.add(textField3);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
                new Polity();

    }
}
