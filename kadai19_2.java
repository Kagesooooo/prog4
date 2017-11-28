import java.awt.*;
import javax.swing.*;

public class kadai19_2 extends JPanel {
  JLabel label;
  JButton b1, b2;
  public kadai19_2() {
    ImageIcon icon0 = new ImageIcon("arigatou.jpg");
    ImageIcon icon1 = new ImageIcon("ryouri.jpeg");
    label = new JLabel("こんにちは");
    b1 = new JButton("ボタン1", icon0);
    b2 = new JButton("ボタン2", icon1);
    setLayout(new BorderLayout());
    add(label, BorderLayout.NORTH);
    add(b1, BorderLayout.CENTER);
    add(b2, BorderLayout.EAST);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    kadai19_2 h = new kadai19_2();
    frame.add(h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
