package ch08.poly;

public class PolyEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.run();		// �ڽ��� �޸���.

		Parent p = new Child();		// �θ� ��ü�� �ڽ��� ��ü�� ���� �� ����.
		//Child c1 = new Parent();	// error
		p.run();		// �ڽ��� �޸���.
		// p.eat();		// error -> ParentŬ�������� eat�޼ҵ尡 �������� ����
		
		Parent p1 = new Parent();
	}

}
