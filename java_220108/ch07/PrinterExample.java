package ch07;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("È«±æµ¿");
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("È«±æµ¿");
		
		// Ãâ·Â¿¹½Ã
		// 10
		// true
		// 5.7
		// È«±æµ¿		
	}

}
