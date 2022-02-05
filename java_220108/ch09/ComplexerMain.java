package ch09;

public class ComplexerMain {

	public static void main(String[] args) {
		Complexer cow = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		cow.print();
		cow.scan();
		cow.send("02-1111-2222");
		cow.receive("02-3333-4444");
	}

}
