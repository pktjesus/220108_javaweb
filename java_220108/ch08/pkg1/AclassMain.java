package ch08.pkg1;

public class AclassMain {

	public static void main(String[] args) {
		Aclass ac = new Aclass();
		ac.varA = "varA";	// varA�� ���ٰ���
		ac.varA2 = "varA2"; // varA2�� ���ٰ���
		//ac.varA3 = "varA3";	// varA3�� ���� �Ұ���
		
		ac.methodA();	// methodA�� ���ٰ���
		ac.methodA2();	// methodA2�� ���ٰ���
		//ac.methodA3();	// methodA2�� ���� �Ұ���
	}

}
