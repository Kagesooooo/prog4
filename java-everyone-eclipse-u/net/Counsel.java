package net;

public class Counsel{
   int i, n=0;
   String[] henji = { 
       "興味がありますね。", 
       "ほう、そうですか。", 
       "もっと聞かせてください。",
       "それはそれは。", 
       "それで?"};
   String kaiwa(String user){
      i = (int)(Math.random()* henji.length);
      n++;
      if(n>10) return  "ではまたにしましょう。";
      else if(i==0) return (user + "とは" + henji[i]);
      else return henji[i];
   }
}  
