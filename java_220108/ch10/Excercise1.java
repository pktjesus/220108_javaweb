package ch10;

public class Excercise1 {

	public static void main(String[] args) {
		// name�� ����ϴ� �ڵ� �ۼ�
		// ��1
		Out out = new Out();
		Out.In in = out.new In();
		System.out.println(in.name);
		
		// ��2
		System.out.println(new Out().new In().name);
	}

}

class Out {
	class In {
		String name = "�ڹ�";
	}
}

// ������
// �ڹ�