package day13;

public class Array1 {
	public static void main(String[] args) {
		Arr1 r = new Arr1();
		r.go();
	}
}

class Arr1{
	public void go() {
		// 배열 : 같은 주제를 가진 변수들을 뭉쳐놓은 변수
		// ex) 카페메뉴들, 음식 메뉴들, ....
		
		// 배열 선언(공간을 만드는 법)
		// 자료형 변수명 [];
		String menu[] = {"라면","김밥","떡볶이","순대","","",""};
		int price[] = new int[7];

		price[0] = 3000;
		price[1] = 1000;
		price[2] = 2000;
		price[3] = 3000;
		
		// 배열을 사용하는 이유(장점) : 반복문을 통해서 배열 갯수가 많아도 한번에 사용할 수 있게 하기 위해서
				for (int i = 0; i < price.length; i++) {
			System.out.println(menu[i]+" : "+price[i]);
		}
		// 배열의 단점 : 수정이 쉽지 않음
		// ex) 값을 중간에 삽입, 배열 크기를 늘리기
		String save = menu[2];
		menu[2] = menu[3];
		menu[3] = save;
		
		int save1 = price[2];
		price[2] = price[3];
		price[3] = save1;
		
		for (int i = 0; i < price.length; i++) {
			System.out.println(menu[i]+" : "+price[i]);
		}
		
		// 배열의 단점을 극복하고자 만든것 : 컬렉션(List, Set, Map)
	}
}