package day06;

public class Class6 {
	public static void main(String[] args) {
		Class6Ex c = new Class6Ex();
		c.setName("홍길동");
		System.out.println("이름 : "+c.getName());
		c.setAge(4);
		System.out.println("나이 : "+c.getAge());
		c.setHelght(21474833);
		System.out.println("키 : "+c.getHelght());
	}
}

class Class6Ex {
	private String name;
	private int age;
	private double helght;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHelght() {
		return helght;
	}
	public void setHelght(double helght) {
		this.helght = helght;
	}
}