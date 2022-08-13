package day15;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Socket1 {
	public static void main(String[] args) {
		Mysever m = new Mysever();
		MyClient c = new MyClient();
		
		//c.go("192.168.3.101",15000);
		// 192.168.3.15
		m.go(12345);
	}
}

class Mysever{
	InputStream i;
	OutputStream o;
	ServerSocket s;
	ObjectInputStream oi;
	ObjectOutputStream oo;
	Socket so;
	
	public void go(int port) {
		try {
			s = new ServerSocket(port);
			while(true) {
				System.out.println("요청대기");
				so = s.accept();
				System.out.println("접속 IP : "+so.getInetAddress());
				i = so.getInputStream();
				o = so.getOutputStream();
				oi = new ObjectInputStream(i);
				oo = new ObjectOutputStream(o);
				String msg = (String)oi.readObject();
				System.out.println("클라이언트의 메시지 : "+msg);
				
				String respon = "서버가 준 메시지 : "+msg;
				oo.writeObject(respon);
				s.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}

class MyClient{
	InputStream i;
	OutputStream o;
//	ServerSocket s;
	ObjectInputStream oi;
	ObjectOutputStream oo;
	Socket so;
	Scanner sc = new Scanner(System.in);
	private String msg = null;
	
	public void go(String ip, int port) {
		try {
			so = new Socket(ip, port);
			o = so.getOutputStream();
			oo = new ObjectOutputStream(o);
			
			System.out.println("보낼 메시지>>");
			String msg = sc.next();
			oo.writeObject(msg);
			
			i = so.getInputStream();
			oi = new ObjectInputStream(i);
			String server_msg = (String)oi.readObject();
			System.out.println(server_msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}