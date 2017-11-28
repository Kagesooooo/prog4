import java.awt.*;
import javax.swing.*;

public class kadai19_1 extends JPanel {
  JLabel label;
  JButton bn, be, bw, bs, bc;
  public kadai19_1() {
    bn = new JButton("北");
    be = new JButton("東");
    bw = new JButton("西");
    bs = new JButton("南");
    bc = new JButton("中央");
    setLayout(new BorderLayout());
    add(bn, BorderLayout.NORTH);
    add(be, BorderLayout.EAST);
    add(bw, BorderLayout.WEST);
    add(bs, BorderLayout.SOUTH);
    add(bc, BorderLayout.CENTER);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    kadai19_1 h = new kadai19_1();
    frame.add(h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
