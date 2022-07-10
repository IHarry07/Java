package day06;

public class Class7 {
	public static void main(String[] args) {
		person p = new person();
		p.setName("홍길동");
		p.setAge(23);
		p.setNation("한국");
		System.out.println(p.getName()+"은 "+p.getNation()+"에서 온 "+p.getAge()+"살 이다.");
		p.setName("아무개");
		p.setAge(22);
		p.setNation("캐나다");
		System.out.println(p.getName()+"은 "+p.getNation()+"에서 온 "+p.getAge()+"살 이다.");
	}
}

class person{
	private String name;
	private int age;
	private String nation;
	
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
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
}