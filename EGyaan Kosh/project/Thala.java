import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Thala extends JFrame {
    public Thala() {
        setTitle("Mahendra Singh Dhoni");
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
        textPane1.setText("Mahendra Singh Dhoni is an Indian professional cricketer. He is a right handed batter and a wicket-keeper.\n" + //
                        " Dhoni was born on 7 July 1981 in Ranchi, Bihar (now in Jharkhand) in a Hindu Rajput family to Pan Singh and Devaki Devi.  His parents hailed from Lwali village in Uttar Pradesh (now Uttarakhand) and he was the youngest of three children. His family spells the surname as \"Dhauni\".\n" + //
                        "\r\n"+//
                        " Dhoni did his schooling at DAV Jawahar Vidya Mandir where he started playing football as a goal keeper but later moved to play cricket on the suggestion of his coach Keshav Banerjee. From 2001 to 2003, Dhoni worked as a Travelling Ticket Examiner (TTE) at Kharagpur under South Eastern Railway zone of Indian Railways.\n" + //
                        " Dhoni married Sakshi Singh Rawat on 4 July 2010 in Dehradun. Dhoni and his wife have a daughter, Zeeva. He lives in his farmhouse outside Ranchi along with his parents.Dhoni owns a number of bikes and cars in his collection.\n" + //
                        "\r\n"+//
                        " A film based on Dhoni's life from his childhood to the 2011 world cup win, titled M.S. Dhoni: The Untold Story, with Sushant Singh Rajput in the lead role was released on 29 September 2016. Dhoni holds an honorary rank of Lieutenant Colonel in the Parachute Regiment of the Indian Territorial Army (106 Para TA battalion).\n" + //
                        " The No.7 jersey has been made popular by Dhoni which was retired in 2023 by BCCI. Dhoni has developed a special connection with the city of Chennai whose IPL franchise he represents with fans calling him 'Thala' meaning leader in Tamil.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));



        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 16);
        textPane2.setFont(font2);
        textPane2.setText("Dhoni made his debut in the first match of the series and was run out for a duck. Dhoni was picked for the subsequent ODI series against Pakistan. In the second match of the series in Visakhapatnam, Dhoni playing in his fifth one-day international, scored 148 runs off 123 deliveries which surpassed the earlier record for the highest score by an Indian wicket-keeper.\n" + //
                        "\r\n"+//
                        " Dhoni played in the Sri Lankan bilateral ODI series in October–November 2005 and was promoted to No. 3 in the batting order in the third ODI at Jaipur where he scored an unbeaten 183 runs off 145 balls, winning the game for India. \n" + //
                        " Dhoni made his test debut in the same month against Sri Lanka during their tour of India at Chennai. Dhoni made his T20 international debut in December 2006 against South Africa at Johannesburg.Dhoni was subsequently named in the ODI team of the year by the ICC for 2006.Dhoni was awarded an 'A' grade contract by BCCI in June 2007.\n" + //
                        "\r\n"+//
                        " Dhoni was appointed as the captain of the Indian squad for the inaugural World Twenty20 in September 2007. Dhoni led India to victory in the tournament after defeating Pakistan in the final. Dhoni was appointed as the captain of Indian cricket team in all formats later.\n" + //
                        " Dhoni took his first and only wicket in international cricket on 30 September 2009 when he bowled Travis Dowlin of West Indies in the 2009 ICC Champions Trophy.\n"+//
                        "\r\n"+//
                        " Dhoni averaged more than 60 in the 2008-09 season. Dhoni scored two centuries during Sri Lanka's tour of India in November 2009 which India won to achieve the top ranking in ICC test ranking for the first time in its history. \n" + //
                        " Dhoni had an excellent year in ODIs in 2009, scoring 1198 runs in just 24 innings, at an average of 70.43 and topped the ICC ODI batsman rankings for several months.\n" + //
                        "\r\n"+//
                        " He was named as captain and wicket-keeper of the ICC ODI Team of the year.Dhoni led the Indian squad for the 2011 Cricket World Cup co-hosted by India. India won its second ever ODI world cup after defeating Sri lanka in the final with Dhoni being named man of the match for scoring an unbeaten 91.\n" + //
                        " In December 2012, Pakistan toured India for a bilateral series for the first time in five years and Dhoni top-scored in all the three matches of the series with a century in the first ODI at Chennai.\n" + //
                        " Dhoni led India to victory in the 2013 ICC Champions Trophy and became the first and the only captain in international cricket to claim all ICC limited overs trophies.He was also named as captain and wicket-keeper of the 'Team of the Tournament' by the ICC.\n" + //
                        "\r\n"+//
                        " Dhoni led India in the 2014 ICC World Twenty20 where India finished as runners-up after losing to Sri Lanka in the final.\n" + //
                        " Dhoni played his last series during India's tour of Australia in December 2014. Following the third Test in Melbourne, Dhoni announced his retirement from the format.\n" + //
                        "\r\n"+//
                        " During the 2015 Cricket World Cup, Dhoni became the first Indian captain to win all group stage matches in a world cup. India lost to eventual champions Australia in the semi-finals.\n" + //
                        " Dhoni led India to victory in the 2016 Asia Cup where India remained unbeaten. Dhoni stepped down as captain of India in January 2017 ahead of the ODI series at home against England. In the second game of the series, he scored 134 off 122 balls, his tenth century in ODIs and his first in over three years.\n" + //
                        "\r\n"+//
                        " He was named as a wicket-keeper of the 'Team of the Tournament' at the 2017 ICC Champions Trophy in which India finished as runners-up. In April 2019, he was named in India's squad for the 2019 Cricket World Cup. On 9 July 2019, Dhoni played in his 350th and final ODI in the semi-final loss against New Zealand.\n" + //
                        " Dhoni announced his retirement from international cricket on 15 August 2020 as he had not played any international cricket since India's loss in the 2019 world cup semi-final.");
        tabbedPane.addTab("International Career", new JScrollPane(textPane2));


        JTextPane textPane6 = new JTextPane();
        textPane6.setEditable(false);
        StyledDocument doc6= textPane6.getStyledDocument();
        SimpleAttributeSet center6 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center6, StyleConstants.ALIGN_LEFT);
        doc6.setParagraphAttributes(0, doc6.getLength(), center6, false);
        Font font6 = new Font("Bookman Old Style", Font.PLAIN, 16);
        textPane6.setFont(font6);
        textPane6.setText("Dhoni was acquired by Chennai Super Kings (CSK) for US$1.5 million during the auction for the inaugural season of the Indian Premier League (IPL). He was the most expensive signing in the auction.\n" + //
                        " Dhoni scored 414 runs to lead CSK to the finals in the first season of IPL. Under his captaincy, CSK won the 2010 season and qualified for Champions League Twenty20. Chennai won the 2010 Champions league.\n" + //
                        "\r\n"+//
                        " Dhoni scored 392 runs and led CSK to its second consecutive IPL title in 2011.Dhoni led CSK to its second Champions League Twenty20 title in 2014.\n" + //
                        " Following the two-year suspension of Chennai Super Kings and Rajasthan Royals, Rising Pune Supergiants picked Dhoni as one of their five draft picks on 15 December 2015 for ₹125 million (US$1.6 million). He scored 574 runs in 30 matches across two seasons for the Supergiants.\n" + //
                        "\r\n"+//
                        " Dhoni returned to Chennai Super Kings for the 2018 season. Dhoni scored 455 runs in the season and led CSK to its third IPL title.\n" + //
                        " Dhoni led CSK to the title again in 2021 and was retained by CSK for ₹12 crore (US$1.5 million) before the auction for 2022 season.\n" + //
                        " Dhoni led the franchise to victory in the 2023 IPL season. Under his captaincy, CSK became the most successful IPL franchise with five title wins and ten final appearances. MS Dhoni became the first player to play 200 T20 matches for Super Kings and holds the record for most appearances in the IPL.");
        tabbedPane.addTab("IPL Career", new JScrollPane(textPane6));


        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 18);
        textPane3.setFont(font3);
        textPane3.setText("➢ Tests\n" + //
                        " • Most runs by an Indian wicket-keeper (4876)\n" + //
                        " • Most number of sixes by an Indian captain Most dismissals by an Indian and fifth most by any wicket-keeper (294)\n" + //
                        "\r\n"+//
                        " ➢ ODIs\n" + //
                        " • Most wins by an Indian captain and second most overall (110)\n" + //
                        " • Second most runs as captain (6641)\n" + //
                        " • Third most number of matches as captain (200)\n" + //
                        " • First player to pass 10,000 runs with an average of over 50\n" + //
                        " • Most not-outs (84)\n" + //
                        " • Highest score by a wicket-keeper (183*)\n" + //
                        " • Highest eighth wicket partnership for India (100* with Bhuvneshwar Kumar)\n" + //
                        " • Most dismissals in an innings (6) and career (432) by an Indian wicket-keeper\n" + //
                        " • Most stumpings by any wicket-keeper (123)\n" + //
                        "\r\n"+//
                        " ➢ T20Is\n" + //
                        " • Second most matches as captain (72)\n" + //
                        " • Most T20I innings (76) and runs (1,153) before scoring a fifty\n" + //
                        " • Most stumpings as wicket-keeper (34)\n" + //
                        " • Most catches as wicket keeper in a T20I innings (5)\n" + //
                        "\r\n"+//
                        " ➢ Combined\n" + //
                        " • Most international matches as captain (332)\n" + //
                        " • Most stumpings (195) and only wicket-keeper to make 150 stumpings\n" + //
                        " • Third most dismissals as a wicket-keeper (829)\n" + //
                        " • Sixth most sixes in career (359)");
        tabbedPane.addTab("Records and Achievements", new JScrollPane(textPane3));



        JTextPane textPane4 = new JTextPane();
        textPane4.setEditable(false);
        StyledDocument doc4 = textPane4.getStyledDocument();
        SimpleAttributeSet center4 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
        doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);

        SwingUtilities.invokeLater(() -> {
            JPanel imagePanel = new JPanel();
            imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms1.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms2.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms3.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms4.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms5.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ms6.jpg");

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
        textPane5.setText(" ☆MTV Youth Icon of the Year: 2006\n" + //
                        " ☆ Honorary doctorate degree by De Montfort University: 2011\n" + //
                        " ☆ CNN-News18 Indian of the Year: 2011\n" + //
                        " ☆ Major Dhyanchand Khel Ratna award: 2008\n" + //
                        " ☆ Padma Shri: 2009\n" + //
                        " ☆ Honorary Lieutenant Colonel, Parachute Regiment of the Indian Territorial Army: 2011\n" + //
                        " ☆ Castrol Indian Cricketer of the Year: 2011\n" + //
                        " ☆ ICC People's Choice Award: 2013\n" + //
                        " ☆ Padma Bhushan: 2018\n" + //
                        " ☆ ICC ODI Player of the Year: 2008, 2009\n" + //
                        " ☆ ICC Men's ODI Team of the Year: 2006, 2008, 2009, 2010, 2011, 2012, 2013, 2014 (captain in 2009, 2011–2014)\n" + //
                        " ☆ ICC Men's ODI team of the decade: 2011–2020 (captain and wicket-keeper)\n" + //
                        " ☆ ICC Men's T20I team of the decade: 2011–2020 (captain and wicket-keeper)\n" + //
                        " ☆ ICC Spirit of the cricket award of the decade: 2011–2020");
        tabbedPane.addTab("Honours", new JScrollPane(textPane5));


       
       
        Object[][]data={
                {"TEST","90","144","4876","224","38.09","59.12","6","33"},
                {"ODI","350","297","10773","183","50.58","87.56","10","73"},
                {"T20I","98","85","1617","56","37.6","126.13","0","2"},
                {"IPL","250","218","5082","84","38.79","135.92","0","24"},
              
                };
                Object Columns[]={"Format","Matches","Innings","Runs","Top Score","Average","Strike Rate","50","100"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
                jTable.setBackground(Color.lightGray);
                Font font = new Font("Arial", Font.PLAIN, 16); 
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.addTab("Career Stats",new JScrollPane(jTable));

        
  
        add(tabbedPane);

 
        setVisible(true);
    }
    public static void main(String[] args) {
        new Thala();
    }
}