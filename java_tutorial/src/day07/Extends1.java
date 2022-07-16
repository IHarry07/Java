package day07;

public class Extends1 {
	public static void main(String[] args) {
		MyString MS = new MyString();
		MS.go();
	}
}

class MyString{
	private String str;
	
	// 함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
	MyString(){
		
	}
	
	
	MyString(String str){
		this.str = str;
	}
	
	public void go() {
		System.out.println(str+" 1번");
	}
}

class MyString2 extends MyString{
	// MyString의 코드가 복사 붙여넣기 됨 : 상속
	
	// 수정 : 동일한 함수를 다시 만들어 주면 됨(오버라이딩)
	public void go() {
		System.out.println("========");
		super.go();			// super : 부모의(코드의 원래 주인)               //MyString의 go함수 사용
		System.out.println("========");
	}
}

// MyString3을 만든 이유 : 별을 달려고
// 코드 복사 붙여넣기만 하면 별을 달 수가 없음
// 상속을 하고 수정이 필요하면 수정이 필요한 함수를 다시만듬 	
class MyString3 extends MyString{
	// MyString의 코드가 복사 붙여넣기 됨 : 상속	

	// 수정 : 동일한 함수를 다시 만들어 주면 됨
	public void go() {
		// go를 한번 더 만듦 : 우선순위가 더 높음
	System.out.println("********");
	// super. 를 붙여준 이유는 과거의 go를 쓰기 위해서 
	super.go();			// super : 부모의(코드의 원래 주인)
	System.out.println("********");
	}
}

// 기본의 클래스를 복붙하고 싶으면 extends 사용
// 수정이 필요하면 그 함수만 다시 만듬
