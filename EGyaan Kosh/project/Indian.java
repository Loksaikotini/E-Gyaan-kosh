import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Indian extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JCheckBox termsCheckBox;
    private JLabel label,label1;
    public Indian() {
        label=new JLabel();
        label1=new JLabel();
        label1.setText("e-Gyaan Kosh");
        Font font1=new Font("Arial Rounded MT Bold",Font.PLAIN,35);
        label1.setFont(font1);
        label1.setForeground(Color.RED);
        label.setText("Please enter a valid Email and a correct Password to Access our");
        Font font = new Font("Bookman Old Style", Font.ITALIC, 25);
        label.setFont(font);
        label.setForeground(Color.darkGray);
        setTitle("Login Page");
        setSize(1500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel emailLabel = new JLabel("Email:");
        Font font2=new Font("Bookman Old Style",Font.BOLD,25);
        emailLabel.setFont(font2);
        JLabel passwordLabel = new JLabel("Password:");
        emailField = new JTextField(30);
        passwordField = new JPasswordField(20);
        passwordLabel.setFont(font2);
        termsCheckBox = new JCheckBox("I accept the terms and conditions");
        JButton loginButton = new JButton("Login");
        Font font3=new Font("Calibri",Font.PLAIN,15);
        loginButton.setFont(font3);

        Dimension buttonSize = new Dimension(75, 30);
        loginButton.setPreferredSize(buttonSize);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(label, gbc);

        gbc.gridy = 1;
        panel.add(label1, gbc);

        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(emailLabel, gbc);

        gbc.gridx = 1;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(termsCheckBox, gbc);

        gbc.gridy = 5;
        panel.add(loginButton, gbc);
        panel.setBackground(new Color(189,252,201));
        add(panel);
        setVisible(true);
    }

    private void login() {
        String email = emailField.getText();
        char[] password = passwordField.getPassword();

        // Validate email using regex
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid email format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length == 0) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if terms and conditions checkbox is selected
        if (!termsCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please accept the terms and conditions", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        new Ency();
    }


    public static void main(String[] args) {
        new Indian();
    }
}
