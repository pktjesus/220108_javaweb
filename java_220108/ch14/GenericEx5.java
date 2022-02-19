package ch14;

public class GenericEx5 {

	public static void main(String[] args) {
		// 제너릭 상하관계
		// <? super 클래스 혹은 인터페이스>		// 클래스 혹은 인터페이스의 부모클래스 혹은 인터페이스의 자료형만 참조 가능
		// <? extends 클래스 혹은 인터페이스>		// 클래스 혹은 인터페이스의 자손(혹은 자기자신)클래스 혹은 인터페이스의 자료형만 참조 가능
		// <?>			// 모든 자료형 가능
		Gen3 g3 = new Gen3();
		
		// Gen2의 상위 클래스 제네릭 선언 가능
		Generic5<? super Gen2> g2 =new Generic5<Gen1>(g3);
		Gen1 t2 = (Gen3)g2.get(); // Gen1은 부모클래스이므로 가능
		//Gen2 t1 = g2.get();		// Gen2는 Gen2의 부모클래스가 아니라서 에러 발생
		//Gen3 t1 = g2.get();		// Gen3는 Gen2의 부모클래스가 아니라서 에러 발생
		
		Object t1 = g2.get(); // Object는 최상위 클래스이기 때문에 가능
		
		System.out.println(t2.name);			// Gen1
		System.out.println(t2.getName());		// Gen3(자식함수의 getName이 실행)(오버라이딩 기능 때문에)
		
		// Gen2의 하위 클래스 제네릭 선언 가능
		Generic5<? extends Gen2> g4 = new Generic5<Gen3>(g3);
		Gen2 t3 = g4.get(); // Gen2 자신도 포함
		Gen3 t4 = (Gen3)g4.get(); // Gen3은 하위클래스이므로 가능
		
		System.out.println(t3.name);		// Gen2
		System.out.println(t4.getName());	// Gen3(자식함수의 getName이 실행)(오버라이딩 기능 때문에)
		
		// <?> 모든 클래스 타입 가능
		Generic5<?> g6 = new Generic5<Gen3>(g3);
		Object t5 = g6.get();
		Gen3 t6 = (Gen3)g6.get();
		System.out.println(t6.getName());	// Gen3
	}
}

class Generic5<T> {
	T obj;
	
	Generic5(T obj) {
		this.obj = obj;
	}
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

class Gen1 extends Object {
	String name = "Gen1";
	
	String getName() {
		return name;
	}
}

class Gen2 extends Gen1 {
	String name = "Gen2";
	
	String getName() {
		return name;
	}
}

class Gen3 extends Gen2 {
	String name = "Gen3";
	
	String getName() {
		return name;
	}
}