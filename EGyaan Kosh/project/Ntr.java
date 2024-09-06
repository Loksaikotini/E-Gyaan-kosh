import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Ntr extends JFrame {

    public Ntr() {
        setTitle("Nandamuri Taraka RamaRao");
        
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
        textPane1.setText("Childhood and Early Life:\n" + //
                "\n" + //
                "Nandamuri Taraka Rama Rao, fondly known as NTR, was born on May 28, 1923, in Nimmakuru, a small village in Andhra Pradesh, India. He was born into a farming family to parents Nandamuri Lakshmaih and Venkata Ramamma.\n" + //
                "\n" + //
                "NTR's early life revolved around the simplicity of rural living. He spent his formative years in Nimmakuru, where he attended the local school. Even during his childhood, he exhibited a deep interest in performing arts, particularly acting and drama. He actively participated in school plays, showcasing his talent and passion for the performing arts.\n" + //
                "\n" + //
                "-->Education:\n" + //
                "\n" + //
                "After completing his primary education in Nimmakuru, NTR pursued his higher studies in Vijayawada. He attended SRR & CVR College for his intermediate education. His enthusiasm for acting continued to grow during this phase of his life.\n" + //
                "\n" + //
                "Subsequently, he pursued a Bachelor's degree in Arts from the Andhra-Christian College located in Guntur. Throughout his academic journey, his interest in acting persisted, and he remained involved in theatrical activities, honing his skills as a performer.\n" + //
                "\n" + //
                "-->Personal Life:\n" + //
                "\n" + //
                "NTR's personal life was characterized by his dedication to his family. He married Basava Tarakam in 1942, and they had eight children together. His commitment to his family remained strong despite his later entry into the tumultuous worlds of cinema and politics.\n" + //
                "\n" + //
                "-->Beyond his professional achievements, NTR was known for his philanthropic endeavors and his deep-rooted connection to the values of his upbringing. He maintained ties with his village and often extended support to causes aimed at the welfare of rural communities.\n" + //
                "\n" + //
                "Throughout his life, Nandamuri Taraka Rama Rao remained closely connected to his roots, reflecting the humility and simplicity instilled in him during his upbringing in a small village.\n" + //
                "\n" + //
                "-->NTR's eldest son, Nandamuri Ramakrishna Sr., died in 1962, 1944-1962 soon after Rao completed shooting of the film Irugu Porugu.Rao founded the film studios Ramakrishna Studios in Nacharam in his memory. NTR's third son, Nandamuri Saikrishna, who was a theatre owner, died in 2004 following diabetic complications.\n" + //
                "\n" + //
                "-->His fourth son, Nandamuri Harikrishna, who died in a car accident on 29 August 2018, was a child actor-turned-politician elected to the Rajya Sabha, representing the TDP. Harikrishna's sons Nandamuri Kalyan Ram and N. T. Rama Rao Jr. are also actors in the Telugu cinema. NTR's sixth son, Nandamuri Balakrishna, has been one of the leading actors in Tollywood since the mid-1980s. He also started his career as a child artist. Balakrishna contested 2014 assembly elections as a TDP candidate. He won the Hindupur Assembly Constituency. His seventh son, Nandamuri Ramakrishna Jr. is a film producer.\n" + //
                "\n" + //
                "-->Nandamuri Taraka Rama Rao's childhood and education laid the foundation for the remarkable journey that followed. His personal life reflected the simplicity, values, and strong connections to his origins that shaped his impactful presence in the realms of cinema and politics.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        textPane2.setText("Nandamuri Taraka Rama Rao (NTR) had an illustrious professional career that encompassed two significant realms: cinema and politics. His impact in both spheres was profound, and he left an indelible mark on the cultural and political landscape of Andhra Pradesh.\r\n" + //
                "\r\n" + //
                "-->Cinema Career:\r\n" + //
                "\r\n" + //
                "-NTR's journey in the film industry began in 1949 with his debut in the Telugu film \"Mana Desam.\" His initial years saw him portraying diverse roles in various genres. However, it was his exceptional performances as mythological characters, notably as Lord Krishna and Lord Rama, that catapulted him to stardom.\r\n" + //
                "\r\n" + //
                "-He became renowned for his remarkable acting skills, emotive prowess, and the ability to connect with audiences on an emotional level. His portrayal of mythological characters in movies like \"Maya Bazaar,\" \"Pathala Bhairavi,\" and \"Lava Kusa\" remains iconic and continues to be celebrated by audiences even today.\r\n" + //
                "\r\n" + //
                "-NTR's on-screen charisma, coupled with his commanding presence and versatile acting, earned him a devoted fan following. He starred in over 300 films throughout his career, becoming a legendary figure in Telugu cinema. Beyond acting, he ventured into film production, contributing significantly to the growth and development of the Telugu film industry.\r\n" + //
                "\r\n" + //
                "-His contributions to cinema were not merely confined to entertainment; they also played a crucial role in shaping Telugu cultural identity and mythology in the film medium. His films left an enduring impact on generations of audiences and actors, cementing his legacy as an icon of Indian cinema.\r\n" + //
                "\r\n" + //
                "-->Political Career:\r\n" + //
                "\r\n" + //
                "-NTR's entry into politics marked a significant turning point in his professional life. In 1982, he founded the Telugu Desam Party (TDP) with a vision to address the concerns of the people of Andhra Pradesh and promote regional pride.\r\n" + //
                "\r\n" + //
                "-His political journey gained momentum when the TDP, under his leadership, achieved a historic victory in the 1983 Andhra Pradesh assembly elections. This remarkable feat catapulted NTR into the role of the Chief Minister of Andhra Pradesh, marking the beginning of his political career.\r\n" + //
                "\r\n" + //
                "-As Chief Minister, NTR introduced several welfare schemes and initiatives aimed at improving the lives of the people. His administration focused on agricultural reforms, education, healthcare, and rural development. He emphasized the empowerment of marginalized sections of society and championed the cause of social justice.\r\n" + //
                "\r\n" + //
                "-Despite facing challenges and political upheavals, NTR's commitment to public service, his charisma, and his ability to connect with the masses allowed him to retain immense popularity among the people of Andhra Pradesh.\r\n" + //
                "\r\n" + //
                "-->Legacy and Impact:\r\n" + //
                "\r\n" + //
                "-Nandamuri Taraka Rama Rao's professional career, both in cinema and politics, left an enduring impact on the collective consciousness of Andhra Pradesh. His contributions to Telugu cinema and regional politics earned him unparalleled reverence and adulation.\r\n" + //
                "\r\n" + //
                "-Even after his passing in 1996, NTR's legacy continues to inspire generations. His films remain timeless classics, and his political ideology and commitment to the welfare of the people continue to influence the political landscape of Andhra Pradesh.\r\n" + //
                "\r\n" + //
                "-->N.T. Rama Rao's professional journey symbolizes the convergence of artistry and leadership, leaving behind an indelible legacy that transcends the realms of entertainment and governance. His unparalleled contributions in cinema and politics firmly establish him as an iconic figure in Indian history and culture.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        textPane3.setText("-->Film Career:\r\n" + //
                "NTR started his career as an actor in Telugu cinema in the early 1950s. He gained immense popularity for his performances in mythological and historical films.\r\n" + //
                "Some of his notable films include \"Pathala Bhairavi,\" \"Maya Bazaar,\" and \"Missamma.\" He became an iconic actor in the Telugu film industry, earning a large fan following.\r\n" + //
                "\r\n" + //
                "-->Political Career:\r\n" + //
                "NTR entered politics in a significant way by founding the Telugu Desam Party (TDP) in 1982. The party aimed to address the concerns of the people of Andhra Pradesh and promote regional pride.\r\n" + //
                "In 1983, TDP, under NTR's leadership, won the state elections, and he became the Chief Minister of Andhra Pradesh. His charismatic leadership and the populist agenda of TDP appealed to the masses.\r\n" + //
                "\r\n" + //
                "-->Chief Ministership:\r\n" + //
                "NTR served as the Chief Minister of Andhra Pradesh three times: 1983–1989, 1994–1995, and a brief period in 1996. His political tenure was marked by several populist measures, including the introduction of the mid-day meal scheme for school children.\r\n" + //
                "\r\n" + //
                "-->Welfare Schemes:\r\n" + //
                "NTR implemented various welfare programs for the benefit of the poor and marginalized sections of society. His government focused on rural development, healthcare, and education.\r\n" + //
                "\r\n" + //
                "-->Dismissal and Return to Power:\r\n" + //
                "In 1984, NTR's government was controversially dismissed by the then-Prime Minister, Indira Gandhi. However, in 1985, he led the TDP to a historic victory in the state elections, reclaiming the Chief Minister's office.\r\n" + //
                "\r\n" + //
                "-->Political Legacy:\r\n" + //
                "NTR's political legacy is often associated with his commitment to regional pride, social justice, and pro-poor policies. His impact on Andhra Pradesh politics is profound, and the TDP remains a significant political force in the state.\r\n" + //
                "\r\n" + //
                "-->Awards and Recognition:\r\n" + //
                "In 1983, NTR received the prestigious National Film Award for Best Actor for his performance in the film \"Sri Ramulayya.\"\r\n" + //
                "\r\n" + //
                "-->He was awarded the Bharat Ratna, India's highest civilian award, posthumously in 1996, recognizing his contributions to cinema and politics.\r\n" + //
                "NTR's career was characterized by success in both the realms of cinema and politics. His popularity as a matinee idol and his political achievements continue to influence the cultural and political landscape of Andhra Pradesh.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\nt5.jpg");

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
            {"1968","Padma Shri","Government of India"},
{"1978","Honorary Doctorate","Andhra University"},	
{"1972","Best Actor – Telugu","Film Fare Awards South"},	
{"1974","Best Story Writer","Tatamma Kala-Nandi Awards"},
{"1954","National Film Award -Certificate of Merit for Best Feature Film in Telugu (producer — National Art Theater)","Thodu Dongalu"},
{"1960","National Film Fare Award-Certificate of Merit for Best Feature Film in Telugu (producer — National Art Theater)","Sita Rama Kalyanam"},
{"1968","National Film Award for Best Feature Film in Telugu (director — National Art Theater)","Varakatnam"}
                };
        Object Columns[]={"Year Of Honour","Awards"};
        JTable jTable = new JTable(data, Columns);
        JScrollPane scrollPane=new JScrollPane(jTable);
        jTable.setRowHeight(50);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(500);
        jTable.setBackground(Color.lightGray);
        Font font = new Font("Arial", Font.PLAIN, 16); // Change the font (Arial, bold, size 14)
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        //renderer.setHorizontalAlignment(SwingConstants.CENTER);
        renderer.setFont(font);
        jTable.setFont(font);
        jTable.getTableHeader().setFont(font);
        jTable.setDefaultRenderer(Object.class,renderer);
        tabbedPane.addTab("Awards and Honours",scrollPane);
        scrollPane.setPreferredSize(new Dimension(400,400));

        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ntr();
    }
}