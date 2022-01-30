package ch08.poly;

public class Child extends Parent {
	String name;
	
	// 메소드 재정의
	void run() {
		System.out.println("자식이 달린다.");
	}
	// 추가된 메소드
	void eat() {
		System.out.println("자식이 먹는다.");
	}
}
