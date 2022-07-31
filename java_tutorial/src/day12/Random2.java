package day12;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int n2 = sc.nextInt();
		
		R r = new R();
		r.go(n1, n2);
	}
}

class R{
	public void go(int n1, int n2) {
		Random ran = new Random();
		while (true) {
		int result = ran.nextInt(n1+n2)-n1+1;
		System.out.println(result);
		}
	}
}
