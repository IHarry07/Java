package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import java.util.Scanner;

public class Map2 {
	public static void main(String[] args) {
//		Hm1 m = new Hm1();
//		m.go();
		Nations n = new Nations();
		n.go();
	}
}

class Hm1{
	public void go() {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("아메리카노", 1500);
		hm.put("카페라떼", 2500);
		hm.put("카라멜마끼아또", 3500);
		hm.put("카페모카", 2500);
		
		System.out.println(hm.containsKey("아메리카노"));
		System.out.println(hm.containsValue(2500));
		hm.remove("카라멜마끼아또");
		hm.get("아메리카노");
		System.out.println(hm.keySet());
		Set<String> keyset = hm.keySet();
		Iterator<String> it = keyset.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("메뉴 : "+key+"\t 가격 : "+hm.get(key));
		}
	}
}

class Nations{
	public void go() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("한국", "서울");
		hm.put("일본", "도쿄");
		hm.put("중국", "베이징");
		hm.put("러시아", "모스크바");
		hm.put("베트남", "호찌민");
		hm.put("미국", "워싱턴");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("어느나라의 수도가 궁금하신가요? (0 입력시 종료)");
			System.out.println(hm.keySet());
			String str = sc.next();
			if (str.equals("0")) {
				System.out.println("종료");
				break;
			}
			String key = hm.get(str);
			System.out.println(str+"의 수도는 "+key);
			
		}
	}
}