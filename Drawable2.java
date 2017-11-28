interface Drawable2
{
  public void draw(int x, int y, int num, int color);
  public void calcArea();
  public void display();
}
class DrawPloygon extends HTurtle implements Drawable2{
  int x, y, num, color, a, b, c;
  double r, area;
  public void draw(int x0, int y0, int n, int color) {
    x = x0; y = y0; num = n;
    r = Math.random() * 100;
    java.awt.Color nc;
    if(color==0) nc = new java.awt.Color(0,0,255);
    else if(color==1) nc = new java.awt.Color(255,255,0);
    else nc = new java.awt.Color(255,0,0);
    up(); moveTo(x-(int)r, y, (180/num)); down(); setColor(nc);
    polygon(num,(int)(2*r*(Math.sin(Math.PI/num))));
  }
  public void calcArea(){
    area = 0.5*num*r*r*Math.sin((2*Math.PI)/num);
  }
  public void display() {
    System.out.println(num+"角形, 面積 : "+area+", 外接円の半径 : "+r);
  }
}
