import java.awt.*;
import javax.swing.*;

class JP0 extends JPanel {
  JButton b1, b2, b3;
  Color b;
  public JP0(int R0,int G0,int B0,int R1,int G1,int B1) {
    b = new Color(R1,G1,B1);
    b1 = new JButton("ボタン1");
    b2 = new JButton("ボタン2");
    b3 = new JButton("ボタン3");
    b1.setBackground(b); b2.setBackground(b); b3.setBackground(b);
    setLayout(new FlowLayout());
    setBackground(new Color(R0,G0,B0));
    add(b1); add(b2); add(b3);
  }
}
class JP1 extends JPanel {
  JButton b4, b5;
  Color b;
  public JP1(int R0,int G0,int B0,int R1,int G1,int B1) {
    b = new Color(R0,G0,B0);
    b4 = new JButton("ボタン4");
    b5 = new JButton("ボタン5");
    b4.setBackground(b); b5.setBackground(b);
    setLayout(new GridLayout(0,1));
    setBackground(new Color(R1,G1,B1));
    add(b4); add(b5);
  }
}
class JP2 extends JPanel {
  JCheckBox c1, c2, ca, cb;
  public JP2(int R,int G,int B) {
    c1 = new JCheckBox("チェック1");
    c2 = new JCheckBox("チェック2");
    ca = new JCheckBox("チェックA");
    cb = new JCheckBox("チェックB");
    setLayout(new GridLayout(2,0));
    setBackground(new Color(R,G,B));
    add(c1); add(c2); add(ca); add(cb);
  }
}
class JP3 extends JPanel {
  JButton b6, b7, b8;
  Color b;
  public JP3(int R0,int G0,int B0,int R1,int G1,int B1) {
    b = new Color(R0,G0,B0);
    b6 = new JButton("ボタン6");
    b7 = new JButton("ボタン7");
    b8 = new JButton("ボタン8");
    b6.setBackground(b); b7.setBackground(b); b8.setBackground(b);
    setLayout(new FlowLayout());
    setBackground(new Color(R1,G1,B1));
    add(b6); add(b7); add(b8);
  }
}
public class kadai20_1 {
  public static void main(String[] args) {
    int[] r = new int[7];
    int[] g = new int[7];
    int[] b = new int[7];
    for(int i=0;i<7;i++) {
      r[i] = (int)(Math.random()*256);
      g[i] = (int)(Math.random()*256);
      b[i] = (int)(Math.random()*256);
    }
    JFrame frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JP0 h0 = new JP0(r[0],g[0],b[0],r[1],g[1],b[1]);
    JP1 h1 = new JP1(r[2],g[2],b[2],r[3],g[3],b[3]);
    JP2 h2 = new JP2(r[4],g[4],b[4]);
    JP3 h3 = new JP3(r[5],g[5],b[5],r[6],g[6],b[6]);
    frame.setLayout(new GridLayout(0,2));
    frame.add(h0); frame.add(h1); frame.add(h2); frame.add(h3);
    frame.pack();
    frame.setVisible(true);
  }
}
