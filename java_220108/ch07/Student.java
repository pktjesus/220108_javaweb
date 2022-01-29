package ch07;

public class Student {
	// 鞘靛
	String name; // 切积疙
	int grade; // 切斥
	String department; // 切苞
	
	// 积己磊1
	Student(String n, int g, String d) {
		System.out.println("积己磊1锅 角青");
		name = n;
		grade = g;
		department = d;		
	}
	// 积己磊2
	Student(String n, int g) {
		System.out.println("积己磊2锅 角青");
		name = n;
		grade = g;
	}
	// 积己磊2-1
	Student(int n, int g) {
		System.out.println("积己磊2锅 角青");
		//name = n;
		grade = g;
	}	
	
	// 积己磊3
	Student(String n) {
		System.out.println("积己磊3锅 角青");		
		name = n;
	}
	// 积己磊4(扁夯 积己磊)
	Student() {
		System.out.println("积己磊4(扁夯 积己磊) 角青");		
	}
}
