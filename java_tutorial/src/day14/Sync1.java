package day14;

public class Sync1 {
	public static void main(String[] args) {
		Toilet t = new Toilet();
		Thread human1 = new Thread(t, "사람1");
		Thread human2 = new Thread(t, "사람2");
		
		human1.start();
		human2.start();
		
	}
}

// 화장실은 한개 뿐... 사람은 많다
// 한 사람이 화장실을 사용하고 있으면 다른 사람은 대기해야 한다. 들어오면 안된다.
class Toilet implements Runnable{
	private int time;
	public void run() {
		synchronized (this) {		// 현재 클래스는 한번에 한명만 사용할 수 있게 동기화
			time = 0;
			System.out.println("화장실 들어감");
			while (time < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;
				
				System.out.println("화장실 사용중... "+time+"초");
			}System.out.println("화장실 비움");
		}
	}
}