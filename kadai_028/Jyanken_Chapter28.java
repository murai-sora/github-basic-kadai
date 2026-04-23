package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
		
		 public static String getMyChoice(){
			 Scanner scanner = new Scanner (System.in);
			 
			 System.out.println("自分のじゃんけんの手を入力しましょう");
			 System.out.println("グーはrockのrを入力しましょう");
			 System.out.println("チョキはscissorsのsを入力しましょう");
			 System.out.println("パーはpaperのpを入力しましょう");
			return scanner.next();
		 
		 }
		 
		 public static String getRandom() {
			 String[] hands={"r","s","p"};
			 int index =(int)Math.floor(Math.random()*3);
			return hands[index];
			 
				 }	 
		 
			 public static void playGame(String my,String you) {
		 HashMap<String,String>handMap = new HashMap<>();
		 handMap.put("r","グー");
		 handMap.put("s","チョキ");
		 handMap.put("p","パー");
	     System.out.println(
	     "自分の手は"+handMap.get(my)+",対戦相手は"+handMap.get(you));
		 
		if(my.equals(you)) {
			System.out.println("あいこです");
			}else if(
		(my.equals("r")&&you.equals("s"))||
		(my.equals("s")&&you.equals("p"))||
		(my.equals("p")&&you.equals("r"))
			){
		System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
}	
	
}
