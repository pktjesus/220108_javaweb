package ch08;

public class SuperEx2 {
	public static void main(String[] args) {

	}
}

class Parent2 {
	String name;
	
	Parent2 (String name) {		// Parent2 持失切
		this.name = name;
	}
}

class Child2 extends Parent2 {
	Child2(String name) {		// Child2 持失切
		super(name);		// Parent2(String name)税 持失切 硲窒
	}
}
