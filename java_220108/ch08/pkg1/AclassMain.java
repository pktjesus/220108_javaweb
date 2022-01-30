package ch08.pkg1;

public class AclassMain {

	public static void main(String[] args) {
		Aclass ac = new Aclass();
		ac.varA = "varA";	// varA에 접근가능
		ac.varA2 = "varA2"; // varA2에 접근가능
		//ac.varA3 = "varA3";	// varA3에 접근 불가능
		
		ac.methodA();	// methodA에 접근가능
		ac.methodA2();	// methodA2에 접근가능
		//ac.methodA3();	// methodA2에 접근 불가능
	}

}
