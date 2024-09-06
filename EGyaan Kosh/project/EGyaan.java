import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EGyaan{
    JFrame frame=new JFrame();
    
    JPanel panel;
    String[] Select_Category={"SELECT A CATEGORY","POLITY","ENTERTAINMENT","SPORTS","SCIENCE"};

    JComboBox<String> comboBox1= new JComboBox<>(Select_Category);

    EGyaan(){
        frame.setSize(1500,800);
        frame.setTitle("eGyaanPedia");
        
        panel = new JPanel(new GridBagLayout());
        panel.setSize(1500,800);
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBackground(new Color(255,218,155));

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(comboBox1, gbc);
        comboBox1.setPreferredSize(new Dimension(200,30));


        ImageIcon logoIcon = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Pictures\\logo2-transformed (1) square.jpeg"); // Change path accordingly
        JLabel logoLabel = new JLabel(logoIcon);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.CENTER;
        panel.add(logoLabel, gbc);

        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedOption = (String) source.getSelectedItem();
                if(selectedOption.equals("POLITY")){
                    new Polity();
                }
                else if(selectedOption.equals("SCIENCE")){
                    new Science();
                }
                else if(selectedOption.equals("SPORTS")){
                    new Sports();
                }
                else if(selectedOption.equals("ENTERTAINMENT")){
                    new Entertainment();
            }
    }});
        frame.add(panel);
        frame.revalidate();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new EGyaan();
    }
}