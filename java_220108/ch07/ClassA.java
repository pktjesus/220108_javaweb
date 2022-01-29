package ch07;

// 외부 클래스(Outer Class)
public class ClassA {
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.print();
		
		ClassB cb1 = new ClassB();
		cb1.print();
		
		ClassB cb2 = new ClassB();
		cb2.print();
	}
	
	public void print() {
		System.out.println("여기는 ClassA");
	}
	
	// 내부클래스(Inner Class)
	private class ClassD {
		
	}
}

//외부 클래스(Outer Class)
class ClassB {
	void print() {
		System.out.println("여기는 ClassB");
	}
}
