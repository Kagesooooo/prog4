import java.io.*;
import java.util.*;

class kadai18_1 {
  void dataSum(String st) throws IOException {
    Scanner sc = new Scanner(new BufferedReader(new FileReader(st)));
    int sum = 0, i = 0;
    String[] s = new String[5];
    int[] v = new int[5];
    while(sc.hasNext()) {
      s[i] = sc.next();
      v[i] = sc.nextInt();
      sum += v[i];
      System.out.println(s[i] + ' ' + v[i]);
      i++;
    }
    sc.close();
    System.out.println("合計" + ' ' + sum);
    for(int j=0;j<v.length;j++) {
      System.out.print(v[j]);
      System.out.print(' ');
    }
    System.out.println();
  }
  public static void main(String[] args) {
    kadai18_1 r = new kadai18_1();
    try {
      r.dataSum(args[0]);
    } catch(IOException error) {
      System.out.println("IOエラー発生");
    }
  }
}
