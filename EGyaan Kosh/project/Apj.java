import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Apj extends JFrame {

    public Apj() {
        setTitle("A.P.J Abdul Kalam");
        
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
        textPane1.setText("-->Avul Pakir Jainulabdeen Abdul Kalam ( 15 October 1931 – 27 July 2015) was an Indian aerospace scientist and statesman who served as the 11th president of India from 2002 to 2007. He was born and raised in Rameswaram, Tamil Nadu and studied physics and aerospace engineering.\n" + //
                " \r\n" + //
                "\r\n" + //
                "-->His father Jainulabdeen Marakayar was a boat owner and imam of a local mosque; his mother Ashiamma was a housewife.His father owned a ferry that took Hindu pilgrims back and forth between Rameswaram and the now uninhabited Dhanushkodi.Kalam was the youngest of four brothers and one sister in his family.\n" + //
                "-->In his school years, Kalam had average grades but was described as a bright and hardworking student who had a strong desire to learn. He spent hours on his studies, especially Mathematics.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->He was known for his simplicity, humility, and dedication to serving the nation. Throughout his life, Kalam remained unmarried and devoted his time entirely to his work as a scientist, educator, and later as India's President. He was deeply passionate about science, education, and inspiring the youth, often encouraging them to dream big and work hard to achieve their goals.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Abdul Kalam's personal life was marked by his strong commitment to his principles, his passion for teaching, and his relentless pursuit of scientific knowledge. He led a simple and disciplined life, often spending time reading, writing, and interacting with students and young people to motivate them to pursue science and innovation.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->He was a highly respected figure not only in India but globally, known for his visionary ideas and efforts to promote education, scientific research, and technological advancements for the betterment of society. Throughout his life, Abdul Kalam remained dedicated to his work, inspiring millions with his words and actions, leaving behind a legacy of determination, knowledge, and service to the nation.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Abdul Kalam's personal life exemplified integrity, dedication, and service to the nation. He was not only a remarkable scientist and leader but also an individual whose life story continues to inspire millions worldwide, especially the youth, to strive for excellence and contribute positively to society.\r\n" + //
                "\r\n" + //
                "\r\n" + //
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
        textPane2.setText("-->A.P.J. Abdul Kalam was a renowned scientist, visionary leader, and India's 11th President. Throughout his lifetime, he achieved numerous milestones and left a lasting impact on various fronts. Some of his notable achievements include:\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Missile Development and Defense Technology:\n" + //
                "\r\n" + //
                "Integral role in the development of India's indigenous missile systems, including the Agni series, Prithvi, Trishul, Akash, and Nag missiles.\r\n" + //
                "Spearheaded the Integrated Guided Missile Development Program (IGMDP), significantly enhancing India's defense capabilities.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Space Research and Satellite Launch:\n" + //
                "\r\n" + //
                "Directed the development of India's first indigenous Satellite Launch Vehicle (SLV-III) that successfully deployed the Rohini satellite in orbit in 1980.\r\n" + //
                "Contributed to the Indian Space Research Organisation (ISRO), paving the way for advancements in India's space missions.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Visionary Leadership and Scientific Contributions:\n" + //
                "\r\n" + //
                "Known as the \"Missile Man of India\" for his exceptional leadership in missile technology and strategic contributions to India's defense.\r\n" + //
                "Published numerous scientific papers and articles, sharing insights and knowledge in the fields of aerospace and defense technology.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Education, Teaching, and Mentorship:\n" + //
                "\r\n" + //
                "Passionate advocate for education and an inspirational figure to students, encouraging them to pursue careers in science and technology.\r\n" + //
                "Held various academic positions, engaging actively with young minds to inspire innovation and excellence.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Presidency and Advocacy for Societal Development:\n" + //
                "\r\n" + //
                "Served as the President of India from 2002 to 2007, bringing a vision of an inclusive, knowledge-driven society.\r\n" + //
                "Emphasized the importance of education, youth empowerment, and societal development during his tenure as President.\\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Authorship and Public Speaking:\n" + //
                "\r\n" + //
                "Authored several books, including \"Wings of Fire,\" an autobiography, and \"Ignited Minds,\" focusing on nurturing the potential of India's youth.\r\n" + //
                "Delivered inspirational speeches, motivating people of all ages and backgrounds to strive for excellence and contribute to the nation's progress.\r\n" + //
                "Abdul Kalam's achievements spanned across science, technology, education, and leadership. His legacy continues to inspire millions worldwide, particularly in India, as a symbol of dedication, innovation, and commitment to national development.\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        textPane3.setText("-->A.P.J. Abdul Kalam was a renowned scientist, visionary leader, and India's 11th President. Throughout his lifetime, he achieved numerous milestones and left a lasting impact on various fronts. Some of his notable achievements include:\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Missile Development and Defense Technology:\n" + //
                "\r\n" + //
                "Integral role in the development of India's indigenous missile systems, including the Agni series, Prithvi, Trishul, Akash, and Nag missiles.\r\n" + //
                "Spearheaded the Integrated Guided Missile Development Program (IGMDP), significantly enhancing India's defense capabilities.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Space Research and Satellite Launch:\n" + //
                "\r\n" + //
                "Directed the development of India's first indigenous Satellite Launch Vehicle (SLV-III) that successfully deployed the Rohini satellite in orbit in 1980.\r\n" + //
                "Contributed to the Indian Space Research Organisation (ISRO), paving the way for advancements in India's space missions.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Visionary Leadership and Scientific Contributions:\n" + //
                "\r\n" + //
                "Known as the \"Missile Man of India\" for his exceptional leadership in missile technology and strategic contributions to India's defense.\r\n" + //
                "Published numerous scientific papers and articles, sharing insights and knowledge in the fields of aerospace and defense technology.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Education, Teaching, and Mentorship:\n" + //
                "\r\n" + //
                "Passionate advocate for education and an inspirational figure to students, encouraging them to pursue careers in science and technology.\r\n" + //
                "Held various academic positions, engaging actively with young minds to inspire innovation and excellence.\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Presidency and Advocacy for Societal Development:\n" + //
                "\r\n" + //
                "Served as the President of India from 2002 to 2007, bringing a vision of an inclusive, knowledge-driven society.\r\n" + //
                "Emphasized the importance of education, youth empowerment, and societal development during his tenure as President.\\n" + //
                "\r\n" + //
                "\r\n" + //
                "-->Authorship and Public Speaking:\n" + //
                "\r\n" + //
                "Authored several books, including \"Wings of Fire,\" an autobiography, and \"Ignited Minds,\" focusing on nurturing the potential of India's youth.\r\n" + //
                "Delivered inspirational speeches, motivating people of all ages and backgrounds to strive for excellence and contribute to the nation's progress.\r\n" + //
                "Abdul Kalam's achievements spanned across science, technology, education, and leadership. His legacy continues to inspire millions worldwide, particularly in India, as a symbol of dedication, innovation, and commitment to national development.\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ak.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ap1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ak5.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ap2.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ap3.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\ap4.jpg");

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
                    {2014,"Honorary professor","Beijing University, China"},
                    {2014,"Doctor of Science","Edinburgh University, UK"},
                    {2013,"Von Braun Award","National Space Society"},
                    {2012,"Doctor of Laws (Honoris Causa)	","Simon Fraser University"},
                    {2011,"IEEE Honorary Membership","IEEE"},
                    {2010,"Doctor of Engineering","University of Waterloo"},
                    {2009,"Honorary Doctorate","Oakland University"},
                    {2009,"International von Kármán Wings Award","California Institute of Technology, USA"},
                    {2008,"Doctor of Science","Universiti Sains Malaysia"},
                    {2008,"Hoover Medal","ASME Foundation, USA"},
                    {2008,"Doctor of Engineering (Honoris Causa)","Nanyang Technological University, Singapore"},
                    {2008,"Doctor of Science (Honoris Causa)","Aligarh Muslim University, Aligarh"},
                    {2007,"Honorary Doctorate of Science and Technology","Carnegie Mellon University"},
                    {2007,"King Charles II Medal","Royal Society, UK"},
                    {2007,"Honorary Doctorate of Science","University of Wolverhampton, UK"},
                    {2000,"Ramanujan Award","Alwars Research Centre, Chennai"},
                    {1998,"Veer Savarkar Award","Government of India"},
                    {1997,"Indira Gandhi Award For National Integration","Indian National Congress"},
                    {1997,"Bharat Ratna","President of India"},
                    {1995,"Honorary Fellow","National Academy of Medical Sciences"},
                    {1994,"Distinguished Fellow","Institute Of Directors"},
                    {1990,"Padma Vibhushan","Government of India"},
                    {1981,"Padma Bhushan","Government of India"}
                };
                Object Columns[]={"Year of Honour","Name of Award","Organization"};
                JTable jTable = new JTable(data, Columns);
                JScrollPane scrollPane=new JScrollPane(jTable);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(500);
                Font font = new Font("Arial", Font.PLAIN, 16); // Change the font (Arial, bold, size 14)
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.setBackground(Color.lightGray);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                scrollPane.setPreferredSize(new Dimension(400,400));
                tabbedPane.addTab("Contributions",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Apj();
    }
}