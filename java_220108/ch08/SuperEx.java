package ch08;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child();		// 부모 객체 생성 자식 객체 생성
		child.print();		// 1 2 3
	}
}

class Parent {
	int number = 3;		// 멤버필드
	
	Parent() {			// 생성자
		System.out.println("부모 객체 생성");
	}
	
	void test1() {
		
	}
}

class Child extends Parent {
	int number = 2;
	
	Child() {
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);			// 메소드 지역변수 number
		System.out.println(this.number);	// 자신 객체의 number
		System.out.println(super.number);	// 부모 객체의 number
		super.test1();
	}
}