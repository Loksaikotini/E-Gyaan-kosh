import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Sai extends JFrame {

    public Sai() {
        setTitle("Sai Pallavi");
        
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
        
        textPane1.setText("->Sai Pallavi was born on 9 May 1992 in a Badaga Hindu family in Coimbatore, Tamil Nadu. Her hometown is Kotagiri in the Nilgiris district, Tamil Nadu. Born to Senthamarai Kannan and Radha, She has a younger sister, Pooja Kannan, who has also worked as an actress.She was raised and educated in Coimbatore, doing her schooling at Avila Convent School.\n" + //
                "\n" + //
                "->Despite completing her medical studies in 2016 from the Tbilisi State Medical University which is recognised by Medical Council of India, she has not yet registered as a medical practitioner in India. She took her Foreign Medical Graduate Examination (FMGE) on 31 August 2020 in Trichy. Besides Badaga, Pallavi can speak fluently in Tamil, English, Hindi and Georgian. She later learnt Telugu following a career in her respective cinema industry.\n" + //
                "\n" + //
                "->Pallavi said in an interview that though she was not a trained dancer, but she always wanted to do something that involved dancing. She participated in several cultural events at school, gaining popularity as a dancer. Due to her passion for dance, which was supported by her mother, she participated in the dance reality show Ungalil Yaar Adutha Prabhu Deva on Vijay TV in 2008, and was a finalist in Dhee Ultimate Dance Show (D4) on ETV in2009.\n" + //
                "\n" + //
                "->Pallavi appeared in uncredited roles as a child actress in Kasthuri Maan (2005) and Dhaam Dhoom (2008) and appeared in few advertisements.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        
        textPane2.setText("->In 2014, while she was studying in Tbilisi, Georgia, film-director Alphonse Puthren had approached her six years before, through clippings from a reality show which she had participated, showcased in Facebook. Alphonse initially gave her an offer to act in his film which she refused, and after six years, he phoned to Pallavi, in which she thought him as a stalker and wanted to lodge a police complaint on him. But later misunderstood after Alphonse forcibly introduced himself. Then, She accepted the role of Malar in his film Premam.She shot the film over the holidays and, after the shooting finished, returned to her studies\r\n" + //
                "\r\n" + //
                "-> She went on to win several \"Best Female Debut\" awards that year, including the Filmfare Award for Best Female Debut.Years later, in an interview, Alphonse revealed that Asin was initially considered for the character Malar, played by Pallavi, following a fan's request.\r\n" + //
                "\r\n" + //
                "->The year 2017 marked her debut in Telugu with Sekhar Kammula's Fidaa, in the role of Bhanumathi, a feisty village girl from Telangana. Her performance in the film is regarded as one of the \"100 Greatest Performances of the Decade\" by Film Companion.She went onto win her first Filmfare Award for Best Actress – Telugu. Her next project with director A. L. Vijay announced that he would be working on a film with her for Lyca Productions and that he would direct a script he had written \"three and a half years ago\".\r\n" + //
                "\r\n" + //
                "-> He had chosen to cast Sai Pallavi, after another project for Pramod Films, which would have been a Tamil remake of the Malayalam film Charlie (2015) with Madhavan, was suddenly shelved. After securing the actress's dates to shoot the film, Vijay finalised the technical crew to include his regular collaborators such as cinematographer Nirav Shah and editor Anthony. \r\n" + //
                "\r\n" + //
                "->For Sai Pallavi, it became her first Tamil language film following a series of projects which she dropped out of, she was replaced in or was shelved. She had previously been cast and then replaced in Mani Ratnam's Kaatru Veliyidai (2017), while she opted out Vijay Chander's Sketch (2017). Likewise, earlier, her films Charlie and Rajiv Menon's Saravam Thaala Maayam were indefinitely postponed.\r\n" + //
                "\r\n" + //
                "-> Finally, it was Diya, which is a Tamil–Telugu bilingual film and had an average run at the box office. In May 2018, it was reported that Vijay Deverakonda will join with debutant director Bharat Kamma for a new film. The first look poster of the film was unveiled on Devarakonda's birthday, 9 May 2018, and for that she was earlier chosen for the film's female lead. However, she rejected the script due to the lip-lock scenes between the lead actors.Later, she starred in the Tamil movie Maari 2, a sequel to Maari (2015), opposite Dhanush, directed by Balaji Mohan. A song from the movie, \"Rowdy Baby\", set a record by becoming the first south Indian (and Tamil) song to clock over 1.5 Billion views on YouTube.\r\n" + //
                "\r\n" + //
                "->Pallavi started shooting in February 2018 for the film Padi Padi Leche Manasu with Sharwanand,[48][49] which was a huge commercial failure. In December, several news outlets reported that she refused to accept her full remuneration, expressing solidarity with the producers for the failure of the film. In 2019, she portrayed an autistic girl in the psychological thriller Athiran opposite Fahadh Faasil. Her next film in Tamil with actor Suriya, directed by Selvaraghavan titled NGK, released on 31 May 2019.[citation needed] Although the film received mixed reviews from critics, it ended up being a commercial success.\r\n" + //
                "\r\n" + //
                "->In 2020, she was recognised by Forbes magazine as one of India's 30 under 30. She was the only person from film industry in that list. She also acted in a Netflix anthology film series Paava Kadhaigal segment Oor Iravu directed by Vetrimaaran. In 2021, she starred in the romantic drama Love Story  alongside Naga Chaitanya in her second collaboration with Sekhar Kammula after Fidaa (2017) and Shyam Singa Roy opposite Nani in their second collaboration after MCA. In 2022 she appeared in Telugu film Virata Parvam opposite Rana Daggubati. For her Tamil film Gargi, she dubbed her own lines in both Telugu and Kannada.\r\n" + //
                "\r\n" + //
                "->Her next film will be in Tamil along with Sivakarthikeyan produced by Kamal Hassan under Raaj Kamal Films International directed by Rajkumar Periyasamy. In September 2023, makers of Naga Chaitanya's 23rd film have confirmed that Sai Pallavi will be playing the female lead in his film, making it their second film collaboration after Love Story.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        
        textPane3.setText("->Filmfare Awards:\n" + //
                "Sai Pallavi won the Filmfare Award for Best Actress - Malayalam for her debut role as Malar in the movie \"Premam\" (2015). This film played a crucial role in establishing her as a talented actress in the industry.\n" + //
                "\n" + //
                "->Asianet Film Awards:\n" + //
                "She received the Best New Face of the Year award at the Asianet Film Awards for her performance in \"Premam.\"\n" + //
                "\n" + //
                "->SIIMA Awards (South Indian International Movie Awards):\n" + //
                "Sai Pallavi won the SIIMA Award for Best Debut Actress (Telugu) for her portrayal in the film \"Fidaa\" (2017). Her performance in this movie opposite actor Varun Tej received widespread acclaim.\n" + //
                "\n" + //
                "\n" + //
                "->Behindwoods Gold Medal:\n" + //
                "She received the Behindwoods Gold Medal for Best Actress (Critics) for her role in the Tamil film \"Diya\" (also known as \"Kanam\") in 2018. Her performance in this film earned critical acclaim.\n" + //
                "\n" + //
                "->Edison Awards:\n" + //
                "Sai Pallavi was recognized with the Edison Award for Best Actress for her impactful performance in \"Diya\" (2018).\n" + //
                "These accolades reflect Sai Pallavi's talent and versatility as an actress across various South Indian film industries. Her ability to portray diverse roles with depth and conviction has earned her praise from audiences and critics alike.\n" + //
                "\n" + //
                "->Additionally, Sai Pallavi's popularity and commendable performances have brought her a significant fan following across different regions in India, making her one of the most sought-after actresses in South Indian cinema.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sp5.jpg");

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
                   {"Premam"," 2015","Sai Pallavi made her acting debut in the Malayalam film \"Premam,\" directed by Alphonse Puthren. The film gained immense popularity and marked her entry into the film industry."},
                   {"Kali","2016","In this Malayalam film directed by Sameer Thahir, Sai Pallavi starred alongside Dulquer Salmaan."},
                   {"Fidaa","2017","Sai Pallavi made her Telugu film debut with \"Fidaa,\" directed by Sekhar Kammula. Her performance in the film received widespread acclaim."},
                   {"MCA (Middle Class Abbayi)","2017"," In this Telugu film directed by Venu Sri Ram, Sai Pallavi starred alongside Nani."},
                   {"Diya (Kanam)","2018","A bilingual film in Tamil and Telugu, \"Diya\" is a horror thriller directed by A. L. Vijay."},
                   {"Maari 2","2018","Sai Pallavi played a significant role in this Tamil action-comedy film directed by Balaji Mohan, starring Dhanush."},
                   {"Padi Padi Leche Manasu","2018"," A Telugu romantic film directed by Hanu Raghavapudi, where Sai Pallavi starred opposite Sharwanand."},
                   {"Athiran","2019","Sai Pallavi appeared in this Malayalam psychological thriller film directed by Vivek."},
                   {"NGK","2019","A Tamil political action film directed by Selvaraghavan, where Sai Pallavi shared the screen with Suriya."},
                   {"Love Story","2020","\"Love Story\" is an Indian Telugu-language romantic drama film directed by Sekhar Kammula, starring Naga Chaitanya and Sai Pallavi, exploring the complexities of love and relationships."},
                   {"Shyam Singha Roy","2020","\r\n" + //
                           "\"Shyam Singha Roy\" is a Telugu drama film featuring Nani, Sai Pallavi, and Krithi Shetty, directed by Rahul Sankrityan,with an anticipated release in 2021."},
                   {"Virata Parvam ","2021","A Telugu film directed by Venu Udugula, featuring Sai Pallavi alongside Rana Daggubati."},
                   {"Gargi","2022","Gargi is a 2022 Indian Tamil-language legal drama film directed and co-written by Gautham Ramachandran and produced by Blacky, Genie & My Left Foot Productions. Co-written by Hariharan Raju."}
                };
                Object Columns[]={"Movie","Year","Description"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
                jTable.setBackground(Color.lightGray);
                Font font = new Font("Arial", Font.PLAIN, 16); // Change the font (Arial, bold, size 14)
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.addTab("Movies",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sai();
    }
}