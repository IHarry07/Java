package day03;

import java.text.BreakIterator;
import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,e,k,num;
		System.out.println("당신의 수학점수를 입력하세요>>");
		m = sc.nextInt();
		System.out.println("당신의 영어점수를 입력하세요>>");
		e = sc.nextInt();
		System.out.println("당신의 국어점수를 입력하세요>>");
		k = sc.nextInt();
		num = m + e + k ;
		
		if (num >= 150 && (m >= 40 && (e >= 40 && k >= 40))){
			System.out.println("합격!");
		}else{
			System.out.println("불합격");
		}

	
	}
}
