package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Review {
	public static void main(String[] args) {
		List_ l = new List_();
		l.go();
		System.out.println("-------------------");
		Set_ s = new Set_();
		s.go();
		System.out.println("-------------------");
		Map_ m = new Map_();
		m.go();
	}
}

class List_{
	public void go() {
		ArrayList<String> a = new ArrayList<>();
		
		a.add("한개");	// 0	
		a.add("두개");	// 1
		a.add("세개");	// 2
		a.add("세개");	// 3
		
		System.out.println(a.get(0));
		
		a.set(1, "두개 수정");
		
		System.out.println(a.get(1));
		
		a.remove("두개 수정");
		
		System.out.println("===============");
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}

class Set_{
	public void go() {
		Set<String> h = new HashSet<>();			// 순서 X, 중복 X, 배열
		
		h.add("한개");
		h.add("두개");
		h.add("세개");
		h.add("세개");
		
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}

class Map_{
	public void go() {
		Map<Integer,String> m = new HashMap<>();
		
		m.put(1, "첫번째");
		m.put(2, "두번째");
		m.put(3, "세번째");
		m.put(5, "네번째");
		
		System.out.println(m.get(1));
		
		System.out.println(m.keySet());
		
		Set<Integer> set = m.keySet();
		
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			int keynum = i.next();
			System.out.println(m.get(keynum));
			
		}
	}
}

/* 
 * {"날씨":"흐림"} : JSON => Map
 *  // List : 순서 O, 중복 O, 배열
 *  // Set  : 순서 X, 중복 X, 배열
 *	// Map : 키와 값으로 이루어진 배열
 * 
 * 	// ArrayList, HashMap
 */




