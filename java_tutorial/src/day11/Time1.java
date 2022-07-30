package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time1 {
	public static void main(String[] args) {
		NowTime n = new NowTime();
		//n.go();
		//n.go2();
		n.go3();
	}
}

class NowTime{
	public void go() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf1.format(date));
	}
	public void go2() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		int num1 = Integer.parseInt(sdf1.format(date));
		int num2 = Integer.parseInt(sdf2.format(date));
		int num3 = Integer.parseInt(sdf3.format(date));
		num3++;
		System.out.println("내일은 "+num1+"년 "+num2+"월 "+num3+"일 이다.");
	}
	public void go3() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String time = sdf1.format(date);
		
		String year = time.substring(0,5);
		String month = time.substring(6,9);
		String day = time.substring(10,12);

		System.out.println("내일은 "+year+" "+month+" "+(Integer.parseInt(day)+1)+"일 이다.");
		
	}
}