package day08;

public class Inter1Impl extends MyClass1 implements Inter1, MyInter{
	// MyClass
	// 인터페이스를 상속(지정)받으면 인터페이스의 함수를 모두 완성해야 함
	// implements 라는 것으로 상속을 받고 클래스에 빨간 밑줄이 가면 마우스를 올려준다
	// Add unimplemented methods 라는 것을 클릭해서 오버라이딩(수정) 한다
	public static void main(String[] args) {
		// static : 우선순위 높음
		Inter1Impl impl = new Inter1Impl();
		impl.go();
		
		// interface를 왜 상속받냐
		Inter1 inter1 = new Inter1Impl();
		inter1.go();
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상속 완료!");
	}

}

class MyClass1{
	
}

class MyClass2{
	
}

interface MyInter{
	
}