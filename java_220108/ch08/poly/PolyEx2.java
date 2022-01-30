package ch08.poly;

public class PolyEx2 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.run();		// 자식이 달린다.
		
		Child c = (Child)p;	// 강제형변환
		c.eat(); 		// 자식이 먹는다.
	}

}
