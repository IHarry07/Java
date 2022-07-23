package day09;

public class Class10 {
	public static void main(String[] args) {
		StarGang SG = new StarGang();
		SG.make();
		SG.sell();
		StarBu SB = new StarBu();
		SB.make();
		SB.sell();
		StarSin SS = new StarSin();
		SS.make();
		SS.sell();
		
		// 다형성 : 객체화를 할때 상속한 인터페이스의 이름으로 통일
		StarBucks Star1 = new StarGang();
		StarBucks Star2 = new StarBu();
		StarBucks Star3 = new StarSin();
		StarBucks star[] = new StarBucks[30];
		star[0] = new StarGang();
		star[1] = new StarBu();
		
		star[0].make();
		star[1].make();
	}
}

interface StarBucks{
	void make();
	void sell();
}
class StarGang implements StarBucks{
	public void make() {
		System.out.println("스타벅스 강남점에서 아메리카노를 만든다.");
	}
	public void sell() {
		System.out.println("스타벅스 강남점에서 아메리카노를 판다");
	}
}
class StarBu implements StarBucks{
	public void make() {
		System.out.println("스타벅스 부평점에서 아메리카노를 만든다.");
	}
	public void sell() {
		System.out.println("스타벅스 부평점에서 아메리카노를 판다");
	}
}
class StarSin implements StarBucks{
	public void make() {
		System.out.println("스타벅스 신촌점에서 아메리카노를 만든다.");
	}
	public void sell() {
		System.out.println("스타벅스 신촌점에서 아메리카노를 판다");
	}
}
	
