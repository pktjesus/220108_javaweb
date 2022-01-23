package ch07;

public class ParamEx2 {

	public static void main(String[] args) {
		Param p = new Param();
		//p.add(10.5, 5.5);
		p.add2(10.5, 5.5);	// 16.0
		
		p.add((int)10.5, (int)5.5);	// 15
	}

}
