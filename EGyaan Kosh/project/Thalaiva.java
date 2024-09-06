import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Thalaiva extends JFrame {

    public Thalaiva() {
        setTitle("Rajini Kanth");
        setSize(1500, 800);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create a JTextPane with non-editable text for the first tab
        JTextPane textPane1 = new JTextPane();
        textPane1.setEditable(false);
        StyledDocument doc1 = textPane1.getStyledDocument();
        SimpleAttributeSet center1 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center1, StyleConstants.ALIGN_LEFT);
        doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
        Font font1 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane1.setFont(font1);
        textPane1.setText("-->Rajinikanth was born as Shivaji Rao Gaikwad on 12 December 1950 in a Marathi Hindu family in Bangalore, Mysore State (present day Karnataka). His mother was a homemaker, and his father Ramoji Rao Gaekwad was a police constable.[His ancestors hailed from Mavadi Kadepathar, Pune, Maharashtra.He is the youngest of four siblings in a family consisting of two elder brothers (Satyanarayana Rao and Nageshwara Rao) and a sister (Aswath Balubhai).After his father's retirement from work in 1956, the family moved to the suburb of Hanumantha Nagar in Bangalore and built a house there.He lost his mother at the age of nine.\r\n" + //
                "\r\n" + //
                "-->Rajinikanth had his primary education at the Gavipuram Government Kannada Model Primary School in Bangalore.As a child, he was \"studious and mischievous\" with a great interest in cricket, football and basketball. During this time, his brother enrolled him at the Ramakrishna Math, a Hindu monastery set up by the Ramakrishna Mission. In the math, he was taught Vedas, tradition and history, which eventually instilled a sense of spirituality in him.In addition to spiritual lessons, he also began acting in plays at the math. \r\n" + //
                "\r\n" + //
                "-->His aspiration towards theatre grew at the math and was once given an opportunity to enact the role of Ekalavya's friend from the Hindu epic Mahabharata. His performance in the play received praise from the Kannada poet D. R. Bendre.After sixth grade, Rajinikanth was enrolled at the Acharya Pathasala Public School and studied there till completion of his pre-university course.During his schooling at the Acharya Pathasala, he spent a lot of time acting in plays.\r\n" + //
                "\r\n" + //
                "-->Upon completion of his school education, Rajinikanth performed several jobs including that of a coolie,before getting a job in the Bangalore Transport Service as a bus conductor.He continued to take part in plays after the Kannada playwright Topi Muniappa offered him a chance to act in one of his mythological plays. He decided to take up an acting course in the newly formed Madras Film Institute after coming across an advertisement.\r\n" + //
                "\r\n" + //
                "-->Though his family was not fully supportive of his decision to join the institute,his friend and co-worker Raj Bahadur motivated him to join the institute and financially supported him during this phase.During his stay at the institute, he was noticed by the Tamil film director K. Balachander.Balachander provided Rajinikanth with his stage name to avoid confusion with fellow actor Sivaji Ganesan, having taken it from a character's name in his earlier film Major Chandrakanth.The director advised him to learn to speak Tamil, a recommendation that Rajinikanth quickly followed.Though he can read the language, he cannot write in it.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        textPane2.setText("-->1974–1977: Early career\r\n" + //
                "\"Rajinikanth claims that I am his school. But I must admit that this wasn't the Rajinikanth I introduced. He has evolved on his own merits and strengths. I gave him an opportunity and unveiled him to the world. He went and conquered it.\"\r\n" + //
                "\r\n" + //
                "-->Rajinikanth began his film career with the Tamil film Apoorva Raagangal (1975), directed by K. Balachander.[45] He was cast in a small role as the ex-husband of the female lead played by Srividya.The film explored relationships between people with wide age differences and was deemed controversial upon release.[48] However, it received critical acclaim and won three National Film Awards including the Award for the Best Tamil Feature at the 23rd National Film Awards in 1976.[\r\n" + //
                "\r\n" + //
                "A review from The Hindu noted that: \"Newcomer Rajinikanth is dignified and impressive\". His next release was Puttanna Kanagal's Kannada anthology film Katha Sangama (1976).Rajinikanth appeared in the last segment of the film; he played the role as a village ruffian who rapes a blind woman in the absence of her husband.Balachander cast him in a pivotal role in Anthuleni Katha (1976), the Telugu remake of his own Tamil film Aval Oru Thodar Kathai (1974).\r\n" + //
                "\r\n" + //
                "--> In Moondru Mudichu—the first Tamil film to feature him in a prominent role—he played a character that \"blithely row[s] away\" when his friend drowns accidentally in the lake only to fulfill his desire to marry the former's girlfriend.His style of flipping the cigarette in the film made him popular among the audience.In his final release of the year, Baalu Jenu, he was cast as the main antagonist who troubles the female lead.[\r\n" + //
                "\r\n" + //
                "-->He played similar roles in Balachander's Avargal (1977), and Bharathiraja's 16 Vayadhinile (1977).The same year, he made his first-ever appearance as a lead actor in the Telugu film Chilakamma Cheppindi (1977), which earned him his only nomination for the Filmfare Award for Best Actor – Telugu.S. P. Muthuraman experimented Rajinikanth in a positive role in Bhuvana Oru Kelvi Kuri (1977).The success of the film brought the duo together for 24 more films till the 1990s.Rajinikanth played supporting and \"villainous\" roles in most of the films released during the year.In Gaayathri he was cast as a pornographer who secretly films his relationship with his wife without her knowledge and in Galate Samsara he played the role of a married man who develops an affair with a cabaret dancer. He had 15 of his films released during the year.\r\n" + //
                "\r\n" + //
                "-->It was speculated that Rajinikanth would enter politics in 1995. He decided against it and declared if he took the plunge into politics now, it would result in a lot of confusion and that he would not be able to serve the people and fulfil their expectations. However, he added that if Chief Minister J. Jayalalithaa's party returns to power in the 1996 Tamil Nadu Legislative Assembly election, \"even God cannot save the people of the State.\"Rajinikanth went on to wholeheartedly supported the Dravida Munnetra Kazhagam (DMK) and Tamil Maanila Congress alliance and asked the people of Tamil Nadu and his fans to vote for that alliance. This alliance had a complete victory in the elections. He also supported the same alliance in the 1996 and 1998 Indian general elections.\r\n" + //
                "\r\n" + //
                "-->Later in 2004, Rajinikanth said he would personally vote for the Bharatiya Janata Party (BJP) but would not extend his support to any front during the upcoming Indian general election.[181] The party, however, failed to win any seats in Tamil Nadu in the Lok Sabha.Rajinikanth canceled his visit to Sri Lanka in March 2017 at the urging of Tamil Nadu politicians. Leaders of the BJP criticized this choice.\r\n" + //
                "\r\n" + //
                "-->However several political analysts state Rajinikanth has missed his chance and unlike 1996 when he was at his peak it will be very difficult for him to make a significant impact in 2019.Rajinikanth announced entry into politics on 31 December 2017 and confirmed his intention to contest in the 2021 Tamil Nadu Legislative Assembly elections in all 234 constituencies. He stated that his party would resign if it was unable to fulfill its electoral promises within three years of coming into power.Rajinikanth dissolved his organisation Rajini Makkal Mandram (RMM) on 12 July 2021 and also said that he has no plans to enter politics in the future.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        textPane3.setText("-->Rajinikanth, the legendary actor from Tamil cinema, has a remarkable list of achievements throughout his illustrious career spanning over four decades. Some of his notable achievements include:\r\n" + //
                "\r\n" + //
                "-->Film Career: Rajinikanth has acted in over 150 films across multiple languages including Tamil, Telugu, Kannada, Malayalam, Hindi, and Bengali. His films have had a profound impact on Indian cinema, with many of them achieving immense commercial success.\r\n" + //
                "\r\n" + //
                "-->Cultural Icon: Rajinikanth is revered as a cultural icon, earning the title of \"Superstar\" for his immense popularity and impact on the audience. His unique style, mannerisms, and powerful dialogue delivery have made him a household name not just in Tamil Nadu but across India and even among the Indian diaspora worldwide.\r\n" + //
                "\r\n" + //
                "-->Versatile Roles: He has portrayed a wide range of characters from action-packed roles to charismatic leads, comic roles, and even characters with deep emotional nuances. Films like \"Baasha,\" \"Sivaji,\" \"Thalapathi,\" and \"Padayappa\" are celebrated for his exceptional performances.\r\n" + //
                "\r\n" + //
                "-->Global Recognition: Rajinikanth's fame extends beyond India. He has a substantial fan base in countries like Japan, where he is admired for his on-screen charisma and unique style.\r\n" + //
                "\r\n" + //
                "-->Philanthropy: Alongside his film career, Rajinikanth has been involved in various philanthropic activities. He has supported charitable causes and established foundations aimed at providing relief and assistance to the underprivileged.\r\n" + //
                "\r\n" + //
                "-->Political Influence: Although initially hesitant, Rajinikanth's expressions of interest in politics and public service have generated significant attention and speculation about his potential role in Tamil Nadu politics.\r\n" + //
                "\r\n" + //
                "-->Enduring Legacy: Even in his later years, Rajinikanth continues to be an influential figure in the Indian film industry. His films, dialogues, and mannerisms remain timeless and continue to captivate audiences of all ages.\r\n" + //
                "\r\n" + //
                "-->Rajinikanth's achievements not only span his success in cinema but also include his immense impact on society, culture, and the hearts of his fans. His journey from a bus conductor to becoming one of the most iconic actors in Indian cinema is a testament to his hard work, dedication, and unparalleled charisma on and off the screen.");
        tabbedPane.addTab("Achievements", new JScrollPane(textPane3));

        // Create a JTextPane with non-editable text and an image for the second tab
        JTextPane textPane4 = new JTextPane();
        textPane4.setEditable(false);
        StyledDocument doc4 = textPane4.getStyledDocument();
        SimpleAttributeSet center4 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
        doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);

        SwingUtilities.invokeLater(() -> {
            JPanel imagePanel = new JPanel();
            imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk2.png");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rk5.jpg");

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

        Object[][]data={
                {"Robo-2.O",2018,"1800Cr"},
                {"Robo-Enthiran",2010,"300Cr"},
                {"Kabali",2016,"300Cr"},
                {"Peta",2019,"200Cr"},
                {"Shivaji-The Boss",2007,"200Cr"},
                {"Kaala",2018,"180Cr"},
                {"Linga",2014,"175Cr"},
                {"Muthu",1995,"100Cr"},
                {"Chandra Mukhi",2005,"90Cr"},
                {"Padayappa",1999,"80Cr"},
                {"Basha",1995,"60Cr"},
                {"Dhalapathy",1991,"50Cr"},
                {"Annamalai",1992,"50Cr"},
                {"Velaikkaran",1987,"25Cr"}
                };
                Object Columns[]={"Movie","Year Of Release","Collection"};
                JTable jTable=new JTable(data,Columns);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(500);
                jTable.setBackground(Color.lightGray);
                Font font = new Font("Arial", Font.PLAIN, 16); 
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                
                tabbedPane.addTab("Box Office BlockBusters",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Thalaiva();
    }
}