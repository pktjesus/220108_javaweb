package ch11;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void first() throws Exception, ArithmeticException, ArrayIndexOutOfBoundsException {
		second();
	}
	
	static void second() throws Exception, ArithmeticException, NullPointerException {
		throw new ArithmeticException("예외 발생");
	}
}
