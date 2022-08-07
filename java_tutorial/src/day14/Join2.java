package day14;

public class Join2 {
	public static void main(String[] args) {
		BGM1 b = new BGM1();
		BGM2 g = new BGM2();
		
		b.start();
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.start();
	}
}

// 1 : 배경음악1
// 2 : 배경음악2

class BGM1 extends Thread{
	public void run() {
		System.out.println("배경음악1 시작");
		int i = 0;
		while (10 > i) {
			System.out.println("배경음악1 진행중");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			i++;
		}
		System.out.println("배경음악1 끝");
	}
	
}

class BGM2 extends Thread{
	public void run() {
		int i = 0;
		System.out.println("배경음악2 시작");
		while (5 > i) {
			System.out.println("배경음악2 진행중");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			i++;
		}
		System.out.println("배경음악2 끝");
	}
}
