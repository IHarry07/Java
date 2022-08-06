package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet1 hs = new HashSet1();
		hs.go();
		
		TreeSet1 ts = new TreeSet1();
		ts.go1();
	}
}

class HashSet1{
	public void go() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		// HashSet은 순서가 없기 때문에 
		// 반복자 Iterator의 도움으로 전체조회가 가능
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class TreeSet1{
	public void go1() {
		// HashSet : 순서 X, 중복 금지
		// TreeSet : 글자순 정렬, 중복 금지
		// a -> b -> c
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(4);
		ts.add(3);
		ts.add(2);
		
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
// Set : 잘 안씀