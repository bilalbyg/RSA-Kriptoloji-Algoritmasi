import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    private JTextField textField1;
    private JPanel jPanel;
    private JLabel jLabel;
    private JButton gonderButton;
    private ImageIcon background,logo;
    public Form()
    {
        logo = new ImageIcon("src\\send.png");
        add(jPanel);
        setSize(800,600);
        setTitle("RSA");
        setIconImage(logo.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.setBackground(Color.BLACK);
        jLabel.setSize(800,600);
        setVisible(true);
    }
}
