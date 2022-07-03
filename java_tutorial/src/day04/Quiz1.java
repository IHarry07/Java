package day04;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String pw_sc;
		String pw = "1234";
		int i = 5;
		while (true) {
		System.out.println("비밀번호를 입력하세요.");
		pw_sc = sc.next();
		if (pw.equals(pw_sc)) {
			System.out.println("비밀번호가 일치합니다.");
			break;
		}else {
			System.out.println("다시 시도하세요.");
			i--;
			}
		if (i == 0) {
			System.out.println("오늘은 더이상 입력할 수 없습니다.");
			break;
			}	
		}
		String kor_cap_sc;
		String kor_cap = "서울";
		while (true) {
			System.out.println("한국의 수도는? (종료를 원하신다면 0을 눌러 주세요)");
			kor_cap_sc = sc.next();
			if (kor_cap_sc.equals("0")) {
				break;
			}
			if(kor_cap.equals(kor_cap_sc)) {
				System.out.println("정답!");
				break;
			}else {
				System.out.println("땡! 다시해봐요!");
			}
		}
		int i_sc;
		i = 0; 
		System.out.println("보고싶은 십구단을 입력하세요!");
		i_sc = sc.nextInt();
		for (int j = 1; j < 20; j++) {
			for (i = i_sc;;) {
				System.out.println(i+"×"+j+"="+i*j+"\t");
				break;
			}
		}
		
	
	
	
	
	
	}		
}
