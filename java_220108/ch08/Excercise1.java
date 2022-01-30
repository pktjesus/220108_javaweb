package ch08;

public class Excercise1 {
	public static void main(String[] args) {
		ChildEx ce = new ChildEx();
		// 출력되는 순서를 작성 -> 2 1 4 3
		
		ParentEx pe = new ParentEx();
		// 출력되는 순서를 작성 -> 2 1
	}
}

class ParentEx {
	ParentEx() {
		this(1);
		System.out.println("(1)");
	}
	ParentEx(int x) {
		System.out.println("(2)");
	}
}

class ChildEx extends ParentEx {
	ChildEx() {
		this(1);
		System.out.println("(3)");
	}
	ChildEx(int x) {
		System.out.println("(4)");
	}
}
