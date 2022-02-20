package ch13;

public class Member2 implements Comparable {
	// �ʵ�
	String name;
	int age;
	
	// ������
	Member2 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toSring() �޼��� ������
	@Override
	public String toString() {
		return "("+ name + "," + age + ")";
	}
	
	@Override
	public int compareTo(Object o) {
		Member2 m = (Member2)o;
		return this.name.compareTo(m.name);
	}
}
