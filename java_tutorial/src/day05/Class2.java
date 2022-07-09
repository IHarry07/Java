package day05;

public class Class2 {
	String 변수;
	public static void main(String[] args) {
		Myclass2 mc = new Myclass2();
		mc.add(5,4);
		mc.sum(4,5);
		mc.mul(4,5);
		mc.div(4,2);
		// 더하기 하려면 add, 빼기 하려면 sum, 곱하기 하려면 mul, 나누기 하려면 div
		
		// 대한민국 GPS 좌표구하기(위도, 경도 구하는 공식 => 인수인계)
		// 사수 : 귀찮네? 내 시간도 없고 알려주기도 싫고 나만의 기술을 공개하기도 싫고
		// => 클래스를 만들어서 사용 방법만 알려줌
		
		// 클래스명 변수명 = new 클래스명();                == 객체화
		
		Mystr ms = new Mystr();
		ms.saveprint("hi");
		ms.myprint();
	}	
}

// ============================================================================================

// 클래스 : 함수 + 변수
// 메서드 : 클래스 안에 있는 함수
class Myclass2{
	// Myclass2 안에 사칙연산 기능 +, -, *, /
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	void sum(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	void mul(int num1, int num2) {
		System.out.println(num1 * num2);		
	}
	void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}

class Mystr{
	String str = "";
	void myprint() {
		System.out.println(str);
	}
	void saveprint(String in){
		str = in;
	}
}