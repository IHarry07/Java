package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 3) {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다.");
			i++;
		}
		i = 0;
		while(i < 3) {
			System.out.println(i+"번");
			i++;
			
		}
		
		int num = 10;
		while (num >= 1) {
			System.out.println(num);
			num --;
		}
		num = 0;
		while (num <= 10) {
			System.out.println(num);
			num ++;
		}
	}
		
}
