import java.io.*;
import java.util.*;

public class test {
  void dataInOut() throws IOException {
    int c;
    // FileReader filein = new FileReader("data1.txt");
    Scanner sc = new Scanner(new BufferedReader(new FileReader("data1.txt")));
    FileWriter fileout = new FileWriter("data2.txt");
    while(sc.hasNextInt()) {
      while((c=sc.nextInt())!=-1) {
        fileout.write(c);
        fileout.newLine();
      }
    }
    sc.close();
    fileout.close();
  }
  public static void main(String[] args) {
    test r = new test();
    try {
      r.dataInOut();
    } catch(IOException error) {
      System.out.println("IOエラー発生");
    }
  }
}
