package ch07;

public class Car2 {
	// �ʵ�
	String color;
	String company;
	String type;
	
	Car2() {								// ������1
		this("white", "���", "����");
	}
	Car2(String color, String company, String type) {// ������2
		this.color = color;
		this.company = company;
		this.type = type;
	}
	Car2(String com, String t) {			// ������3
		this("white", com, t);
	}
	Car2(String t) {						// ������4
		this("white", "���", t);
	}
	
	public String toString() {			// �޼ҵ�
		return color + "-" + company + "-" + type;
	}
}
