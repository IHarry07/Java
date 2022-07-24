package day10;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		mc.go();
		
	}
}

class MyClass2 extends MyClass1{
	@Override
	public void go() {
		System.out.println("go 실행");
		scan();
		// 예외처리
		
		try{ 
			System.out.println(num1/num2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("go 종료");
	}
	
	@Override
	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num2에 넣을 숫자를 입력하세요>>>");
		try {
		int num = sc.nextInt();			// 숫자가 아닌 문자열을 넣으면 프로그램이 강제종료 되어버림
		num2 = num;
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}