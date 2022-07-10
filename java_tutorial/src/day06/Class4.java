package day06;

public class Class4 {
	public static void main(String[] args) {
		사칙연산 tool = new 사칙연산(); 
		tool.div(1, 1);
	}
}

class 사칙연산{
	int num2 = 0;
	void add(int num,int num1) {
		num2 = num + num1;
		System.out.println(num2);
	}
	void sum(int num,int num1) {
		num2 = num - num1; 
		System.out.println(num2);
	}
	void mul(int num,int num1) {
		num2 = num * num1; 
		System.out.println(num2);
	}
	void div(int num,int num1) {
		num2 = num / num1; 
		System.out.println(num2);
	}
}