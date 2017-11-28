class kadai17 {
  public static void main(String[] args) {
    kadai17 a = new kadai17();
    a.division(args);
  }
  void division(String[] args){
    int num, n0, n1;
    try {
      n0 = Integer.parseInt(args[0]);
      n1 = Integer.parseInt(args[1]);
      System.out.println(n0/n1);
    } catch(NumberFormatException e) {
      System.out.println("数値以外にしないで");
    } catch(ArithmeticException e) {
      System.out.println("除数0にしないで");
    }
  }
}
