package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dressRoom = new DressRoom();
		Thread human1 = new Thread(dressRoom, "사람1");
		Thread human2 = new Thread(dressRoom, "사람2");
		
		human1.start();
		human2.start();
	}
}

class DressRoom implements Runnable{
	private int time; 
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("드레스룸에 사람이 들어감");
			while (time < 20) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("드레스룸에 사람이 있음.."+(time+1)+"초");
				time++;
			}System.out.println("사람이 나옴");
			System.out.println("비어 있음");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}