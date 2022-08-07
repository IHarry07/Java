package day14;

public class Thread1 {
	public static void main(String[] args) {
		MyClass1 m1 = new MyClass1();
		MyClass2 m2 = new MyClass2();
		MyClass3 m3 = new MyClass3();
//		
//		m1.go();
//		m2.go();
//		m3.go();
		
		m1.start();			// 추가쓰레드 run메서드 실행
		m2.start();			// 추가쓰레드 run메서드 실행	
		m3.start();			// 추가쓰레드 run메서드 실행
		
		// 프로그램 : 개발자가 만든 애플리케이션
		// 프로세스 : 실행중인 프로그램
		// 쓰레드 : 프로세스의 실질적인 동작수행을 담당 
		// 멀티쓰레드 : 하나의 프로세스에 여러개의 쓰레드를 동작시키는것 (원래는 main쓰레드만 작동)
		// ex) 캐릭터를 움직이면서 배경음악이 재생되며 채팅을 주고 받을수 있다
		
		// main 쓰레드 외에 추가 쓰레드 생성하는 법
		// 클래스 만들고 쓰레드 상속받고 run에 내용입력후 start로 실행
	}
}

class MyClass1 extends Thread{
	
	// 쓰레드를 상속 받으면 run이라는 메서드 사용가능
	@Override
	public void run() {
		go();
	}
	
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("UI화면 갱신중(캐릭터 움직임, 대화창)");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyClass2 extends Thread{
	
	@Override
	public void run() {
		go();
	}
	
	public int go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악 재생중");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
}

class MyClass3 extends Thread{
	
	@Override
	public void run() {
		go();
	}
	
	public String go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("채팅 메시지 송수신(네트워크)");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}
}