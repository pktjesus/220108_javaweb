package ch08.pkg1;

public class Aclass {
	protected String varA;
	String varA2;
	private String varA3;
	
	protected void methodA() {
		System.out.println("methodA");
		methodA3();
	}
	
	void methodA2() {
		System.out.println("methodA2");
		methodA3();
	}
	
	private void methodA3() {
		System.out.println("methodA3");
	}
}
