package ch08.poly;

public class PolyEx2 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.run();		// �ڽ��� �޸���.
		
		Child c = (Child)p;	// ��������ȯ
		c.eat(); 		// �ڽ��� �Դ´�.
	}

}
