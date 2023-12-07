package class1205.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class jp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, String> pe = new HashMap();
		
		pe.put("あ", "아");  
		pe.put("い", "이");
		pe.put("う", "우");
		pe.put("え", "에"); 	
		pe.put("お","오"); 	
		pe.put("か" ,"카");
		pe.put("く", "쿠");	
		pe.put("き", "키");	
		pe.put("け", "케");
		pe.put("こ", "코");	
		pe.put("さ", "사");	
		pe.put("す", "수");
		pe.put("せ", "세");
		pe.put("そ", "소");	
		pe.put("ぜ", "제");
		pe.put("し", "시");
		pe.put("づ", "즈");
		pe.put("と", "토");
		pe.put("ど", "도");
		pe.put("な", "나");
		pe.put("ぬ", "누");
		pe.put("ね", "네");
		pe.put("に", "니");
		pe.put("の", "노");
		pe.put("へ", "헤");
		pe.put("ほ", "호");
		pe.put("で", "데");
		pe.put("は", "하");
		pe.put("ひ", "히");
		pe.put("ふ", "후");
		pe.put("ば", "바");
		pe.put("び", "비");
		pe.put("ぶ", "부");
		pe.put("ぱ", "파");
		pe.put("べ", "베");
		pe.put("ぼ", "보");
		pe.put("ぴ", "피");
		pe.put("ま", "마");
		pe.put("み", "미");
		pe.put("ぷ", "푸");
		pe.put("む", "무");
		pe.put("め", "메");
		pe.put("ぺ", "페");
		pe.put("ぽ", "포");
		pe.put("も", "모");
		pe.put("よ", "요");
		pe.put("ょ", "ㅛ");
		pe.put("ゆ", "유");
		pe.put("ゅ", "ㅠ");
		pe.put("れ", "레");
		pe.put("ろ", "로");
		pe.put("り", "리");
		pe.put("る", "루");
		pe.put("わ", "와");
		pe.put("や", "야");
		pe.put("ゃ", "ㅑ");
		pe.put("ん", "ㄴ");
		pe.put("を", "워");
		pe.put("ら", "라");
		pe.put("ゃ", "ㅑ");
	
		System.out.println(pe.size());
		System.out.println(pe);
		Set<String> se =  pe.keySet();	 
						
		//hash -> set
		int number = 	se.size();
		String[] se2 = new String[number]; //인덱스 필요를 위해 
	
		System.arraycopy(se.toArray(), 0, se2, 0, number);
		String[] a1 = new String[] {};
		Object[] arr4=  se.toArray();
		System.out.println(arr4[1]);


		System.out.println("====");
		System.out.println(Arrays.toString(se2));
	
		int ran = (int)(Math.random()*59);
		
		String jpLan = se2[ran];
		
		Scanner scan = new Scanner(System.in);
		boolean ox= true;
		while(ox) {
		System.out.println(se2[ran]);
	
		String input = scan.next();
	
		if(input.equals(pe.get(jpLan))) {
			
			System.out.println("정답");
		}
		else if(input.equals("x")) {
			System.out.println("종료되었습니다./");
			ox=false;
			
		}
		else {
			System.out.println("틀렸습니다");
		}
	
		}
	}

}
