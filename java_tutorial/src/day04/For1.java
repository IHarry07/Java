package day04;

import java.util.Iterator;

public class For1 {
	public static void main(String[] args) {
		// int flag = 0;
		// while (flag){
		// 내용;
		// flag++;}
		
		// for (){} : while과 동일한 반복문
		// while이 지저분 했던 이유 : 1. 플래그 2. 조건(소괄호) 3. 코드 내부에서 플래그 증감
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("안녕하세요");
		}
		for (int i = 0; i < 14; i++) {			
			System.out.println("안녕하세요");
		}
	}
}
