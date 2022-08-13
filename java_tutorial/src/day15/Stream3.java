package day15;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		MyProgram m = new MyProgram();
		m.go("c:\\Users\\Administrator\\Desktop\\num.txt");
	}
}

class MyProgram{
	Scanner sc = new Scanner(System.in);
	String msg = "";
	
	public void go(String file) {
		System.out.println("내 메시지>>");
		msg = sc.next();
		
		try {
			FileOutputStream f = new FileOutputStream(file, true);
			byte[] byteArray = msg.getBytes();
			f.write(byteArray);
			} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println(msg);
	}
}