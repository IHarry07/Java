package day15;

public class Review {
	public static void main(String[] args) {
		// 쓰레드 : 실행중인 프로그램(프로세스) 내부에서 실질적으로 업무수행을 하는 단위
		
		// main() 함수는 기본적으로 메인 쓰레드를 갖고 있음
		
		MyThread1 m = new MyThread1();
		MyThread2 y = new MyThread2();
		Thread my = new Thread(y);
		m.start();
		my.start();
	}
}

// 추가 쓰레드 : 메인쓰레드와는 별개로 동작하기 위해서 
class MyThread1 extends Thread{
	public void run(){
		// 쓰레드 클래스를 상속 받아서 run에 구현 -> main에서 start로 실행
		for (int i = 0; i < 100; i++) {
			System.out.println("추가 쓰레드1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 추가 쓰레드2
class MyThread2 implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("추가 쓰레드2");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}