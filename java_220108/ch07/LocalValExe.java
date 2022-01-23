package ch07;

public class LocalValExe {

	public static void main(String[] args) {
		Local local = new Local();
		System.out.println(local.name); // null
		
		local.process();
		System.out.println(local.name); // 홍길동
		
		local.printAge1();		// 20
		local.printAge2();		// 30
		
		// for문 블록 내에서의 변수 선언
		for (int i=0; i<10; i++) {
			int temp = 0;
			temp += i;
		}
		
		int temp = 1;
		System.out.println(temp); // 1
	}
}

class Local {
	String name;
	
	void process() {
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20; // 지역변수
		//int age = 30; // error
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; // 지역변수
		System.out.println(age);
	}
}
