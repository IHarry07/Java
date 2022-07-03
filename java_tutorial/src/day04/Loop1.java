package day04;

public class Loop1 {
	public static void main(String[] args) {
		// break : 반복문 중단
		// continue : 반복문 1회성 취소(원래는 중괄호 마치고 조건을 검사하지만, 바로 조건검사로 넘어감)
	
		// break : 5까지만
		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
			
		}
		// continue : 짝수만(2로 나눈 나머지가 0과 같으면 짝수)
		for(int i = 1; i <= 10 ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
}
