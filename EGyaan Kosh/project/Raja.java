import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Raja extends JFrame {

    public Raja() {
        setTitle("S.S. Rajamouli");
        
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
        textPane1.setText("->Koduri Srisaila Sri Rajamouli, commonly known as S.S. Rajamouli, was born on October 10, 1973, in Raichur, Karnataka, India." + //
                "\r\n" + //
                "->He hails from a family with a strong connection to the film industry.His father, K. V. Vijayendra Prasad, is a renowned screenwriter in the Telugu film industry, and this familial association played a significant role in shaping Rajamouli's interest in cinema from an early age." + //
                "\r\n" + //
                "->Rajamouli's mother belonged to Kapu caste and his father is a Kamma.Rajamouli married Rama, sister-in-law of his cousin Keeravani in 2001." + //
                "\r\n" + //
                "->He adopted Karthikeya, Rama's son from her previous marriage. The couple also has an adopted daughter Mayookha.Karthikeya is married to Pooja Prasad, niece of Telugu actor Jagapathi Babu." + //
                "\r\n" + //
                "->Rajamouli's cousin, M. M. Keeravani has worked as the music composer for all of his films. His other cousins Kalyani Malik and M. M. Srilekha are also music composers. S. S. Kanchi, a screenwriter and actor known for his role in the sitcom Amrutham is also one of his cousins." + //
                "");
        tabbedPane.addTab("Personal Information", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        
        textPane2.setText("    He started writing for films but was always disappointed by the execution of his stories by other directors. His frustration as a writer motivated him to become a director so that he can bring out his vision as a writer perfectly onto the screen. Student No:1(2001) marked the official debut of SS Rajamouli as a director. It was a coming of age romantic action film and was the second film of Jr. NTR in a lead role.\n" + //
                "    Rajamouli's second film was Simhadri (2003), again with Jr. NTR. It marked Rajamouli's first collaboration with his father Vijayendra Prasad who provided the story. Rajamouli's third film was Sye (2004), starring Nithin and Genelia. It was a first-of-its-kind film in Telugu cinema, in that it was based on the sport of Rugby. \n" + //
                "    His next venture was Chatrapathi (2005),starring Prabhas in the lead role with music composed by M. M. Keeravani. It was Rajamouli's fourth consecutive hit. In his next project Vikramarkudu (2006), Rajamouli worked with Ravi Teja and Anushka Shetty.\n" + //
                "    He then directed Yamadonga (2007), a fantasy action comedy film starring Jr NTR, Priyamani, Mohan Babu, and Mamata Mohandas. \n" + //
                "    Rajamouli's next venture was the fantasy-action film Magadheera (2009), starring Ram Charan and Kajal Aggarwal. Made on a budget of ₹35–44 crore (US$7–10 million), it was the most expensive Telugu film at the time. \n" + //
                "    In 2010 he directed the action comedy film Maryada Ramanna starring Sunil and Saloni. His next project was the fantasy action film Eega (2012). The film was produced with an estimated budget of ₹30–40 crore (US$6–7 million). The film stars Sudeep, Nani, and Samantha.\n" + //
                "    In 2015, he directed the epic action film Baahubali: The Beginning starring Prabhas, Rana Daggubati, Anushka Shetty, Ramya Krishna, Sathyaraj, and Tamanna. It became the second highest grossing Indian film of all time, and the highest grossing Indian film of all time within India.Its Hindi dubbed version also broke several records. It was the first dubbed film to collect over 100 crore nett at the Hindi box office and became the highest-grossing dubbed film in Hindi of all time. \n" + //
                "    His next project was Baahubali 2: The Conclusion (2017), which served as both a sequel and a prequel to Baahubali: The Beginning. It was made on an estimated budget of ₹250 crore ($37 million) and was the most expensive Indian film ever made at the time. It grossed ₹1,810 crore worldwide ($267 million), collecting approximately ₹800 crore worldwide within just six days of its release. The film sold over 10 crore (100 million) tickets during its box office run, the highest estimated admissions for any film in India since Sholay (1975).\n" + //
                "    Several filmmakers and film analysts have credited Rajamouli for almost single-handedly expanding the reach and market of South Indian cinema to Northern India and beyond.\n" + //
                "    Rajamouli's subsequent film RRR (2022) is an epic action drama based on the lives of Indian revolutionaries, Alluri Sitarama Raju and Komaram Bheem. The film stars NTR Jr, Ram Charan, Ajay Devgn, and Alia Bhatt. With ₹240 crore (US$31 million) worldwide on its first day, RRR broke the record for the highest opening-day collection earned by an Indian film. The film grossed 1,200 crore (US$175 million) worldwide.\n" + //
                "    Rajamouli is committed to collaborate with actor Mahesh Babu.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        textPane3.setText("S. S. Rajamouli, the acclaimed Indian filmmaker, has garnered numerous awards and accolades throughout his illustrious career. In 2017, he was honored with the ANR National Award, recognizing his significant contributions to the film industry. His directorial prowess was evident at the CineMAA Awards in 2009, where his work on \"Magadheera\" earned him the Best Director title. This success continued with the 2015 CineMAA Awards for \"Baahubali: The Beginning,\" solidifying his position as a directorial force.\n" + //
                "Rajamouli's impact on the entertainment industry extended beyond national borders, earning him the CNN–News18 Indian of the Year award in 2015 and 2022 for his outstanding contributions to the field of entertainment. The Filmfare Awards South acknowledged his brilliance in multiple instances, including wins for \"Magadheera\" (2009), \"Eega\" (2012), and \"Baahubali: The Beginning\" (2015). His magnumopus, \"Baahubali 2: The Conclusion,\" continued this trend with a Best Director win in 2018.\n" + //
                "\r\n" + //
                "The prestigious National Film Awards recognized Rajamouli's excellence with \"Eega\" receiving the Best Feature Film in Telugu in 2012, and \"Baahubali: The Beginning\" securing the Best Feature Film award in 2015. \n" + //
                "His epic saga, \"Baahubali 2: The Conclusion,\" added to the accolades with the Best Popular Film Providing Wholesome Entertainment award in 2017. The trend continued with \"RRR,\" earning him the Best Popular Film Providing Wholesome Entertainment award in 2021.\n" + //
                "\r\n" + //
                "Rajamouli's international acclaim was underscored by the New York Film Critics Circle in 2022, honoring him with the Best Director award for \"RRR.\" \n" + //
                "Additionally, his films received recognition at various film festivals and associations, including the South Indian International Movie Awards, South Scope Cine Awards, and the Utah Film Critics Association.\n" + //
                "While achieving great success, Rajamouli has also garnered nominations, such as those at the Vijay Awards for \"Naan Ee\" in 2013 and \"Baahubali 2: The Conclusion\" in 2018, reflecting the consistent quality of his directorial endeavors. Rajamouli's enduring influence on Indian cinema is characterized not only by his numerous awards but also by the widespread acclaim and commercial success of his films, securing his place as one of the industry's most esteemed filmmakers.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\rj5.jpg");

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
    
           
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            textPane4.insertComponent(scrollPane.getComponent(0));
            
        });
        tabbedPane.addTab("Images", new JScrollPane(textPane4));


        Object[][]data={
                    {"Student No.1","NTR.Jr",2001},
                    {"Simhadri","NTR.Jr",2003},
                    {"Chatrapathi","Prabhas",2005},
                    {"Vikramarkudu","Ravi Teja",2006},
                    {"Yamadonga","NTR.Jr",2007},
                    {"Magadheera","Ramcharan",2009},
                    {"Eega","Nani",2012},
                    {"Bahubali 1","Prabhas",2015},
                    {"Bahubali 2","Prabhas",2017},
                    {"RRR","NTR.Jr,Ramcharan",2022}
                };
                Object Columns[]={"Movie","Actor","Year"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(500);
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
        new Raja();
    }
}