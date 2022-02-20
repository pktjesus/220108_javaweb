package ch13;

public class Member {
	// �ʵ�
	int id;
	String name;
	int age;
	
	// ������
	Member (int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// toSring() �޼��� ������
	@Override
	public String toString() {
		return "["+ name + "," + age + "]";
	}
	
	// equals() �޼��� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age && this.id == id;
		} else {
			return false;
		}
	}
	
	// hashCode() �޼��� ������
	@Override
	public int hashCode() {
		//System.out.println(System.identityHashCode(this.name));
		return id + this.name.hashCode() + age;
		//return System.identityHashCode(this.name) + age;
	}
}
