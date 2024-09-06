import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Baba extends JFrame {

    public Baba() {
        setTitle("DR.B.R.Ambedkar");
    
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
        textPane1.setText("-->Bhimrao Ramji Ambedkar, born into a family belonging to the Mahar caste, faced severe social discrimination and economic hardships due to the prevailing caste system in India. Despite these challenges, his early years were marked by a thirst for knowledge and a determination to break the shackles of oppression through education.\r\n" + //
                "\r\n" + //
                "-->Ambedkar's family background influenced his understanding of the deep-rooted injustices prevalent in society. His father, Ramji Maloji Sakpal, encouraged his education, recognizing the transformative power it held for breaking the chains of social hierarchy.\r\n" + //
                "\r\n" + //
                "-->His educational journey began in local schools where he encountered discrimination and segregation. These early experiences instilled in him a profound desire to fight against the discriminatory caste system and to strive for social reform.\r\n" + //
                "\r\n" + //
                "-->Despite facing numerous obstacles, Ambedkar's academic prowess shone through. He received a scholarship from the Gaekwad ruler of Baroda, which enabled him to pursue higher studies. He earned a Bachelor of Arts degree from Bombay University, excelling in subjects like Economics, History, Sociology, and Philosophy.\r\n" + //
                "\r\n" + //
                "-->Ambedkar's pursuit of knowledge led him to further academic achievements. He earned a Master's degree in Economics and a Doctorate in Economics from Columbia University in the United States. His overseas education provided him with a global perspective on social issues and helped shape his ideas on social justice, equality, and human rights.\r\n" + //
                "\r\n" + //
                "-->Upon his return to India, Ambedkar continued his efforts in the field of education and social reform. He became actively involved in advocating for the rights of the marginalized communities, especially Dalits (formerly known as \"untouchables\"), and fought against caste-based discrimination.\r\n" + //
                "\r\n" + //
                "-->Ambedkar's commitment to social justice culminated in his pivotal role as the chairman of the drafting committee of the Constitution of India. He played a key part in formulating a progressive and inclusive constitution that enshrined fundamental rights, abolished untouchability, and aimed at establishing equality and justice for all citizens.\r\n" + //
                "\r\n" + //
                "-->Throughout his life, Dr. B.R. Ambedkar remained an ardent advocate for the rights of the oppressed and worked tirelessly to uplift the downtrodden sections of society. His legacy continues to inspire movements for social equality and justice in India and across the world. Ambedkar's life journey from a marginalized community to becoming a prominent leader and scholar stands as a testament to the power of education, determination, and the relentless pursuit of social reform.\r\n" + //
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
        textPane2.setText("-->Dr. B.R. Ambedkar's professional career was multifaceted, spanning various domains such as law, academia, social activism, and politics. His contributions in each of these fields played a significant role in shaping modern India's socio-political landscape.\r\n" + //
                "\r\n" + //
                "-->Legal Career:\r\n" + //
                "Ambedkar was the first person from the \"untouchable\" Mahar caste to obtain a formal higher education in law. He earned a law degree from Gray's Inn in London and became a barrister. His legal expertise and commitment to social justice were evident in his efforts to fight against discrimination and secure rights for the oppressed castes. He used the legal system as a tool to challenge discriminatory practices and advocate for the rights of marginalized communities.\r\n" + //
                "\r\n" + //
                "-->Social Reformer and Activist:\r\n" + //
                "Ambedkar was a staunch advocate for the rights of Dalits and other marginalized communities. He founded various organizations and movements aimed at uplifting the oppressed castes, including the Bahishkrit Hitakarini Sabha in 1924 and the Independent Labour Party in 1936. He fought against the practice of untouchability and campaigned for social reforms to eradicate caste-based discrimination. His efforts led to significant social and legislative changes, such as the Temple Entry Movement and the Mahad Satyagraha, which aimed to establish the rights of Dalits to access public spaces and resources.\r\n" + //
                "\r\n" + //
                "-->Academic and Scholarly Contributions:\r\n" + //
                "Ambedkar was a scholar of repute, with expertise in economics, sociology, and political science. He earned multiple degrees, including a Doctorate in Economics from Columbia University. He authored several scholarly works and papers on socio-economic issues, constitutional law, and the problems of marginalized communities. His seminal work, \"Annihilation of Caste,\" remains a powerful critique of the caste system in India.\r\n" + //
                "\r\n" + //
                "-->Architect of the Indian Constitution:\r\n" + //
                "One of his most significant contributions was his role as the chairman of the drafting committee of the Constitution of India. Ambedkar played a pivotal role in formulating the guiding principles of the Indian Constitution, ensuring the inclusion of provisions for social justice, fundamental rights, and safeguards for marginalized communities. His vision and efforts shaped the Constitution, which stands as a cornerstone of India's democratic framework.\r\n" + //
                "\r\n" + //
                "-->Political Career:\r\n" + //
                "Ambedkar ventured into politics and served as India's first Minister of Law and Justice in the interim government of independent India. He was also appointed as the chairman of the Constitution Drafting Committee. Later, he founded the Scheduled Caste Federation to advocate for the political rights of Dalits.\r\n" + //
                "\r\n" + //
                "-->Dr. B.R. Ambedkar's professional career was characterized by his relentless pursuit of social justice, equality, and the empowerment of marginalized communities. His contributions across various spheres continue to inspire movements and policies aimed at creating an equitable and just society.\r\n" + //
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
        textPane3.setText("-->Dr. B.R. Ambedkar, born on April 14, 1891, was a prominent Indian jurist, social reformer, and the chief architect of the Indian Constitution. His life's work was dedicated to the upliftment of the oppressed and marginalized sections of Indian society, particularly the Dalits (formerly known as untouchables). Here are some key achievements and contributions of Dr. B.R. Ambedkar:\r\n" + //
                "\r\n" + //
                "-->Architect of the Indian Constitution:\r\n" + //
                "Dr. Ambedkar played a pivotal role in drafting the Constitution of India, which came into effect on January 26, 1950. He chaired the Drafting Committee and is often referred to as the \"Father of the Indian Constitution.\"\r\n" + //
                "\r\n" + //
                "-->Social Reforms:\r\n" + //
                "Ambedkar was a staunch advocate for social justice and equality. He campaigned against social discrimination, untouchability, and the caste system. His efforts were instrumental in the inclusion of provisions in the Constitution to abolish untouchability and promote equality.\r\n" + //
                "\r\n" + //
                "-->Promotion of Education:\r\n" + //
                "Dr. Ambedkar emphasized the importance of education as a means of empowerment for the marginalized communities. He himself was highly educated, earning degrees from the University of Bombay, the London School of Economics, and Columbia University.\r\n" + //
                "\r\n" + //
                "-->Dalit Rights:\r\n" + //
                "Ambedkar dedicated his life to the upliftment of Dalits and fought against the social injustices they faced. He advocated for their rights, access to education, and equal opportunities.\r\n" + //
                "\r\n" + //
                "-->Poona Pact:\r\n" + //
                "Dr. Ambedkar played a crucial role in the Poona Pact of 1932, which was an agreement between him and Mahatma Gandhi. The pact ensured reserved seats for Dalits in legislatures and government jobs, providing political representation and affirmative action.\r\n" + //
                "\r\n" + //
                "-->Labour Reforms:\r\n" + //
                "Ambedkar was the principal architect of the Labour Code in India, working towards the betterment of workers and their rights.\r\n" + //
                "\r\n" + //
                "-->Economic and Political Thought:\r\n" + //
                "Dr. Ambedkar contributed significantly to economic and political thought in India. His ideas on social justice, democracy, and the role of the state have had a lasting impact.\r\n" + //
                "\r\n" + //
                "-->Conversion to Buddhism:\r\n" + //
                "In 1956, along with a large number of followers, Dr. Ambedkar embraced Buddhism, renouncing Hinduism. This was a symbolic rejection of the caste system and an assertion of the dignity of the marginalized communities.\r\n" + //
                "\r\n" + //
                "-->Bharat Ratna:\r\n" + //
                "In 1990, posthumously, Dr. B.R. Ambedkar was honored with the Bharat Ratna, India's highest civilian award, in recognition of his exceptional service to the nation.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\br5.png");

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
            {"Annihilation of Caste"," It critiques the rigid caste system in India, challenging its fundamental principles and advocating for its complete abolition. Ambedkar's ideas in this book remain relevant in the ongoing discourse on caste-based discrimination and social inequality."},
{"The Buddha and His Dhamma","This posthumously published book delves into the life and teachings of the Buddha. Ambedkar's exploration of Buddhism as a path to social justice, liberty, and equality was a significant departure from the Hindu caste system. It reflects his vision for a more egalitarian society and played a pivotal role in his decision to embrace Buddhism as a way to renounce caste-based discrimination."},
{"The Problem of the Rupee: Its Origin and Its Solution","As an economist, Ambedkar penned this book, offering an in-depth analysis of the Indian currency system during the colonial era. His insights into economic issues and proposed solutions have historical relevance and shed light on economic challenges faced by India."},
{"Who Were the Shudras?","In this scholarly work, Ambedkar challenges prevailing theories about the origins and status of Shudras within the caste system. He critically examines historical texts and presents an alternative perspective on the origins and societal position of the Shudra caste, shedding light on their social exclusion and advocating for their rights."},
{"Thoughts on Linguistic States","Ambedkar's thoughts on linguistic states were crucial during India's state reorganization process post-independence. His book provided a rational framework for the formation of states based on linguistic principles, which significantly influenced the creation of linguistic states in India."},
{"Castes in India: Their Mechanism, Genesis, and Development","In this book, Ambedkar provides a comprehensive analysis of the caste system's origins, evolution, and its impact on Indian society. He explores the mechanisms that sustain caste divisions and their historical development, shedding light on the social, economic, and political implications of caste-based hierarchies."},
{"Riddles in Hinduism","This collection of essays critically examines various aspects of Hinduism, questioning its inconsistencies, contradictions, and rituals. Ambedkar challenges certain Hindu beliefs and practices, aiming to provoke critical thinking and initiate discussions about the nature of Hindu religious doctrines and societal norms."},
{"Pakistan or The Partition of India","Ambedkar wrote this book before India's independence and partition. He explores the political and social implications of the Hindu-Muslim divide and the potential consequences of the partition. This work offers insights into the complex dynamics leading to the eventual partition of India into India and Pakistan."},
{"Philosophy of Hinduism","Ambedkar examines the philosophical foundations of Hinduism in this book, analyzing its scriptures, doctrines, and ideologies. He critiques certain philosophical concepts within Hinduism and presents his views on religious pluralism, emphasizing the need for rationality and equality in religious thought."},
{"Women and Men in Society","In this work, Ambedkar discusses the role and status of women in society, addressing issues of gender inequality, social reforms, and women's rights. He advocates for gender equality and highlights the importance of empowering women for the progress and well-being of society."},
{"The Evolution of Provincial Finance in British India","This book delves into the evolution of fiscal policies in British India, examining the financial administration of various provinces and the economic impact of British colonial rule. Ambedkar analyzes revenue systems, taxation policies, and their implications on provincial finances."},
{"The Untouchables: Who Were They and Why They Became Untouchables?","In this text, Ambedkar explores the historical reasons behind the social segregation and oppression of the Untouchables. He delves into the origins of Untouchability, shedding light on the societal forces and circumstances that led to their marginalization."},
{"What Congress and Gandhi Have Done to the Untouchables","This book critically evaluates the efforts of the Indian National Congress and Mahatma Gandhi regarding the upliftment and rights of the Untouchables. Ambedkar assesses their policies, actions, and the effectiveness of their approaches in addressing the issues faced by the marginalized communities."},
{"Castes in India: Their Mechanism, Genesis, and Development","Another significant work by Ambedkar, this book offers a detailed examination of the caste system, focusing on its social mechanisms, historical development, and the entrenched social hierarchy prevalent in Indian society."},
{"The Rise and Fall of Hindu Women","In this work, Ambedkar discusses the social status and condition of Hindu women, exploring their historical position, social customs, and the challenges they faced within the patriarchal structure of Hindu society. He advocates for gender equality and women's empowerment."}
                };
                Object Columns[]={"Title of Book","Theme of Book"};
                JTable jTable=new JTable(data,Columns);
                jTable.setRowHeight(50);
                jTable.getColumnModel().getColumn(1).setPreferredWidth(500);
                Font font = new Font("Arial", Font.PLAIN, 16); // Change the font (Arial, bold, size 14)
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                //renderer.setHorizontalAlignment(SwingConstants.CENTER);
                renderer.setFont(font);
                jTable.setFont(font);
                jTable.setBackground(Color.lightGray);
                jTable.getTableHeader().setFont(font);
                jTable.setDefaultRenderer(Object.class,renderer);
                tabbedPane.addTab("LiteraryContributions",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Baba();
    }
}