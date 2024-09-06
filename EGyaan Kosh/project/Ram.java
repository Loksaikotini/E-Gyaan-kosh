import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class Ram extends JFrame {

    public Ram() {
        setTitle("Srinivasa Ramanujan");
        
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
        
        textPane1.setText("->Srinivasa Ramanujan was born on December 22, 1887, in Erode, Madras Presidency (now in Tamil Nadu), India, to K. Srinivasa Iyengar and Komalatammal. \r\n" + //
                "He belonged to a Brahmin family. \n" + //
                "->His father worked as a clerk in a sari shop.Srinivasa Ramanujan married Janakiammal on July 14, 1909. Janakiammal was Ramanujan's cousin, and their marriage was arranged by their families.\r\n" + //
                "\r\n" + //
                "-> The couple faced financial difficulties early in their marriage, given Ramanujan's struggles to secure a stable job. \n" + //
                "Despite the challenges, Janakiammal provided support to Ramanujan during his pursuit of mathematics. \r\n" + //
                "\r\n" + //
                "->They did not have children, and Ramanujan's untimely death in 1920 left Janakiammal a widow at a young age. \n" + //
                "After Ramanujan's death, Janakiammal devoted herself to religious and charitable activities.Ramanujan's early education began in Kumbakonam, where he showed a natural aptitude for mathematics. \r\n" + //
                "\r\n" + //
                "->Despite facing financial challenges, he pursued his studies and eventually enrolled at Government Arts College in Kumbakonam in 1904. \n" + //
                "However, due to his intense focus on mathematics at the expense of other subjects, he lost his scholarship.\r\n" + //
                "\r\n" + //
                "\n" + //
                "->Ramanujan's family background, educational journey, and early mathematical accomplishments laid the foundation for his later contributions to the field of mathematics.");
        tabbedPane.addTab("Personal Life", new JScrollPane(textPane1));

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        StyledDocument doc2= textPane2.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_LEFT);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        Font font2 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane2.setFont(font2);
        
        textPane2.setText("->Early Career and Self-Study: Ramanujan's interest in mathematics developed early in life. \n" + //
                "Despite facing financial constraints, he pursued his education and conducted independent mathematical research. \n" + //
                "His self-study included exploring advanced mathematical texts.\r\n" + //
                "\r\n" + //
                "->Government Service: After completing his education at Government Arts College in Kumbakonam, Ramanujan worked in a clerical position in the Accountant General's office in Madras (now Chennai) from 1906 to 1912. \n" + //
                "However, his passion for mathematics remained, and he continued his mathematical work independently.\r\n" + //
                "\r\n" + //
                "->Collaboration with G. H. Hardy: In 1913, Ramanujan's life took a significant turn when he began corresponding with G. H. Hardy, a prominent British mathematician. \n" + //
                "Recognizing Ramanujan's extraordinary talent, Hardy arranged for Ramanujan to travel to England in 1914, where he joined Trinity College, Cambridge.\r\n" + //
                "\r\n" + //
                "->Years at Cambridge: Ramanujan spent several years at the University of Cambridge, collaborating with Hardy and other mathematicians. \n" + //
                "Despite facing health issues and cultural adjustments, he continued to produce groundbreaking work in mathematics.\r\n" + //
                "\r\n" + //
                "->Return to India: Ramanujan's health deteriorated, and he returned to India in 1919. \n" + //
                "Despite his relatively short time in Cambridge, he left an indelible mark on the field of mathematics, with many of his results later becoming foundational in various mathematical disciplines.\r\n" + //
                "\r\n" + //
                "->Recognition and Legacy: Srinivasa Ramanujan's contributions to mathematics were eventually recognized, and he was elected a Fellow of the Royal Society in 1918. \n" + //
                "His legacy lives on through his extensive notebooks, which contain a wealth of mathematical discoveries, and his work continues to inspire mathematicians worldwide.\r\n" + //
                "\r\n" + //
                "->Tragically, Ramanujan's life was cut short when he passed away on April 26, 1920, at the age of 32. \n" + //
                "Despite the brevity of his professional career, his impact on mathematics is enduring, and he is remembered as one of the greatest mathematical prodigies in history.");
        tabbedPane.addTab("Professional Career", new JScrollPane(textPane2));

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        StyledDocument doc3 = textPane3.getStyledDocument();
        SimpleAttributeSet center3 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center3, StyleConstants.ALIGN_LEFT);
        doc3.setParagraphAttributes(0, doc3.getLength(), center1, false);
        Font font3 = new Font("Bookman Old Style", Font.PLAIN, 20);
        textPane3.setFont(font3);
        
        textPane3.setText("->Srinivasa Ramanujan, a self-taught mathematical genius from India, made extraordinary contributions to number theory, infinite series, and other mathematical disciplines. \n" + //
                "His work on elliptic functions, modular forms, and the partition function significantly advanced these areas. \n" + //
                "Ramanujan's formulae for the calculation of π (pi) were groundbreaking, providing rapidly converging infinite series for approximating the value of this fundamental constant.\r\n" + //
                "\r\n" + //
                "->He independently discovered results that mathematicians in the Western world had not encountered before, enriching mathematical knowledge with novel theorems and identities. \\n" + //
                "His collaboration with G. H. Hardy at the University of Cambridge led to groundbreaking discoveries, including the now-famous \"Ramanujan-Hardy Number\" 1729.\r\n" + //
                "\r\n" + //
                "->Ramanujan's insights into mock theta functions influenced the development of modular forms and had applications in diverse fields, from number theory to quantum physics.\\n" + //
                " Despite facing health challenges, he continued to produce an incredible volume of work, filling notebooks with mathematical discoveries.\r\n" + //
                "\r\n" + //
                "->Elected a Fellow of the Royal Society in 1918, Ramanujan's legacy extends beyond his tragically short life. \n" + //
                "His contributions remain influential, inspiring mathematicians to explore the depths of number theory and related fields. \n" + //
                "The profound impact of Ramanujan's achievements has solidified his place as one of the most brilliant mathematicians in history.\r\n" + //
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

           
            ImageIcon image1 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr.jpg");
            ImageIcon image2 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr1.jpg");
            ImageIcon image3 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr2.jpg");
            ImageIcon image4 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr3.jpg");
            ImageIcon image5 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr4.jpg");
            ImageIcon image6 = new ImageIcon("C:\\Users\\sunka\\OneDrive\\Desktop\\Project\\sr5.jpg");

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

        String Hardy="Known for the famous Ramanujan-Hardy number, 1729, \nthe smallest positive integer expressible as the sum of two cubes in two different ways: 1729 = 1^3 + 12^3 = 9^3 + 10^3.";
        String Prime="Contributed to prime numbers; Ramanujan Prime is named in his honor. Introduced the Ramanujan-Hirschsprung constant related to prime distribution.";
        String Infinite="Made significant discoveries in infinite series and continued fractions, offering new mathematical insights.";
        String Note="A posthumously discovered notebook containing previously unknown theorems, continuing to impact modern mathematics.";
        String Conjecture="Left conjectures, including the Ramanujan Conjecture on the partition function and the Ramanujan-Petersson Conjecture on coefficients of modular forms.";
        String Elliptic="Ramanujan made contributions to elliptic functions, providing new results and insights into these mathematical entities.";
        String Mock="Introduced mock theta functions, influential in modular forms and quantum physics.";
        Object[][]data={
                   {"Ramanujan-Hardy Number (1729)",Hardy},
                   {"Mock Theta Functions",Mock},
                   {"Ramanujan Prime and Ramanujan-Hirschsprung Constant",Prime},
                   {"Ramanujan Conjecture and Ramanujan-Petersson Conjecture",Conjecture},
                   {"Ramanujan's Lost Notebook",Note},
                   {"Infinite Series and Continued Fractions",Infinite},
                   {"Modular Forms and Elliptic Functions",Elliptic}
                };
                Object Columns[]={"Discoveries","Brief Explanation"};
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
        tabbedPane.addTab("Contributions",new JScrollPane(jTable));

        
        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Set the JFrame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ram();
    }
}