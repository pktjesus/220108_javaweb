package ch07;

public class Car2 {
	// 필드
	String color;
	String company;
	String type;
	
	Car2() {								// 생성자1
		this("white", "기아", "경차");
	}
	Car2(String color, String company, String type) {// 생성자2
		this.color = color;
		this.company = company;
		this.type = type;
	}
	Car2(String com, String t) {			// 생성자3
		this("white", com, t);
	}
	Car2(String t) {						// 생성자4
		this("white", "기아", t);
	}
	
	public String toString() {			// 메소드
		return color + "-" + company + "-" + type;
	}
}
