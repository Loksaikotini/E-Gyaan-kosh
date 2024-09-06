import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Science {
    private JFrame frame;

    public Science() {
        frame = new JFrame("Science");
        frame.setSize(1500, 800);
        

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JLabel imageLabel1 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv1.jpg"));
        imageLabel1.setBounds(0,0,400,400);
       
        JButton button1 = new JButton("C.V.Raman");
        button1.setBounds(100,450,200,40);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Cv();
            }

        });

        JLabel imageLabel2 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr.jpg"));
        imageLabel2.setBounds(400,0,400,400);
        
        JButton button2 = new JButton("Srinivasa Ramanujan");
        button2.setBounds(500,450,200,40);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Ram();
            }
        });

        JLabel imageLabel3 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ap4.jpg"));
        imageLabel3.setBounds(850,0,400,400);
       
        JButton button3 = new JButton("A.P.J.Abdul Kalam");
        button3.setBounds(950,450,200,40);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             new Apj();
            }
        });

        // Add components to the panel
        mainPanel.add(imageLabel1);
        mainPanel.add(imageLabel2);
        mainPanel.add(imageLabel3);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
                new Science();

    }
}
