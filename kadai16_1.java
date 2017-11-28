public class kadai16_1 {
  public static void main(String args[]) {
    TurtleFrame f = new TurtleFrame();
    Drawable2 a = new DrawPloygon();
    f.add((Turtle)a);
    for(int i=0;i<20;i++) {
      int x = (int) (Math.random() * 400);
      int y = (int) (Math.random() * 400);
      int n = (int) (Math.random() * 8) + 3; //3~10の乱数
      int c = (int) (Math.random() * 3);
      a.draw(x,y,n,c);
      a.calcArea();
      a.display();
    }
  }
}
