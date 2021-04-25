import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame {
    public static void main(String[] args) {
        String title = "Billig Software";
        JFrame frame = new JFrame();
        JTextField tf2, tf = new JTextField();
        tf2 = new JTextField();
        JButton btn = new JButton();
        btn.setText("CLick");
        btn.setBounds(150, 200, 300, 40);
        tf.setBounds(150, 100, 300, 40);
        tf2.setBounds(150, 150, 300, 40);
        // label.setFont(ItalicAction);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle(title);
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.add(btn);
        frame.add(tf);
        frame.add(tf2);
    }
}