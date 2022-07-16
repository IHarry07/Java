package day07;

public class Constructor2 {
	public static void main(String[] args) {
		person p = new person("홍길동", 17, "한국");
		p.go();
	}
}

class person{
	
	private String name; 
	private int age;
	private String nation;
	
	person(String name,int age,String nation){
		setNation(nation);
		setAge(age);
		setName(name);
	}
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
	public void go(){
		personInfo();
	}
	public void personInfo() {
		System.out.println("이름 : "+name+",  국적 : "+nation+", 나이 : "+age);
	}
}