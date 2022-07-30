package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 s = new StringEx1();
		System.out.println(s.go(price));
		
	}
}

class StringEx1{
	public String go(int num) {
		String num6 = "";
		String num1 = Integer.toString(num);
		if (num < 0) {
			String str1 = "음수는 구현 불가";
			num6 = str1;
		}
		else if (num < 1000){
			String num2 = Integer.toString(num);
			return num2;
			// System.out.println(num);
		}
		else if (num < 10000 ) {
			String num2 = num1.substring(0,0+1);
			String num3 = num1.substring(1,1+3);
			num6 = num2+","+num3;
			// System.out.println(num2+","+num3);
		}
		else if (num < 100000 ) {
			String num2 = num1.substring(0,1+1);
			String num3 = num1.substring(2,2+3);
			num6 = num2+","+num3;
			// System.out.println(num2+","+num3);
		}
		else if (num < 1000000 ) {
			String num2 = num1.substring(0,2+1);
			String num3 = num1.substring(3,3+3);
			num6 = num2+","+num3;
			// System.out.println(num2+","+num3);
		}
		else if (num < 10000000 ) {
			String num2 = num1.substring(0,0+1);
			String num3 = num1.substring(1,1+3);			
			String num4 = num1.substring(4,4+3);			
			num6 = num2+","+num3+","+num4;
			// System.out.println(num2+","+num3+","+num4);
		}
		else if (num < 100000000 ) {
			String num2 = num1.substring(0,1+1);
			String num3 = num1.substring(2,2+3);			
			String num4 = num1.substring(5,5+3);			
			num6 = num2+","+num3+","+num4;
			// System.out.println(num2+","+num3+","+num4);
		}
		else if (num < 1000000000 ) {
			String num2 = num1.substring(0,2+1);
			String num3 = num1.substring(3,3+3);			
			String num4 = num1.substring(6,6+3);			
			num6 = num2+","+num3+","+num4;
			// System.out.println(num2+","+num3+","+num4);
		}
		else if (num <= 2147483647 ) {
			String num2 = num1.substring(0,0+1);
			String num3 = num1.substring(1,1+3);			
			String num4 = num1.substring(4,4+3);			
			String num5 = num1.substring(7,7+3);			
			num6 = num2+","+num3+","+num4+","+num5;
			// System.out.println(num2+","+num3+","+num4+","+num5);
		}
		
		return num6;
	}
}