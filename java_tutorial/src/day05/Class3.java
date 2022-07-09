package day05;

public class Class3 {
	public static void main(String[] args) {
		// 클래스 안에서 클래스를 사용하기 위해선 변수로 만들어 준다.(객체화)
		car 아빠차 = new car();		// 객체 : Object (대상, 물체), 클래스 : Class(반, 추상적)
		car 엄마차 = new car();
		car 내차 = new car();	
		car 동생차 = new car();
		car 홍길동차 = new car();
		
		아빠차.차정보입력("검정", "아빠", "BMW");
		엄마차.차정보입력("빨강", "엄마", "SM");
		내차.차정보입력("회색", "나", "K5");
		동생차.차정보입력("하양", "동생", "아반떼");
		홍길동차.차정보입력("파랑", "홍길동", "모닝");
		
		System.out.println(아빠차.차정보출력());
		System.out.println(엄마차.차정보출력());
		System.out.println(내차.차정보출력());
		System.out.println(동생차.차정보출력());
		System.out.println(홍길동차.차정보출력());
		
		human 나 = new human();
		
		나.신상정보입력("홍길동", 17, 157.5);
		
		System.out.println(나.신상정보출력());
	}
}

class car{
	String color;
	String onwer_name;
	String car_name;

	void 차정보입력(String 색상, String 주인, String 차종) {
		color = 색상;
		onwer_name = 주인;
		car_name = 차종;
	}
	String 차정보출력(){
		return "차주는 "+onwer_name+", 차종과 색상은 "+car_name+", "+color;
		
	}
}
class human{
	String name;
	int age;
	double hight;
	
	void 신상정보입력(String 이름, int 나이, double 신장) {
		name = 이름;
		age = 나이;
		hight = 신장;
	}
	String 신상정보출력() {
		return "이름 : "+name+"\n나이 : "+age+"\n신장 : "+hight;
		
	}
}