import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Entertainment {
    private JFrame frame;

    public Entertainment() {
        frame = new JFrame("Entertainment");
        frame.setSize(1500, 800);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        
        JLabel imageLabel1 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj1.jpg"));
        imageLabel1.setBounds(0,0,400,400);
       
        JButton button1 = new JButton("S.S.Rajamouli");
        button1.setBounds(100,450,200,40);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Raja();
            }

        });

        JLabel imageLabel2 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp.jpg"));
        imageLabel2.setBounds(400,0,400,400);
        JButton button2 = new JButton("Sai Pallavi");
        button2.setBounds(500,450,200,40);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Sai();
            }
        });

        
        JLabel imageLabel3 = new JLabel(new ImageIcon("c:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk2.png"));
        imageLabel3.setBounds(850,0,400,400);
        
        JButton button3 = new JButton("Rajinikanth");
        button3.setBounds(950,450,200,40);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             new Thalaiva();
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
                new Entertainment();

    }
}
