package ch07;

// �ܺ� Ŭ����(Outer Class)
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
		System.out.println("����� ClassA");
	}
	
	// ����Ŭ����(Inner Class)
	private class ClassD {
		
	}
}

//�ܺ� Ŭ����(Outer Class)
class ClassB {
	void print() {
		System.out.println("����� ClassB");
	}
}
