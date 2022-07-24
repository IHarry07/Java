package day10;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		MyClass3 mc = new MyClass3();
		//mc.go();
		double result = mc.divide(20,10); // 20 / 10
		System.out.println(result);
		
		result = mc.divide(10, 0); 		 // 10 / 0
		System.out.println(result);
	}
}

class MyClass3{
	
	double divide(double a, double b) {
		double result = 0.0;
		if (b != 0) {
			
		result = a / b;
		
		}	
		return result;	
}
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("시스템 가동");
		int a=0,b = 0 ,c= 0;
		try {
		System.out.println("숫자1을 입력하세요");
		a = sc.nextInt();
		System.out.println(a);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			
		System.out.println("숫자2을 입력하세요");
		b = Integer.parseInt(sc.next());
		System.out.println(b);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try {
		c = a/b;
		System.out.println(c);
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		sc.close();
		System.out.println("시스템 종료");
	}
	
	
}
	// 함수 3개를 만들고 main 사용
	// 1. scanner 의 nextInt()
	// 2. scanner를 사용해서 Integer.parseInt(sc.nextInt())로 형변환
	// 3. 나누기
	
	// 예외 처리 작업

