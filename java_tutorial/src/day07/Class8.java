package day07;

public class Class8 {
	public static void main(String[] args) {
		Class8Ex c = new Class8Ex();
		c.go();
	}
}
class Class8Ex{
	private String str1;
	
	// 생성자 : 객체화를 하는 순간 무조건 사용되는 함수 
	Class8Ex(){
		setStr1("set을 먼저 써야지!");	
	}
	
	// 사용
	public String getStr1() {
		return str1;
	}
		// 대입
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	public void go() {
		
		System.out.println(getStr1());
		
	}
}