package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		Menu1 m = new Menu1();
		m.go();
	}
}

class Menu1{
	public void go() {
		ArrayList<String> arr4 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			String str = sc.next();
			if(str.equals("1")) {
				System.out.print("추가할 항목 입력>>");
				String str1 = sc.next();
				arr4.add(str1);
			}else if (str.equals("2")) {
				try {
				System.out.print("수정할 위치를 입력하세요>>");
				int str2 = sc.nextInt();
				System.out.print("수정할 내용을 입력하세요>>");
				String str3 = sc.next();
				arr4.set(str2-1, str3);
				}catch (Exception e) {
					System.out.println("오류발생");
					System.out.println("0을 입력하였거나 빈공간을 수정하려 시도했기 때문입니다.");
					break;
				}
			}else if (str.equals("3")) {
				try {
				System.out.print("제거할 위치를 입력하세요>>");
				int str4 = sc.nextInt();
				arr4.remove(str4-1);
				}catch (Exception e) {
					System.out.println("오류발생");
					System.out.println("0을 입력하였거나 빈공간을 제거하려 시도했기 때문입니다.");
					break;
				}
				
			}else if (str.equals("4")) {
				for (int i = 0; i < arr4.size(); i++) {
					System.out.print(arr4.get(i)+" ");
				}System.out.println();
			}else if (str.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			
			}else {
				System.out.println("오류발생");
				System.out.println("제공되지 않은 숫자를 입력했기 때문입니다.");
				break;
			}
		}
	}
}