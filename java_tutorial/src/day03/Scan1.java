package day03;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		// 출력 syso
		// 입력 Scanner
		Scanner num = new Scanner(System.in);
		
		// 입력
		/*
		 System.out.println("글자를 입력하세요 :");
		 String 글자입력1 = num.next();
		 System.out.println("숫자를 입력하세요 :"); 
		 int 숫자입력1 = num.nextInt();
		 */
		
		// 입력2		
		System.out.println("글자 여러개를 입력하세요");
		String 글자입력2 = num.nextLine();
		System.out.println("숫자를 입력하세요 :"); 
		int 숫자입력2 = Integer.parseInt(num.nextLine());
		
		// 출력
		System.out.println(글자입력2);
		System.out.println(숫자입력2);
		
		num.close(); // 입력 종료
		
	}
}
