package ch08.pkg2;

import ch08.pkg1.Aclass;

public class Cclass extends Aclass {
	Cclass() {
		this.varA = "varA";		// varA에 접근가능
		//this.varA2 = "varA2";   // varA2에 접근 불가능
		
		this.methodA();	// methodA에 접근가능
		//this.methodA2();	// methodA2에 접근 불가능
	}
}
