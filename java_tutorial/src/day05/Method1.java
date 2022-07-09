package day05;

public class Method1 {
	public static void main(String[] args) {
		myprint();	
		myprint();	
		// 4+5;
		add2(4,5);
		add2(1,1);
		add3(1,2,3);
		absMinus(3,2);
		absMinus1(45,1);
		
		// return이 있을 경우 그 값을 변수에 담는다. 
		int result = absMinus2(10,-4);
		System.out.println(result);

	}
	// myprint 기호 : 안녕하세요 반갑습니다 를 보여주는 기능
	static void myprint() {
		System.out.println("안녕하세요,"+"반갑습니다.");	
		
	}
	// +와 동일한 기능
	static void add2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static void add3(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	static void absMinus(int num1, int num2) {
		if (num1 < 0) {
			num1 = num1*-1;
		}
		if (num2 > 0) {
			num2 = num2*-1;
		}
		System.out.println(num1+num2);
	}
	static void absMinus1(int num1, int num2) {
		if (num1 < 0 && num2 > 0) {
			num1 = num1*-1;
		}
		if (num2 > 0 && num1 > 0) {
			num2 = num2*-1;
		}
		System.out.println(num1+num2);
	}
	static int absMinus2(int num1, int num2) {
		if (num1 < 0) {
			num1 = num1*-1;
		}
		if (num2 > 0) {
			num2 = num2*-1;
		}
		// System.out.println(num1+num2);
		return num1 + num2;
		}
	}


// 메소드 : 클래스 안에 있는 함수