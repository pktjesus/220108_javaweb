package ch07;

public class MemberMain {

	public static void main(String[] args) {
		// ��ü ����� �ʱ�ȭ ���ÿ�
		Member m = new Member();
		// ��ü ����� �ʱ�ȭ ������
		Member m2;
		m2 = new Member();
		
		if (m == m2) {
			System.out.println("m��ü�� m2��ü�� ����");
		} else {
			System.out.println("m��ü�� m2��ü�� �ٸ���");
		}
		m.test1();
		
		m.i = 1;
		m.j = 2;
		m.test1();
	}

}
