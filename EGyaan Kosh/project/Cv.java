import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Cv extends JFrame {

    public Cv() {
        setTitle("Sir C.V.Raman");
        
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
        textPane1.setText("->Sir Chandrasekhara Venkata Raman, commonly known as C. V. Raman, was an Indian physicist renowned for his groundbreaking work in the field of light scattering. Here is a brief overview of his personal information:\r\n" + //
                "\r\n" + //
                "->Birth: C. V. Raman was born on November 7, 1888, in Thiruvanaikaval, near Tiruchirapalli in Tamil Nadu, British India.\r\n" + //
                "\r\n" + //
                "->Family: He belonged to a Brahmin family. His father, R. Chandrasekhara Iyer, was a lecturer in mathematics and physics, and his mother, Parvathi Ammal, was a housewife.\r\n" + //
                "\r\n" + //
                "->Education: Raman pursued his education at Presidency College in Madras (now Chennai), where he earned his bachelor's degree in physics in 1904 and master's degree in 1907. He later joined the University of Cambridge for further studies.\r\n" + //
                "\r\n" + //
                "->Marriage: C. V. Raman married Lokasundari Ammal in 1907. They had two sons, Chandrasekhar and Radhakrishnan.\r\n" + //
                "\r\n" + //
                "->Career: Raman began his career as an assistant accountant general in the finance department of the Indian government. However, his true passion lay in physics. In 1917, he joined the Indian Association for the Cultivation of Science (IACS) in Calcutta (now Kolkata). It was during his time at IACS that he conducted the research that led to the discovery of the Raman Effect.\r\n" + //
                "\r\n" + //
                "->Later Career and Honors: Raman continued his scientific pursuits and held various prestigious positions, including the directorship of the Indian Institute of Science in Bangalore. He received numerous awards and honors throughout his career.\r\n" + //
                "\r\n" + //
                "->Death: C. V. Raman passed away on November 21, 1970, in Bangalore, India.\r\n" + //
                "\r\n" + //
                "->C. V. Raman's legacy extends beyond his scientific contributions; he played a crucial role in the development of science and education in India. His work in light scattering remains a cornerstone of modern physics.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        textPane2.setText("->C. V. Raman's illustrious professional career spanned both the administrative and scientific realms. After completing his education, he began as an assistant accountant general in the finance department of the Indian government. \r\n" + //
                "\r\n" + //
                "->However, his passion for physics led him to the Indian Association for the Cultivation of Science (IACS) in Calcutta in 1917.\r\n" + //
                "\r\n" + //
                "->At IACS, Raman conducted groundbreaking research that resulted in the discovery of the Raman Effect in 1928. \r\n" + //
                "\r\n" + //
                "->This effect, based on the inelastic scattering of light, marked a significant advancement in the understanding of molecular vibrations and earned him the Nobel Prize in Physics in 1930, making him the first Asian and non-white person to receive this honor in the sciences.\r\n" + //
                "\r\n" + //
                "->Raman's subsequent career included serving as the Palit Professor of Physics at the University of Calcutta and the Director of the Indian Institute of Science in Bangalore. He played a pivotal role in shaping scientific institutions in India and fostering a culture of research and innovation. \r\n" + //
                "\r\n" + //
                "->His legacy includes numerous awards, honors, and influential contributions to the field of physics. C. V. Raman passed away in 1970, leaving behind a lasting impact on Indian science and the global scientific community.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "->During his tenure as the Director of the Indian Institute of Science (1933-1937), C. V. Raman contributed significantly to the growth and development of scientific research and education in India. His emphasis on quality research and academic rigor laid the foundation for future scientific endeavors in the country.\r\n" + //
                "\r\n" + //
                "->Raman continued his scientific work, delving into diverse areas such as acoustics, optics, and crystal physics. He published numerous papers covering a wide range of topics throughout his career, showcasing his versatility and intellectual curiosity.\r\n" + //
                "\r\n" + //
                "->Apart from his Nobel Prize, Raman received numerous other accolades, including the Bharat Ratna, India's highest civilian award, in 1954. He was also knighted in 1929 but chose to use the honorific 'Sir' only in association with his scientific contributions.\r\n" + //
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
        textPane3.setText("->Sir Chandrasekhara Venkata Raman, an eminent Indian physicist, made groundbreaking contributions to the field of physics, earning global recognition. \r\n" + //
                "\r\n" + //
                "->His discovery of the Raman Effect in 1928 revolutionized the understanding of light scattering, providing insights into molecular vibrations and earning him the Nobel Prize in Physics in 1930.\r\n" + //
                "\r\n" + //
                "->Raman's illustrious career included serving as the Director of the Indian Institute of Science, where he played a pivotal role in fostering scientific research and education in India. His administrative leadership and commitment to excellence helped shape the scientific landscape in the country.\r\n" + //
                "\r\n" + //
                "->Throughout his career, Raman published extensively on a wide array of topics, showcasing his versatility in acoustics, optics, and crystal physics. \r\n" + //
                "\r\n" + //
                "->He received numerous accolades, including the Bharat Ratna, the highest civilian award in India, in 1954. Knighted in 1929, Raman chose to use the title 'Sir' only in connection with his scientific achievements.\r\n" + //
                "\r\n" + //
                "->Raman's legacy endures through institutions like the Raman Research Institute, which continues to advance scientific research. \r\n" + //
                "\r\n" + //
                "->His impact extends beyond his individual achievements, inspiring generations of scientists and contributing significantly to the global understanding of light and matter interactions. C. V. Raman's life and work exemplify a rare fusion of scientific brilliance, leadership, and dedication to advancing knowledge.");
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\cv5.jpg");

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

        String Optical="Investigated the phenomenon of optical harmonic generation, demonstrating that light can interact with matter to produce new frequencies, expanding the understanding of light-matter interactions.";
        String music="Conducted pioneering research in acoustics, contributing to the understanding of musical instruments and laying the groundwork for advancements in the field.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "";
        
        String Spectro="Pioneered Raman Spectroscopy, a technique that uses the Raman Effect to study vibrational, rotational, and other low-frequency modes in a system, becoming a powerful tool in various scientific disciplines.";
        String Nath=" Developed the Raman-Nath theory, which explains the diffraction of light by ultrasonic waves, providing insights into the interaction between sound waves and light.";
        String Diamonds="Investigated the behavior of light in diamonds, discovering the unusual properties of \"Raman lines\" in diamond spectra, which are now essential in the characterization of diamonds.";
        String Raman="Discovered the inelastic scattering of light, known as the Raman Effect, providing crucial insights into molecular vibrations and earning him the Nobel Prize in Physics in 1930.";
        Object[][]data={
                   {"Raman Effect (1928)",Raman},
                   {"Optical Harmonics (1930)",Optical},
                   {"Acoustics and Musical Instruments (1934-1942)",music},
                   {"Raman-Nath Theory (1938)",Nath},
                   {"Raman Spectroscopy (1928-1970)",Spectro},
                   {"Work on Diamonds (1968)",Diamonds}
                };
                Object Columns[]={"Discoveries","Brief Explanation"};
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
        new Cv();
    }
}