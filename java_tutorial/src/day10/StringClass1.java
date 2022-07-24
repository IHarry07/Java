package day10;

public class StringClass1 {
	public static void main(String[] args) {
		// MyString1 ms = new MyString1();
		// ms.go();
		Quiz1 q = new Quiz1();
		q.name();
		q.hello();
		q.bye();
		q.myInfo();
	}
}

class Quiz1{
	String info = "안녕하세요 저는 홍길동입니다. 잘 부탁드립니다. 안녕히 계세요.";
	String result;
	int num;
	public void name() {
		num = info.indexOf("홍");
		result = info.substring(num, num+3);
		System.out.println(result);
	} 
	public void hello() {
		num = info.indexOf("안");
		result = info.substring(num, num+5);
		System.out.println(result);
	}
	public void bye() {
		num = info.indexOf("히");
		result = info.substring(num-2, num+5);
		System.out.println(result);
	}
	public void myInfo() {
		result = info.replace("홍길동", "이진건");
		System.out.println(result);
	}
}

class MyString1{
	int var1;			// 붉은색에 소문자 (기본 자료형)
	double var2;		// 붉은색에 소문자 (기본 자료형)
	String var3;		// 검은색에 맨 앞글자만 대문자  : 기본 자료형이 아닌 클래스
	boolean var4;		// 붉은색에 소문자 (기본 자료형)
	
	public void go() {
		var3 = "Hello World!";
		// String만 갖고있는 매서드
		
		// 1. equals() : 같은지 비교
		var3.equals("Hello World!");						// 같으면 true, 다르면 false
		
		// 2. contains() : 포함하는지 검사
		var3.contains("World");								// var3에 world가 있으면 true, 없으면 false
		
		// 3.replace() : 교체
		var3 = var3.replace("World", "Java"); 				// var3에 world가 있으면 java로 바꾼다
		System.out.println(var3);		
		
		// 4. length() : 글자 갯수를 알려준다
		var1 = var3.length(); 								// var3의 글자 갯수를 알려준다
		System.out.println(var1);
		
		// 5. indexOf() : 해당 글자의 방번호를 알려줌
		var1 = var3.indexOf("!");
		System.out.println("!의 위치는 : " +var1);				// 방번호는 0부터 시작
		
		// 6. charAt() : 방번호를 알려주면 해당 글자를 알려줌(반환)
		char var5 = var3.charAt(10);
		System.out.println("10번째 방에있는 문자는" +var5);	// 방번호는 0부터 시작
		
		// 7. substring() : 잘라내기
		var3 = var3.substring(0, 5);
		System.out.println("0번부터 4번까지 자른 결과 : "+var3);
		
		// 8. + : 합치기
		var3 = var3+" World!";
		System.out.println(var3);
	}
}