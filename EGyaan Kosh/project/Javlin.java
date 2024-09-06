import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Javlin extends JFrame {
    public Javlin() {
        setTitle("Neeraj Chopra");
        
        setSize(1500, 800);
 

       
        JTabbedPane tabbedPane = new JTabbedPane();

        JTextPane textPane1 = new JTextPane();
        textPane1.setEditable(false);
        StyledDocument doc1 = textPane1.getStyledDocument();
        SimpleAttributeSet center1 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center1, StyleConstants.ALIGN_LEFT);
        doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
        Font font1 = new Font("Bookman Old Style", Font.PLAIN, 16);
        textPane1.setFont(font1);
        textPane1.setText("Neeraj Chopra (born 24 December 1997) is an Indian track and field athlete, who is the reigning Olympic champion and World champion in Men's javelin throw.\n" + //
                " Chopra was born in a Haryanvi Ror family in Khandra, Panipat, Haryana. He has two sisters and his family is largely involved in agriculture. \n" + //
                "\r\n"+//
                " He did his schooling from BVN Public School. He graduated from Dayanand Anglo-Vedic College in Chandigarh, and as of 2021, was pursuing a Bachelor of Arts from Lovely Professional University in Jalandhar, Punjab.\n" + //
                "\r\n"+//
                " After local children teased him about his childhood obesity, Chopra's father enrolled him in a gymnasium at Madlauda; he was later enrolled in a gym in Panipat.\n" + //
                "  While playing at Shivaji stadium in Panipat, he saw some javelin throwers and began participating himself.\n" + //
                "\r\n"+//
                " Impressed with Chopra's performance at the South Asian Games and his future potential, the Indian Army offered him a direct appointment as a Junior Commissioned Officer (JCO) in the Rajputana Rifles with the rank of Naib Subedar. He accepted the offer and joined the army under sports quota. ");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));



        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 16);
        textPane2.setFont(font2);
        textPane2.setText("In 2013, Neeraj Chopra entered his first international competition, the World Youth Championships in Ukraine. He won his first international medal in 2014, a silver at the Youth Olympics Qualification in Bangkok.\n" + //
                " Chopra finished fifth at the 2015 National Games in Kerala,and received a callback for the national-level training camp as a result.\n" + //
                "\r\n"+//
                " At the 2016 South Asian Games, Chopra achieved a new personal best during the athletics finals in Guwahati on 9 February, winning gold with a throw of 82.23 meters.\n" + //
                " In September 2016, he left the Netaji Subhas National Institute of Sports to train at the Sports Authority of India centre in Bangalore.\n" + //
                "\r\n"+//
                " Chopra won gold in the 2017 Asian Athletics Championships with a throw of 85.23 metres. On 24 August, Chopra suffered a significant groin injury in the finals of the Zurich Diamond League. As a result of his injury, he withdrew from competition for the remainder of 2017.\n" + //
                " In the men's javelin throw at the 2018 Commonwealth Games, he registered a season-best effort of 86.47 metres, becoming the first Indian to win the javelin throw at the Commonwealth Games. In May 2018, he again broke the national record at the Doha Diamond League with a throw of 87.43 metres.\n" + //
                "\r\n"+//
                " In August 2018, Chopra made his debut at the Asian Games representing India, and was also the flag-bearer for the Indian contingent during the 2018 Asian Games Parade of Nations. On 27 August, he threw a distance of 88.06 m to win gold in the Men's javelin throw at the 2018 Asian Games and bettered his own Indian national record.\n" + //
                "\r\n"+//
                " In 4 August 2021, Chopra made his debut at the Olympics, representing India in the Japan National Stadium He topped his qualifying group for entry to the final with a throw of 86.65 metres.\n" + //
                " Chopra won the gold medal in the final on 7 August with a throw of 87.58 m in his second attempt, becoming the first Indian Olympian to win a gold medal in athletics, and the first post-independence Indian Olympic medalist in athletics.\n" + //
                "\r\n"+//
                " In June 2022 at the Paavo Nurmi Games in Turku, Finland, Chopra placed second with a new personal best of 89.30m and registered the new national record. He broke his own national record with a throw of 89.94m for a second place at the Stockholm Diamond League.\n" + //
                " In July 2022, Chopra with his throw of 88.13m on fourth attempt in the men's javelin throw final at the Oregon World Championships ensured himself a historic silver medal.\n" + //
                " On August 26, he won first place at the Lausanne Diamond League with a throw of 89.09m and qualified for the Zürich Final. \n" + //
                "\r\n"+//
                " In May 2023, Chopra clinched top spot in the Doha Diamond League with a throw of 88.67m. In the same month, he, for the first time, achieved first position in the men's javelin throw rankings issued by World Athletics.\n" + //
                " In August 2023, he won the gold medal in 2023 World Athletics Championships with a throw of 88.17m. In October 2023, he won the second gold medal in 2022 Asian Games with a season-best throw of 88.88m.");
        tabbedPane.addTab("Athletics Career", new JScrollPane(textPane2));




        JTextPane textPane4 = new JTextPane();
        textPane4.setEditable(false);
        StyledDocument doc4 = textPane4.getStyledDocument();
        SimpleAttributeSet center4 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
        doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);

        SwingUtilities.invokeLater(() -> {
            JPanel imagePanel = new JPanel();
            imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc1.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc2.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc3.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc4.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc5.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nc6.jpg");

            JPanel colPanel1 = new JPanel();
            colPanel1.setLayout(new BoxLayout(colPanel1, BoxLayout.X_AXIS));
            colPanel1.add(new JLabel(image1));
            colPanel1.add(Box.createRigidArea(new Dimension(20, 20))); 
            colPanel1.add(new JLabel(image2));
            imagePanel.add(colPanel1);

            imagePanel.add(Box.createRigidArea(new Dimension(20, 20)));         

            JPanel colPanel2 = new JPanel();
            colPanel2.setLayout(new BoxLayout(colPanel2, BoxLayout.X_AXIS));
            colPanel2.add(new JLabel(image3));
            colPanel2.add(Box.createRigidArea(new Dimension(20, 20)));
            colPanel2.add(new JLabel(image4));
            imagePanel.add(colPanel2);

         
            imagePanel.add(Box.createRigidArea(new Dimension(20, 20))); 

            JPanel colPanel3 = new JPanel();
            colPanel3.setLayout(new BoxLayout(colPanel3, BoxLayout.X_AXIS));
            colPanel3.add(new JLabel(image5));
            colPanel3.add(Box.createRigidArea(new Dimension(20, 20))); 
            colPanel3.add(new JLabel(image6));
            imagePanel.add(colPanel3);

            JScrollPane scrollPane = new JScrollPane(imagePanel);
    
           
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

            textPane4.insertComponent(scrollPane.getComponent(0));
            
        });
        tabbedPane.addTab("Images", new JScrollPane(textPane4));

      
      
      
        JTextPane textPane5 = new JTextPane();
        textPane5.setEditable(false);
        StyledDocument doc5 = textPane5.getStyledDocument();
        SimpleAttributeSet center5 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center5, StyleConstants.ALIGN_LEFT);
        doc5.setParagraphAttributes(0, doc5.getLength(), center1, false);
        Font font5 = new Font("Bookman Old Style", Font.PLAIN, 18);
        textPane5.setFont(font5);
        textPane5.setText("⊛National awards\n" + //
                "\r\n"+//
                " ☆ Arjuna Award – 2018\n" + //
                " ☆ Vishisht Seva Medal (VSM) – 2020 Republic Day honours\n" + //
                " ☆Major Dhyan Chand Khel Ratna Award – 2021 (highest sporting honour of India)\n" + //
                " ☆ Param Vishisht Seva Medal (PVSM) - 2022 Republic Day honours\n" + //
                " ☆ Padma Shri (fourth highest civilian honour) - 2022 Republic Day honours\n" + //
                "\r\r"+//
                " ⊛ Other\n" + //
                "\r\n"+//
                " ☆ The Times of India TOISA Sportsperson of the Year: 2021\n" + //
                " ☆ Army Sports Institute (ASI) stadium of Pune cantonment renamed \"Neeraj Chopra Stadium\".\n" + //
                " ☆Switzerland Tourism appointed Neeraj Chopra as its Friendship Ambassador.");
        tabbedPane.addTab("Honours", new JScrollPane(textPane5));


       
       
        Object[][]data={
            {"2016","South Asian Games","Guwahati","1","82.83 m"},
            {"2016","World U20 Championships","Poland","1","86.48 m"},
            {"2017","Asian Championships","Bhubaneshwar","1","85.23 m"},
            {"2018","Commomwealth Games","Australia","1","86.47 m"},
            {"2018","Asian Games","Indonesia","1","88.06 m"},
            {"2021","Olympics Games","Tokyo","1","87.58 m"},
            {"2022","World Championships","United States","2","88.13 m"},
            {"2023","World Championships","Hungary","1","88.17 m"},
            {"2023","Asian Games","China","1","88.88 m"},              
              
                };
                Object Columns[]={"Year","Competition","Venue","Position","Result"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
                Font font = new Font("Arial", Font.PLAIN, 16); 
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.setBackground(Color.lightGray);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.addTab("Career Stats",new JScrollPane(jTable));

        
  
        add(tabbedPane);

 
        setVisible(true);
    }
    public static void main(String[] args) {
        new Javlin();
    }
}
