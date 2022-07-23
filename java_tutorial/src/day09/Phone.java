package day09;

public class Phone {
	public static void main(String[] args) {
		_5GPhone galaxy20 = new _5GPhone();
		galaxy20.call("010-1122-3344");
		galaxy20.msg("010-1122-3344", "ㅁㄴㅇㄹ");
		galaxy20.net();
		galaxy20.LTE();
		galaxy20.bigdata();
		
	}
}

// 인터페이스1 : 상속을 여러개 하기 위해서
// 인터페이스2 : 반드시 만들어줘야 하는 함수를 정해놓기 위해서
// 인터페이스3 : 다형성

interface KPhone{
	// 전화, 문자 함수 만들기를 강요
	void call(String num);
	void msg(String num, String str);
}
class _2GPhone implements KPhone{
	// 2G폰을 만드는 사람은 전화와 문자기능을 빼놓을 수 없음
	@Override
	public void call(String num) {
		// 반드시 만들어줘야 하는 기능1
		System.out.println(num+"에 전화합니다.");
		
	}

	@Override
	public void msg(String num, String str) {
		// 반드시 만들어 줘야 하는 기능2
		System.out.println(num+"에 문자를 보냅니다."+str);
		
	}
}
// 3G폰 : 전화 + 문자 + 인터넷
class _3GPhone extends _2GPhone{
	public void net() {
		System.out.println("인터넷 사용");
	}
}
// 4G폰 : 전화 + 문자 + 인터넷 + 속도(LTE)
class _4GPhone extends _3GPhone{
	public void LTE() {
		System.out.println("빠른속도");
	}
}
// 5G폰 : 전화 + 문자 + 인터넷 + 속도 + 빅데이터
class _5GPhone extends _4GPhone{
	public void bigdata() {
		System.out.println("빅데이터 활용");
		
	}
}