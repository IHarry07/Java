package day16;

import java.util.Scanner;

public class _06_Class {
	public static void main(String[] args) {
		// 클래스명 변수명 = new 클래스명();
		Myclass1 m = new Myclass1();
		
	}
}

class Myclass1{
	// 생성자 : 객체화시 사용되는 메서드
	Myclass1(){
		//  생성자는 클래스와 동일한 이름을 갖고 있는 메서드다
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자의 값은?");
		int num = sc.nextInt();
		setNum(num);
	}
	// 생성자 : 객체화시 사용되는 메서드
	// 메서드 : 클래스 안에 있는 함수
	// 접근권한 제어자 : private, default, protected, public 
	// 변수는 private, 메서드는 public, 상속이 필요할 때만 private를 protected로
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	// 모든 메서드에는 클래스를 저장하는 this가 숨겨저 있다
	public void go(Myclass1 this) {
		this.getNum();
		this.setNum(1);
		this.num = 3;
	}
}
