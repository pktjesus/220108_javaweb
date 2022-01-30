package ch08.poly;

public class PolyEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.run();		// 자식이 달린다.

		Parent p = new Child();		// 부모 객체는 자식의 객체를 받을 수 있음.
		//Child c1 = new Parent();	// error
		p.run();		// 자식이 달린다.
		// p.eat();		// error -> Parent클래스에는 eat메소드가 존재하지 않음
		
		Parent p1 = new Parent();
	}

}
