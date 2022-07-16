package day07;

public class Review {
	public static void main(String[] args) {
		// 객체화
		ReviewClass RC = new ReviewClass();
		// 실행
		RC.go();
	}
}

class ReviewClass{
	// Class : 변수 + 함수 꾸러미(반)
	private int num[] = {1, 2, 3, 4};
	public void go() {
		System.out.println("객체화 성공!");
		numChange();           	// 메서드 사용
		numSelect();    
	}
	// 메서드 정의
	public void numChange() {
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
	}
	public void numSelect() {
		for(int i = 0; i< num.length; i++) {
			System.out.println(num[i]);
		}
	}
}