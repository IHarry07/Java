package day06;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Array4Ex a = new Array4Ex();
		a.go();
	}
}

class Array4Ex{
	public void go() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어느나라의 수도가 궁금하신가요?");
		String input = sc.next();
		String nations[] = {"미국", "한국", "일본"};
		String capitals[] = {"워싱턴D.C", "서울", "도쿄"};
			for (int i = 0; i < capitals.length; i++) {
				if (input.equals(nations[i])) {
				System.out.println(nations[i]+"의 수도는 "+capitals[i]+"입니다.");
		}
	}
}
}