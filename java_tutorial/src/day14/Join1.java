package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Join1 {
	static ArrayList<String> a = new ArrayList<>();
	public static void main(String[] args) {
		InitClass i = new InitClass();
		AfterClass a = new AfterClass();
		
		i.start();
		try {
			i.join();						// i 쓰레드가 끝날때까지 다른 쓰레드는 대기
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.start();
	}
}

class InitClass extends Thread{
	// 먼저 해줘야 할 클래스
	
	Scanner sc = new Scanner(System.in);
	private String ss;
	
	public void run() {
		System.out.println("초기화 쓰레드 시작");
		while (true) {
			System.out.print("입력하세요 (종료하려면 0)>>");
			ss = sc.next();
			if(ss.equals("0")) {
				break;
			}
			Join1.a.add(ss);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("초기화 쓰레드 끝");
		System.out.println("---------------------");
	}
}

class AfterClass extends Thread{
	// 나중에 해줘야 할 클래스
	public void run() {
		System.out.println("그 다음 쓰레드 시작");
		for (int i = 0; i < Join1.a.size(); i++) {
			System.out.println(Join1.a.get(i));
		}
		System.out.println("그 다음 쓰레드 끝");
	}
	
}