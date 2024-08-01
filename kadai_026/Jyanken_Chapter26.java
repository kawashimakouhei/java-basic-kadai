package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String c = scanner.next();
			
			if(c.equals("r") || c.equals("p") || c.equals("s")) {
				return c;
			}else {
				return "エラー";
			}
		}	
	}
	
	public String getRandom() {
		
		int ran = (int)Math.floor(Math.random() * 3);
		String ans ="";
		
		switch(ran){
		  case 0:
		    ans = "r";
		    break;
		  case 1:
			ans = "s";
			break;
		  case 2:
		    ans = "p";
		    break;
		}
		
		return ans;
	}
	
	public void playGame() {
		
		Map<String, String> map = new HashMap<String, String>() {
	        {
	            put("r","グー");
	            put("s","チョキ");
	            put("p","パー");
	        }
	    };
		
		String myj = getMyChoice();
		
		if(myj.equals("エラー")){
			System.out.println(myj);
			return;
		}

		String youj = getRandom();
		
		System.out.println("自分の手は"+ map.get(myj) +",対戦相手の手は" + map.get(youj));
		
		if (myj.equals(youj)) {
			System.out.println("あいこです、");
			
		}else if(myj.equals("r") && youj.equals("s")) {
			System.out.println("自分の勝ちです、");
			
		}else if(myj.equals("r") && youj.equals("p")) {
			System.out.println("自分の負けです、");
			
		}else if(myj.equals("s") && youj.equals("r")) {
			System.out.println("自分の負けです、");
			
		}else if(myj.equals("s") && youj.equals("p")) {
			System.out.println("自分の勝ちです、");
			
		}else if(myj.equals("p") && youj.equals("r")) {
			System.out.println("自分の勝ちです、");
			
		}else if(myj.equals("p") && youj.equals("s")) {
			System.out.println("自分の負けです、");
		}
	}
}
