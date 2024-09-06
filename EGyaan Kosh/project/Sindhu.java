import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Sindhu extends JFrame {
    public Sindhu() {
        setTitle("P.V. Sindhu");
        
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
        textPane1.setText("Pusarla Venkata Sindhu (born 5 July 1995) is an Indian badminton player. She was born and brought up in Hyderabad, India to P. V. Ramana and P. Vijaya.\n" + //
                " Both her parents have been national level volleyball players. Her father, Ramana and was a member of the Indian volleyball team that won the bronze medal in the 1986 Seoul Asian Games, received the Arjuna Award in 2000 for his contribution to the sport.\n" + //
                "\r\n"+//
                " She was educated at Auxilium High School and at St. Ann's College for Women, Hyderabad. Though her parents played professional volleyball, she chose badminton over it. She eventually started playing badminton from the age of eight.\n" + //
                " She first learned the basics of the sport with the guidance of Mehboob Ali. Soon after, she joined Pullela Gopichand's Gopichand Badminton Academy.\n" + //
                "\r\n"+//
                " Sindhu has been employed with Bharat Petroleum since July 2013, as an assistant sports manager with their Hyderabad office. Following her silver-medal win at the Rio Olympics, she was promoted to deputy sports manager.\n" + //
                " She was appointed as the first brand ambassador of Bridgestone India. She was appointed as the Deputy Collector (Group-I) by the Andhra Pradesh government in July 2017, which she took charge later in August.\n" + //
                " She was the flag bearer for the Indian contingent in the opening ceremony of the 2018 and 2022 Commonwealth Games.\n" + //
                "\r\n"+//
                " With earnings of US$8.5 million, $5.5 million, $7.2 million and $7.1 million respectively, Sindhu made the Forbes' list of Highest-Paid Female Athletes in 2018, 2019, 2021 and 2022.\n" + //
                " She is a recipient of the sports honours Arjuna Award and Rajiv Gandhi Khel Ratna, as well as India's fourth-highest civilian award, the Padma Shri, and third-highest civilian award, the Padma Bhushan.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));



        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 16);
        textPane2.setFont(font2);
        textPane2.setText("Sindhu entered the international circuit at a young age of 14 in the year 2009. She was a bronze medalist at the 2009 Sub-Junior Asian Badminton Championships held in Colombo.\n" + //
                " In 2011, She then won the Commonwealth Youth Games by beating Soniia Cheah Su Ya of Malaysia in straight games. She was a finalist at the Dutch Open where she lost to home player Yao Jie 16–21, 17–21. Her successful run continued after she won the Swiss International beating Carola Bott of Germany in the final.\n" + //
                "\r\n"+//
                " In 2013, Sindhu stunned China's Wang Shixian in the second round of the Asian Championships in 3 tough games to reach the quarterfinal, but lost to Eriko Hirose of Japan in yet another 3-game clash.\n" + //
                " She reached her career-best ranking of 15. Sindhu was awarded the Arjuna Award by the Government of India in recognition of her achievements.\n" + //
                "\r\n"+//
                " Sindhu reached the final of the 2014 India Open Grand Prix Gold but lost to her senior compatriot Saina Nehwal. She claimed her first medal at the Asian Championships, a bronze, after beating Thailand's Busanan Ongbamrungphan in the quarterfinal.\n" + //
                " She reached the semi-final stage of the 2014 Commonwealth Games in the women's singles competition, which she lost narrowly to eventual gold medalist Michelle Li of Canada.\n" + //
                " She later won against Malaysian Tee Jing Yi to claim the bronze medal. She suffered a stress fracture in 2015 that kept her from playing for nearly six months, yet managed to qualify for the 2016 Rio Olympics.\n" + //
                " In January, Sindhu won the Malaysia Masters Grand Prix Gold women's singles title after beating Scotland's Kirsty Gilmour in the final.\n" + //
                "\r\n"+//
                " Sindhu was seeded ninth at the Rio Olympic Games. In the group stage, she defeated Hungary's Laura Sárosi (2–0) and Canada's Michelle Li (2–1). She then ousted Taiwanese eighth seed Tai Tzu-ying (2–0) in the Round of 16 to meet the second seeded Wang Yihan from China in the quarterfinals, whom she also defeated in straight games.\n" + //
                " She later faced sixth seeded Japanese star Nozomi Okuhara in the semi-finals and won in straight games, ensuring a podium finish. This set the stage for her final showdown with the top seed from Spain, Carolina Marín. Marin managed to beat her in three games in the 83-minute match.\n" + //
                " With that result, she clinched the silver medal, creating history as India's youngest individual Olympic medallist and the first Indian woman to bag an Olympic silver medal. This was only the second instance of a podium finish at the Olympics by any Indian badminton player.\n" + //
                "\r\n"+//
                " Sindhu was named as the BWF Most Improved Player of the Year following her achievements in 2016. In April 2017, she achieved a career-high world ranking of number 2.\n" + //
                " At the 2017 World Championships, her final against Okuhara is widely regarded as one of the best ever women's singles matches in the history of the sport.\n" + //
                "\r\n"+//
                " At the All England Open Championships, she made it to the last four, before losing to world number 3 Akane Yamaguchi in the semi-final with a close 21–19, 19–21, 18–21 scoreline. This was her best performance at the All England Open.\n" + //
                " She competed at the 2018 Commonwealth Games in Gold Coast, winning a gold medal in the mixed team event and a silver medal in the singles event. Her jinx of losing in finals continued after she went down to Nozomi Okuhara in the final of the Thailand Open.\n" + //
                "\r\n"+//
                " She won her second consecutive World Championship silver medal after losing to Carolina Marín in the final 19–21, 10–21. This was her fourth medal at the World Championships in total.\n" + //
                " In the 2018 Asian Games, she lost to top seed Tai Tzu-ying in the final, she won a historic first silver medal for India in badminton.\n" + //
                "\r\n"+//
                " Sindhu was seeded sixth at the Tokyo Olympic Games. She won both of her group matches against Israel's Ksenia Polikarpova and Hong Kong's Cheung Ngan Yi to progress towards the knockout stage. She defeated Denmark's Mia Blichfeldt comfortably in the Round of 16 and reached the quarterfinals.\n" + //
                " She put up a dominating display to outmanoeuvre fourth seed Akane Yamaguchi of Japan 21–13, 22–20, placing herself in the last four stage, also becoming the only Indian shuttler to reach two consecutive Olympic semi-finals.\n" + //
                " Her opponent for the semi-final was second seed Tai Tzu-ying. Sindhu, who was yet to drop a game in the tournament, fell against Taiwan's Tai in two straight games 18–21, 12–21.\n" + //
                " She later beat eighth seed He Bingjiao of China in the playoff to clinch the bronze medal, thereby becoming the first Indian woman and only the fourth player in women's singles badminton to claim two medals at two consecutive Olympic games.\n" + //
                "\r\n"+//
                " At the 2022 Commonwealth Games, Sindhu won her maiden Commonwealth Games gold medal in the women's singles, beating Michelle Li of Canada in the final. ");
        tabbedPane.addTab("Career", new JScrollPane(textPane2));




        JTextPane textPane4 = new JTextPane();
        textPane4.setEditable(false);
        StyledDocument doc4 = textPane4.getStyledDocument();
        SimpleAttributeSet center4 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
        doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);

        SwingUtilities.invokeLater(() -> {
            JPanel imagePanel = new JPanel();
            imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv1.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv2.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv3.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv4.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv5.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\pv6.jpg");

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
        textPane5.setText(" ⊛ National\n" + //
                " ☆ Arjuna Award (2013)\n" + //
                " ☆ Padma Shri, the fourth-highest civilian award of India(2015)\n" + //
                " ☆ Major Dhyan Chand Khel Ratna, the highest sporting honour of India (2016)\n" + //
                " ☆ Padma Bhushan, the third-highest civilian award of India (2020)\n" + //
                "\r\n"+//
                " ⊛ Rewards for winning the silver medal at the 2016 Rio Summer Olympics\n" + //
                " ☆ ₹5 crore and a land grant from the Government of Telangana.\n" + //
                " ☆ ₹3 crore, a Group A cadre job (Deputy Collector of Andhra Pradesh) and 1000 yd land grant from the Government of Andhra Pradesh.\n" + //
                " ☆ ₹2 crore  from the Government of Delhi.\n" + //
                " ☆ ₹75 lakh  from her employer, Bharat Petroleum Corporation, with promotion from assistant to deputy sports manager.\n" + //
                " ☆ ₹50 lakh  from the Government of Haryana.\n" + //
                " ☆ ₹50 lakh  from the Government of Madhya Pradesh.\n" + //
                " ☆ ₹50 lakh  from the Ministry of Youth Affairs and Sports.\n" + //
                " ☆ ₹50 lakh  from Badminton Association of India.\n" + //
                " ☆ ₹50 lakh  from NRI businessman, Mukkattu Sebastian.\n" + //
                " ☆ ₹30 lakh from the Indian Olympic Association.\n" + //
                " ☆ BMW car from the Hyderabad District Badminton Association and Indian cricketer Sachin Tendulkar.\n" + //
                "\r\n"+//
                " ⊛ Rewards for winning the bronze medal at the 2020 Tokyo Summer Olympics\n" + //
                " ☆ ₹1 crore  from the Government of Uttar Pradesh.\n" + //
                " ☆ ₹1 crore  from BYJU'S.\n" + //
                " ☆ ₹50 lakh  from the Government of Telangana.\n" + //
                " ☆ ₹30 lakh  from the Government of India.\n" + //
                " ☆ ₹30 lakh  from the Government of Andhra Pradesh.\n" + //
                " ☆ ₹25 lakh  from the Board of Control for Cricket in India\n" + //
                " ☆ ₹25 lakh  from the Indian Olympic Association.");
        tabbedPane.addTab("Honours", new JScrollPane(textPane5));


       
       
        Object[][]data={
            {"2016","Olympic Games","Rio de Janerio","Carolina Marin","21-19,12-21,12-21","Silver",},
            {"2021","Olympic Games","Tokyo, Japan","He Bingjiao","21-13,21-15","Bronze"},
            {"2013","World Championships","China","Ratchanok Intanon ","10-21,13-21","Bronze"},
            {"2014","World Championships","Denmark","Carolina Marin","17-21,15-21","Bronze"},
            {"2017","World Championships","Scotland","Nozomi Okuhara","19-21,22-20,20-22","Silver"},
            {"2018","World Championships","China","Carolina Marin","19-21,10-21","Silver"},
            {"2019","World Championships","Switzerland","Nozomi Okuhara","21-7,21-7","Gold"},
            {"2014","Commonwealth Games","Scotland","Tee Jing Yi","23-21,21-9","Bronze"},
            {"2018","Commonwealth Games","Australia","Saina Nehwal","18-21,21-23","Silver"},
            {"2022","Commonwealth Games","England","Michelle Li","18-21,21-23","Silver"},
            {"2018","Asian Games","Indonesia","Tai Tzu-ying","13-21,16-21","Silver"},
              
                };
                Object Columns[]={"Year","Competition","Venue","Opponent","Score","Result"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
                jTable.setBackground(Color.LIGHT_GRAY);
                Font font = new Font("Arial", Font.PLAIN, 16); 
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.addTab("Achievements",new JScrollPane(jTable));

        
  
        add(tabbedPane);

 
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sindhu();
    }
}