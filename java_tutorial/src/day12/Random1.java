package day12;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Rand1 r = new Rand1();
		r.go3();
	}
}

class Rand1{
	Random r = new Random();
	
	public void go1() {
		int result = r.nextInt(10);
		System.out.println(result);
	}
	public void go2() {
		int result = r.nextInt(10)+1;
		System.out.println(result);
	}
	public void go3() {
		int result = r.nextInt(6)+100;
		System.out.println(result);
	}
}
