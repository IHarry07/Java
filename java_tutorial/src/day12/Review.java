package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Review {
	public static void main(String[] args) {
		R1 r = new R1();
		R2 rr = new R2();
		R3 rrr = new R3();
		r.go();
		rr.go();
		rrr.go(10,0);
		
		// Java는 Object클래스를 항상 상속받아 있음.
		// Java의 각종기능은 Object라는 클래스에 구현이 되어있음.
		// ex) String, Date, ...
	}
}
 
class R1{
	
	private String s1;
	
	public void go() {
		String s1 = null;
		s1 = "hello world";
		this.s1 = s1.substring(0,4+1);
		if (s1.equals(this.s1)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}

class R2{
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	String time = sdf.format(date);
	
	public void go() {
		System.out.println(time);
		int year = Integer.parseInt(time.substring(0, 4));
		System.out.println("작년은 "+(year-1)+"년");
		
				
	}
}
class R3{
	private int n1,n2;
	
	public void go(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
		try{
			System.out.println(n1/n2);
		}catch(Exception e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}
		
	}
}