package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		dic.map.put("apple","りんご");
		dic.map.put("peach","桃");
		dic.map.put("banana","バナナ");
		dic.map.put("lemon","レモン");
		dic.map.put("pear","梨");
		dic.map.put("kiwi","キウィ");
		dic.map.put("strawberry","いちご");
		dic.map.put("grape","ぶどう");
		dic.map.put("muscat","マスカット");
		dic.map.put("cherry","さくらんぼ");
		
		String[] check = {"apple","banana","grape","orange"};
		
		for(String i : check) {
			if(dic.map.get(i)!=null) {
				System.out.println(i + "の意味は" + dic.map.get(i));
			}else {
				System.out.println(i + "は辞書に存在しません");
			}
		}
	}

}
