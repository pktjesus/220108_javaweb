package ch07;

public class StudentMain {

	public static void main(String[] args) {
		// �Ķ���� 3���� ���� �����ڷ� ��ü ���� 
		Student stu1 = new Student("ȫ�浿", 4, "����Ʈ�������");
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);

		System.out.println();
		// �Ķ���� 3���� ���� �����ڷ� ��ü ����
		Student stu2 = new Student("�̼���", 3, "������");
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		System.out.println();
		// �⺻ �����ڷ� ��ü ����
		Student stu0 = new Student();  // 4�� ������
		
		System.out.println();
		Student stu10 = new Student(); // 4�� ������
		Student stu20 = new Student("ȫ�浿"); // 3�� ������
		Student stu30 = new Student("ȫ�浿", 4); // 2�� ������
		Student stu40 = new Student("ȫ�浿", 4, "����Ʈ�������"); // 1�� ������
	}

}
