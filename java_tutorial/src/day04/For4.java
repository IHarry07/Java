package day04;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		// 아이디와 비번 맞추기
		String id = "hello";
		String pw = "1234";
		Scanner sc = new Scanner (System.in);
		String id_sc, pw_sc;
		int i = 5;
		while (i > 0) {
			System.out.println("아이디를 입력하세요");
			id_sc = sc.next();
			if(id.equals(id_sc)) {
				System.out.println("비밀번호를 입력하세요.");
				pw_sc = sc.next();
				if(pw.equals(pw_sc)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
					i--;
				}
			}else {
				System.out.println("맞는 아이디가 없습니다."); 
				i--;
			}
			if (i == 0) {
				System.out.println("오늘은 더이상 로그인을 시도할 수 없습니다.");
			}	
		}
	}
}
