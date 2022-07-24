package day10;

public class ReviewImpl extends ReviewAdapter{
	static String str = "";			// static : 정적
	
	public static void main(String[] args) {
		ReviewImpl r1 = new ReviewImpl();		// 인터페이스를 상속받으면 자료형을 인터페이스형으로 줄수 있다ㅣ
		r1.func1();
		r1.func2(123);
		
		final int number = 12;		// final 로 만든 변수는 수정 불가
		// number = 45; 	// 불가능
	}

	@Override
	public void func1() {
		String str = "";			// 함수 안에서 만든 변수는 함수가 사용과 동시에 만들어지고 함수가 종료되면 사라짐`
		System.out.println("impl에서 구현");
		
	}
}

class Review2{
	public void go() {
		ReviewImpl.str = "객체화없이 정적변수 대입/사용";	
		// static변수는 컴퓨터의 성능을 저하할 수 있으므로 사용을 최소화
		
	}
}