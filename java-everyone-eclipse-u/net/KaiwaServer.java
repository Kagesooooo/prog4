// リスト16.2 カウンセラーサーバ
package net;
import java.net.*;
import java.io.*;

public class KaiwaServer {
   public static void main(String[] args) throws IOException {
      ServerSocket serverS = null;
      Socket clientS = null;
      try{ 
	 serverS = new ServerSocket(50000); 
      } catch (IOException e) {
         System.out.println("ポートにアクセスできません。");
         System.exit(1);
      }
      try{ 
	 clientS = serverS.accept(); 
      } catch (IOException e) {
         System.out.println("Acceptに失敗しました。");
         System.exit(1);
      }
      PrintWriter out = new PrintWriter(clientS.getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(clientS.getInputStream()));
      String fromC, fromUser;
      Counsel c = new Counsel();
      out.println("何でも話してください");
      while ((fromUser = in.readLine()) != null) {
         fromC = c.kaiwa(fromUser);
         out.println(fromC);
         if (fromC.equals("ではまたにしましょう。")) break;
      }
      in.close();  out.close();
      clientS.close();  serverS.close();
    }
}
