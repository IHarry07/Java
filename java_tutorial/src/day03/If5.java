package day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >>>");
		
		int age = Integer.parseInt(sc.nextLine());
		
		if(age >= 50) {
			System.out.println("당신은 50대 이상 입니다");
		}else if(age >= 40) {
			System.out.println("당신은 40대 입니다");
		}else if(age >= 30) {
			System.out.println("당신은 30대 입니다");
		}else if(age >= 20) {
			System.out.println("당신은 20대 입니다");
		}else {
			System.out.println("미성년자 입니다");
		}

	}
}
	
