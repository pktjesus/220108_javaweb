package ch07;

public class MemberMain2 {

	public static void main(String[] args) {
		// �ڱ� �ڽ��� Ŭ���� ��ü�� ���� ����
		MemberMain2 m = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if (m == m2) {
			System.out.println("m��ü�� m2��ü�� ����");
		} else {
			System.out.println("m��ü�� m2��ü�� �ٸ���");
		}
	}
}
