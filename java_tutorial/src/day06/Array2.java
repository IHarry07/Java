package day06;

import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
		Array2Ex a = new Array2Ex();
		a.go();
	}
}

class Array2Ex{
	public void go() {
		int price [] = {1500, 2000, 3000, 4000};
		// 배열값 수정
		price[0] = 1500;
		String menu [] = {"아메리카노", "에스프레소", "카푸치노", "카페라떼"};
		for (int i = 0; i < price.length; i++) {
			for (int j = 0; j < menu.length; j++) {
				if (i == j) {
					System.out.println(menu[j]+" : "+price[i]+"원");					
				}
			}
		
		}
	}
}