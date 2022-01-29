package ch07;

public class StudentMain {

	public static void main(String[] args) {
		// 파라미터 3개를 가진 생성자로 객체 생성 
		Student stu1 = new Student("홍길동", 4, "소프트웨어공학");
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);

		System.out.println();
		// 파라미터 3개를 가진 생성자로 객체 생성
		Student stu2 = new Student("이순신", 3, "디자인");
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		System.out.println();
		// 기본 생성자로 객체 생성
		Student stu0 = new Student();  // 4번 생성자
		
		System.out.println();
		Student stu10 = new Student(); // 4번 생성자
		Student stu20 = new Student("홍길동"); // 3번 생성자
		Student stu30 = new Student("홍길동", 4); // 2번 생성자
		Student stu40 = new Student("홍길동", 4, "소프트웨어공학"); // 1번 생성자
	}

}
