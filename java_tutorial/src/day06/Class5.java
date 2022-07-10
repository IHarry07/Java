package day06;

public class Class5 {
	public static void main(String[]args) {
		Class5Ex c = new Class5Ex();
		c.num1 = 1;
		c.num2 = 2;
		c.num3 = 3;
		// c.num4 = 4;
		c.num(4);
		
		System.out.println(c.num2);
		// 변수는 private, 매서드는 public : 너의 정보를 은닉할 수 있게 캡슐화를 해야한다.
		// 함수를 좀 만들어서 써라(주목적)
	}
}

// 캡슐, 접근권한제어자, 정보은닉 : 사실무근
class Class5Ex{
	//  접근권한제어자
	// public, protected, default, private
	public int num1;		// public : 어디서든 사용 가능
	protected int num2;		// protected : 
	int num3; 				// default : 같은 패키지 내에서만 사용가능
	private int num4; 		// private : 내 클래스 안에서만 사용가능
	
	void test() {
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
	}
	public void num(int num4) {
		this.num4 = num4;
		System.out.println(this.num4);
	}
}