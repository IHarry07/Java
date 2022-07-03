package day04;

public class For2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다.");
		}
		// 반복문을 활용한 계산
		// {} : 범위, {}안에서 만들어진 변수는 {}가 끝나면 삭제됨
		// {}밖에서 만들어진 변수는 {}가 끝나고 유지가 됨(공간,값)
		int num = 0; 
		for (int i = 0; i < 9; i++) { num += i; }
			System.out.println(num);
		 
		num = 0;
		for(int i = 0; i <= 50; i++) {
			num += i;
		}System.out.println(num);
	}
}
