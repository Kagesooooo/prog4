import java.io.*;
import java.util.*;
public class BufferedWriterDemo {
  public static void main(String args[]){
    try{
      Scanner sc = new Scanner(new BufferedReader(new FileReader("data1.txt")));
      FileWriter wr=new FileWriter(args[0]);
      BufferedWriter br=new BufferedWriter(wr);
      int[] v = new int[5];
      int i = 0;
      while(sc.hasNextInt()) {
        v[i] = sc.nextInt();
        i++;
      }
      for(int j=0;j<v.length;j++) {
        String s = String.valueOf(v[j]);
        br.write(s);
        br.write(',');
        br.newLine();
      }
      br.close();
      wr.close();
    }catch(IOException e){
      System.out.println("IOエラー発生");
    }
  }
}
