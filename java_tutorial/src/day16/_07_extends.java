package day16;

public class _07_extends {
	public static void main(String[] args) {
		Myclass2 m2 = new Myclass2();
	}
}

class Myclass2 extends Myclass1{
	// extends 키워드로 상속을 받는다
	// 상속 : 클래스 단위로 코드를 복사 붙여넣기
	// 부모클래스 : 복사된 클래스 super
	// 자식 클래스 : 붙여넣기 된 클래스 this
	
	// 메서드 오버라이딩(메서드 수정)
	@Override
	public void go() {
		System.out.println("go함수를 변경하였습니다. 오버라이딩");
	}
	
	// 메서드 오버로딩(같은 이름이면서 파라미터가 다른 메서드가 여러개)
	public void go(int num) {
		System.out.println("go함수를 정수 1개 전달 받는 메서드로 만들었습니다. 오버로딩");
	}
}

class Myclass3 extends Myclass1 implements _08_interface{

	@Override
	public void you() {
		System.out.println("you구현");
		
	}

	@Override
	public void you2be() {
		System.out.println("유튜브 구현");
	}
	
}

class Myclass4 extends _09_Abstractclass{

	@Override
	public void you() {
		System.out.println("you구현");
		
	}
	// 유튜브는 추상클래스(어댑터)에서 미리 구현해줬으므로 구현안된 메서드만 오버라이딩 해주면 된다

	
	
}