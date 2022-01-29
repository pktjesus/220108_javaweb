package ch07;

public class Person {
	String name;	// 이름
	String gender;	// 성별
	int age;		// 나이
	int height;		// 키
	int weight;		// 몸무게
	
	// Person객체를 생성할 때 name과 age의 필드를 외부에서 받은 값으로 초기화하기 위한 생성자 코드 작성
	// 기본 생성자도 작성
	public Person() {
		
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public Person(int a, String n) {
		name = n;
		age = a;
	}
	
	public Person(int a) {
		age = a;
	}
	
	public Person(String n) {
		name = n;
	}
}
