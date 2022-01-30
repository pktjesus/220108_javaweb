package ch08.pkg2;

import ch08.pkg1.Aclass;

public class Bclass {
	public void methodB() {
		Aclass ac = new Aclass();
		//ac.varA = "varA";	// varA에 접근 불가능
		//ac.varA2 = "varA2"; // varA2에 접근 불가능
		
		//ac.methodA();	// methodA에 접근 불가능
		//ac.methodA2();	// methodA2에 접근 불가능
	}
}
