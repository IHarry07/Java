package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		Th3 t3 = new Th3();
		Thread tt3 = new Thread(t3);
		
		t1.start();
		t2.start();
		tt3.start();
	}
}

class Th1 extends Thread{
	public void run() {
		go();
	}
	public void go(){
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.print(str);
	}
}

class Th2 extends Thread{
	public void run() {
		go();
	}
	public void go() {
		while (true) {
			System.out.println("Hello World!");
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 자바는 다중상속이 안되기 때문에 추가로 상속 받을 수 있게 인터페이스를 제공 : Runnable

class Th3 implements Runnable{

	@Override
	public void run() {
		while (true) {
		System.out.println("BGM 재생중");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}