package day03;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int y,m,d = 0;
		
		System.out.println("연도를 입력하세요.>>>");
		y = sc.nextInt();
		System.out.println("월을 입력하세요.>>>");
		m = sc.nextInt();
		switch (m) {
		case 1:
			System.out.println(y+"년 1월은 31일까지 있습니다.");
			break;
		case 2:
			if (y % 100 != 0 && y % 4 == 0){
				d = 29;
			}else if (y % 400 == 0){
				d = 29;
			}else {
				d = 28;
			}
			System.out.println(y+"년 2월은 "+d+ "일까지 있습니다.");
			break;
		case 3:
			System.out.println(y+"년 3월은 31일까지 있습니다.");
			break;
		case 4:
			System.out.println(y+"년 4월은 30일까지 있습니다.");
			break;
		case 5:
			System.out.println(y+"년 5월은 31일까지 있습니다.");
			break;
		case 6:
			System.out.println(y+"년 6월은 30일까지 있습니다.");
			break;
		case 7:
			System.out.println(y+"년 7월은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println(y+"년 8월은 31일까지 있습니다.");
			break;
		case 9:
			System.out.println(y+"년 9월은 30일까지 있습니다.");
			break;
		case 10:
			System.out.println(y+"년 10월은 31일까지 있습니다.");
			break;
		case 11:
			System.out.println(y+"년 11월은 30일까지 있습니다.");
			break;
		case 12:
			System.out.println(y+"년 12월은 31일까지 있습니다.");
			break;
		default:
			System.out.println(y+"년 "+m+"월은 존재하지 않습니다. 언젠가는 생기겠지만 말이죠.\n(2022년 기준)");
		
		}
	}
}
