import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Atal extends JFrame {

    public Atal() {
        setTitle("Atal Bihari Vajpayee");
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
        textPane1.setText("Atal Bihari Vajpayee, a prominent Indian political leader, served as the Prime Minister of India three times and played a crucial role in shaping the country's political landscape. Here is a brief overview of his personal life:\r\n" + //
                "\r\n" + //
                "Birth and Family:\r\n" + //
                "\r\n" + //
                "Atal Bihari Vajpayee was born on December 25, 1924, in Gwalior, British India (now in Madhya Pradesh, India).\r\n" + //
                "->He came from a middle-class Brahmin family. His father's name was Krishna Bihari Vajpayee, and his mother was Krishna Devi.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "->Education:Vajpayee completed his schooling from Saraswati Shishu Mandir and Victoria College in Gwalior.\r\n" + //
                "He pursued a master's degree in political science from DAV College, Kanpur.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "->Early Career:\r\n" + //
                "Vajpayee was associated with the Rashtriya Swayamsevak Sangh (RSS) during his college days and played an active role in student politics.He was a prominent leader of the Bharatiya Jana Sangh, the political arm of the RSS.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "->Atal Bihari Vajpayee's political journey began as a Member of Parliament in 1957. He was elected to the Lok Sabha (Lower House of Parliament) several times.\r\n" + //
                "He co-founded the Janata Party in 1977 and became the External Affairs Minister in the Janata government.\r\n" + //
                "\r\n" + //
                "->Vajpayee served as the Prime Minister of India for three non-consecutive terms: 1996 for 13 days, 1998-2004, and briefly in 1999.\r\n" + //
                "\r\n" + //
                "->Vajpayee was known for his affable personality, oratory skills, and ability to build consensus.\n" + //
                "He was a bachelor and had no immediate family of his own. His adopted daughter, Namita Kaul Bhattacharya, was a part of his close-knit circle.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "->Vajpayee faced health issues in his later years, including a stroke in 2009 that affected his speech.He withdrew from active politics due to health reasons and lived a retired life until his passing.\r\n" + //
                "\r\n" + //
                "->Atal Bihari Vajpayee passed away on August 16, 2018, at the age of 93, at All India Institute of Medical Sciences (AIIMS), New Delhi.\n" + //
                "Atal Bihari Vajpayee's legacy is celebrated for his statesmanship, contributions to Indian politics, and efforts to promote economic reforms and strengthen India's position on the global stage.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        textPane2.setText("->Atal Bihari Vajpayee had a distinguished and impactful career in Indian politics. Here is an overview of his professional political career:\r\n" + //
                "\r\n" + //
                "->Early Political Involvement:Vajpayee's political journey began with his association with the Rashtriya Swayamsevak Sangh (RSS) during his college days in the 1940s.\r\n" + //
                "He joined the Bharatiya Jana Sangh, the political arm of the RSS, and became an active member in post-independence India.\r\n" + //
                "\r\n" + //
                "->Member of Parliament:Vajpayee was elected as a Member of Parliament (MP) for the first time in 1957 from Balrampur, Uttar Pradesh, representing the Bharatiya Jana Sangh.\r\n" + //
                "\r\n" + //
                "->Foreign Minister in Janata Government (1977-1980):He played a key role in the formation of the Janata Party, which came to power after the Emergency in 1977.\r\n" + //
                "Vajpayee served as the External Affairs Minister in the Janata government led by Morarji Desai.\r\n" + //
                "\r\n" + //
                "->Founding the Bharatiya Janata Party (BJP):In 1980, Vajpayee, along with other leaders, founded the Bharatiya Janata Party (BJP) as a successor to the Bharatiya Jana Sangh.\r\n" + //
                "The BJP emerged as a major political force under his leadership.\r\n" + //
                "\r\n" + //
                "->Prime Ministership (1996, 1998-2004):Vajpayee became the Prime Minister of India for the first time in 1996, leading a short-lived government for 13 days.\r\n" + //
                "He returned to power in 1998, leading the National Democratic Alliance (NDA), a coalition of political parties, and served as Prime Minister until 2004.\r\n" + //
                "Pokhran-II Nuclear Tests (1998):\r\n" + //
                "\r\n" + //
                "->Vajpayee's government conducted nuclear tests at Pokhran in May 1998, asserting India's nuclear capabilities.\r\n" + //
                "Economic Reforms and Infrastructure Development:\r\n" + //
                "\r\n" + //
                "->Vajpayee's tenure saw significant economic reforms, including privatization initiatives and infrastructure development projects like the Golden Quadrilateral highway network.\r\n" + //
                "\r\n" + //
                "->Peace Initiatives:\r\n" + //
                "Known for his statesmanship, Vajpayee made efforts to improve relations with Pakistan, including the historic Lahore Summit in 1999.\r\n" + //
                "Retirement and Later Years:\r\n" + //
                "\r\n" + //
                "->Vajpayee announced his retirement from active politics in 2005 due to health reasons.He lived a retired life until his passing on August 16, 2018.Atal Bihari Vajpayee's political career was marked by his charismatic leadership, inclusive governance, and a commitment to national development. His legacy continues to influence Indian politics, and he is remembered as one of India's most respected statesmen.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        textPane3.setText("-->Atal Bihari Vajpayee was a prominent Indian statesman, a charismatic leader, and a respected figure in Indian politics. His achievements during his political career, spanning several decades, are numerous and significant. Here are some of Atal Bihari Vajpayee's key achievements:\r\n" + //
                "\r\n" + //
                "-->Three-time Prime Minister of India:\r\n" + //
                "\r\n" + //
                "Vajpayee served as the Prime Minister of India three times: first for 13 days in 1996, then for 13 months from 1998 to 1999, and finally from 1999 to 2004, becoming the first non-Congress Prime Minister to complete a full term in office.\r\n" + //
                "\r\n" + //
                "-->Nuclear Tests and Foreign Policy:\r\n" + //
                "\r\n" + //
                "Oversaw the Pokhran-II nuclear tests in May 1998, which established India as a nuclear power and showcased its technological capabilities.\r\n" + //
                "Pioneered the 'Look East' policy, aiming to strengthen India's ties with Southeast Asia and the wider Asia-Pacific region.\r\n" + //
                "\r\n" + //
                "-->Infrastructure Development and Economic Reforms:\r\n" + //
                "\r\n" + //
                "Initiated various infrastructure development projects, including the Golden Quadrilateral highway project aimed at connecting major Indian cities through highways.\r\n" + //
                "Advocated for economic reforms and liberalization policies to stimulate growth and attract foreign investment.\r\n" + //
                "\r\n" + //
                "-->Peace Initiatives and Diplomacy:\r\n" + //
                "\r\n" + //
                "Took proactive steps towards peace and diplomacy, especially with Pakistan, initiating the Lahore Declaration in 1999 to improve bilateral relations.\r\n" + //
                "Advocated for a peaceful resolution of the Kashmir conflict and regional stability.\r\n" + //
                "\r\n" + //
                "-->Education and Governance Reforms:\r\n" + //
                "\r\n" + //
                "Focused on education reforms, emphasizing the importance of education for all and the modernization of the education system.\r\n" + //
                "Emphasized good governance, advocating for transparency, accountability, and administrative reforms.\r\n" + //
                "\r\n" + //
                "-->Poet and Orator:\r\n" + //
                "\r\n" + //
                "Vajpayee was also known for his eloquence and poetry. He was a gifted orator and a published poet whose speeches and poems resonated with the public.\r\n" + //
                "\r\n" + //
                "-->Padma Vibhushan and Bharat Ratna:\r\n" + //
                "\r\n" + //
                "Honored with the Padma Vibhushan in 1992 and posthumously awarded India's highest civilian award, the Bharat Ratna, in 2015.\r\n" + //
                "\r\n" + //
                "-->Atal Bihari Vajpayee's tenure as Prime Minister and his contributions to India's development, foreign policy, and governance left a significant impact on the nation. He was revered for his statesmanship, inclusive leadership, and ability to unite diverse political ideologies for the country's progress. Vajpayee remains an iconic figure in Indian politics, remembered for his vision, statesmanship, and dedication to the nation.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ab5.jpg");

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
                            {"1951","Founding-Member","Bharatiya Jana Sangh"},
                            {"1957–1962","MP, Balrampur (Lok Sabha constituency)","1st Term"},
                            {"1957–1977","Leader","Bharatiya Jana Sangh"},	
                            {"1962–1968","MP,Uttar Pradesh", "1st Term (Resigned on 25 February 1967) Elected to Lok Sabha"},
                            {"1966–1967","Chairman Committee on Government Assurances","Rajya Sabha"},	
                            {"1967","MP, Balrampur (Lok Sabha constituency)","4th Lok Sabha ,Bharatiya Jana Sangh 2nd Term"},
                            {"1967–70","Chairman,Public Accounts Committee","Bharatiya Jana Sangh"},
                            {"1968–1973","President","Bharatiya Jana Sangh"},	
                            {"1971","MP Gwalior (Lok Sabha constituency)","5th Lok Sabha,3rd Term"},
                            {"1977","MP, New Delhi (Lok Sabha constituency)","6th Lok Sabha (4th term)"},
                            {"1977–1979","Union Cabinet Minister,	External Affairs","Janata Party"},	
                            {"1977–1980","Founding Member	Janata Party","Janata Party"},
                            {"1980","MP, New Delhi (Lok Sabha constituency)","7th Lok Sabha,Bharatiya Janata Party,(5th term)"},
                            {"1980-1986","President","Bharatiya Janata Party"},
                            {"1980–1984, 1986 and 1993–1996","Leader","Parliamentary Party,Bharatiya Janata Party"},
                            {"1986","MP, Madhya Pradesh","Rajya Sabha 2nd Term"},
                            {"1988–1989","Member","General Purposes Committee Rajya Sabha"},
                            {"1988–1990","Member","House Committee Member, Business Advisory Committee Rajya Sabha"},
                            {"1990–1991","Chairman","Committee on Petitions Rajya Sabha	"},
                            {"1991","MP","Lucknow (Lok Sabha constituency) 10th Lok Sabha,Bharatiya Janata Party (6th term)"},
                            {"1991–1993","Chairman","Public Accounts Committee,Lok Sabha"},	
                            {"1993–1996","Chairman","Committee on External Affairs,Lok Sabha"},
                            {"1993–1996","Leader of Opposition","Lok Sabha,Bharatiya Janata Party"},
                            {"1996","MP, Lucknow (Lok Sabha constituency)","1th Lok Sabha,Bharatiya Janata Party,7th Term"},
                            {"16 May 1996 – 31 May 1996","Prime Minister of India; and in charge of other subjects not allocated to any other Cabinet Minister","Bharatiya Janata Party"},
                            {"1996–1997","Leader of Opposition","Lok Sabha,Bharatiya Janata Party"},
                            {"1997–1998","Chairman","Committee on External Affairs	Lok Sabha"},	
                            {"1998","MP, Lucknow (Lok Sabha constituency)","12th Lok Sabha","Bharatiya Janata Party	8th Term"},
                            {"1998–1999","Prime Minister of India; Minister of External Affairs; and also incharge of Ministries/Departments not specifically allocated to the charge of any Minister","Bharatiya Janata Party"},
                            {"1999","MP, Lucknow (Lok Sabha constituency)","13th Lok Sabha,Bharatiya Janata Party,9th Term"},
                            {"1999","Leader,","Parliamentary Party, Lok Sabha,Bharatiya Janata Party"},
                            {"13 Oct.1999- May 2004","Prime Minister of India and also in charge of the Ministries/Departments not specifically allocated to the charge of any Minister","	Bharatiya Janata Party"},	
                            {"2004","MP Lucknow (Lok Sabha constituency)14th Lok Sabha","Bharatiya Janata Party 10th Term"},
                            {"2004","Chairman Parliamentary Party","Bharatiya Janata Party National Democratic Alliance(India)"}
                };
                Object Columns[]={"Year","Position","Remarks"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(300);
                Font font = new Font("Arial", Font.PLAIN, 16); // Change the font (Arial, bold, size 14)
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.setBackground(Color.lightGray);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.addTab("Positions held",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Atal();
    }
}