package ch13;

public class Member {
	// 필드
	int id;
	String name;
	int age;
	
	// 생성자
	Member (int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// toSring() 메서드 재정의
	@Override
	public String toString() {
		return "["+ name + "," + age + "]";
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age && this.id == id;
		} else {
			return false;
		}
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		//System.out.println(System.identityHashCode(this.name));
		return id + this.name.hashCode() + age;
		//return System.identityHashCode(this.name) + age;
	}
}
