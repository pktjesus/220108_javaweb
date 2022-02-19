package ch14;

public class GenericEx5 {

	public static void main(String[] args) {
		// ���ʸ� ���ϰ���
		// <? super Ŭ���� Ȥ�� �������̽�>		// Ŭ���� Ȥ�� �������̽��� �θ�Ŭ���� Ȥ�� �������̽��� �ڷ����� ���� ����
		// <? extends Ŭ���� Ȥ�� �������̽�>		// Ŭ���� Ȥ�� �������̽��� �ڼ�(Ȥ�� �ڱ��ڽ�)Ŭ���� Ȥ�� �������̽��� �ڷ����� ���� ����
		// <?>			// ��� �ڷ��� ����
		Gen3 g3 = new Gen3();
		
		// Gen2�� ���� Ŭ���� ���׸� ���� ����
		Generic5<? super Gen2> g2 =new Generic5<Gen1>(g3);
		Gen1 t2 = (Gen3)g2.get(); // Gen1�� �θ�Ŭ�����̹Ƿ� ����
		//Gen2 t1 = g2.get();		// Gen2�� Gen2�� �θ�Ŭ������ �ƴ϶� ���� �߻�
		//Gen3 t1 = g2.get();		// Gen3�� Gen2�� �θ�Ŭ������ �ƴ϶� ���� �߻�
		
		Object t1 = g2.get(); // Object�� �ֻ��� Ŭ�����̱� ������ ����
		
		System.out.println(t2.name);			// Gen1
		System.out.println(t2.getName());		// Gen3(�ڽ��Լ��� getName�� ����)(�������̵� ��� ������)
		
		// Gen2�� ���� Ŭ���� ���׸� ���� ����
		Generic5<? extends Gen2> g4 = new Generic5<Gen3>(g3);
		Gen2 t3 = g4.get(); // Gen2 �ڽŵ� ����
		Gen3 t4 = (Gen3)g4.get(); // Gen3�� ����Ŭ�����̹Ƿ� ����
		
		System.out.println(t3.name);		// Gen2
		System.out.println(t4.getName());	// Gen3(�ڽ��Լ��� getName�� ����)(�������̵� ��� ������)
		
		// <?> ��� Ŭ���� Ÿ�� ����
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