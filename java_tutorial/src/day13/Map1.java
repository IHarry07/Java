package day13;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
//		HMap1 h = new HMap1();
//		h.go();
		MyDictionary m = new MyDictionary();
		m.go();
	}
}

class HMap1{
	public void go() {
		HashMap<String, Double> hm1 = new HashMap<>();
		
		// 추가 put
		hm1.put("일" , 1.0);
		hm1.put("이" , 2.0);
		hm1.put("삼" , 3.0);
		hm1.put("사" , 4.0);
		
		// System.out.println(arr1.get(0));
		System.out.println(hm1.get("일"));
		System.out.println(hm1.get("이"));
		System.out.println(hm1.get("삼"));
		System.out.println(hm1.get("사"));
	}
}

class MyDictionary{
	private String search;
	public void go() {
		HashMap<String, String> hm1 = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		hm1.put("apple", "사과");
		hm1.put("kiwi", "키위");
		hm1.put("mellon", "멜론");
		hm1.put("strawberry", "딸기");
		hm1.put("watermellon", "수박");
		
		System.out.println("단어를 입력하세요>>");
		search = sc.nextLine();
		
		System.out.println(hm1.get(search));
	}
}
// Map : 사전
// ArrayList : {1, 2, 3, 4}
// Map : {"키워드1" : "값1", "키워드2" : "값2"}