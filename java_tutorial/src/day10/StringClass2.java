package day10;

public class StringClass2 {
	public static void main(String[] args) {
		Quiz2 q = new Quiz2();
		q.order1();
		q.order2();
	}
}

class Quiz2{
	int num;
	String result1;
	String result2;
	String result3;	
	String name;
	String info1 = "STAname=A01price=001000num=02ED";
	String info2 = "STAname=A02price=001500num=01ED";
	// info는 주문내역 (통신패키지)
	// 보안을 위해 시작은 무조건  STA로 시작
	// 상품명은 name= 다음에, 가격은 price다음에, 수량은 num다음에, 맨 마지막은 ED로 끝나야함
	// A01 : 에스프레소, A02 : 아메리카노, A03 : 카푸치노, A04 : 카페라떼
	
	public void order1() {
		num = info1.indexOf("A");
		result1 = info1.substring(num+7, num+9);
		if(result1.equals("01")) {
		name = result1.replace("01", "에스프레소");
			}
		else if(result1.equals("02")) {
		name = result1.replace("02", "아메리카노");
		}
		else if(result1.equals("03")) {
		name = result1.replace("03", "카푸치노");
		}
		else if(result1.equals("04")) {
		name = result1.replace("04", "카페라떼");
		}
		num = info1.indexOf("num");
		result2 = info1.substring(num-4, num);
		num = info1.indexOf("E");
		result3 = info1.substring(num-1, num);
		int num2 = Integer.parseInt(result2);
		int num3 = Integer.parseInt(result3);
		System.out.println(name+" "+num3+"잔 주문 "+num2*num3+"원");
		
	}public void order2() {
		num = info2.indexOf("A");
		result1 = info2.substring(num+7, num+9);
		if(result1.equals("01")) {
		name = result1.replace("01", "에스프레소");
			}
		else if(result1.equals("02")) {
		name = result1.replace("02", "아메리카노");
		}
		else if(result1.equals("03")) {
		name = result1.replace("03", "카푸치노");
		}
		else if(result1.equals("04")) {
		name = result1.replace("04", "카페라떼");
		}
		num = info2.indexOf("num");
		result2 = info2.substring(num-4, num);
		num = info2.indexOf("E");
		result3 = info2.substring(num-1, num);
		int num2 = Integer.parseInt(result2);
		int num3 = Integer.parseInt(result3);
		System.out.println(name+" "+num3+"잔 주문 "+num2*num3+"원");
		
	}
}